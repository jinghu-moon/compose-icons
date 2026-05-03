package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorLightIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 L 218.000 163.570 L 188.530 134.100 C 185.904 131.474 182.343 129.999 178.630 129.999 C 174.917 129.999 171.356 131.474 168.730 134.100 L 147.310 155.520 L 101.900 110.100 C 99.274 107.474 95.713 105.999 92.000 105.999 C 88.287 105.999 84.726 107.474 82.100 110.100 L 38.000 154.200 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 ZM 38.000 200.000 L 38.000 171.170 L 90.580 118.590 C 90.956 118.211 91.467 117.998 92.000 117.998 C 92.533 117.998 93.044 118.211 93.420 118.590 L 176.830 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 ZM 216.000 202.000 L 193.800 202.000 L 155.800 164.000 L 177.210 142.580 C 177.585 142.204 178.094 141.993 178.625 141.993 C 179.156 141.993 179.665 142.204 180.040 142.580 L 218.040 180.580 L 218.040 200.000 C 218.040 200.537 217.824 201.052 217.440 201.429 C 217.056 201.805 216.537 202.011 216.000 202.000 ZM 146.000 100.000 C 146.000 94.477 150.477 90.000 156.000 90.000 C 161.523 90.000 166.000 94.477 166.000 100.000 C 166.000 105.523 161.523 110.000 156.000 110.000 C 150.477 110.000 146.000 105.523 146.000 100.000 Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
