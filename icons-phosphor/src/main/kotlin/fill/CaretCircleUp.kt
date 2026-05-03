package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) return _caretCircleUp!!
        _caretCircleUp = phosphorFillIcon(
            name = "CaretCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 173.660 149.660 C 172.159 151.162 170.123 152.006 168.000 152.006 C 165.877 152.006 163.841 151.162 162.340 149.660 L 128.000 115.310 L 93.660 149.660 C 90.534 152.786 85.466 152.786 82.340 149.660 C 79.214 146.534 79.214 141.466 82.340 138.340 L 122.340 98.340 C 123.841 96.838 125.877 95.994 128.000 95.994 C 130.123 95.994 132.159 96.838 133.660 98.340 L 173.660 138.340 C 175.162 139.841 176.006 141.877 176.006 144.000 C 176.006 146.123 175.162 148.159 173.660 149.660 Z"),
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
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
