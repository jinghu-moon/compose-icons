package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = tablerFilledIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c.331 .001 .64 .167 .823 .443l.067 .116 2.852 5.781 6.38 .925c.741 .108 1.08 .94 .703 1.526l-.07 .095-.078 .086-4.624 4.499 1.09 6.355c.058 .337-.06 .68-.313 .91-.253 .23-.606 .315-.936 .225l-.101-.035-.101-.046-5.693-3-5.706 3c-.105 .055-.212 .09-.32 .106l-.106 .01c-.282 .01-.556-.099-.753-.301-.198-.202-.301-.477-.285-.759l.013-.11L5.932 14.471 1.309 9.971C1.066 9.734 .959 9.391 1.026 9.058c.066-.333 .296-.609 .611-.734l.113-.036 .114-.023L8.243 7.34 11.096 1.56C11.259 1.21 11.614 .99 12 1ZM12 4.274v12.476c.081 0 .161 .01 .239 .029l.115 .036 .112 .05 4.363 2.299-.836-4.873c-.041-.241 .007-.488 .136-.696l.07-.099 .082-.09L19.827 9.953 14.936 9.245c-.242-.035-.462-.157-.62-.344l-.073-.097-.06-.106L12 4.274Z"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
