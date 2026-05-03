package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorRegularIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 152.000 C 216.000 156.418 212.418 160.000 208.000 160.000 L 136.000 160.000 L 136.000 212.690 L 154.340 194.340 C 157.466 191.214 162.534 191.214 165.660 194.340 C 168.786 197.466 168.786 202.534 165.660 205.660 L 133.660 237.660 C 132.159 239.162 130.123 240.006 128.000 240.006 C 125.877 240.006 123.841 239.162 122.340 237.660 L 90.340 205.660 C 87.214 202.534 87.214 197.466 90.340 194.340 C 93.466 191.214 98.534 191.214 101.660 194.340 L 120.000 212.690 L 120.000 160.000 L 48.000 160.000 C 43.582 160.000 40.000 156.418 40.000 152.000 C 40.000 147.582 43.582 144.000 48.000 144.000 L 208.000 144.000 C 212.418 144.000 216.000 147.582 216.000 152.000 ZM 48.000 112.000 L 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 C 216.000 99.582 212.418 96.000 208.000 96.000 L 136.000 96.000 L 136.000 43.310 L 154.340 61.660 C 157.466 64.786 162.534 64.786 165.660 61.660 C 168.786 58.534 168.786 53.466 165.660 50.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 90.340 50.340 C 87.214 53.466 87.214 58.534 90.340 61.660 C 93.466 64.786 98.534 64.786 101.660 61.660 L 120.000 43.310 L 120.000 96.000 L 48.000 96.000 C 43.582 96.000 40.000 99.582 40.000 104.000 C 40.000 108.418 43.582 112.000 48.000 112.000 Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
