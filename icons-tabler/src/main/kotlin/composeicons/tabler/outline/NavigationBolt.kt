package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationBolt: ImageVector
    get() {
        if (_navigationBolt != null) return _navigationBolt!!
        _navigationBolt = tablerOutlineIcon(
            name = "NavigationBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.559f, 12.882f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(4.03f, 20.275f),
                    PathNode.CurveTo(3.96f, 20.475f, 4.013f, 20.699f, 4.165f, 20.847f),
                    PathNode.CurveTo(4.315f, 20.995f, 4.539f, 21.04f, 4.735f, 20.963f),
                    PathNode.LineTo(12.0f, 18.5f),
                    PathNode.LineTo(13.036f, 18.851f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _navigationBolt!!
    }

private var _navigationBolt: ImageVector? = null
