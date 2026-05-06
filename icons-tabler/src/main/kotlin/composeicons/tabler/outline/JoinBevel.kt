package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JoinBevel: ImageVector
    get() {
        if (_joinBevel != null) return _joinBevel!!
        _joinBevel = tablerOutlineIcon(
            name = "JoinBevel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 4h3c1.105 0 2 .895 2 2v6c0 .552 .448 1 1 1h6c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-6.586c-.265-0-.52-.105-.707-.293L4.293 13.293C4.105 13.106 4 12.851 4 12.586v-6.586C4 4.895 4.895 4 6 4"),
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
        return _joinBevel!!
    }

private var _joinBevel: ImageVector? = null
