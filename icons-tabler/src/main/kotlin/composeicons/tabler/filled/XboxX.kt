package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxX: ImageVector
    get() {
        if (_xboxX != null) return _xboxX!!
        _xboxX = tablerFilledIcon(
            name = "XboxX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M15.6 7.2c-.442-.331-1.069-.242-1.4 .2L12 10.333 9.8 7.4C9.469 6.958 8.842 6.869 8.4 7.2c-.442 .331-.531 .958-.2 1.4L10.75 12 8.2 15.4c-.331 .442-.242 1.069 .2 1.4 .442 .331 1.069 .242 1.4-.2L12 13.667l2.2 2.933c.331 .442 .958 .531 1.4 .2 .442-.331 .531-.958 .2-1.4L13.25 12 15.8 8.6c.331-.442 .242-1.069-.2-1.4"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _xboxX!!
    }

private var _xboxX: ImageVector? = null
