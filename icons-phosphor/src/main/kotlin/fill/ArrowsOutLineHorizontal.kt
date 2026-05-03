package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorFillIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 128.000 C 104.000 132.418 100.418 136.000 96.000 136.000 L 56.000 136.000 L 56.000 160.000 C 56.003 163.238 54.053 166.158 51.062 167.397 C 48.071 168.636 44.628 167.951 42.340 165.660 L 10.340 133.660 C 8.838 132.159 7.994 130.123 7.994 128.000 C 7.994 125.877 8.838 123.841 10.340 122.340 L 42.340 90.340 C 44.628 88.049 48.071 87.364 51.062 88.603 C 54.053 89.842 56.003 92.762 56.000 96.000 L 56.000 120.000 L 96.000 120.000 C 100.418 120.000 104.000 123.582 104.000 128.000 ZM 245.660 122.340 L 213.660 90.340 C 211.372 88.049 207.929 87.364 204.938 88.603 C 201.947 89.842 199.997 92.762 200.000 96.000 L 200.000 120.000 L 160.000 120.000 C 155.582 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 155.582 136.000 160.000 136.000 L 200.000 136.000 L 200.000 160.000 C 199.997 163.238 201.947 166.158 204.938 167.397 C 207.929 168.636 211.372 167.951 213.660 165.660 L 245.660 133.660 C 247.162 132.159 248.006 130.123 248.006 128.000 C 248.006 125.877 247.162 123.841 245.660 122.340 ZM 128.000 32.000 C 123.582 32.000 120.000 35.582 120.000 40.000 L 120.000 216.000 C 120.000 220.418 123.582 224.000 128.000 224.000 C 132.418 224.000 136.000 220.418 136.000 216.000 L 136.000 40.000 C 136.000 35.582 132.418 32.000 128.000 32.000 Z"),
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
