package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorLightIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 48.000 L 230.000 88.000 C 230.000 91.314 227.314 94.000 224.000 94.000 C 220.686 94.000 218.000 91.314 218.000 88.000 L 218.000 54.000 L 184.000 54.000 C 180.686 54.000 178.000 51.314 178.000 48.000 C 178.000 44.686 180.686 42.000 184.000 42.000 L 224.000 42.000 C 227.314 42.000 230.000 44.686 230.000 48.000 ZM 72.000 202.000 L 38.000 202.000 L 38.000 168.000 C 38.000 164.686 35.314 162.000 32.000 162.000 C 28.686 162.000 26.000 164.686 26.000 168.000 L 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 72.000 214.000 C 75.314 214.000 78.000 211.314 78.000 208.000 C 78.000 204.686 75.314 202.000 72.000 202.000 ZM 224.000 162.000 C 220.686 162.000 218.000 164.686 218.000 168.000 L 218.000 202.000 L 184.000 202.000 C 180.686 202.000 178.000 204.686 178.000 208.000 C 178.000 211.314 180.686 214.000 184.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 L 230.000 168.000 C 230.000 164.686 227.314 162.000 224.000 162.000 ZM 32.000 94.000 C 35.314 94.000 38.000 91.314 38.000 88.000 L 38.000 54.000 L 72.000 54.000 C 75.314 54.000 78.000 51.314 78.000 48.000 C 78.000 44.686 75.314 42.000 72.000 42.000 L 32.000 42.000 C 28.686 42.000 26.000 44.686 26.000 48.000 L 26.000 88.000 C 26.000 91.314 28.686 94.000 32.000 94.000 ZM 187.000 165.210 L 131.000 197.210 C 129.144 198.282 126.856 198.282 125.000 197.210 L 69.000 165.210 C 67.139 164.136 65.995 162.149 66.000 160.000 L 66.000 96.000 C 65.995 93.851 67.139 91.864 69.000 90.790 L 125.000 58.790 C 126.856 57.718 129.144 57.718 131.000 58.790 L 187.000 90.790 C 188.861 91.864 190.005 93.851 190.000 96.000 L 190.000 160.000 C 190.005 162.149 188.861 164.136 187.000 165.210 ZM 84.090 96.000 L 128.000 121.090 L 171.910 96.000 L 128.000 70.910 ZM 78.000 156.520 L 122.000 181.660 L 122.000 131.480 L 78.000 106.340 ZM 178.000 156.520 L 178.000 106.340 L 134.000 131.480 L 134.000 181.660 Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
