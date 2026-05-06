package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterO: ImageVector
    get() {
        if (_circleLetterO != null) return _circleLetterO!!
        _circleLetterO = tablerFilledIcon(
            name = "CircleLetterO",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M12 7C10.343 7 9 8.343 9 10v4c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-4C15 8.343 13.657 7 12 7M12 9c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1"),
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
        return _circleLetterO!!
    }

private var _circleLetterO: ImageVector? = null
