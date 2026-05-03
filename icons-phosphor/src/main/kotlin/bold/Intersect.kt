package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorBoldIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.000 78.000 C 169.084 37.210 131.562 9.161 89.917 12.154 C 48.272 15.146 15.146 48.272 12.154 89.917 C 9.161 131.562 37.210 169.084 78.000 178.000 C 86.916 218.790 124.438 246.839 166.083 243.846 C 207.728 240.854 240.854 207.728 243.846 166.083 C 246.839 124.438 218.790 86.916 178.000 78.000 ZM 155.810 100.190 C 155.105 110.512 151.724 120.472 146.000 129.090 L 126.940 110.000 C 135.555 104.265 145.515 100.874 155.840 100.160 ZM 76.310 152.700 C 49.812 143.524 33.204 117.218 36.313 89.350 C 39.423 61.481 61.421 39.483 89.290 36.373 C 117.158 33.264 143.464 49.872 152.640 76.370 C 112.094 79.989 79.959 112.124 76.340 152.670 ZM 100.130 155.870 C 100.835 145.548 104.216 135.588 109.940 126.970 L 129.060 146.000 C 120.445 151.735 110.485 155.126 100.160 155.840 ZM 160.000 220.000 C 134.456 219.965 111.726 203.785 103.330 179.660 C 143.898 176.053 176.053 143.898 179.660 103.330 C 207.306 112.946 223.979 141.106 219.115 169.970 C 214.251 198.834 189.271 219.975 160.000 220.000 Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
