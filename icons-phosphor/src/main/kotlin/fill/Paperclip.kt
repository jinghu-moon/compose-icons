package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorFillIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 165.660 74.340 C 164.159 72.838 162.123 71.994 160.000 71.994 C 157.877 71.994 155.841 72.838 154.340 74.340 L 87.090 143.000 C 77.701 152.364 77.681 167.566 87.045 176.955 C 96.409 186.344 111.611 186.364 121.000 177.000 L 170.320 126.680 C 172.303 124.560 175.280 123.680 178.097 124.382 C 180.914 125.084 183.130 127.257 183.886 130.060 C 184.643 132.863 183.821 135.856 181.740 137.880 L 132.370 188.260 C 122.314 198.563 107.497 202.667 93.573 199.006 C 79.650 195.345 68.768 184.484 65.080 170.567 C 61.392 156.651 65.467 141.826 75.750 131.750 L 143.000 63.090 C 152.364 53.701 167.566 53.681 176.955 63.045 C 186.344 72.409 186.364 87.611 177.000 97.000 L 109.710 165.600 C 107.727 167.720 104.750 168.600 101.933 167.898 C 99.116 167.196 96.900 165.023 96.144 162.220 C 95.387 159.417 96.209 156.424 98.290 154.400 L 165.600 85.710 C 167.126 84.215 167.990 82.173 168.001 80.038 C 168.013 77.902 167.170 75.851 165.660 74.340 Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
