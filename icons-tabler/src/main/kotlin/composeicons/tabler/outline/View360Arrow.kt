package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Arrow: ImageVector
    get() {
        if (_view360Arrow != null) return _view360Arrow!!
        _view360Arrow = tablerOutlineIcon(
            name = "View360Arrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 15.328f),
                    PathNode.CurveTo(19.414f, 14.61f, 21.0f, 13.388f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 9.79f, 16.97f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(7.03f, 8.0f, 3.0f, 9.79f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 14.21f, 7.03f, 16.0f, 12.0f, 16.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.LineTo(9.0f, 19.0f)
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
        return _view360Arrow!!
    }

private var _view360Arrow: ImageVector? = null
