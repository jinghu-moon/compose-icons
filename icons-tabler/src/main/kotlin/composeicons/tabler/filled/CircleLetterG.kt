package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterG: ImageVector
    get() {
        if (_circleLetterG != null) return _circleLetterG!!
        _circleLetterG = tablerFilledIcon(
            name = "CircleLetterG",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14 7h-2C10.343 7 9 8.343 9 10v4c0 1.657 1.343 3 3 3h2c.552 0 1-.448 1-1v-4c0-.552-.448-1-1-1h-1c-.552 0-1 .448-1 1l.007 .117c.059 .503 .486 .883 .993 .883v2h-1c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1h2c.552 0 1-.448 1-1C15 7.448 14.552 7 14 7"),
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
        return _circleLetterG!!
    }

private var _circleLetterG: ImageVector? = null
