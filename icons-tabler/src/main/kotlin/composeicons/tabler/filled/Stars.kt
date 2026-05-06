package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stars: ImageVector
    get() {
        if (_stars != null) return _stars!!
        _stars = tablerFilledIcon(
            name = "Stars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.657 12.007c-.475 .049-.891 .338-1.103 .765l-.855 1.723-1.907 .277c-.52 .072-.96 .44-1.124 .944l-.038 .14c-.1 .465 .046 .954 .393 1.29l1.377 1.337-.326 1.892c-.087 .521 .128 1.047 .556 1.357 .428 .31 .994 .352 1.462 .108l1.708-.895 1.708 .896c.468 .246 1.034 .205 1.462-.105l.112-.09c.357-.32 .524-.8 .442-1.272l-.325-1.891 1.38-1.339c.38-.371 .516-.924 .352-1.427l-.051-.134c-.195-.437-.6-.742-1.073-.81l-1.907-.278-.853-1.722c-.235-.473-.718-.773-1.247-.773l-.143 .007Z")
            addPathData("M6.057 12.007c-.475 .049-.891 .338-1.103 .765l-.855 1.723-1.907 .277c-.52 .072-.96 .44-1.124 .944l-.038 .14c-.1 .465 .046 .954 .393 1.29l1.377 1.337-.326 1.892c-.087 .521 .128 1.047 .556 1.357 .428 .31 .994 .352 1.462 .108l1.708-.895 1.708 .896c.468 .246 1.034 .205 1.462-.105l.112-.09c.357-.32 .524-.8 .442-1.272L9.6 18.483l1.38-1.339c.38-.371 .516-.924 .352-1.427l-.051-.134c-.195-.437-.6-.742-1.073-.81L8.3 14.494 7.447 12.772C7.211 12.299 6.728 12 6.2 12l-.143 .007Z")
            addPathData("M11.857 2.007c-.475 .049-.891 .338-1.103 .765L9.899 4.495 7.992 4.772c-.52 .072-.96 .44-1.124 .944l-.038 .14c-.1 .465 .046 .954 .393 1.29L8.6 8.483l-.326 1.892c-.087 .521 .128 1.047 .556 1.357 .428 .31 .994 .352 1.462 .108L12 10.946l1.709 .896c.468 .246 1.034 .205 1.462-.105l.112-.09c.357-.32 .524-.8 .442-1.272L15.4 8.483 16.78 7.144c.38-.371 .516-.924 .352-1.427l-.051-.134c-.195-.437-.6-.742-1.073-.81L14.1 4.494 13.247 2.772C13.011 2.299 12.528 2 12 2l-.143 .007Z")
        }
        return _stars!!
    }

private var _stars: ImageVector? = null
