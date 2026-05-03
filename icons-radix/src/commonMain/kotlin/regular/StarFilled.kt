package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StarFilled: ImageVector
    get() {
        if (_starFilled != null) return _starFilled!!
        _starFilled = radixIcon(
            name = "StarFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.223 0.666 C 7.325 0.420 7.675 0.420 7.777 0.666 L 9.413 4.601 C 9.456 4.704 9.554 4.775 9.666 4.784 L 13.914 5.125 C 14.180 5.146 14.288 5.479 14.085 5.652 L 10.849 8.424 C 10.763 8.497 10.726 8.612 10.752 8.722 L 11.741 12.866 C 11.803 13.126 11.521 13.331 11.293 13.192 L 7.656 10.971 C 7.560 10.912 7.440 10.912 7.344 10.971 L 3.707 13.192 C 3.479 13.331 3.197 13.126 3.259 12.866 L 4.248 8.722 C 4.274 8.612 4.237 8.497 4.151 8.424 L 0.915 5.652 C 0.712 5.479 0.820 5.146 1.086 5.125 L 5.334 4.784 C 5.446 4.775 5.544 4.704 5.587 4.601 L 7.223 0.666 Z"),
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
        return _starFilled!!
    }

private var _starFilled: ImageVector? = null
