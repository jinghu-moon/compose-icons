package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = tablerFilledIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.998 2l.118 .007 .059 .008 .061 .013 .111 .034c.077 .028 .15 .066 .217 .112l.104 .082 .255 .218c2.017 1.676 4.567 2.575 7.189 2.537l.342-.01c.46-.021 .875 .275 1.005 .717 .993 3.377 .574 7.013-1.162 10.075-1.735 3.063-4.639 5.291-8.046 6.175-.165 .043-.337 .043-.502 0C8.341 21.084 5.438 18.856 3.702 15.794 1.967 12.731 1.547 9.095 2.54 5.718c.13-.442 .545-.738 1.005-.717 2.737 .125 5.423-.776 7.531-2.527l.263-.225 .096-.075c.067-.046 .14-.084 .217-.112l.112-.034c.039-.009 .079-.016 .119-.021L11.998 2ZM15.708 9.293c-.188-.188-.442-.293-.708-.293-.265 0-.52 .106-.707 .293L11 12.585 9.707 11.293l-.094-.083c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367l2 2 .094 .083c.398 .309 .964 .273 1.32-.083l4-4 .083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
