package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterU: ImageVector
    get() {
        if (_squareRoundedLetterU != null) return _squareRoundedLetterU!!
        _squareRoundedLetterU = tablerFilledIcon(
            name = "SquareRoundedLetterU",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 14.000 7.000 C 13.448 7.000 13.000 7.448 13.000 8.000 L 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 C 11.448 15.000 11.000 14.552 11.000 14.000 L 11.000 8.000 C 11.000 7.448 10.552 7.000 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 L 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000"),
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
        return _squareRoundedLetterU!!
    }

private var _squareRoundedLetterU: ImageVector? = null
