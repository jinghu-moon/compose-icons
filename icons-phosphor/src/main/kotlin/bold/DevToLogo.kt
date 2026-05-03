package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorBoldIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 52.000 L 24.000 52.000 C 12.954 52.000 4.000 60.954 4.000 72.000 L 4.000 184.000 C 4.000 195.046 12.954 204.000 24.000 204.000 L 232.000 204.000 C 243.046 204.000 252.000 195.046 252.000 184.000 L 252.000 72.000 C 252.000 60.954 243.046 52.000 232.000 52.000 ZM 228.000 180.000 L 28.000 180.000 L 28.000 76.000 L 228.000 76.000 ZM 108.000 156.000 L 108.000 100.000 C 108.000 93.373 113.373 88.000 120.000 88.000 L 140.000 88.000 C 146.627 88.000 152.000 93.373 152.000 100.000 C 152.000 106.627 146.627 112.000 140.000 112.000 L 132.000 112.000 L 132.000 116.000 C 138.627 116.000 144.000 121.373 144.000 128.000 C 144.000 134.627 138.627 140.000 132.000 140.000 L 132.000 144.000 L 140.000 144.000 C 146.627 144.000 152.000 149.373 152.000 156.000 C 152.000 162.627 146.627 168.000 140.000 168.000 L 120.000 168.000 C 113.373 168.000 108.000 162.627 108.000 156.000 ZM 160.460 103.300 C 158.637 96.927 162.327 90.283 168.700 88.460 C 175.073 86.637 181.717 90.327 183.540 96.700 L 188.000 112.320 L 192.460 96.700 C 194.283 90.327 200.927 86.637 207.300 88.460 C 213.673 90.283 217.363 96.927 215.540 103.300 L 199.540 159.300 C 198.070 164.455 193.360 168.009 188.000 168.009 C 182.640 168.009 177.930 164.455 176.460 159.300 ZM 52.000 168.000 L 64.000 168.000 C 83.882 168.000 100.000 151.882 100.000 132.000 L 100.000 124.000 C 100.000 104.118 83.882 88.000 64.000 88.000 L 52.000 88.000 C 45.373 88.000 40.000 93.373 40.000 100.000 L 40.000 156.000 C 40.000 162.627 45.373 168.000 52.000 168.000 ZM 64.000 112.000 C 70.627 112.000 76.000 117.373 76.000 124.000 L 76.000 132.000 C 76.000 138.627 70.627 144.000 64.000 144.000 Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
