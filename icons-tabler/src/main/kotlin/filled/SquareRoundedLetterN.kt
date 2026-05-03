package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterN: ImageVector
    get() {
        if (_squareRoundedLetterN != null) return _squareRoundedLetterN!!
        _squareRoundedLetterN = tablerFilledIcon(
            name = "SquareRoundedLetterN",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 10.894 7.553 C 10.423 6.609 9.000 6.945 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 10.117 16.993 C 10.620 16.934 11.000 16.507 11.000 16.000 L 11.000 12.236 L 13.106 16.447 C 13.577 17.391 15.000 17.055 15.000 16.000 L 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000 L 13.883 7.007 C 13.380 7.066 13.000 7.493 13.000 8.000 L 13.000 11.764 Z"),
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
        return _squareRoundedLetterN!!
    }

private var _squareRoundedLetterN: ImageVector? = null
