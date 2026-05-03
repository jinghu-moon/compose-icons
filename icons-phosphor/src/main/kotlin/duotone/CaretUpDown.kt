package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorDuotoneIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 176.000 L 176.000 176.000 L 128.000 224.000 ZM 128.000 32.000 L 80.000 80.000 L 176.000 80.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 176.000 168.000 L 80.000 168.000 C 76.762 167.997 73.842 169.947 72.603 172.938 C 71.364 175.929 72.049 179.372 74.340 181.660 L 122.340 229.660 C 123.841 231.162 125.877 232.006 128.000 232.006 C 130.123 232.006 132.159 231.162 133.660 229.660 L 181.660 181.660 C 183.951 179.372 184.636 175.929 183.397 172.938 C 182.158 169.947 179.238 167.997 176.000 168.000 ZM 128.000 212.690 L 99.310 184.000 L 156.690 184.000 ZM 80.000 88.000 L 176.000 88.000 C 179.238 88.003 182.158 86.053 183.397 83.062 C 184.636 80.071 183.951 76.628 181.660 74.340 L 133.660 26.340 C 132.159 24.838 130.123 23.994 128.000 23.994 C 125.877 23.994 123.841 24.838 122.340 26.340 L 74.340 74.340 C 72.049 76.628 71.364 80.071 72.603 83.062 C 73.842 86.053 76.762 88.003 80.000 88.000 ZM 128.000 43.310 L 156.690 72.000 L 99.310 72.000 Z"),
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
