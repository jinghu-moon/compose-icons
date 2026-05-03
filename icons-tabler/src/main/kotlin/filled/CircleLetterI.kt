package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterI: ImageVector
    get() {
        if (_circleLetterI != null) return _circleLetterI!!
        _circleLetterI = tablerFilledIcon(
            name = "CircleLetterI",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 12.000 7.000 C 11.448 7.000 11.000 7.448 11.000 8.000 L 11.000 16.000 C 11.000 16.552 11.448 17.000 12.000 17.000 C 12.552 17.000 13.000 16.552 13.000 16.000 L 13.000 8.000 C 13.000 7.448 12.552 7.000 12.000 7.000"),
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
        return _circleLetterI!!
    }

private var _circleLetterI: ImageVector? = null
