package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorFillIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 168.000 C 256.000 172.418 252.418 176.000 248.000 176.000 L 8.000 176.000 C 5.453 176.000 3.058 174.786 1.551 172.732 C 0.044 170.678 -0.394 168.030 0.370 165.600 L 22.630 91.400 C 24.634 84.595 30.906 79.943 38.000 80.000 L 122.100 80.000 C 129.175 79.965 135.421 84.613 137.420 91.400 L 158.000 160.000 L 173.300 160.000 L 150.790 85.150 C 150.426 83.939 150.657 82.628 151.411 81.613 C 152.166 80.598 153.356 80.000 154.620 80.000 L 170.050 80.000 C 177.113 80.002 183.339 84.635 185.370 91.400 L 206.000 160.000 L 221.300 160.000 L 198.790 85.150 C 198.426 83.939 198.657 82.628 199.411 81.613 C 200.166 80.598 201.356 80.000 202.620 80.000 L 218.050 80.000 C 225.113 80.002 231.339 84.635 233.370 91.400 L 255.630 165.580 C 255.875 166.363 256.000 167.179 256.000 168.000 Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
