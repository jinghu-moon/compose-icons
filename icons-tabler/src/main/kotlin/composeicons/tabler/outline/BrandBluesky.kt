package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBluesky: ImageVector
    get() {
        if (_brandBluesky != null) return _brandBluesky!!
        _brandBluesky = tablerOutlineIcon(
            name = "BrandBluesky",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.335f, 5.144f),
                    PathNode.CurveTo(4.681f, 3.945f, 2.0f, 3.017f, 2.0f, 5.97f),
                    PathNode.CurveTo(2.0f, 6.56f, 2.35f, 10.923f, 2.556f, 11.631f),
                    PathNode.CurveTo(3.269f, 14.094f, 5.686f, 14.381f, 8.0f, 14.0f),
                    PathNode.CurveTo(3.955f, 14.665f, 3.111f, 17.208f, 5.333f, 19.41f),
                    PathNode.CurveTo(6.363f, 20.428f, 7.246f, 21.0f, 8.0f, 21.0f),
                    PathNode.CurveTo(10.0f, 21.0f, 11.134f, 18.231f, 11.5f, 17.5f),
                    PathNode.CurveTo(11.833f, 16.833f, 12.0f, 16.333f, 12.0f, 16.0f),
                    PathNode.CurveTo(12.0f, 16.333f, 12.167f, 16.833f, 12.5f, 17.5f),
                    PathNode.CurveTo(12.866f, 18.231f, 14.0f, 21.0f, 16.0f, 21.0f),
                    PathNode.CurveTo(16.754f, 21.0f, 17.637f, 20.429f, 18.667f, 19.41f),
                    PathNode.CurveTo(20.889f, 17.207f, 20.045f, 14.664f, 16.0f, 14.0f),
                    PathNode.CurveTo(18.314f, 14.38f, 20.73f, 14.094f, 21.444f, 11.631f),
                    PathNode.CurveTo(21.65f, 10.923f, 22.0f, 6.559f, 22.0f, 5.97f),
                    PathNode.CurveTo(22.0f, 3.017f, 19.32f, 3.945f, 17.665f, 5.144f),
                    PathNode.CurveTo(15.372f, 6.806f, 12.905f, 10.192f, 12.0f, 12.0f),
                    PathNode.CurveTo(11.095f, 10.192f, 8.628f, 6.806f, 6.335f, 5.144f)
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
        return _brandBluesky!!
    }

private var _brandBluesky: ImageVector? = null
