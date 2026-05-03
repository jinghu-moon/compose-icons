package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartBitcoin: ImageVector
    get() {
        if (_heartBitcoin != null) return _heartBitcoin!!
        _heartBitcoin = tablerOutlineIcon(
            name = "HeartBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 21.000 L 17.000 15.000M 19.000 15.000 L 19.000 13.500M 19.000 22.500 L 19.000 21.000M 17.000 18.000 L 20.000 18.000M 19.000 18.000 L 19.500 18.000 C 20.328 18.000 21.000 18.672 21.000 19.500 C 21.000 20.328 20.328 21.000 19.500 21.000 L 16.000 21.000M 19.000 18.000 L 19.500 18.000 C 20.328 18.000 21.000 17.328 21.000 16.500 C 21.000 15.672 20.328 15.000 19.500 15.000 L 16.000 15.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 13.000 19.000 L 12.000 20.000 L 4.500 12.572 C 3.151 11.260 2.654 9.301 3.212 7.504 C 3.771 5.707 5.292 4.376 7.147 4.060 C 9.002 3.743 10.877 4.496 12.000 6.006 C 13.456 4.069 16.091 3.455 18.254 4.549 C 20.416 5.643 21.483 8.129 20.785 10.450"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _heartBitcoin!!
    }

private var _heartBitcoin: ImageVector? = null
