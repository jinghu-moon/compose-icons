package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorLightIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 58.000 206.000 L 58.000 224.000 C 58.000 227.314 60.686 230.000 64.000 230.000 C 67.314 230.000 70.000 227.314 70.000 224.000 L 70.000 206.000 L 186.000 206.000 L 186.000 224.000 C 186.000 227.314 188.686 230.000 192.000 230.000 C 195.314 230.000 198.000 227.314 198.000 224.000 L 198.000 206.000 L 216.000 206.000 C 223.732 206.000 230.000 199.732 230.000 192.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 216.000 194.000 L 40.000 194.000 C 38.895 194.000 38.000 193.105 38.000 192.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 L 218.000 122.000 L 197.600 122.000 C 194.439 97.969 173.173 80.514 148.987 82.098 C 124.800 83.682 105.993 103.762 105.993 128.000 C 105.993 152.238 124.800 172.318 148.987 173.902 C 173.173 175.486 194.439 158.031 197.600 134.000 L 218.000 134.000 L 218.000 192.000 C 218.000 193.105 217.105 194.000 216.000 194.000 ZM 164.630 122.000 C 161.824 116.085 155.293 112.904 148.906 114.342 C 142.519 115.780 137.981 121.453 137.981 128.000 C 137.981 134.547 142.519 140.220 148.906 141.658 C 155.293 143.096 161.824 139.915 164.630 134.000 L 185.460 134.000 C 182.352 151.334 166.523 163.426 148.982 161.866 C 131.441 160.306 117.994 145.610 117.994 128.000 C 117.994 110.390 131.441 95.694 148.982 94.134 C 166.523 92.574 182.352 104.666 185.460 122.000 Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
