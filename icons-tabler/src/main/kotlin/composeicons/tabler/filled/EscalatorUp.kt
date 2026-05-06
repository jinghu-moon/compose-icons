package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = tablerFilledIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 6C21.433 6 23 7.567 23 9.5 23 11.433 21.433 13 19.5 13h-1.086l-8.12 8.121c-.514 .514-1.198 .824-1.924 .872L8.172 22h-3.672C2.567 22 1 20.433 1 18.5 1 16.567 2.567 15 4.5 15h2.084L14.707 6.879c.514-.514 1.198-.824 1.923-.872L16.828 6Z")
            addPathData("M19.5 8h-2.672c-.265 0-.52 .105-.707 .293L7.707 16.707C7.52 16.895 7.265 17 7 17h-2.5C3.672 17 3 17.672 3 18.5 3 19.328 3.672 20 4.5 20h3.672c.265-0 .52-.105 .707-.293l8.414-8.414c.187-.188 .442-.293 .707-.293h1.5C20.328 11 21 10.328 21 9.5 21 8.672 20.328 8 19.5 8")
            addPathData("M5.852 2.011l.058-.007L6 2l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L7 5.415v4.585c0 .552-.448 1-1 1C5.448 11 5 10.552 5 10v-4.585L3.707 6.707c-.356 .356-.922 .392-1.32 .083L2.293 6.707c-.39-.39-.39-1.023 0-1.414L5.293 2.293q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z")
        }
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
