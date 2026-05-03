package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = radixIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.106 1.352 C 12.064 1.352 13.647 2.945 13.647 4.905 C 13.647 6.740 12.601 8.505 11.400 9.970 C 10.189 11.446 8.747 12.705 7.833 13.520 C 7.667 13.669 7.427 13.687 7.242 13.576 L 7.167 13.520 C 6.253 12.705 4.810 11.446 3.600 9.970 C 2.399 8.505 1.352 6.740 1.352 4.905 C 1.353 2.945 2.936 1.352 4.893 1.352 C 6.008 1.352 6.735 1.760 7.209 2.295 C 7.321 2.421 7.417 2.554 7.500 2.685 C 7.583 2.554 7.679 2.421 7.791 2.295 C 8.265 1.760 8.992 1.353 10.106 1.352 ZM 10.106 2.352 C 9.271 2.353 8.819 2.643 8.540 2.958 C 8.234 3.304 8.104 3.703 7.962 4.046 C 7.885 4.233 7.702 4.355 7.500 4.355 C 7.298 4.355 7.115 4.233 7.038 4.046 C 6.896 3.703 6.766 3.304 6.460 2.958 C 6.181 2.643 5.729 2.352 4.893 2.352 C 3.492 2.352 2.353 3.494 2.352 4.905 C 2.352 6.382 3.210 7.916 4.373 9.335 C 5.394 10.580 6.595 11.668 7.500 12.476 C 8.405 11.668 9.607 10.580 10.628 9.335 C 11.791 7.917 12.647 6.381 12.647 4.905 C 12.647 3.494 11.508 2.352 10.106 2.352 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
