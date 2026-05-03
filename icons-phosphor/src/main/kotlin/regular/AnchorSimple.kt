package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorRegularIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 112.000 L 200.000 112.000 C 195.582 112.000 192.000 115.582 192.000 120.000 C 192.000 124.418 195.582 128.000 200.000 128.000 L 215.640 128.000 C 211.720 170.252 178.253 203.715 136.000 207.630 L 136.000 95.000 C 151.602 90.971 161.775 75.970 159.745 59.984 C 157.714 43.998 144.114 32.016 128.000 32.016 C 111.886 32.016 98.285 43.998 96.255 59.984 C 94.225 75.970 104.398 90.971 120.000 95.000 L 120.000 207.630 C 77.747 203.715 44.280 170.252 40.360 128.000 L 56.000 128.000 C 60.418 128.000 64.000 124.418 64.000 120.000 C 64.000 115.582 60.418 112.000 56.000 112.000 L 32.000 112.000 C 27.582 112.000 24.000 115.582 24.000 120.000 C 24.000 177.438 70.562 224.000 128.000 224.000 C 185.438 224.000 232.000 177.438 232.000 120.000 C 232.000 115.582 228.418 112.000 224.000 112.000 ZM 112.000 64.000 C 112.000 55.163 119.163 48.000 128.000 48.000 C 136.837 48.000 144.000 55.163 144.000 64.000 C 144.000 72.837 136.837 80.000 128.000 80.000 C 119.163 80.000 112.000 72.837 112.000 64.000 Z"),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
