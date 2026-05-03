package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorFillIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 101.660 133.660 L 69.660 165.660 C 67.372 167.951 63.929 168.636 60.938 167.397 C 57.947 166.158 55.997 163.238 56.000 160.000 L 56.000 136.000 L 24.000 136.000 C 19.582 136.000 16.000 132.418 16.000 128.000 C 16.000 123.582 19.582 120.000 24.000 120.000 L 56.000 120.000 L 56.000 96.000 C 55.997 92.762 57.947 89.842 60.938 88.603 C 63.929 87.364 67.372 88.049 69.660 90.340 L 101.660 122.340 C 103.162 123.841 104.006 125.877 104.006 128.000 C 104.006 130.123 103.162 132.159 101.660 133.660 ZM 122.340 101.660 C 123.841 103.162 125.877 104.006 128.000 104.006 C 130.123 104.006 132.159 103.162 133.660 101.660 L 165.660 69.660 C 167.951 67.372 168.636 63.929 167.397 60.938 C 166.158 57.947 163.238 55.997 160.000 56.000 L 136.000 56.000 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 56.000 L 96.000 56.000 C 92.762 55.997 89.842 57.947 88.603 60.938 C 87.364 63.929 88.049 67.372 90.340 69.660 ZM 133.660 154.340 C 132.159 152.838 130.123 151.994 128.000 151.994 C 125.877 151.994 123.841 152.838 122.340 154.340 L 90.340 186.340 C 88.049 188.628 87.364 192.071 88.603 195.062 C 89.842 198.053 92.762 200.003 96.000 200.000 L 120.000 200.000 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 200.000 L 160.000 200.000 C 163.238 200.003 166.158 198.053 167.397 195.062 C 168.636 192.071 167.951 188.628 165.660 186.340 ZM 232.000 120.000 L 200.000 120.000 L 200.000 96.000 C 200.003 92.762 198.053 89.842 195.062 88.603 C 192.071 87.364 188.628 88.049 186.340 90.340 L 154.340 122.340 C 152.838 123.841 151.994 125.877 151.994 128.000 C 151.994 130.123 152.838 132.159 154.340 133.660 L 186.340 165.660 C 188.628 167.951 192.071 168.636 195.062 167.397 C 198.053 166.158 200.003 163.238 200.000 160.000 L 200.000 136.000 L 232.000 136.000 C 236.418 136.000 240.000 132.418 240.000 128.000 C 240.000 123.582 236.418 120.000 232.000 120.000 Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
