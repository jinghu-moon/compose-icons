package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlagOffFill: ImageVector
    get() {
        if (_flagOffFill != null) return _flagOffFill!!
        _flagOffFill = remixIcon(
            name = "FlagOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.586 18l4.607 4.607 1.414-1.414L2.808 1.393 1.394 2.808 3 4.414v17.586h2v-6h7l.724 1.447c.169 .339 .516 .553 .894 .553h2.968ZM21 6v10.758L7.242 3h5.14c.379 0 .725 .214 .894 .553l.724 1.447h6c.552 0 1 .448 1 1Z"),
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
        return _flagOffFill!!
    }

private var _flagOffFill: ImageVector? = null
