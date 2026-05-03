package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorLightIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 26.000 L 123.310 26.000 C 119.596 25.993 116.032 27.469 113.410 30.100 L 101.660 41.860 L 89.900 30.100 C 87.274 27.474 83.713 25.999 80.000 25.999 C 76.287 25.999 72.726 27.474 70.100 30.100 L 46.100 54.100 C 43.474 56.726 41.999 60.287 41.999 64.000 C 41.999 67.713 43.474 71.274 46.100 73.900 L 57.860 85.660 L 46.100 97.410 C 43.469 100.032 41.993 103.596 42.000 107.310 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 40.000 C 214.000 32.268 207.732 26.000 200.000 26.000 ZM 54.590 65.410 C 53.815 64.630 53.815 63.370 54.590 62.590 L 78.590 38.590 C 79.370 37.815 80.630 37.815 81.410 38.590 L 93.170 50.340 L 66.340 77.170 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 107.310 C 54.002 106.780 54.214 106.273 54.590 105.900 L 70.590 89.900 L 70.590 89.900 L 105.900 54.590 L 105.900 54.590 L 121.900 38.590 C 122.273 38.214 122.780 38.002 123.310 38.000 L 200.000 38.000 C 201.105 38.000 202.000 38.895 202.000 40.000 ZM 182.000 64.000 C 182.000 67.314 179.314 70.000 176.000 70.000 L 136.000 70.000 C 132.686 70.000 130.000 67.314 130.000 64.000 C 130.000 60.686 132.686 58.000 136.000 58.000 L 176.000 58.000 C 179.314 58.000 182.000 60.686 182.000 64.000 ZM 179.600 124.800 L 138.000 156.000 L 179.600 187.200 C 182.251 189.188 182.788 192.949 180.800 195.600 C 178.812 198.251 175.051 198.788 172.400 196.800 L 128.000 163.500 L 83.600 196.800 C 80.949 198.788 77.188 198.251 75.200 195.600 C 73.212 192.949 73.749 189.188 76.400 187.200 L 118.000 156.000 L 76.400 124.800 C 73.749 122.812 73.212 119.051 75.200 116.400 C 77.188 113.749 80.949 113.212 83.600 115.200 L 128.000 148.500 L 172.400 115.200 C 175.051 113.212 178.812 113.749 180.800 116.400 C 182.788 119.051 182.251 122.812 179.600 124.800 Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
