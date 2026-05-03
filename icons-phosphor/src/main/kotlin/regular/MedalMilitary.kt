package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorRegularIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.000 40.000 L 49.000 40.000 C 39.611 40.000 32.000 47.611 32.000 57.000 L 32.000 106.210 C 32.009 112.882 35.920 118.933 42.000 121.680 L 104.600 150.130 C 85.537 160.798 76.081 182.991 81.593 204.129 C 87.105 225.267 106.195 240.018 128.040 240.018 C 149.885 240.018 168.975 225.267 174.487 204.129 C 179.999 182.991 170.543 160.798 151.480 150.130 L 214.000 121.680 C 220.080 118.933 223.991 112.882 224.000 106.210 L 224.000 57.000 C 224.000 47.611 216.389 40.000 207.000 40.000 ZM 160.000 56.000 L 160.000 128.670 L 128.000 143.210 L 96.000 128.670 L 96.000 56.000 ZM 48.000 106.210 L 48.000 57.000 C 48.000 56.448 48.448 56.000 49.000 56.000 L 80.000 56.000 L 80.000 121.390 L 48.590 107.120 C 48.232 106.959 48.001 106.603 48.000 106.210 ZM 128.000 224.000 C 110.327 224.000 96.000 209.673 96.000 192.000 C 96.000 174.327 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 174.327 160.000 192.000 C 160.000 209.673 145.673 224.000 128.000 224.000 ZM 208.000 106.210 C 207.999 106.603 207.768 106.959 207.410 107.120 L 176.000 121.390 L 176.000 56.000 L 207.000 56.000 C 207.552 56.000 208.000 56.448 208.000 57.000 Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
