package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterD: ImageVector
    get() {
        if (_circleLetterD != null) return _circleLetterD!!
        _circleLetterD = tablerFilledIcon(
            name = "CircleLetterD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 12.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000M 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 L 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 L 11.000 15.000 L 11.000 9.000 Z"),
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
        return _circleLetterD!!
    }

private var _circleLetterD: ImageVector? = null
