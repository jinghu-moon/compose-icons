package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorRegularIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 40.000 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 40.000 C 120.000 35.582 123.582 32.000 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 ZM 96.000 120.000 L 35.310 120.000 L 53.660 101.660 C 56.786 98.534 56.786 93.466 53.660 90.340 C 50.534 87.214 45.466 87.214 42.340 90.340 L 10.340 122.340 C 8.838 123.841 7.994 125.877 7.994 128.000 C 7.994 130.123 8.838 132.159 10.340 133.660 L 42.340 165.660 C 45.466 168.786 50.534 168.786 53.660 165.660 C 56.786 162.534 56.786 157.466 53.660 154.340 L 35.310 136.000 L 96.000 136.000 C 100.418 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 100.418 120.000 96.000 120.000 ZM 245.660 122.340 L 213.660 90.340 C 210.534 87.214 205.466 87.214 202.340 90.340 C 199.214 93.466 199.214 98.534 202.340 101.660 L 220.690 120.000 L 160.000 120.000 C 155.582 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 155.582 136.000 160.000 136.000 L 220.690 136.000 L 202.340 154.340 C 199.214 157.466 199.214 162.534 202.340 165.660 C 205.466 168.786 210.534 168.786 213.660 165.660 L 245.660 133.660 C 247.162 132.159 248.006 130.123 248.006 128.000 C 248.006 125.877 247.162 123.841 245.660 122.340 Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
