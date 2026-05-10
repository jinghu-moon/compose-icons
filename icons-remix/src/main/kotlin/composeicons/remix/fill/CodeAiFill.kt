package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CodeAiFill: ImageVector
    get() {
        if (_codeAiFill != null) return _codeAiFill!!
        _codeAiFill = remixIcon(
            name = "CodeAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.713 10.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C15.847 9.119 15.056 8.316 14.068 7.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM2.828 12l4.243 4.243L5.657 17.657 0 12 5.657 6.343 7.071 7.757 2.828 12ZM18.343 17.657l5.657-5.657L21.171 9.172l-1.414 1.414 1.414 1.414-4.243 4.243 1.414 1.414Z"),
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
        return _codeAiFill!!
    }

private var _codeAiFill: ImageVector? = null
