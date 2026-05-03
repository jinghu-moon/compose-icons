package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorBoldIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 100.000 L 132.920 100.000 L 211.060 79.370 C 214.152 78.554 216.791 76.538 218.391 73.769 C 219.991 71.000 220.419 67.706 219.580 64.620 L 211.420 34.620 C 208.502 24.104 197.673 17.886 187.120 20.670 L 34.790 60.870 C 29.663 62.206 25.289 65.546 22.650 70.140 C 20.006 74.673 19.303 80.081 20.700 85.140 L 28.000 112.000 L 28.000 200.000 C 28.000 211.046 36.954 220.000 48.000 220.000 L 208.000 220.000 C 219.046 220.000 228.000 211.046 228.000 200.000 L 228.000 112.000 C 228.000 105.373 222.627 100.000 216.000 100.000 ZM 124.890 61.910 L 143.180 72.470 L 117.230 79.320 L 98.940 68.760 ZM 189.340 44.910 L 193.250 59.260 L 176.120 63.780 L 157.830 53.210 ZM 66.000 77.460 L 84.290 88.000 L 48.890 97.350 L 45.000 83.000 ZM 204.000 196.000 L 52.000 196.000 L 52.000 124.000 L 204.000 124.000 Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
