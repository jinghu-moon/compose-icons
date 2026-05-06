package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BookmarkFilled: ImageVector
    get() {
        if (_bookmarkFilled != null) return _bookmarkFilled!!
        _bookmarkFilled = radixIcon(
            name = "BookmarkFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.601 2.01c.228 .047 .399 .249 .399 .49v11c0 .182-.099 .349-.258 .438-.159 .088-.353 .083-.507-.014L7.5 11.59 3.765 13.924c-.154 .096-.348 .102-.507 .014C3.099 13.849 3 13.682 3 13.5v-11l.01-.101C3.056 2.171 3.258 2 3.5 2h8l.101 .01Z"),
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
        return _bookmarkFilled!!
    }

private var _bookmarkFilled: ImageVector? = null
