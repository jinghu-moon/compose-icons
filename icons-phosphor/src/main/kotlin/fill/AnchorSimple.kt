package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorFillIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 120.000 C 232.000 177.438 185.438 224.000 128.000 224.000 C 70.562 224.000 24.000 177.438 24.000 120.000 C 24.000 115.582 27.582 112.000 32.000 112.000 L 56.000 112.000 C 60.418 112.000 64.000 115.582 64.000 120.000 C 64.000 124.418 60.418 128.000 56.000 128.000 L 40.360 128.000 C 44.280 170.252 77.747 203.715 120.000 207.630 L 120.000 90.830 C 106.677 86.858 98.286 73.712 100.293 59.955 C 102.300 46.198 114.097 35.997 128.000 35.997 C 141.903 35.997 153.700 46.198 155.707 59.955 C 157.714 73.712 149.323 86.858 136.000 90.830 L 136.000 207.630 C 178.253 203.715 211.720 170.252 215.640 128.000 L 200.000 128.000 C 195.582 128.000 192.000 124.418 192.000 120.000 C 192.000 115.582 195.582 112.000 200.000 112.000 L 224.000 112.000 C 228.418 112.000 232.000 115.582 232.000 120.000 Z"),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
