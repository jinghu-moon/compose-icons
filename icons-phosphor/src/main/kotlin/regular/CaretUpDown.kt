package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorRegularIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 181.660 170.340 C 183.162 171.841 184.006 173.877 184.006 176.000 C 184.006 178.123 183.162 180.159 181.660 181.660 L 133.660 229.660 C 132.159 231.162 130.123 232.006 128.000 232.006 C 125.877 232.006 123.841 231.162 122.340 229.660 L 74.340 181.660 C 71.214 178.534 71.214 173.466 74.340 170.340 C 77.466 167.214 82.534 167.214 85.660 170.340 L 128.000 212.690 L 170.340 170.340 C 171.841 168.838 173.877 167.994 176.000 167.994 C 178.123 167.994 180.159 168.838 181.660 170.340 ZM 85.660 85.660 L 128.000 43.310 L 170.340 85.660 C 173.466 88.786 178.534 88.786 181.660 85.660 C 184.786 82.534 184.786 77.466 181.660 74.340 L 133.660 26.340 C 132.159 24.838 130.123 23.994 128.000 23.994 C 125.877 23.994 123.841 24.838 122.340 26.340 L 74.340 74.340 C 71.214 77.466 71.214 82.534 74.340 85.660 C 77.466 88.786 82.534 88.786 85.660 85.660 Z"),
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
