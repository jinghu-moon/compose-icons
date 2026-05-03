package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorBoldIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.860 109.250 L 169.180 86.820 L 146.750 25.140 C 143.884 17.254 136.390 12.005 128.000 12.005 C 119.610 12.005 112.116 17.254 109.250 25.140 L 86.820 86.820 L 25.140 109.250 C 17.254 112.116 12.005 119.610 12.005 128.000 C 12.005 136.390 17.254 143.884 25.140 146.750 L 86.820 169.180 L 109.250 230.860 C 112.116 238.746 119.610 243.995 128.000 243.995 C 136.390 243.995 143.884 238.746 146.750 230.860 L 169.180 169.180 L 230.860 146.750 C 238.746 143.884 243.995 136.390 243.995 128.000 C 243.995 119.610 238.746 112.116 230.860 109.250 ZM 155.720 148.540 C 152.382 149.753 149.753 152.382 148.540 155.720 L 128.000 212.210 L 107.460 155.720 C 106.247 152.382 103.618 149.753 100.280 148.540 L 43.790 128.000 L 100.280 107.460 C 103.618 106.247 106.247 103.618 107.460 100.280 L 128.000 43.790 L 148.540 100.280 C 149.753 103.618 152.382 106.247 155.720 107.460 L 212.210 128.000 Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
