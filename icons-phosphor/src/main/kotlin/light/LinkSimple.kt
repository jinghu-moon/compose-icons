package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorLightIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.250 91.750 C 165.377 92.875 166.010 94.403 166.010 95.995 C 166.010 97.587 165.377 99.115 164.250 100.240 L 100.250 164.240 C 97.903 166.552 94.130 166.539 91.799 164.211 C 89.468 161.882 89.451 158.110 91.760 155.760 L 155.760 91.760 C 156.884 90.632 158.410 89.997 160.003 89.995 C 161.595 89.993 163.123 90.625 164.250 91.750 ZM 214.200 41.800 C 193.094 20.742 158.926 20.742 137.820 41.800 L 107.750 71.850 C 105.406 74.194 105.406 77.996 107.750 80.340 C 110.094 82.684 113.896 82.684 116.240 80.340 L 146.310 50.280 C 162.716 33.874 189.314 33.874 205.720 50.280 C 222.126 66.686 222.126 93.284 205.720 109.690 L 175.640 139.760 C 173.296 142.104 173.296 145.906 175.640 148.250 C 177.984 150.594 181.786 150.594 184.130 148.250 L 214.200 118.180 C 224.331 108.053 230.022 94.315 230.022 79.990 C 230.022 65.665 224.331 51.927 214.200 41.800 ZM 139.760 175.640 L 109.690 205.720 C 93.284 222.126 66.686 222.126 50.280 205.720 C 33.874 189.314 33.874 162.716 50.280 146.310 L 80.340 116.240 C 82.684 113.896 82.684 110.094 80.340 107.750 C 77.996 105.406 74.194 105.406 71.850 107.750 L 41.850 137.820 C 20.755 158.912 20.753 193.110 41.845 214.205 C 62.937 235.300 97.135 235.302 118.230 214.210 L 148.300 184.130 C 150.644 181.786 150.644 177.984 148.300 175.640 C 145.956 173.296 142.154 173.296 139.810 175.640 Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
