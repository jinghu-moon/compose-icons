package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerRecord: ImageVector
    get() {
        if (_playerRecord != null) return _playerRecord!!
        _playerRecord = tablerOutlineIcon(
            name = "PlayerRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 15.865993f, 8.134007f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(15.865993f, 19.0f, 19.0f, 15.865993f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 8.134007f, 15.865993f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(8.134007f, 5.0f, 5.0f, 8.134007f, 5.0f, 12.0f)
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
        return _playerRecord!!
    }

private var _playerRecord: ImageVector? = null
