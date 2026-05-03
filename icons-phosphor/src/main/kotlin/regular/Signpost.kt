package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorRegularIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 106.650 L 212.330 69.300 C 209.297 65.928 204.975 64.002 200.440 64.000 L 136.000 64.000 L 136.000 32.000 C 136.000 27.582 132.418 24.000 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 144.000 C 24.000 152.837 31.163 160.000 40.000 160.000 L 120.000 160.000 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 160.000 L 200.440 160.000 C 204.975 159.998 209.297 158.072 212.330 154.700 L 246.000 117.350 C 248.736 114.308 248.736 109.692 246.000 106.650 ZM 200.440 144.000 L 40.000 144.000 L 40.000 80.000 L 200.440 80.000 L 229.240 112.000 Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
