package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorFillIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.340 69.660 C 88.049 67.372 87.364 63.929 88.603 60.938 C 89.842 57.947 92.762 55.997 96.000 56.000 L 120.000 56.000 L 120.000 16.000 C 120.000 11.582 123.582 8.000 128.000 8.000 C 132.418 8.000 136.000 11.582 136.000 16.000 L 136.000 56.000 L 160.000 56.000 C 163.238 55.997 166.158 57.947 167.397 60.938 C 168.636 63.929 167.951 67.372 165.660 69.660 L 133.660 101.660 C 132.159 103.162 130.123 104.006 128.000 104.006 C 125.877 104.006 123.841 103.162 122.340 101.660 ZM 133.660 154.340 C 132.159 152.838 130.123 151.994 128.000 151.994 C 125.877 151.994 123.841 152.838 122.340 154.340 L 90.340 186.340 C 88.049 188.628 87.364 192.071 88.603 195.062 C 89.842 198.053 92.762 200.003 96.000 200.000 L 120.000 200.000 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 200.000 L 160.000 200.000 C 163.238 200.003 166.158 198.053 167.397 195.062 C 168.636 192.071 167.951 188.628 165.660 186.340 ZM 216.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 L 216.000 136.000 C 220.418 136.000 224.000 132.418 224.000 128.000 C 224.000 123.582 220.418 120.000 216.000 120.000 Z"),
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
