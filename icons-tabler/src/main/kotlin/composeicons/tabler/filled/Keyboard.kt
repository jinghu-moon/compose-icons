package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = tablerFilledIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 5c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-16C2.343 19 1 17.657 1 16v-8C1 6.343 2.343 5 4 5ZM6 13c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C7 13.448 6.552 13 6 13M18 13c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M10.002 13C9.45 12.999 9.001 13.446 9 13.998c-.001 .552 .446 1.001 .998 1.002l4 .01c.552 .001 1.001-.445 1.002-.998 .001-.552-.445-1.001-.997-1.002ZM6 9C5.448 9 5 9.448 5 10v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C7 9.448 6.552 9 6 9M10 9C9.448 9 9 9.448 9 10v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C11 9.448 10.552 9 10 9M14 9c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C15 9.448 14.552 9 14 9M18 9c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C19 9.448 18.552 9 18 9"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
