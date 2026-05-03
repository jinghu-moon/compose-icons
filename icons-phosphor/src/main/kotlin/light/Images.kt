package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorLightIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 72.000 42.000 C 64.268 42.000 58.000 48.268 58.000 56.000 L 58.000 74.000 L 40.000 74.000 C 32.268 74.000 26.000 80.268 26.000 88.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 184.000 214.000 C 191.732 214.000 198.000 207.732 198.000 200.000 L 198.000 182.000 L 216.000 182.000 C 223.732 182.000 230.000 175.732 230.000 168.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 70.000 56.000 C 70.000 54.895 70.895 54.000 72.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 L 218.000 123.570 L 204.530 110.100 C 201.904 107.474 198.343 105.999 194.630 105.999 C 190.917 105.999 187.356 107.474 184.730 110.100 L 163.310 131.510 L 117.900 86.100 C 115.274 83.474 111.713 81.999 108.000 81.999 C 104.287 81.999 100.726 83.474 98.100 86.100 L 70.000 114.200 ZM 186.000 200.000 C 186.000 201.105 185.105 202.000 184.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 88.000 C 38.000 86.895 38.895 86.000 40.000 86.000 L 58.000 86.000 L 58.000 168.000 C 58.000 175.732 64.268 182.000 72.000 182.000 L 186.000 182.000 ZM 216.000 170.000 L 72.000 170.000 C 70.895 170.000 70.000 169.105 70.000 168.000 L 70.000 131.170 L 106.580 94.590 C 106.955 94.214 107.464 94.003 107.995 94.003 C 108.526 94.003 109.035 94.214 109.410 94.590 L 159.070 144.250 C 160.195 145.377 161.723 146.010 163.315 146.010 C 164.907 146.010 166.435 145.377 167.560 144.250 L 193.210 118.590 C 193.585 118.214 194.094 118.003 194.625 118.003 C 195.156 118.003 195.665 118.214 196.040 118.590 L 218.040 140.590 L 218.040 168.000 C 218.040 168.537 217.824 169.052 217.440 169.429 C 217.056 169.805 216.537 170.011 216.000 170.000 ZM 162.000 84.000 C 162.000 78.477 166.477 74.000 172.000 74.000 C 177.523 74.000 182.000 78.477 182.000 84.000 C 182.000 89.523 177.523 94.000 172.000 94.000 C 166.477 94.000 162.000 89.523 162.000 84.000 Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
