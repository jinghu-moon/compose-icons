package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorFillIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.610 83.060 C 71.370 80.071 72.053 76.629 74.340 74.340 L 122.340 26.340 C 123.841 24.838 125.877 23.994 128.000 23.994 C 130.123 23.994 132.159 24.838 133.660 26.340 L 181.660 74.340 C 183.951 76.628 184.636 80.071 183.397 83.062 C 182.158 86.053 179.238 88.003 176.000 88.000 L 80.000 88.000 C 76.764 87.999 73.848 86.050 72.610 83.060 ZM 176.000 168.000 L 80.000 168.000 C 76.762 167.997 73.842 169.947 72.603 172.938 C 71.364 175.929 72.049 179.372 74.340 181.660 L 122.340 229.660 C 123.841 231.162 125.877 232.006 128.000 232.006 C 130.123 232.006 132.159 231.162 133.660 229.660 L 181.660 181.660 C 183.951 179.372 184.636 175.929 183.397 172.938 C 182.158 169.947 179.238 167.997 176.000 168.000 Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
