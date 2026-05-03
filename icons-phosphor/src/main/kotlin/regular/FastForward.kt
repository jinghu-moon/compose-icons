package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorRegularIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.670 114.660 L 160.480 58.500 C 155.592 55.375 149.391 55.158 144.297 57.934 C 139.203 60.710 136.024 66.039 136.000 71.840 L 136.000 109.140 L 56.480 58.500 C 51.592 55.375 45.391 55.158 40.297 57.934 C 35.203 60.710 32.024 66.039 32.000 71.840 L 32.000 184.160 C 32.030 189.958 35.210 195.282 40.302 198.056 C 45.394 200.831 51.591 200.618 56.480 197.500 L 136.000 146.860 L 136.000 184.160 C 136.030 189.958 139.210 195.282 144.302 198.056 C 149.394 200.831 155.591 200.618 160.480 197.500 L 248.670 141.340 C 253.237 138.442 256.003 133.409 256.003 128.000 C 256.003 122.591 253.237 117.558 248.670 114.660 ZM 48.000 183.940 L 48.000 72.070 L 135.820 128.000 ZM 152.000 183.940 L 152.000 72.070 L 239.820 128.000 Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
