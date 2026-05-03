package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterV: ImageVector
    get() {
        if (_squareRoundedLetterV != null) return _squareRoundedLetterV!!
        _squareRoundedLetterV = tablerFilledIcon(
            name = "SquareRoundedLetterV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 14.243 7.030 C 13.707 6.896 13.164 7.221 13.030 7.757 L 12.000 11.875 L 10.970 7.757 C 10.885 7.408 10.620 7.132 10.275 7.032 C 9.930 6.933 9.558 7.026 9.301 7.276 C 9.044 7.526 8.940 7.895 9.030 8.243 L 11.030 16.243 C 11.282 17.253 12.718 17.253 12.970 16.243 L 14.970 8.243 C 15.104 7.707 14.779 7.164 14.243 7.030"),
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
        return _squareRoundedLetterV!!
    }

private var _squareRoundedLetterV: ImageVector? = null
