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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.223 .666c.103-.246 .452-.246 .555 0L9.413 4.601c.043 .104 .141 .174 .253 .184l4.248 .341c.266 .021 .374 .354 .171 .527L10.849 8.424c-.085 .073-.123 .188-.097 .298l.989 4.145c.062 .259-.22 .465-.448 .326L7.656 10.971c-.096-.059-.217-.059-.312 0L3.707 13.192c-.228 .139-.51-.067-.448-.326L4.248 8.722c.026-.109-.011-.225-.097-.298L.915 5.652C.712 5.479 .82 5.146 1.086 5.125L5.334 4.784c.112-.009 .21-.08 .253-.184L7.223 .666Z"),
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
        return _starFilled!!
    }

private var _starFilled: ImageVector? = null
