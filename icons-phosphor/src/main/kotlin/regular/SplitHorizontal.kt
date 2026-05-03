package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorRegularIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.000 48.000 L 112.000 208.000 C 112.000 212.418 108.418 216.000 104.000 216.000 C 99.582 216.000 96.000 212.418 96.000 208.000 L 96.000 136.000 L 43.310 136.000 L 61.660 154.340 C 64.786 157.466 64.786 162.534 61.660 165.660 C 58.534 168.786 53.466 168.786 50.340 165.660 L 18.340 133.660 C 16.838 132.159 15.994 130.123 15.994 128.000 C 15.994 125.877 16.838 123.841 18.340 122.340 L 50.340 90.340 C 53.466 87.214 58.534 87.214 61.660 90.340 C 64.786 93.466 64.786 98.534 61.660 101.660 L 43.310 120.000 L 96.000 120.000 L 96.000 48.000 C 96.000 43.582 99.582 40.000 104.000 40.000 C 108.418 40.000 112.000 43.582 112.000 48.000 ZM 237.660 122.340 L 205.660 90.340 C 202.534 87.214 197.466 87.214 194.340 90.340 C 191.214 93.466 191.214 98.534 194.340 101.660 L 212.690 120.000 L 160.000 120.000 L 160.000 48.000 C 160.000 43.582 156.418 40.000 152.000 40.000 C 147.582 40.000 144.000 43.582 144.000 48.000 L 144.000 208.000 C 144.000 212.418 147.582 216.000 152.000 216.000 C 156.418 216.000 160.000 212.418 160.000 208.000 L 160.000 136.000 L 212.690 136.000 L 194.340 154.340 C 191.214 157.466 191.214 162.534 194.340 165.660 C 197.466 168.786 202.534 168.786 205.660 165.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
