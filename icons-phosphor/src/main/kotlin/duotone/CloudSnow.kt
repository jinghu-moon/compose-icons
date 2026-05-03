package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorDuotoneIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 92.000 C 224.000 129.555 193.555 160.000 156.000 160.000 L 76.000 160.000 C 58.556 159.983 42.769 149.663 35.755 133.690 C 28.742 117.718 31.826 99.111 43.618 86.256 C 55.411 73.401 73.683 68.727 90.200 74.340 L 90.200 74.450 C 99.038 41.473 130.940 20.146 164.791 24.587 C 198.642 29.027 223.966 57.859 224.000 92.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 88.000 196.000 C 88.000 202.627 82.627 208.000 76.000 208.000 C 69.373 208.000 64.000 202.627 64.000 196.000 C 64.000 189.373 69.373 184.000 76.000 184.000 C 82.627 184.000 88.000 189.373 88.000 196.000 ZM 116.000 200.000 C 109.373 200.000 104.000 205.373 104.000 212.000 C 104.000 218.627 109.373 224.000 116.000 224.000 C 122.627 224.000 128.000 218.627 128.000 212.000 C 128.000 205.373 122.627 200.000 116.000 200.000 ZM 164.000 184.000 C 157.373 184.000 152.000 189.373 152.000 196.000 C 152.000 202.627 157.373 208.000 164.000 208.000 C 170.627 208.000 176.000 202.627 176.000 196.000 C 176.000 189.373 170.627 184.000 164.000 184.000 ZM 68.000 224.000 C 61.373 224.000 56.000 229.373 56.000 236.000 C 56.000 242.627 61.373 248.000 68.000 248.000 C 74.627 248.000 80.000 242.627 80.000 236.000 C 80.000 229.373 74.627 224.000 68.000 224.000 ZM 156.000 224.000 C 149.373 224.000 144.000 229.373 144.000 236.000 C 144.000 242.627 149.373 248.000 156.000 248.000 C 162.627 248.000 168.000 242.627 168.000 236.000 C 168.000 229.373 162.627 224.000 156.000 224.000 ZM 232.000 92.000 C 231.956 133.955 197.955 167.956 156.000 168.000 L 76.000 168.000 C 47.281 168.000 24.000 144.719 24.000 116.000 C 24.000 87.281 47.281 64.000 76.000 64.000 C 78.989 64.003 81.973 64.257 84.920 64.760 C 98.084 30.567 133.749 10.614 169.775 17.286 C 205.801 23.959 231.955 55.361 232.000 92.000 ZM 216.000 92.000 C 215.867 59.615 190.082 33.168 157.712 32.213 C 125.341 31.258 98.042 56.140 96.000 88.460 C 95.746 92.878 91.958 96.254 87.540 96.000 C 83.122 95.746 79.746 91.958 80.000 87.540 Q 80.210 83.880 80.770 80.310 C 79.188 80.107 77.595 80.003 76.000 80.000 C 56.118 80.000 40.000 96.118 40.000 116.000 C 40.000 135.882 56.118 152.000 76.000 152.000 L 156.000 152.000 C 189.121 151.961 215.961 125.121 216.000 92.000 Z"),
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
