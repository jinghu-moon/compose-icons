package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorFillIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 49.000 C 235.974 38.913 229.888 29.829 220.568 25.969 C 211.249 22.108 200.522 24.226 193.370 31.340 L 143.160 81.540 L 18.340 206.400 C 16.285 208.457 15.507 211.467 16.309 214.262 C 17.111 217.057 19.367 219.196 22.200 219.850 C 34.070 222.602 46.215 223.994 58.400 224.000 C 91.350 224.000 124.310 213.800 155.340 193.770 C 187.100 173.270 205.530 149.950 206.340 148.970 C 208.835 145.786 208.560 141.241 205.700 138.380 L 181.310 114.000 L 228.690 66.610 C 233.372 61.946 236.003 55.609 236.000 49.000 ZM 146.230 180.600 C 111.800 202.700 76.290 211.520 40.470 206.900 L 146.000 101.340 L 189.090 144.440 C 176.404 158.271 162.000 170.423 146.230 180.600 Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
