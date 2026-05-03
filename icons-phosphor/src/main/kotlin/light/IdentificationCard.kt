package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorLightIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 112.000 C 198.000 115.314 195.314 118.000 192.000 118.000 L 152.000 118.000 C 148.686 118.000 146.000 115.314 146.000 112.000 C 146.000 108.686 148.686 106.000 152.000 106.000 L 192.000 106.000 C 195.314 106.000 198.000 108.686 198.000 112.000 ZM 192.000 138.000 L 152.000 138.000 C 148.686 138.000 146.000 140.686 146.000 144.000 C 146.000 147.314 148.686 150.000 152.000 150.000 L 192.000 150.000 C 195.314 150.000 198.000 147.314 198.000 144.000 C 198.000 140.686 195.314 138.000 192.000 138.000 ZM 230.000 56.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 ZM 133.810 166.510 C 134.638 169.719 132.709 172.992 129.500 173.820 C 126.291 174.648 123.018 172.719 122.190 169.510 C 119.340 158.380 108.080 150.000 96.000 150.000 C 83.920 150.000 72.670 158.380 69.810 169.500 C 68.982 172.709 65.709 174.638 62.500 173.810 C 59.291 172.982 57.362 169.709 58.190 166.500 C 60.906 156.451 67.626 147.956 76.780 143.000 C 67.087 134.909 63.498 121.615 67.801 109.745 C 72.104 97.875 83.379 89.970 96.005 89.970 C 108.631 89.970 119.906 97.875 124.209 109.745 C 128.512 121.615 124.923 134.909 115.230 143.000 C 124.382 147.961 131.098 156.459 133.810 166.510 ZM 96.000 138.000 C 105.941 138.000 114.000 129.941 114.000 120.000 C 114.000 110.059 105.941 102.000 96.000 102.000 C 86.059 102.000 78.000 110.059 78.000 120.000 C 78.000 129.941 86.059 138.000 96.000 138.000 Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
