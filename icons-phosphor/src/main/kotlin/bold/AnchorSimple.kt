package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorBoldIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 108.000 L 200.000 108.000 C 193.373 108.000 188.000 113.373 188.000 120.000 C 188.000 126.627 193.373 132.000 200.000 132.000 L 211.150 132.000 C 205.764 168.833 176.833 197.759 140.000 203.140 L 140.000 97.940 C 156.531 92.096 166.446 75.192 163.482 57.911 C 160.517 40.630 145.533 27.999 128.000 27.999 C 110.467 27.999 95.483 40.630 92.518 57.911 C 89.554 75.192 99.469 92.096 116.000 97.940 L 116.000 203.140 C 79.167 197.759 50.236 168.833 44.850 132.000 L 56.000 132.000 C 62.627 132.000 68.000 126.627 68.000 120.000 C 68.000 113.373 62.627 108.000 56.000 108.000 L 32.000 108.000 C 25.373 108.000 20.000 113.373 20.000 120.000 C 20.000 179.647 68.353 228.000 128.000 228.000 C 187.647 228.000 236.000 179.647 236.000 120.000 C 236.000 113.373 230.627 108.000 224.000 108.000 ZM 128.000 52.000 C 134.627 52.000 140.000 57.373 140.000 64.000 C 140.000 70.627 134.627 76.000 128.000 76.000 C 121.373 76.000 116.000 70.627 116.000 64.000 C 116.000 57.373 121.373 52.000 128.000 52.000 Z"),
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
