package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterY: ImageVector
    get() {
        if (_squareRoundedLetterY != null) return _squareRoundedLetterY!!
        _squareRoundedLetterY = tablerFilledIcon(
            name = "SquareRoundedLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 14.371 7.071 C 14.125 6.973 13.849 6.976 13.605 7.081 C 13.362 7.185 13.169 7.383 13.071 7.629 L 12.000 10.307 L 10.928 7.629 C 10.711 7.136 10.142 6.903 9.642 7.103 C 9.141 7.303 8.889 7.864 9.072 8.371 L 11.000 13.194 L 11.000 16.000 C 11.000 16.507 11.380 16.934 11.883 16.993 L 12.000 17.000 C 12.552 17.000 13.000 16.552 13.000 16.000 L 13.000 13.191 L 14.928 8.371 C 15.116 7.901 14.923 7.363 14.478 7.121 Z"),
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
        return _squareRoundedLetterY!!
    }

private var _squareRoundedLetterY: ImageVector? = null
