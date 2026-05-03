package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorLightIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 194.000 L 198.000 194.000 L 198.000 166.000 L 224.000 166.000 C 225.849 166.000 227.594 165.148 228.731 163.691 C 229.868 162.233 230.270 160.333 229.820 158.540 L 197.820 30.540 C 197.151 27.871 194.752 25.999 192.000 25.999 C 189.248 25.999 186.849 27.871 186.180 30.540 L 154.180 158.540 C 153.730 160.333 154.132 162.233 155.269 163.691 C 156.406 165.148 158.151 166.000 160.000 166.000 L 186.000 166.000 L 186.000 194.000 L 118.000 194.000 L 118.000 174.000 L 128.000 174.000 C 131.314 174.000 134.000 171.314 134.000 168.000 C 134.000 164.686 131.314 162.000 128.000 162.000 L 118.000 162.000 L 118.000 142.000 L 128.000 142.000 C 131.314 142.000 134.000 139.314 134.000 136.000 C 134.000 132.686 131.314 130.000 128.000 130.000 L 40.000 130.000 C 36.686 130.000 34.000 132.686 34.000 136.000 C 34.000 139.314 36.686 142.000 40.000 142.000 L 50.000 142.000 L 50.000 162.000 L 40.000 162.000 C 36.686 162.000 34.000 164.686 34.000 168.000 C 34.000 171.314 36.686 174.000 40.000 174.000 L 50.000 174.000 L 50.000 194.000 L 24.000 194.000 C 20.686 194.000 18.000 196.686 18.000 200.000 C 18.000 203.314 20.686 206.000 24.000 206.000 L 232.000 206.000 C 235.314 206.000 238.000 203.314 238.000 200.000 C 238.000 196.686 235.314 194.000 232.000 194.000 ZM 192.000 56.740 L 216.320 154.000 L 167.680 154.000 ZM 62.000 142.000 L 106.000 142.000 L 106.000 162.000 L 62.000 162.000 ZM 62.000 174.000 L 106.000 174.000 L 106.000 194.000 L 62.000 194.000 ZM 116.000 94.000 C 130.359 94.000 142.000 82.359 142.000 68.000 C 142.000 53.641 130.359 42.000 116.000 42.000 C 101.641 42.000 90.000 53.641 90.000 68.000 C 90.000 82.359 101.641 94.000 116.000 94.000 ZM 116.000 54.000 C 123.732 54.000 130.000 60.268 130.000 68.000 C 130.000 75.732 123.732 82.000 116.000 82.000 C 108.268 82.000 102.000 75.732 102.000 68.000 C 102.000 60.268 108.268 54.000 116.000 54.000 Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
