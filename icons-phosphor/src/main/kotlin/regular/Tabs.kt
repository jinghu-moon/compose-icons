package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorRegularIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.660 165.700 L 255.660 165.700 L 255.660 165.700 C 255.664 165.674 255.664 165.646 255.660 165.620 L 233.370 91.400 C 231.371 84.613 225.125 79.965 218.050 80.000 L 208.000 80.000 C 203.582 80.000 200.000 83.582 200.000 88.000 C 200.000 92.418 203.582 96.000 208.000 96.000 L 218.050 96.000 L 237.250 160.000 L 206.000 160.000 L 185.370 91.400 C 183.371 84.613 177.125 79.965 170.050 80.000 L 160.000 80.000 C 155.582 80.000 152.000 83.582 152.000 88.000 C 152.000 92.418 155.582 96.000 160.000 96.000 L 170.050 96.000 L 189.250 160.000 L 158.000 160.000 L 137.370 91.400 C 135.371 84.613 129.125 79.965 122.050 80.000 L 38.000 80.000 C 30.906 79.943 24.634 84.595 22.630 91.400 L 0.370 165.600 L 0.370 165.650 L 0.370 165.650 C 0.370 165.650 0.370 165.700 0.370 165.730 C 0.139 166.465 0.015 167.230 0.000 168.000 C 0.000 172.418 3.582 176.000 8.000 176.000 L 248.000 176.000 C 250.529 175.999 252.908 174.803 254.417 172.774 C 255.926 170.745 256.387 168.122 255.660 165.700 ZM 38.000 96.000 L 122.100 96.000 L 141.300 160.000 L 18.750 160.000 Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
