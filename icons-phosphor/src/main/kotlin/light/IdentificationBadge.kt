package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorLightIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 151.110 166.130 C 164.037 156.226 169.217 139.187 163.988 123.764 C 158.759 108.341 144.285 97.965 128.000 97.965 C 111.715 97.965 97.241 108.341 92.012 123.764 C 86.783 139.187 91.963 156.226 104.890 166.130 C 93.060 170.548 82.753 178.280 75.200 188.400 C 73.212 191.051 73.749 194.812 76.400 196.800 C 79.051 198.788 82.812 198.251 84.800 195.600 C 94.998 182.002 111.003 174.000 128.000 174.000 C 144.997 174.000 161.002 182.002 171.200 195.600 C 173.188 198.251 176.949 198.788 179.600 196.800 C 182.251 194.812 182.788 191.051 180.800 188.400 C 173.247 178.280 162.940 170.548 151.110 166.130 ZM 128.000 110.000 C 142.359 110.000 154.000 121.641 154.000 136.000 C 154.000 150.359 142.359 162.000 128.000 162.000 C 113.641 162.000 102.000 150.359 102.000 136.000 C 102.000 121.641 113.641 110.000 128.000 110.000 ZM 200.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 40.000 C 214.000 32.268 207.732 26.000 200.000 26.000 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 200.000 38.000 C 201.105 38.000 202.000 38.895 202.000 40.000 ZM 90.000 64.000 C 90.000 60.686 92.686 58.000 96.000 58.000 L 160.000 58.000 C 163.314 58.000 166.000 60.686 166.000 64.000 C 166.000 67.314 163.314 70.000 160.000 70.000 L 96.000 70.000 C 92.686 70.000 90.000 67.314 90.000 64.000 Z"),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
