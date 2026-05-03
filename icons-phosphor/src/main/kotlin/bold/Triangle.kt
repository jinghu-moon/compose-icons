package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorBoldIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.260 186.100 L 152.810 34.230 L 152.810 34.230 C 147.656 25.415 138.211 19.997 128.000 19.997 C 117.789 19.997 108.344 25.415 103.190 34.230 L 15.740 186.100 C 10.736 194.659 10.736 205.251 15.740 213.810 C 20.840 222.674 30.324 228.098 40.550 228.000 L 215.450 228.000 C 225.669 228.091 235.143 222.668 240.240 213.810 C 245.250 205.255 245.258 194.662 240.260 186.100 ZM 219.460 201.800 C 218.631 203.212 217.096 204.056 215.460 204.000 L 40.550 204.000 C 38.914 204.056 37.379 203.212 36.550 201.800 C 35.847 200.656 35.847 199.214 36.550 198.070 L 124.000 46.200 C 124.873 44.837 126.381 44.012 128.000 44.012 C 129.619 44.012 131.127 44.837 132.000 46.200 L 219.450 198.070 C 220.157 199.212 220.160 200.654 219.460 201.800 Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
