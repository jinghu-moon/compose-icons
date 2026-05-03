package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorThinIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 184.000 C 180.000 199.464 167.464 212.000 152.000 212.000 C 139.910 212.000 128.240 204.170 124.250 193.390 C 123.722 192.043 123.963 190.516 124.880 189.397 C 125.796 188.278 127.245 187.741 128.670 187.992 C 130.094 188.244 131.272 189.245 131.750 190.610 C 134.580 198.240 143.280 204.000 152.000 204.000 C 163.046 204.000 172.000 195.046 172.000 184.000 C 172.000 172.954 163.046 164.000 152.000 164.000 L 40.000 164.000 C 37.791 164.000 36.000 162.209 36.000 160.000 C 36.000 157.791 37.791 156.000 40.000 156.000 L 152.000 156.000 C 167.464 156.000 180.000 168.536 180.000 184.000 ZM 148.000 72.000 C 148.000 56.536 135.464 44.000 120.000 44.000 C 107.910 44.000 96.240 51.830 92.250 62.610 C 91.530 64.668 92.591 66.924 94.635 67.682 C 96.680 68.440 98.955 67.420 99.750 65.390 C 102.580 57.760 111.280 52.000 120.000 52.000 C 131.046 52.000 140.000 60.954 140.000 72.000 C 140.000 83.046 131.046 92.000 120.000 92.000 L 24.000 92.000 C 21.791 92.000 20.000 93.791 20.000 96.000 C 20.000 98.209 21.791 100.000 24.000 100.000 L 120.000 100.000 C 135.464 100.000 148.000 87.464 148.000 72.000 ZM 208.000 76.000 C 195.910 76.000 184.240 83.830 180.250 94.610 C 179.722 95.957 179.963 97.484 180.880 98.603 C 181.796 99.722 183.245 100.259 184.670 100.008 C 186.094 99.756 187.272 98.755 187.750 97.390 C 190.580 89.760 199.280 84.000 208.000 84.000 C 219.046 84.000 228.000 92.954 228.000 104.000 C 228.000 115.046 219.046 124.000 208.000 124.000 L 32.000 124.000 C 29.791 124.000 28.000 125.791 28.000 128.000 C 28.000 130.209 29.791 132.000 32.000 132.000 L 208.000 132.000 C 223.464 132.000 236.000 119.464 236.000 104.000 C 236.000 88.536 223.464 76.000 208.000 76.000 Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
