package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorBoldIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.810 111.290 L 158.630 55.120 C 152.510 51.209 144.745 50.942 138.370 54.422 C 131.995 57.902 128.021 64.577 128.000 71.840 L 128.000 101.840 L 54.630 55.120 C 48.510 51.209 40.745 50.942 34.370 54.422 C 27.995 57.902 24.021 64.577 24.000 71.840 L 24.000 184.160 C 24.034 191.417 28.011 198.082 34.381 201.559 C 40.751 205.037 48.507 204.776 54.630 200.880 L 128.000 154.150 L 128.000 184.150 C 128.034 191.407 132.011 198.072 138.381 201.549 C 144.751 205.027 152.507 204.766 158.630 200.870 L 246.810 144.700 C 252.531 141.070 255.997 134.765 255.997 127.990 C 255.997 121.215 252.531 114.910 246.810 111.280 ZM 48.000 176.640 L 48.000 79.360 L 124.380 128.000 ZM 152.000 176.640 L 152.000 79.360 L 228.380 128.000 Z"),
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
