package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookAiFill: ImageVector
    get() {
        if (_bookAiFill != null) return _bookAiFill!!
        _bookAiFill = remixIcon(
            name = "BookAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.343 2c-.221 .626-.343 1.299-.343 2 0 3.314 2.686 6 6 6 .701 0 1.374-.122 2-.343v11.343c0 .552-.448 1-1 1h-13.5C4.567 22 3 20.433 3 18.5v-13.5C3 3.343 4.343 2 6 2h7.343ZM6.5 17C5.672 17 5 17.672 5 18.5 5 19.328 5.672 20 6.5 20h12.5v-3h-12.5ZM18.529 .329c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.848 6.129 17.055 5.326 16.067 4.887l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319C17.038 2.816 17.844 1.983 18.276 .941l.253-.611Z"),
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
        return _bookAiFill!!
    }

private var _bookAiFill: ImageVector? = null
