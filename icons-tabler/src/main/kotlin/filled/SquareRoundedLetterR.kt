package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterR: ImageVector
    get() {
        if (_squareRoundedLetterR != null) return _squareRoundedLetterR!!
        _squareRoundedLetterR = tablerFilledIcon(
            name = "SquareRoundedLetterR",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 12.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 10.117 16.993 C 10.620 16.934 11.000 16.507 11.000 16.000 L 11.000 13.668 L 13.200 16.600 C 13.531 17.042 14.158 17.131 14.600 16.800 L 14.696 16.719 C 15.058 16.368 15.103 15.803 14.800 15.400 L 12.897 12.862 L 13.012 12.825 C 14.384 12.332 15.203 10.924 14.953 9.487 C 14.704 8.051 13.458 7.002 12.000 7.000M 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 C 13.000 10.552 12.552 11.000 12.000 11.000 L 11.000 11.000 L 11.000 9.000 Z"),
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
        return _squareRoundedLetterR!!
    }

private var _squareRoundedLetterR: ImageVector? = null
