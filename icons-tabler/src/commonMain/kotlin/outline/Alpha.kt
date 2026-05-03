package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Alpha: ImageVector
    get() {
        if (_alpha != null) return _alpha!!
        _alpha = tablerOutlineIcon(
            name = "Alpha",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.1f, 6.0f),
                    PathNode.CurveTo(17.0f, 8.913f, 16.2f, 10.913f, 15.7f, 12.0f),
                    PathNode.CurveTo(13.821f, 16.088f, 11.987f, 18.0f, 9.7f, 18.0f),
                    PathNode.CurveTo(7.3f, 18.0f, 4.9f, 15.6f, 4.9f, 12.0f),
                    PathNode.CurveTo(4.9f, 8.4f, 7.3f, 6.0f, 9.7f, 6.0f),
                    PathNode.CurveTo(11.967f, 6.0f, 13.835f, 7.986f, 15.7f, 12.0f),
                    PathNode.CurveTo(16.212f, 13.102f, 17.012f, 15.102f, 18.1f, 18.0f)
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
        return _alpha!!
    }

private var _alpha: ImageVector? = null
