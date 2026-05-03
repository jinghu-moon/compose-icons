package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorBoldIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 85.576 20.038 47.103 44.909 29.654 83.579 C 12.205 122.248 19.011 167.552 47.053 199.387 C 75.095 231.222 119.178 243.690 159.740 231.260 C 161.628 230.686 163.345 229.656 164.740 228.260 L 228.310 164.690 C 229.704 163.294 230.734 161.577 231.310 159.690 C 241.330 126.929 235.224 91.358 214.853 63.814 C 194.482 36.269 162.259 20.014 128.000 20.000 ZM 209.120 149.910 L 149.920 209.110 C 113.248 218.976 74.523 202.971 55.518 170.092 C 36.513 137.214 41.972 95.668 68.825 68.815 C 95.678 41.962 137.224 36.503 170.102 55.508 C 202.981 74.513 218.986 113.238 209.120 149.910 ZM 76.000 108.000 C 76.000 99.163 83.163 92.000 92.000 92.000 C 100.837 92.000 108.000 99.163 108.000 108.000 C 108.000 116.837 100.837 124.000 92.000 124.000 C 83.163 124.000 76.000 116.837 76.000 108.000 ZM 180.000 108.000 C 180.000 116.837 172.837 124.000 164.000 124.000 C 155.163 124.000 148.000 116.837 148.000 108.000 C 148.000 99.163 155.163 92.000 164.000 92.000 C 172.837 92.000 180.000 99.163 180.000 108.000 ZM 178.390 158.000 C 167.390 177.060 149.000 188.000 128.000 188.000 C 107.000 188.000 88.640 177.070 77.610 158.000 C 74.442 152.276 76.443 145.069 82.108 141.798 C 87.774 138.526 95.016 140.395 98.390 146.000 C 102.280 152.730 111.300 164.000 128.000 164.000 C 144.700 164.000 153.720 152.720 157.610 146.000 C 159.711 142.203 163.698 139.837 168.038 139.811 C 172.377 139.785 176.392 142.103 178.539 145.875 C 180.685 149.646 180.628 154.282 178.390 158.000 Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
