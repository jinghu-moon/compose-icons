package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpaceOff: ImageVector
    get() {
        if (_spaceOff != null) return _spaceOff!!
        _spaceOff = tablerOutlineIcon(
            name = "SpaceOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(4.0f, 13.552285f, 4.447716f, 14.0f, 5.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.552284f, 14.0f, 20.0f, 13.552285f, 20.0f, 13.0f),
                    PathNode.LineTo(20.0f, 10.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _spaceOff!!
    }

private var _spaceOff: ImageVector? = null
