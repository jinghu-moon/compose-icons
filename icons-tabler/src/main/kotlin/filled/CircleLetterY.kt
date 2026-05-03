package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterY: ImageVector
    get() {
        if (_circleLetterY != null) return _circleLetterY!!
        _circleLetterY = tablerFilledIcon(
            name = "CircleLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 14.371 7.072 C 14.125 6.973 13.849 6.977 13.606 7.081 C 13.362 7.186 13.170 7.383 13.071 7.629 L 12.000 10.307 L 10.928 7.629 C 10.711 7.136 10.142 6.903 9.642 7.103 C 9.141 7.303 8.889 7.864 9.072 8.371 L 11.000 13.194 L 11.000 16.000 C 11.000 16.507 11.380 16.934 11.883 16.993 L 12.000 17.000 C 12.552 17.000 13.000 16.552 13.000 16.000 L 13.000 13.191 L 14.928 8.371 C 15.116 7.901 14.923 7.363 14.478 7.121 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _circleLetterY!!
    }

private var _circleLetterY: ImageVector? = null
