package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MailOpened: ImageVector
    get() {
        if (_mailOpened != null) return _mailOpened!!
        _mailOpened = tablerFilledIcon(
            name = "MailOpened",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.872 14.287l6.522 6.52c-.529 .702-1.34 1.137-2.218 1.188L19 22h-14c-.941 .001-1.827-.44-2.394-1.191L9.127 14.287l2.318 1.545 .116 .066c.277 .135 .601 .135 .878 0l.116-.066 2.317-1.545Z")
            addPathData("M2 9.535l5.429 3.62L2 18.585Z")
            addPathData("M22 9.535v9.05L16.57 13.155Z")
            addPathData("M12.44 2.102l.115 .066 8.444 5.629-8.999 6-9-6L11.445 2.167c.296-.197 .675-.222 .994-.065Z")
        }
        return _mailOpened!!
    }

private var _mailOpened: ImageVector? = null
