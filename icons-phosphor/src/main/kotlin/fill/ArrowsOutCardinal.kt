package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorFillIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 136.000 L 64.000 136.000 L 64.000 160.000 C 64.003 163.238 62.053 166.158 59.062 167.397 C 56.071 168.636 52.628 167.951 50.340 165.660 L 18.340 133.660 C 16.838 132.159 15.994 130.123 15.994 128.000 C 15.994 125.877 16.838 123.841 18.340 122.340 L 50.340 90.340 C 52.628 88.049 56.071 87.364 59.062 88.603 C 62.053 89.842 64.003 92.762 64.000 96.000 L 64.000 120.000 L 96.000 120.000 C 100.418 120.000 104.000 123.582 104.000 128.000 C 104.000 132.418 100.418 136.000 96.000 136.000 ZM 96.000 64.000 L 120.000 64.000 L 120.000 96.000 C 120.000 100.418 123.582 104.000 128.000 104.000 C 132.418 104.000 136.000 100.418 136.000 96.000 L 136.000 64.000 L 160.000 64.000 C 163.238 64.003 166.158 62.053 167.397 59.062 C 168.636 56.071 167.951 52.628 165.660 50.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 90.340 50.340 C 88.049 52.628 87.364 56.071 88.603 59.062 C 89.842 62.053 92.762 64.003 96.000 64.000 ZM 237.660 122.340 L 205.660 90.340 C 203.372 88.049 199.929 87.364 196.938 88.603 C 193.947 89.842 191.997 92.762 192.000 96.000 L 192.000 120.000 L 160.000 120.000 C 155.582 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 155.582 136.000 160.000 136.000 L 192.000 136.000 L 192.000 160.000 C 191.997 163.238 193.947 166.158 196.938 167.397 C 199.929 168.636 203.372 167.951 205.660 165.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 ZM 160.000 192.000 L 136.000 192.000 L 136.000 160.000 C 136.000 155.582 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 155.582 120.000 160.000 L 120.000 192.000 L 96.000 192.000 C 92.762 191.997 89.842 193.947 88.603 196.938 C 87.364 199.929 88.049 203.372 90.340 205.660 L 122.340 237.660 C 123.841 239.162 125.877 240.006 128.000 240.006 C 130.123 240.006 132.159 239.162 133.660 237.660 L 165.660 205.660 C 167.951 203.372 168.636 199.929 167.397 196.938 C 166.158 193.947 163.238 191.997 160.000 192.000 Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
