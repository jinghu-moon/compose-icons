package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockBitcoin: ImageVector
    get() {
        if (_clockBitcoin != null) return _clockBitcoin!!
        _clockBitcoin = tablerOutlineIcon(
            name = "ClockBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 21.000 L 17.000 15.000M 19.000 15.000 L 19.000 13.500M 19.000 22.500 L 19.000 21.000M 17.000 18.000 L 20.000 18.000M 19.000 18.000 L 19.500 18.000 C 20.328 18.000 21.000 18.672 21.000 19.500 C 21.000 20.328 20.328 21.000 19.500 21.000 L 16.000 21.000M 19.000 18.000 L 19.500 18.000 C 20.328 18.000 21.000 17.328 21.000 16.500 C 21.000 15.672 20.328 15.000 19.500 15.000 L 16.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 20.866 10.450 C 20.021 5.618 15.463 2.352 10.617 3.107 C 5.770 3.861 2.420 8.357 3.083 13.217 C 3.747 18.077 8.179 21.511 13.051 20.938"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 7.000 L 12.000 12.000 L 13.500 13.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _clockBitcoin!!
    }

private var _clockBitcoin: ImageVector? = null
