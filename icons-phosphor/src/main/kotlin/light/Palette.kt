package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorLightIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 199.370 55.310 C 180.376 36.510 154.724 25.975 128.000 26.000 L 127.000 26.000 C 71.058 26.548 25.997 72.055 26.000 128.000 C 26.000 170.090 52.070 205.440 94.000 220.260 C 97.246 221.412 100.665 222.001 104.110 222.000 C 120.622 221.907 133.967 208.512 134.000 192.000 C 134.000 182.059 142.059 174.000 152.000 174.000 L 198.210 174.000 C 212.227 174.070 224.400 164.369 227.460 150.690 C 229.214 142.954 230.067 135.042 230.000 127.110 C 229.797 100.045 218.766 74.187 199.370 55.310 ZM 215.760 148.000 C 213.930 156.213 206.624 162.041 198.210 162.000 L 152.000 162.000 C 135.431 162.000 122.000 175.431 122.000 192.000 C 122.010 197.849 119.177 203.337 114.404 206.718 C 109.632 210.098 103.514 210.950 98.000 209.000 C 61.000 195.860 38.000 164.850 38.000 128.000 C 37.997 78.655 77.728 38.510 127.070 38.000 L 128.000 38.000 C 177.327 38.182 217.389 77.897 218.000 127.220 C 218.059 134.210 217.307 141.183 215.760 148.000 ZM 138.000 76.000 C 138.000 81.523 133.523 86.000 128.000 86.000 C 122.477 86.000 118.000 81.523 118.000 76.000 C 118.000 70.477 122.477 66.000 128.000 66.000 C 133.523 66.000 138.000 70.477 138.000 76.000 ZM 94.000 100.000 C 94.000 105.523 89.523 110.000 84.000 110.000 C 78.477 110.000 74.000 105.523 74.000 100.000 C 74.000 94.477 78.477 90.000 84.000 90.000 C 89.523 90.000 94.000 94.477 94.000 100.000 ZM 94.000 156.000 C 94.000 161.523 89.523 166.000 84.000 166.000 C 78.477 166.000 74.000 161.523 74.000 156.000 C 74.000 150.477 78.477 146.000 84.000 146.000 C 89.523 146.000 94.000 150.477 94.000 156.000 ZM 182.000 100.000 C 182.000 105.523 177.523 110.000 172.000 110.000 C 166.477 110.000 162.000 105.523 162.000 100.000 C 162.000 94.477 166.477 90.000 172.000 90.000 C 177.523 90.000 182.000 94.477 182.000 100.000 Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
