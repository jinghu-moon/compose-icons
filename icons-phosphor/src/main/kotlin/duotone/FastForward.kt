package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorDuotoneIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 144.000 128.000 C 144.007 130.676 142.635 133.166 140.370 134.590 L 52.180 190.740 C 49.756 192.295 46.678 192.409 44.146 191.039 C 41.613 189.668 40.025 187.030 40.000 184.150 L 40.000 71.850 C 40.025 68.970 41.613 66.332 44.146 64.961 C 46.678 63.591 49.756 63.705 52.180 65.260 L 140.370 121.410 C 142.635 122.834 144.007 125.324 144.000 128.000 ZM 244.370 121.410 L 156.180 65.260 C 153.756 63.705 150.678 63.591 148.146 64.961 C 145.613 66.332 144.025 68.970 144.000 71.850 L 144.000 184.150 C 144.025 187.030 145.613 189.668 148.146 191.039 C 150.678 192.409 153.756 192.295 156.180 190.740 L 244.370 134.590 C 246.628 133.160 247.997 130.673 247.997 128.000 C 247.997 125.327 246.628 122.840 244.370 121.410 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 248.670 114.660 L 160.480 58.500 C 155.592 55.375 149.391 55.158 144.297 57.934 C 139.203 60.710 136.024 66.039 136.000 71.840 L 136.000 109.140 L 56.480 58.500 C 51.592 55.375 45.391 55.158 40.297 57.934 C 35.203 60.710 32.024 66.039 32.000 71.840 L 32.000 184.160 C 32.030 189.958 35.210 195.282 40.302 198.056 C 45.394 200.831 51.591 200.618 56.480 197.500 L 136.000 146.860 L 136.000 184.160 C 136.030 189.958 139.210 195.282 144.302 198.056 C 149.394 200.831 155.591 200.618 160.480 197.500 L 248.670 141.340 C 253.237 138.442 256.003 133.409 256.003 128.000 C 256.003 122.591 253.237 117.558 248.670 114.660 ZM 48.000 183.940 L 48.000 72.070 L 135.820 128.000 ZM 152.000 183.940 L 152.000 72.070 L 239.820 128.000 Z"),
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
