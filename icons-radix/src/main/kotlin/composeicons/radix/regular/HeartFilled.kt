package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.HeartFilled: ImageVector
    get() {
        if (_heartFilled != null) return _heartFilled!!
        _heartFilled = radixIcon(
            name = "HeartFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.106 1.352c1.957 0 3.541 1.592 3.541 3.553 0 1.835-1.047 3.6-2.247 5.064-1.137 1.387-2.479 2.581-3.394 3.396-.06 .053-.117 .105-.173 .154-.19 .169-.476 .169-.666 0-.056-.05-.113-.101-.173-.154C6.078 12.551 4.737 11.356 3.6 9.97 2.399 8.505 1.352 6.74 1.352 4.905 1.353 2.945 2.936 1.352 4.893 1.352c1.364 0 1.967 .571 2.606 1.583C8.139 1.923 8.742 1.353 10.106 1.352Z"),
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
        return _heartFilled!!
    }

private var _heartFilled: ImageVector? = null
