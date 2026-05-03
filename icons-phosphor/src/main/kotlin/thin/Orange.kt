package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorThinIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 155.620 72.690 C 179.768 64.306 195.968 41.562 196.000 16.000 C 196.000 13.791 194.209 12.000 192.000 12.000 L 184.000 12.000 C 159.172 12.032 136.920 27.330 128.000 50.500 C 119.080 27.330 96.828 12.032 72.000 12.000 L 64.000 12.000 C 61.791 12.000 60.000 13.791 60.000 16.000 C 60.000 18.209 61.791 20.000 64.000 20.000 L 72.000 20.000 C 99.193 20.037 121.777 40.996 123.840 68.110 C 80.624 70.237 46.094 104.843 44.062 148.064 C 42.030 191.284 73.161 228.978 115.987 235.150 C 158.813 241.321 199.321 213.952 209.576 171.917 C 219.830 129.881 196.477 86.933 155.620 72.690 ZM 184.000 20.000 L 187.850 20.000 C 185.727 47.073 163.156 67.968 136.000 68.000 L 132.150 68.000 C 134.273 40.927 156.844 20.032 184.000 20.000 ZM 128.000 228.000 C 86.026 228.000 52.000 193.974 52.000 152.000 C 52.000 110.026 86.026 76.000 128.000 76.000 C 169.974 76.000 204.000 110.026 204.000 152.000 C 203.956 193.955 169.955 227.956 128.000 228.000 ZM 179.940 160.660 C 176.042 182.760 158.754 200.071 136.660 204.000 C 136.441 204.031 136.221 204.048 136.000 204.050 C 133.908 204.066 132.157 202.466 131.983 200.381 C 131.810 198.296 133.274 196.429 135.340 196.100 C 154.070 192.780 168.735 178.119 172.060 159.390 C 172.230 157.923 173.195 156.668 174.570 156.128 C 175.945 155.588 177.506 155.849 178.630 156.808 C 179.754 157.767 180.257 159.267 179.940 160.710 Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
