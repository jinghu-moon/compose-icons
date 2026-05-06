package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowDown: ImageVector
    get() {
        if (_thickArrowDown != null) return _thickArrowDown!!
        _thickArrowDown = radixIcon(
            name = "ThickArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.601 3.01c.228 .047 .399 .249 .399 .49v2.5h2.5c.187 0 .359 .105 .444 .271 .086 .167 .072 .367-.037 .52L7.907 13.791C7.813 13.922 7.661 14 7.5 14c-.161 0-.313-.078-.407-.209l-5-7C1.984 6.639 1.97 6.438 2.056 6.271 2.141 6.105 2.313 6 2.5 6h2.5v-2.5l.01-.101C5.056 3.171 5.258 3 5.5 3h4l.101 .01ZM6 6.5C6 6.776 5.776 7 5.5 7h-2.027l4.027 5.639L11.527 7h-2.027C9.224 7 9 6.776 9 6.5v-2.5h-3v2.5Z"),
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
        return _thickArrowDown!!
    }

private var _thickArrowDown: ImageVector? = null
