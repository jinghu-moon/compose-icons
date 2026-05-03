package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorLightIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 106.000 L 227.480 106.000 L 199.480 57.050 C 196.975 52.710 192.341 50.041 187.330 50.050 L 68.640 50.050 C 63.629 50.041 58.995 52.710 56.490 57.050 L 28.490 106.050 L 16.000 106.050 C 12.686 106.050 10.000 108.736 10.000 112.050 C 10.000 115.364 12.686 118.050 16.000 118.050 L 26.000 118.050 L 26.000 200.050 C 26.000 207.782 32.268 214.050 40.000 214.050 L 64.000 214.050 C 71.732 214.050 78.000 207.782 78.000 200.050 L 78.000 182.000 L 178.000 182.000 L 178.000 200.000 C 178.000 207.732 184.268 214.000 192.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 118.000 L 240.000 118.000 C 243.314 118.000 246.000 115.314 246.000 112.000 C 246.000 108.686 243.314 106.000 240.000 106.000 ZM 66.910 63.000 C 67.267 62.382 67.926 62.001 68.640 62.000 L 187.360 62.000 C 188.074 62.001 188.733 62.382 189.090 63.000 L 213.660 106.000 L 42.340 106.000 ZM 66.000 200.000 C 66.000 201.105 65.105 202.000 64.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 182.000 L 66.000 182.000 ZM 216.000 202.000 L 192.000 202.000 C 190.895 202.000 190.000 201.105 190.000 200.000 L 190.000 182.000 L 218.000 182.000 L 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 ZM 218.000 170.000 L 38.000 170.000 L 38.000 118.000 L 218.000 118.000 ZM 58.000 144.000 C 58.000 140.686 60.686 138.000 64.000 138.000 L 80.000 138.000 C 83.314 138.000 86.000 140.686 86.000 144.000 C 86.000 147.314 83.314 150.000 80.000 150.000 L 64.000 150.000 C 60.686 150.000 58.000 147.314 58.000 144.000 ZM 170.000 144.000 C 170.000 140.686 172.686 138.000 176.000 138.000 L 192.000 138.000 C 195.314 138.000 198.000 140.686 198.000 144.000 C 198.000 147.314 195.314 150.000 192.000 150.000 L 176.000 150.000 C 172.686 150.000 170.000 147.314 170.000 144.000 ZM 98.000 24.000 C 98.000 20.686 100.686 18.000 104.000 18.000 L 152.000 18.000 C 155.314 18.000 158.000 20.686 158.000 24.000 C 158.000 27.314 155.314 30.000 152.000 30.000 L 104.000 30.000 C 100.686 30.000 98.000 27.314 98.000 24.000 Z"),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
