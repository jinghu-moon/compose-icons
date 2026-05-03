package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorThinIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 164.000 112.000 C 164.010 94.975 152.092 80.271 135.434 76.755 C 118.776 73.240 101.932 81.874 95.062 97.451 C 88.191 113.028 93.172 131.289 107.000 141.220 L 92.340 174.390 C 91.796 175.627 91.913 177.054 92.652 178.186 C 93.390 179.317 94.649 179.999 96.000 180.000 L 160.000 180.000 C 161.351 179.999 162.610 179.317 163.348 178.186 C 164.087 177.054 164.204 175.627 163.660 174.390 L 149.000 141.220 C 158.392 134.445 163.969 123.580 164.000 112.000 ZM 140.340 141.330 L 153.860 172.000 L 102.140 172.000 L 115.660 141.330 C 116.479 139.464 115.764 137.280 114.000 136.260 C 103.025 129.924 97.674 117.005 100.954 104.764 C 104.234 92.523 115.327 84.011 128.000 84.011 C 140.673 84.011 151.766 92.523 155.046 104.764 C 158.326 117.005 152.975 129.924 142.000 136.260 C 140.236 137.280 139.521 139.464 140.340 141.330 Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
