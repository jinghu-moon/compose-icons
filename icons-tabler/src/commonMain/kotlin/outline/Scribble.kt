package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = tablerOutlineIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 18.0f, 7.0f, 19.0f, 10.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 19.0f, 17.0f, 16.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 8.0f, 14.0f, 5.0f, 11.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 5.0f, 6.0f, 6.5f, 6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 11.5f, 8.0f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 14.0f, 20.408f, 11.547f, 22.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scribble!!
    }

private var _scribble: ImageVector? = null
