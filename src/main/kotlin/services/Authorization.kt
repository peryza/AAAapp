package services

import DataAccessLayer
import ExitCode
import Handler
import models.Roles
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

fun authorize(handler: Handler, dal: DataAccessLayer): ExitCode {

    val logger: Logger = LogManager.getLogger()

    fun isResSubsidiary(resFromDB: String): Boolean {
        val name: List<String> = resFromDB.split('.')
        var result = true
        val splitInput = handler.res!!.split('.')
        if (splitInput.size < name.size) {
            return false
        }
        for (i in name.indices) {
            if (splitInput[i] != name[i]) result = false
        }
        return result
    }

    logger.info("Checking the user role existence.")
    if (!Roles.contains(handler.role!!)) {
        logger.info("Invalid role.")
        return ExitCode.UnknownRole
    } else logger.info("The role was entered correctly.")

    logger.info("Checking user access to a resource.")
    logger.info("Requesting data from the database.")
    return if (dal.getUserAccessInfo(handler.login!!, handler.role!!).any { isResSubsidiary(it) }) {
        logger.info("Access to the resource is allowed.")
        ExitCode.Success
    } else {
        logger.info("Access is denied.")
        ExitCode.NoAccess
    }
}
