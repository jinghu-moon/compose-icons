package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorRegularIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 C 248.002 150.651 234.358 171.073 213.431 179.741 C 192.504 188.410 168.416 183.618 152.400 167.600 L 152.070 167.250 L 92.120 99.550 C 76.451 84.064 51.210 84.163 35.663 99.771 C 20.116 115.379 20.116 140.621 35.663 156.229 C 51.210 171.837 76.451 171.936 92.120 156.450 L 100.640 146.830 C 103.570 143.516 108.631 143.205 111.945 146.135 C 115.259 149.065 115.570 154.126 112.640 157.440 L 103.950 167.250 L 103.620 167.600 C 81.750 189.468 46.294 189.467 24.425 167.597 C 2.557 145.728 2.557 110.272 24.425 88.403 C 46.294 66.533 81.750 66.532 103.620 88.400 L 103.950 88.750 L 163.900 156.450 C 179.569 171.936 204.810 171.837 220.357 156.229 C 235.904 140.621 235.904 115.379 220.357 99.771 C 204.810 84.163 179.569 84.064 163.900 99.550 L 155.380 109.170 C 152.450 112.484 147.389 112.795 144.075 109.865 C 140.761 106.935 140.450 101.874 143.380 98.560 L 152.070 88.750 L 152.400 88.400 C 168.416 72.382 192.504 67.590 213.431 76.259 C 234.358 84.927 248.002 105.349 248.000 128.000 Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
