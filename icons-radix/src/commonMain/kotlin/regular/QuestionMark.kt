package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = radixIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 11.607 C 7.983 11.607 8.375 11.999 8.375 12.482 C 8.375 12.965 7.983 13.357 7.500 13.357 C 7.017 13.357 6.625 12.965 6.625 12.482 C 6.625 11.999 7.017 11.607 7.500 11.607 ZM 7.500 0.775 C 9.219 0.775 11.075 2.128 11.075 4.100 C 11.075 5.753 10.133 6.574 9.382 7.240 C 8.630 7.907 8.075 8.416 8.075 9.501 C 8.075 9.818 7.818 10.075 7.500 10.075 C 7.183 10.075 6.925 9.818 6.925 9.501 C 6.925 7.858 7.871 7.043 8.618 6.380 C 9.368 5.715 9.925 5.199 9.925 4.100 C 9.925 2.911 8.743 1.926 7.500 1.925 C 6.257 1.925 5.075 2.911 5.075 4.100 C 5.075 4.418 4.818 4.675 4.500 4.675 C 4.183 4.675 3.925 4.418 3.925 4.100 C 3.925 2.128 5.782 0.775 7.500 0.775 Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
