package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorRegularIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 132.418 32.000 128.000 C 32.000 123.582 35.582 120.000 40.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 122.340 101.660 C 123.841 103.162 125.877 104.006 128.000 104.006 C 130.123 104.006 132.159 103.162 133.660 101.660 L 165.660 69.660 C 168.786 66.534 168.786 61.466 165.660 58.340 C 162.534 55.214 157.466 55.214 154.340 58.340 L 136.000 76.690 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 76.690 L 101.660 58.340 C 98.534 55.214 93.466 55.214 90.340 58.340 C 87.214 61.466 87.214 66.534 90.340 69.660 ZM 133.660 154.340 C 132.159 152.838 130.123 151.994 128.000 151.994 C 125.877 151.994 123.841 152.838 122.340 154.340 L 90.340 186.340 C 87.214 189.466 87.214 194.534 90.340 197.660 C 93.466 200.786 98.534 200.786 101.660 197.660 L 120.000 179.310 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 179.310 L 154.340 197.660 C 157.466 200.786 162.534 200.786 165.660 197.660 C 168.786 194.534 168.786 189.466 165.660 186.340 Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
