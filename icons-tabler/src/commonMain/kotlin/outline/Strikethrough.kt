package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) return _strikethrough!!
        _strikethrough = tablerOutlineIcon(
            name = "Strikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 6.5f),
                    PathNode.CurveTo(15.532936f, 5.593601f, 13.871066f, 4.970399f, 12.0f, 5.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(9.067003f, 5.0f, 7.5f, 6.567004f, 7.5f, 8.5f),
                    PathNode.CurveTo(7.5f, 10.432997f, 9.067003f, 12.0f, 11.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.CurveTo(14.932997f, 12.0f, 16.5f, 13.567003f, 16.5f, 15.5f),
                    PathNode.CurveTo(16.5f, 17.432997f, 14.932997f, 19.0f, 13.0f, 19.0f),
                    PathNode.LineTo(11.5f, 19.0f),
                    PathNode.CurveTo(9.628934f, 19.029602f, 7.967065f, 18.4064f, 7.5f, 17.5f)
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
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
