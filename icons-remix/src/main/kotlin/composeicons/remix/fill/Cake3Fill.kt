package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Cake3Fill: ImageVector
    get() {
        if (_cake3Fill != null) return _cake3Fill!!
        _cake3Fill = remixIcon(
            name = "Cake3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.5 2C17.433 2 19 3.567 19 5.5c0 .227-.022 .449-.063 .663l-.015 .066C20.711 6.825 22 8.512 22 10.5c0 1.874-1.146 3.481-2.775 4.157l-1.086 6.507c-.08 .482-.498 .836-.986 .836h-10.306c-.489 0-.906-.353-.986-.836L4.832 14.994C3.249 14.904 2 13.598 2 12 2 10.693 2.836 9.581 4.003 9.17L4 9C4 5.686 6.686 3 10 3c.922 0 1.795 .208 2.575 .579C13.199 2.628 14.276 2 15.5 2ZM11 15h-2v5h2v-5ZM15 15h-2v5h2v-5ZM17.5 13C18.881 13 20 11.881 20 10.5 20 9.119 18.881 8 17.5 8c-.336 0-.658 .065-.956 .19l-.175 .082c-.967 .498-2.143 .13-2.663-.804l-.07-.137C12.988 5.921 11.578 5 10 5 7.858 5 6.109 6.684 6.005 8.767l-.005 .196 .003 .17c.015 .808-.457 1.539-1.186 1.863l-.149 .059C4.271 11.196 4 11.572 4 12c0 .552 .448 1 1 1h12.5Z"),
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
        return _cake3Fill!!
    }

private var _cake3Fill: ImageVector? = null
