package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlarmSnooze: ImageVector
    get() {
        if (_alarmSnooze != null) return _alarmSnooze!!
        _alarmSnooze = tablerFilledIcon(
            name = "AlarmSnooze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 6.072c3.331 1.923 4.822 5.945 3.549 9.575-1.273 3.63-4.948 5.84-8.751 5.262C6.995 20.332 4.142 17.129 4.005 13.285L4 13l.005-.285C4.105 9.91 5.668 7.362 8.124 6.002 10.58 4.642 13.569 4.668 16 6.072ZM14 10h-4l-.117 .007C9.38 10.066 9 10.493 9 11l.007 .117c.059 .503 .486 .883 .993 .883h1.584L9.293 14.293l-.076 .084C8.703 15.014 9.147 16 10 16h4l.117-.007c.503-.059 .883-.486 .883-.993l-.007-.117C14.934 14.38 14.507 14 14 14h-1.586l2.293-2.293 .076-.084C15.297 10.986 14.853 10 14 10Z")
            addPathData("M6.412 3.191c.427-.317 1.028-.244 1.367 .165 .339 .41 .298 1.013-.094 1.374l-.097 .08-2.75 2C4.411 7.132 3.806 7.061 3.465 6.649 3.124 6.236 3.168 5.629 3.565 5.27l.097-.08 2.75-2Z")
            addPathData("M16.191 3.412c.296-.408 .85-.531 1.291-.288l.106 .067 2.75 2c.427 .31 .539 .899 .256 1.345-.283 .446-.863 .595-1.326 .34l-.106-.067-2.75-2c-.214-.156-.358-.391-.399-.653-.041-.262 .023-.53 .179-.744Z")
        }
        return _alarmSnooze!!
    }

private var _alarmSnooze: ImageVector? = null
