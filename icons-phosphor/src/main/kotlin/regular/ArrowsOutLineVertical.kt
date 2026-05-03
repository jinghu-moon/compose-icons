package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorRegularIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 132.418 32.000 128.000 C 32.000 123.582 35.582 120.000 40.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 101.660 53.660 L 120.000 35.310 L 120.000 96.000 C 120.000 100.418 123.582 104.000 128.000 104.000 C 132.418 104.000 136.000 100.418 136.000 96.000 L 136.000 35.310 L 154.340 53.660 C 157.466 56.786 162.534 56.786 165.660 53.660 C 168.786 50.534 168.786 45.466 165.660 42.340 L 133.660 10.340 C 132.159 8.838 130.123 7.994 128.000 7.994 C 125.877 7.994 123.841 8.838 122.340 10.340 L 90.340 42.340 C 87.214 45.466 87.214 50.534 90.340 53.660 C 93.466 56.786 98.534 56.786 101.660 53.660 ZM 154.340 202.340 L 136.000 220.690 L 136.000 160.000 C 136.000 155.582 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 155.582 120.000 160.000 L 120.000 220.690 L 101.660 202.340 C 98.534 199.214 93.466 199.214 90.340 202.340 C 87.214 205.466 87.214 210.534 90.340 213.660 L 122.340 245.660 C 123.841 247.162 125.877 248.006 128.000 248.006 C 130.123 248.006 132.159 247.162 133.660 245.660 L 165.660 213.660 C 168.786 210.534 168.786 205.466 165.660 202.340 C 162.534 199.214 157.466 199.214 154.340 202.340 Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
