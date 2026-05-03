package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterH: ImageVector
    get() {
        if (_circleLetterH != null) return _circleLetterH!!
        _circleLetterH = tablerFilledIcon(
            name = "CircleLetterH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 14.000 7.000 C 13.448 7.000 13.000 7.448 13.000 8.000 L 13.000 11.000 L 11.000 11.000 L 11.000 8.000 C 11.000 7.493 10.620 7.066 10.117 7.007 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 C 10.552 17.000 11.000 16.552 11.000 16.000 L 11.000 13.000 L 13.000 13.000 L 13.000 16.000 C 13.000 16.507 13.380 16.934 13.883 16.993 L 14.000 17.000 C 14.552 17.000 15.000 16.552 15.000 16.000 L 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000"),
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
        return _circleLetterH!!
    }

private var _circleLetterH: ImageVector? = null
