package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseUppercase: ImageVector
    get() {
        if (_letterCaseUppercase != null) return _letterCaseUppercase!!
        _letterCaseUppercase = radixIcon(
            name = "LetterCaseUppercase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.019 11.743c-.096 .259-.384 .391-.643 .295-.258-.096-.39-.383-.295-.642l.938 .347ZM7.17 11.396c.095 .259-.037 .546-.296 .642-.259 .096-.547-.036-.643-.295l.938-.347ZM8.765 11.743c-.096 .259-.384 .391-.643 .295-.258-.096-.39-.383-.295-.642l.938 .347ZM14.916 11.396c.095 .259-.037 .546-.296 .642-.259 .096-.547-.036-.642-.295l.938-.347ZM3.625 2.75c.209 0 .396 .13 .469 .326l3.076 8.32-.47 .173-.469 .174L5.224 9.016h-3.197L1.019 11.743 .55 11.569 .081 11.396 3.156 3.076l.032-.07c.087-.156 .254-.256 .437-.256ZM11.371 2.75c.209 0 .396 .13 .469 .326l3.076 8.32-.47 .173-.469 .174L12.97 9.016h-3.197L8.765 11.743l-.469-.174-.469-.173L10.902 3.076l.032-.07c.087-.156 .254-.256 .437-.256ZM2.341 8.166h2.568L3.625 4.691 2.341 8.166ZM10.087 8.166h2.568L11.371 4.691 10.087 8.166Z"),
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
        return _letterCaseUppercase!!
    }

private var _letterCaseUppercase: ImageVector? = null
