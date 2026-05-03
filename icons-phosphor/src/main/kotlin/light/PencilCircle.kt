package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorLightIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.120 55.870 C 174.423 29.753 136.693 19.425 101.277 28.813 C 65.861 38.201 38.202 65.863 28.816 101.279 C 19.430 136.696 29.761 174.425 55.880 200.120 C 81.577 226.237 119.307 236.565 154.723 227.177 C 190.139 217.789 217.798 190.127 227.184 154.711 C 236.570 119.294 226.239 81.565 200.120 55.870 ZM 106.000 134.000 L 150.000 134.000 L 164.100 164.560 C 151.335 158.930 136.375 162.842 128.000 174.000 C 119.630 162.830 104.662 158.909 91.890 164.540 ZM 111.540 122.000 L 128.000 86.320 L 144.470 122.000 ZM 134.000 192.000 C 134.000 182.059 142.059 174.000 152.000 174.000 C 161.941 174.000 170.000 182.059 170.000 192.000 L 170.000 207.640 C 158.851 213.524 146.581 216.980 134.000 217.780 ZM 86.000 192.000 C 86.000 182.059 94.059 174.000 104.000 174.000 C 113.941 174.000 122.000 182.059 122.000 192.000 L 122.000 217.780 C 109.419 216.980 97.149 213.524 86.000 207.640 ZM 191.640 191.640 C 188.622 194.645 185.401 197.438 182.000 200.000 L 182.000 176.000 C 182.000 175.133 181.812 174.277 181.450 173.490 L 133.450 69.490 C 132.470 67.362 130.342 65.999 128.000 65.999 C 125.658 65.999 123.530 67.362 122.550 69.490 L 74.550 173.490 C 74.188 174.277 74.000 175.133 74.000 176.000 L 74.000 200.000 C 70.598 197.435 67.377 194.638 64.360 191.630 C 29.213 156.483 29.213 99.498 64.361 64.351 C 99.508 29.204 156.492 29.204 191.639 64.351 C 226.787 99.498 226.787 156.483 191.640 191.630 Z"),
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
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
