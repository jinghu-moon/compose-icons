package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) return _caretCircleLeft!!
        _caretCircleLeft = phosphorRegularIcon(
            name = "CaretCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 149.660 93.660 L 115.310 128.000 L 149.660 162.340 C 152.786 165.466 152.786 170.534 149.660 173.660 C 146.534 176.786 141.466 176.786 138.340 173.660 L 98.340 133.660 C 96.838 132.159 95.994 130.123 95.994 128.000 C 95.994 125.877 96.838 123.841 98.340 122.340 L 138.340 82.340 C 141.466 79.214 146.534 79.214 149.660 82.340 C 152.786 85.466 152.786 90.534 149.660 93.660 Z"),
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
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null
