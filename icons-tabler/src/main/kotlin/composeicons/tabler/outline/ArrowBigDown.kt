package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = tablerOutlineIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 4v8h3.586c.404 0 .769 .244 .924 .617 .155 .374 .069 .804-.217 1.09l-6.586 6.586c-.391 .39-1.023 .39-1.414 0L4.707 13.707c-.286-.286-.371-.716-.217-1.09 .155-.374 .519-.617 .924-.617h3.586v-8C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1"),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
