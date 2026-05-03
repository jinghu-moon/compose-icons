package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorFillIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.740 211.690 L 137.500 53.500 L 158.740 20.310 C 161.120 16.588 160.032 11.640 156.310 9.260 C 152.588 6.880 147.640 7.968 145.260 11.690 L 128.000 38.660 L 110.740 11.660 C 108.360 7.938 103.412 6.850 99.690 9.230 C 95.968 11.610 94.880 16.558 97.260 20.280 L 118.500 53.500 L 17.260 211.690 C 15.685 214.153 15.579 217.278 16.983 219.842 C 18.386 222.406 21.077 224.000 24.000 224.000 L 232.000 224.000 C 234.923 224.000 237.614 222.406 239.017 219.842 C 240.421 217.278 240.315 214.153 238.740 211.690 ZM 188.740 208.000 L 134.740 123.690 C 133.270 121.391 130.729 120.000 128.000 120.000 C 125.271 120.000 122.730 121.391 121.260 123.690 L 67.300 208.000 L 38.620 208.000 L 128.000 68.340 L 217.380 208.000 Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
