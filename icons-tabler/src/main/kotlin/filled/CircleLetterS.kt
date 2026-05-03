package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterS: ImageVector
    get() {
        if (_circleLetterS != null) return _circleLetterS!!
        _circleLetterS = tablerFilledIcon(
            name = "CircleLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 13.000 7.000 L 11.000 7.000 C 9.895 7.000 9.000 7.895 9.000 9.000 L 9.000 11.000 C 9.000 12.105 9.895 13.000 11.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 C 11.000 14.448 10.552 14.000 10.000 14.000 C 9.448 14.000 9.000 14.448 9.000 15.000 C 9.000 16.105 9.895 17.000 11.000 17.000 L 13.000 17.000 C 14.105 17.000 15.000 16.105 15.000 15.000 L 15.000 13.000 C 15.000 11.895 14.105 11.000 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 13.000 9.000 L 13.007 9.117 C 13.069 9.642 13.530 10.028 14.059 9.997 C 14.587 9.966 14.999 9.529 15.000 9.000 C 15.000 7.895 14.105 7.000 13.000 7.000"),
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
        return _circleLetterS!!
    }

private var _circleLetterS: ImageVector? = null
