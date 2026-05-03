package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorLightIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 194.000 L 230.000 194.000 L 230.000 98.670 C 230.008 93.982 227.669 89.602 223.770 87.000 L 135.770 28.340 C 131.065 25.201 124.935 25.201 120.230 28.340 L 32.230 87.000 C 28.331 89.602 25.992 93.982 26.000 98.670 L 26.000 194.000 L 16.000 194.000 C 12.686 194.000 10.000 196.686 10.000 200.000 C 10.000 203.314 12.686 206.000 16.000 206.000 L 240.000 206.000 C 243.314 206.000 246.000 203.314 246.000 200.000 C 246.000 196.686 243.314 194.000 240.000 194.000 ZM 38.000 98.670 C 37.998 97.999 38.332 97.372 38.890 97.000 L 126.890 38.330 C 127.562 37.882 128.438 37.882 129.110 38.330 L 217.110 97.000 C 217.665 97.370 217.999 97.993 218.000 98.660 L 218.000 194.000 L 190.000 194.000 L 190.000 136.000 C 190.000 132.686 187.314 130.000 184.000 130.000 L 72.000 130.000 C 68.686 130.000 66.000 132.686 66.000 136.000 L 66.000 194.000 L 38.000 194.000 ZM 178.000 142.000 L 178.000 162.000 L 134.000 162.000 L 134.000 142.000 ZM 122.000 162.000 L 78.000 162.000 L 78.000 142.000 L 122.000 142.000 ZM 78.000 174.000 L 122.000 174.000 L 122.000 194.000 L 78.000 194.000 ZM 134.000 174.000 L 178.000 174.000 L 178.000 194.000 L 134.000 194.000 Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
