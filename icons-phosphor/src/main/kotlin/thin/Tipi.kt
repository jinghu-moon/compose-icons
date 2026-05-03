package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorThinIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.370 213.840 L 132.750 53.500 L 155.370 18.160 C 156.563 16.299 156.021 13.823 154.160 12.630 C 152.299 11.437 149.823 11.979 148.630 13.840 L 128.000 46.080 L 107.370 13.840 C 106.177 11.979 103.701 11.437 101.840 12.630 C 99.979 13.823 99.437 16.299 100.630 18.160 L 123.250 53.500 L 20.630 213.840 C 19.840 215.072 19.785 216.636 20.487 217.920 C 21.190 219.203 22.537 220.001 24.000 220.000 L 232.000 220.000 C 233.463 220.001 234.810 219.203 235.513 217.920 C 236.215 216.636 236.160 215.072 235.370 213.840 ZM 79.000 212.000 L 128.000 135.420 L 177.000 212.000 ZM 186.520 212.000 L 131.380 125.840 C 130.645 124.690 129.375 123.995 128.010 123.995 C 126.645 123.995 125.375 124.690 124.640 125.840 L 69.490 212.000 L 31.310 212.000 L 128.000 60.920 L 224.690 212.000 Z"),
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
