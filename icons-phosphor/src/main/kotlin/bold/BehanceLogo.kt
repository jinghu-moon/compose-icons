package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorBoldIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 117.820 121.390 C 128.523 108.948 130.998 91.412 124.157 76.493 C 117.316 61.575 102.412 52.008 86.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 90.000 204.000 C 109.736 203.986 127.264 191.385 133.563 172.681 C 139.862 153.977 133.527 133.340 117.820 121.390 ZM 44.000 76.000 L 86.000 76.000 C 95.941 76.000 104.000 84.059 104.000 94.000 C 104.000 103.941 95.941 112.000 86.000 112.000 L 44.000 112.000 ZM 90.000 180.000 L 44.000 180.000 L 44.000 136.000 L 90.000 136.000 C 102.150 136.000 112.000 145.850 112.000 158.000 C 112.000 170.150 102.150 180.000 90.000 180.000 ZM 156.000 76.000 C 156.000 69.373 161.373 64.000 168.000 64.000 L 232.000 64.000 C 238.627 64.000 244.000 69.373 244.000 76.000 C 244.000 82.627 238.627 88.000 232.000 88.000 L 168.000 88.000 C 161.373 88.000 156.000 82.627 156.000 76.000 ZM 200.000 100.000 C 171.281 100.000 148.000 123.281 148.000 152.000 C 148.000 180.719 171.281 204.000 200.000 204.000 C 207.865 204.021 215.631 202.239 222.700 198.790 C 226.651 196.973 229.309 193.161 229.649 188.826 C 229.989 184.491 227.957 180.311 224.338 177.901 C 220.719 175.490 216.079 175.226 212.210 177.210 C 208.406 179.059 204.230 180.013 200.000 180.000 C 189.188 179.988 179.345 173.764 174.700 164.000 L 240.000 164.000 C 246.627 164.000 252.000 158.627 252.000 152.000 C 251.967 123.295 228.705 100.033 200.000 100.000 ZM 174.700 140.000 C 179.334 130.226 189.183 123.996 200.000 123.996 C 210.817 123.996 220.666 130.226 225.300 140.000 Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
