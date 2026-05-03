package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorLightIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 72.000 L 134.000 118.290 L 173.320 98.630 C 176.286 97.150 179.890 98.354 181.370 101.320 C 182.850 104.286 181.646 107.890 178.680 109.370 L 130.680 133.370 C 128.820 134.299 126.611 134.198 124.843 133.104 C 123.075 132.010 121.999 130.079 122.000 128.000 L 122.000 72.000 C 122.000 68.686 124.686 66.000 128.000 66.000 C 131.314 66.000 134.000 68.686 134.000 72.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 218.000 131.314 220.686 134.000 224.000 134.000 C 227.314 134.000 230.000 131.314 230.000 128.000 C 230.000 71.667 184.333 26.000 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 131.314 230.000 134.000 227.314 134.000 224.000 C 134.000 220.686 131.314 218.000 128.000 218.000 ZM 229.800 222.460 C 230.651 225.663 228.743 228.949 225.540 229.800 C 222.337 230.651 219.051 228.743 218.200 225.540 C 215.140 214.000 204.370 206.000 192.000 206.000 C 179.630 206.000 168.860 214.000 165.800 225.540 C 165.102 228.170 162.721 230.000 160.000 230.000 C 159.480 229.998 158.963 229.930 158.460 229.800 C 156.922 229.392 155.608 228.389 154.809 227.012 C 154.011 225.636 153.791 223.998 154.200 222.460 C 156.919 212.443 163.608 203.970 172.720 199.000 C 163.057 190.894 159.496 177.610 163.808 165.757 C 168.121 153.905 179.387 146.016 192.000 146.016 C 204.613 146.016 215.879 153.905 220.192 165.757 C 224.504 177.610 220.943 190.894 211.280 199.000 C 220.392 203.970 227.081 212.443 229.800 222.460 ZM 174.000 176.000 C 174.000 185.941 182.059 194.000 192.000 194.000 C 201.941 194.000 210.000 185.941 210.000 176.000 C 210.000 166.059 201.941 158.000 192.000 158.000 C 182.059 158.000 174.000 166.059 174.000 176.000 Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
