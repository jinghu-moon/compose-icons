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
                pathData = parseSvgPathData("M15 7 8.5 13.5c-.828 .828-.828 2.172 0 3 .828 .828 2.172 .828 3 0L18 10C19.657 8.343 19.657 5.657 18 4 16.343 2.343 13.657 2.343 12 4L5.5 10.5c-2.485 2.485-2.485 6.515 0 9 2.485 2.485 6.515 2.485 9 0L21 13"),
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
