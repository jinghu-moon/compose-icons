package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.IconjarLogo: ImageVector
    get() {
        if (_iconjarLogo != null) return _iconjarLogo!!
        _iconjarLogo = radixIcon(
            name = "IconjarLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c.694 0 .828 .864 .133 1.128-.492 .204-.405 .702 0 .966 .695 .439 .956 1.23 .841 1.962l-.811 4.422-.039 .161c-.229 .795-.944 1.361-1.786 1.361h-5.677l-.166-.008C3.726 13.924 3.089 13.381 2.875 12.639l-.039-.161L2.025 8.056C1.904 7.312 2.258 6.525 2.895 6.123c.38-.274 .479-.729 .085-.93L2.895 5.158C2.243 4.91 2.295 4.109 2.876 4.01l.124-.01h9ZM4.11 5c.095 .213 .132 .439 .119 .655-.034 .569-.383 1.014-.749 1.278l-.025 .018-.026 .017c-.297 .188-.473 .578-.416 .928l.805 4.388 .044 .154c.131 .343 .449 .562 .8 .562h5.677c.351 0 .669-.22 .8-.562l.044-.154 .805-4.39c.062-.409-.09-.766-.387-.954l-.012-.008c-.392-.256-.754-.704-.789-1.283-.014-.236 .029-.454 .114-.648h-1.855c-.035 .146-.057 .312-.057 .5 0 .995 .954 1.649 .954 2.85C9.954 9.27 9.498 9.842 8.621 9.842 8.132 9.842 7.579 9.461 7.578 8.758c0-.862 .621-1.413 .621-2.508 0-.432-.115-.874-.295-1.25h-3.795ZM7.5 .003c.695 0 1.25 .278 1.25 .747-0 .247-.175 .37-.327 .478-.118 .083-.224 .157-.224 .272 .002 .499 4.301 0 4.301 1-0 .276-.224 .5-.5 .5h-9c-.276 0-.5-.224-.5-.5 0-1 4.298-.501 4.3-1 0-.115-.105-.189-.224-.272C6.424 1.121 6.25 .997 6.25 .75 6.25 .281 6.805 .003 7.5 .003Z"),
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
        return _iconjarLogo!!
    }

private var _iconjarLogo: ImageVector? = null
