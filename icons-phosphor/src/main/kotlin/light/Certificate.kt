package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorLightIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 126.000 136.000 C 126.000 139.314 123.314 142.000 120.000 142.000 L 72.000 142.000 C 68.686 142.000 66.000 139.314 66.000 136.000 C 66.000 132.686 68.686 130.000 72.000 130.000 L 120.000 130.000 C 123.314 130.000 126.000 132.686 126.000 136.000 ZM 120.000 98.000 L 72.000 98.000 C 68.686 98.000 66.000 100.686 66.000 104.000 C 66.000 107.314 68.686 110.000 72.000 110.000 L 120.000 110.000 C 123.314 110.000 126.000 107.314 126.000 104.000 C 126.000 100.686 123.314 98.000 120.000 98.000 ZM 230.000 160.620 L 230.000 224.000 C 230.005 226.146 228.863 228.131 227.006 229.207 C 225.149 230.282 222.859 230.283 221.000 229.210 L 196.000 214.910 L 171.000 229.210 C 169.141 230.283 166.851 230.282 164.994 229.207 C 163.137 228.131 161.995 226.146 162.000 224.000 L 162.000 198.000 L 40.000 198.000 C 32.268 198.000 26.000 191.732 26.000 184.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 L 230.000 87.380 C 240.200 96.826 245.999 110.098 245.999 124.000 C 245.999 137.902 240.200 151.174 230.000 160.620 ZM 196.000 86.000 C 175.013 86.000 158.000 103.013 158.000 124.000 C 158.000 144.987 175.013 162.000 196.000 162.000 C 216.987 162.000 234.000 144.987 234.000 124.000 C 234.000 103.013 216.987 86.000 196.000 86.000 ZM 162.000 186.000 L 162.000 160.620 C 143.906 143.734 140.888 116.151 154.903 95.752 C 168.918 75.353 195.748 68.277 218.000 79.110 L 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 184.000 C 38.000 185.105 38.895 186.000 40.000 186.000 ZM 218.000 168.890 C 204.125 175.704 187.875 175.704 174.000 168.890 L 174.000 213.660 L 193.000 202.790 C 194.856 201.718 197.144 201.718 199.000 202.790 L 218.000 213.660 Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
