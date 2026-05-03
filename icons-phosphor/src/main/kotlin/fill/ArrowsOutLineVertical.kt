package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorFillIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.610 51.060 C 87.370 48.071 88.053 44.629 90.340 42.340 L 122.340 10.340 C 123.841 8.838 125.877 7.994 128.000 7.994 C 130.123 7.994 132.159 8.838 133.660 10.340 L 165.660 42.340 C 167.951 44.628 168.636 48.071 167.397 51.062 C 166.158 54.053 163.238 56.003 160.000 56.000 L 136.000 56.000 L 136.000 96.000 C 136.000 100.418 132.418 104.000 128.000 104.000 C 123.582 104.000 120.000 100.418 120.000 96.000 L 120.000 56.000 L 96.000 56.000 C 92.764 55.999 89.848 54.050 88.610 51.060 ZM 216.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 L 216.000 136.000 C 220.418 136.000 224.000 132.418 224.000 128.000 C 224.000 123.582 220.418 120.000 216.000 120.000 ZM 160.000 200.000 L 136.000 200.000 L 136.000 160.000 C 136.000 155.582 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 155.582 120.000 160.000 L 120.000 200.000 L 96.000 200.000 C 92.762 199.997 89.842 201.947 88.603 204.938 C 87.364 207.929 88.049 211.372 90.340 213.660 L 122.340 245.660 C 123.841 247.162 125.877 248.006 128.000 248.006 C 130.123 248.006 132.159 247.162 133.660 245.660 L 165.660 213.660 C 167.951 211.372 168.636 207.929 167.397 204.938 C 166.158 201.947 163.238 199.997 160.000 200.000 Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
