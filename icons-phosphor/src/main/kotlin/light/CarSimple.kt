package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarSimple: ImageVector
    get() {
        if (_carSimple != null) return _carSimple!!
        _carSimple = phosphorLightIcon(
            name = "CarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 106.000 L 227.900 106.000 L 199.590 42.310 C 197.342 37.257 192.330 34.001 186.800 34.000 L 69.200 34.000 C 63.670 34.001 58.658 37.257 56.410 42.310 L 28.100 106.000 L 16.000 106.000 C 12.686 106.000 10.000 108.686 10.000 112.000 C 10.000 115.314 12.686 118.000 16.000 118.000 L 26.000 118.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 64.000 214.000 C 71.732 214.000 78.000 207.732 78.000 200.000 L 78.000 182.000 L 178.000 182.000 L 178.000 200.000 C 178.000 207.732 184.268 214.000 192.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 118.000 L 240.000 118.000 C 243.314 118.000 246.000 115.314 246.000 112.000 C 246.000 108.686 243.314 106.000 240.000 106.000 ZM 67.370 47.190 C 67.691 46.466 68.408 45.999 69.200 46.000 L 186.800 46.000 C 187.592 45.999 188.309 46.466 188.630 47.190 L 214.770 106.000 L 41.230 106.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 192.000 202.000 C 190.895 202.000 190.000 201.105 190.000 200.000 L 190.000 176.000 C 190.000 172.686 187.314 170.000 184.000 170.000 L 72.000 170.000 C 68.686 170.000 66.000 172.686 66.000 176.000 L 66.000 200.000 C 66.000 201.105 65.105 202.000 64.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 118.000 L 218.000 118.000 Z"),
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
        return _carSimple!!
    }

private var _carSimple: ImageVector? = null
