package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorFillIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 117.350 L 212.330 154.700 C 209.297 158.072 204.975 159.998 200.440 160.000 L 136.000 160.000 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 160.000 L 40.000 160.000 C 31.163 160.000 24.000 152.837 24.000 144.000 L 24.000 80.000 C 24.000 71.163 31.163 64.000 40.000 64.000 L 120.000 64.000 L 120.000 32.000 C 120.000 27.582 123.582 24.000 128.000 24.000 C 132.418 24.000 136.000 27.582 136.000 32.000 L 136.000 64.000 L 200.440 64.000 C 204.975 64.002 209.297 65.928 212.330 69.300 L 246.000 106.650 C 248.736 109.692 248.736 114.308 246.000 117.350 Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
