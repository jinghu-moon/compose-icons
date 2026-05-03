package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = tablerOutlineIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 7.000 L 8.500 13.500 C 7.672 14.328 7.672 15.672 8.500 16.500 C 9.328 17.328 10.672 17.328 11.500 16.500 L 18.000 10.000 C 19.657 8.343 19.657 5.657 18.000 4.000 C 16.343 2.343 13.657 2.343 12.000 4.000 L 5.500 10.500 C 3.015 12.985 3.015 17.015 5.500 19.500 C 7.985 21.985 12.015 21.985 14.500 19.500 L 21.000 13.000"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
