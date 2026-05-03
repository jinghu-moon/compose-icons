package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorFillIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 165.660 157.660 L 133.660 189.660 C 132.159 191.162 130.123 192.006 128.000 192.006 C 125.877 192.006 123.841 191.162 122.340 189.660 L 90.340 157.660 C 87.214 154.534 87.214 149.466 90.340 146.340 C 93.466 143.214 98.534 143.214 101.660 146.340 L 128.000 172.690 L 154.340 146.340 C 157.466 143.214 162.534 143.214 165.660 146.340 C 168.786 149.466 168.786 154.534 165.660 157.660 ZM 165.660 109.660 C 164.159 111.162 162.123 112.006 160.000 112.006 C 157.877 112.006 155.841 111.162 154.340 109.660 L 128.000 83.310 L 101.660 109.660 C 98.534 112.786 93.466 112.786 90.340 109.660 C 87.214 106.534 87.214 101.466 90.340 98.340 L 122.340 66.340 C 123.841 64.838 125.877 63.994 128.000 63.994 C 130.123 63.994 132.159 64.838 133.660 66.340 L 165.660 98.340 C 167.162 99.841 168.006 101.877 168.006 104.000 C 168.006 106.123 167.162 108.159 165.660 109.660 Z"),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
