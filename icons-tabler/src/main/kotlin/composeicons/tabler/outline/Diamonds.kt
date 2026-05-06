package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diamonds: ImageVector
    get() {
        if (_diamonds != null) return _diamonds!!
        _diamonds = tablerOutlineIcon(
            name = "Diamonds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.831 20.413 5.456 13.503c-.608-.783-.608-2.223 0-3L10.831 3.592c.275-.37 .708-.587 1.169-.587 .461 0 .894 .218 1.169 .587l5.375 6.91c.608 .783 .608 2.223 0 3l-5.375 6.911c-.275 .37-.708 .587-1.169 .587-.461 0-.894-.218-1.169-.587"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
