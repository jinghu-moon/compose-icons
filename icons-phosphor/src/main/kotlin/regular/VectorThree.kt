package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorRegularIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.660 141.660 L 205.660 173.660 C 202.534 176.786 197.466 176.786 194.340 173.660 C 191.214 170.534 191.214 165.466 194.340 162.340 L 212.690 144.000 L 123.310 144.000 L 67.310 200.000 L 96.000 200.000 C 100.418 200.000 104.000 203.582 104.000 208.000 C 104.000 212.418 100.418 216.000 96.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 160.000 C 40.000 155.582 43.582 152.000 48.000 152.000 C 52.418 152.000 56.000 155.582 56.000 160.000 L 56.000 188.690 L 112.000 132.690 L 112.000 43.310 L 93.660 61.660 C 90.534 64.786 85.466 64.786 82.340 61.660 C 79.214 58.534 79.214 53.466 82.340 50.340 L 114.340 18.340 C 115.841 16.838 117.877 15.994 120.000 15.994 C 122.123 15.994 124.159 16.838 125.660 18.340 L 157.660 50.340 C 160.786 53.466 160.786 58.534 157.660 61.660 C 154.534 64.786 149.466 64.786 146.340 61.660 L 128.000 43.310 L 128.000 128.000 L 212.690 128.000 L 194.340 109.660 C 191.214 106.534 191.214 101.466 194.340 98.340 C 197.466 95.214 202.534 95.214 205.660 98.340 L 237.660 130.340 C 239.162 131.841 240.006 133.877 240.006 136.000 C 240.006 138.123 239.162 140.159 237.660 141.660 Z"),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
