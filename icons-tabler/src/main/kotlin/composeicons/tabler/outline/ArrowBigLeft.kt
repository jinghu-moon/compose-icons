package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = tablerOutlineIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 15h-8v3.586c-0 .404-.244 .769-.617 .924-.374 .155-.804 .069-1.09-.217L3.707 12.707c-.39-.391-.39-1.023 0-1.414L10.293 4.707c.286-.286 .716-.371 1.09-.217 .374 .155 .617 .519 .617 .924v3.586h8c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1"),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
