package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorBoldIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 212.000 L 204.000 212.000 L 204.000 117.000 L 214.140 106.860 C 217.912 103.112 220.022 98.007 220.000 92.690 L 220.000 48.000 C 220.000 36.954 211.046 28.000 200.000 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 92.690 C 35.986 97.997 38.096 103.089 41.860 106.830 L 52.000 117.000 L 52.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 217.373 28.000 224.000 C 28.000 230.627 33.373 236.000 40.000 236.000 L 216.000 236.000 C 222.627 236.000 228.000 230.627 228.000 224.000 C 228.000 217.373 222.627 212.000 216.000 212.000 ZM 72.490 103.510 L 60.000 91.000 L 60.000 52.000 L 88.000 52.000 L 88.000 76.000 C 88.000 82.627 93.373 88.000 100.000 88.000 C 106.627 88.000 112.000 82.627 112.000 76.000 L 112.000 52.000 L 144.000 52.000 L 144.000 76.000 C 144.000 82.627 149.373 88.000 156.000 88.000 C 162.627 88.000 168.000 82.627 168.000 76.000 L 168.000 52.000 L 196.000 52.000 L 196.000 91.000 L 183.510 103.480 C 181.253 105.740 179.990 108.806 180.000 112.000 L 180.000 212.000 L 164.000 212.000 L 164.000 168.000 C 164.000 148.118 147.882 132.000 128.000 132.000 C 108.118 132.000 92.000 148.118 92.000 168.000 L 92.000 212.000 L 76.000 212.000 L 76.000 112.000 C 76.003 108.816 74.740 105.762 72.490 103.510 ZM 140.000 212.000 L 116.000 212.000 L 116.000 168.000 C 116.000 161.373 121.373 156.000 128.000 156.000 C 134.627 156.000 140.000 161.373 140.000 168.000 Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
