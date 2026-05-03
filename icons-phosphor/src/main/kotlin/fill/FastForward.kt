package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorFillIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 128.000 C 256.008 133.410 253.241 138.446 248.670 141.340 L 160.480 197.500 C 155.592 200.625 149.391 200.842 144.297 198.066 C 139.203 195.290 136.024 189.961 136.000 184.160 L 136.000 146.860 L 56.480 197.500 C 51.592 200.625 45.391 200.842 40.297 198.066 C 35.203 195.290 32.024 189.961 32.000 184.160 L 32.000 71.840 C 32.024 66.039 35.203 60.710 40.297 57.934 C 45.391 55.158 51.592 55.375 56.480 58.500 L 136.000 109.140 L 136.000 71.840 C 136.024 66.039 139.203 60.710 144.297 57.934 C 149.391 55.158 155.592 55.375 160.480 58.500 L 248.670 114.660 C 253.241 117.554 256.008 122.590 256.000 128.000 Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
