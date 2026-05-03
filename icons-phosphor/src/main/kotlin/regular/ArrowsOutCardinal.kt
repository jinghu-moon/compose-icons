package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorRegularIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 90.340 61.660 C 88.838 60.159 87.994 58.123 87.994 56.000 C 87.994 53.877 88.838 51.841 90.340 50.340 L 122.340 18.340 C 123.841 16.838 125.877 15.994 128.000 15.994 C 130.123 15.994 132.159 16.838 133.660 18.340 L 165.660 50.340 C 168.786 53.466 168.786 58.534 165.660 61.660 C 162.534 64.786 157.466 64.786 154.340 61.660 L 136.000 43.310 L 136.000 96.000 C 136.000 100.418 132.418 104.000 128.000 104.000 C 123.582 104.000 120.000 100.418 120.000 96.000 L 120.000 43.310 L 101.660 61.660 C 100.159 63.162 98.123 64.006 96.000 64.006 C 93.877 64.006 91.841 63.162 90.340 61.660 ZM 154.340 194.340 L 136.000 212.690 L 136.000 160.000 C 136.000 155.582 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 155.582 120.000 160.000 L 120.000 212.690 L 101.660 194.340 C 98.534 191.214 93.466 191.214 90.340 194.340 C 87.214 197.466 87.214 202.534 90.340 205.660 L 122.340 237.660 C 123.841 239.162 125.877 240.006 128.000 240.006 C 130.123 240.006 132.159 239.162 133.660 237.660 L 165.660 205.660 C 168.786 202.534 168.786 197.466 165.660 194.340 C 162.534 191.214 157.466 191.214 154.340 194.340 ZM 237.660 122.340 L 205.660 90.340 C 202.534 87.214 197.466 87.214 194.340 90.340 C 191.214 93.466 191.214 98.534 194.340 101.660 L 212.690 120.000 L 160.000 120.000 C 155.582 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 155.582 136.000 160.000 136.000 L 212.690 136.000 L 194.340 154.340 C 191.214 157.466 191.214 162.534 194.340 165.660 C 197.466 168.786 202.534 168.786 205.660 165.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 ZM 43.310 136.000 L 96.000 136.000 C 100.418 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 100.418 120.000 96.000 120.000 L 43.310 120.000 L 61.660 101.660 C 64.786 98.534 64.786 93.466 61.660 90.340 C 58.534 87.214 53.466 87.214 50.340 90.340 L 18.340 122.340 C 16.838 123.841 15.994 125.877 15.994 128.000 C 15.994 130.123 16.838 132.159 18.340 133.660 L 50.340 165.660 C 53.466 168.786 58.534 168.786 61.660 165.660 C 64.786 162.534 64.786 157.466 61.660 154.340 Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
