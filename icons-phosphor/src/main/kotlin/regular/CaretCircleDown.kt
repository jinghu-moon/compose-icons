package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) return _caretCircleDown!!
        _caretCircleDown = phosphorRegularIcon(
            name = "CaretCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 173.660 106.340 C 175.162 107.841 176.006 109.877 176.006 112.000 C 176.006 114.123 175.162 116.159 173.660 117.660 L 133.660 157.660 C 132.159 159.162 130.123 160.006 128.000 160.006 C 125.877 160.006 123.841 159.162 122.340 157.660 L 82.340 117.660 C 79.214 114.534 79.214 109.466 82.340 106.340 C 85.466 103.214 90.534 103.214 93.660 106.340 L 128.000 140.690 L 162.340 106.340 C 163.841 104.838 165.877 103.994 168.000 103.994 C 170.123 103.994 172.159 104.838 173.660 106.340 Z"),
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
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
