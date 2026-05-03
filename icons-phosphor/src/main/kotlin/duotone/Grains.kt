package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorDuotoneIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 64.000 L 208.000 120.000 C 163.817 120.000 128.000 155.817 128.000 200.000 C 128.000 155.817 92.183 120.000 48.000 120.000 L 48.000 64.000 C 60.525 63.990 72.876 66.933 84.050 72.590 L 84.050 72.590 C 95.620 40.190 128.000 24.000 128.000 24.000 C 128.000 24.000 160.390 40.190 172.000 72.580 L 172.000 72.580 C 183.159 66.931 195.493 63.992 208.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 56.000 C 197.102 56.000 186.301 58.035 176.150 62.000 C 161.830 32.300 132.900 17.540 131.580 16.870 C 129.327 15.742 126.673 15.742 124.420 16.870 C 123.090 17.540 94.170 32.300 79.850 62.000 C 69.699 58.035 58.898 56.000 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 L 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 L 216.000 64.000 C 216.000 59.582 212.418 56.000 208.000 56.000 ZM 120.000 215.560 C 83.578 211.442 56.042 180.654 56.000 144.000 L 56.000 128.440 C 92.422 132.558 119.958 163.346 120.000 200.000 ZM 120.000 149.460 C 105.151 128.295 81.746 114.732 56.000 112.370 L 56.000 72.440 C 92.422 76.558 119.958 107.346 120.000 144.000 ZM 94.150 69.110 C 103.370 49.890 120.580 37.760 128.000 33.200 C 135.440 37.740 152.600 49.800 161.840 69.110 C 147.047 78.258 135.277 91.562 128.000 107.360 C 120.721 91.561 108.947 78.257 94.150 69.110 ZM 200.000 144.000 C 199.958 180.654 172.422 211.442 136.000 215.560 L 136.000 200.000 C 136.042 163.346 163.578 132.558 200.000 128.440 ZM 200.000 112.370 C 174.254 114.732 150.849 128.295 136.000 149.460 L 136.000 144.000 C 136.042 107.346 163.578 76.558 200.000 72.440 Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
