package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorFillIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 101.660 122.340 C 103.162 123.841 104.006 125.877 104.006 128.000 C 104.006 130.123 103.162 132.159 101.660 133.660 L 69.660 165.660 C 67.372 167.951 63.929 168.636 60.938 167.397 C 57.947 166.158 55.997 163.238 56.000 160.000 L 56.000 136.000 L 16.000 136.000 C 11.582 136.000 8.000 132.418 8.000 128.000 C 8.000 123.582 11.582 120.000 16.000 120.000 L 56.000 120.000 L 56.000 96.000 C 55.997 92.762 57.947 89.842 60.938 88.603 C 63.929 87.364 67.372 88.049 69.660 90.340 ZM 240.000 120.000 L 200.000 120.000 L 200.000 96.000 C 200.003 92.762 198.053 89.842 195.062 88.603 C 192.071 87.364 188.628 88.049 186.340 90.340 L 154.340 122.340 C 152.838 123.841 151.994 125.877 151.994 128.000 C 151.994 130.123 152.838 132.159 154.340 133.660 L 186.340 165.660 C 188.628 167.951 192.071 168.636 195.062 167.397 C 198.053 166.158 200.003 163.238 200.000 160.000 L 200.000 136.000 L 240.000 136.000 C 244.418 136.000 248.000 132.418 248.000 128.000 C 248.000 123.582 244.418 120.000 240.000 120.000 ZM 128.000 32.000 C 123.582 32.000 120.000 35.582 120.000 40.000 L 120.000 216.000 C 120.000 220.418 123.582 224.000 128.000 224.000 C 132.418 224.000 136.000 220.418 136.000 216.000 L 136.000 40.000 C 136.000 35.582 132.418 32.000 128.000 32.000 Z"),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
