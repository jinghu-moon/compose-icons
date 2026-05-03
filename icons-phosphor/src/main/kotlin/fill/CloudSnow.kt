package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorFillIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 88.000 196.000 C 88.000 202.627 82.627 208.000 76.000 208.000 C 69.373 208.000 64.000 202.627 64.000 196.000 C 64.000 189.373 69.373 184.000 76.000 184.000 C 82.627 184.000 88.000 189.373 88.000 196.000 ZM 116.000 200.000 C 109.373 200.000 104.000 205.373 104.000 212.000 C 104.000 218.627 109.373 224.000 116.000 224.000 C 122.627 224.000 128.000 218.627 128.000 212.000 C 128.000 205.373 122.627 200.000 116.000 200.000 ZM 164.000 184.000 C 157.373 184.000 152.000 189.373 152.000 196.000 C 152.000 202.627 157.373 208.000 164.000 208.000 C 170.627 208.000 176.000 202.627 176.000 196.000 C 176.000 189.373 170.627 184.000 164.000 184.000 ZM 68.000 224.000 C 61.373 224.000 56.000 229.373 56.000 236.000 C 56.000 242.627 61.373 248.000 68.000 248.000 C 74.627 248.000 80.000 242.627 80.000 236.000 C 80.000 229.373 74.627 224.000 68.000 224.000 ZM 156.000 224.000 C 149.373 224.000 144.000 229.373 144.000 236.000 C 144.000 242.627 149.373 248.000 156.000 248.000 C 162.627 248.000 168.000 242.627 168.000 236.000 C 168.000 229.373 162.627 224.000 156.000 224.000 ZM 231.870 87.550 C 229.512 47.227 196.025 15.793 155.634 15.987 C 115.243 16.181 82.060 47.936 80.090 88.280 C 79.848 92.583 76.309 95.959 72.000 96.000 L 71.400 96.000 C 67.009 95.608 63.728 91.790 64.000 87.390 C 64.278 81.828 65.058 76.302 66.330 70.880 C 66.664 69.495 66.236 68.036 65.206 67.051 C 64.175 66.066 62.699 65.704 61.330 66.100 C 39.084 72.673 23.864 93.164 24.000 116.360 C 24.200 145.070 48.120 168.000 76.840 168.000 L 156.000 168.000 C 176.922 167.977 196.910 159.339 211.265 144.118 C 225.619 128.897 233.072 108.437 231.870 87.550 Z"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
