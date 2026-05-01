package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OvalVertical: ImageVector
    get() {
        if (_ovalVertical != null) return _ovalVertical!!
        _ovalVertical = tablerOutlineIcon(
            name = "OvalVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 8.686f, 7.03f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(16.97f, 6.0f, 21.0f, 8.686f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 15.314f, 16.97f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(7.03f, 18.0f, 3.0f, 15.314f, 3.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ovalVertical!!
    }

private var _ovalVertical: ImageVector? = null
