package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinStarGreen: ImageVector
    get() {
        if (_michelinStarGreen != null) return _michelinStarGreen!!
        _michelinStarGreen = tablerOutlineIcon(
            name = "MichelinStarGreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.432f, 17.949f),
                    PathNode.CurveTo(13.295f, 19.493f, 15.021f, 19.925f, 16.562f, 19.061f),
                    PathNode.CurveTo(18.102f, 18.196f, 18.534f, 16.467f, 17.61f, 14.923f),
                    PathNode.CurveTo(17.425f, 14.614f, 17.301f, 14.367f, 17.116f, 14.183f),
                    PathNode.CurveTo(17.363f, 14.243f, 17.671f, 14.243f, 18.041f, 14.243f),
                    PathNode.CurveTo(19.767f, 14.243f, 21.0f, 13.009f, 21.0f, 11.28f),
                    PathNode.CurveTo(21.0f, 9.55f, 19.767f, 8.315f, 17.98f, 8.315f),
                    PathNode.CurveTo(17.61f, 8.315f, 17.363f, 8.315f, 17.055f, 8.377f),
                    PathNode.CurveTo(17.24f, 8.192001f, 17.363f, 7.945f, 17.548f, 7.637f),
                    PathNode.CurveTo(18.411f, 6.092f, 17.979f, 4.363f, 16.5f, 3.499f),
                    PathNode.CurveTo(14.959f, 2.634f, 13.295f, 3.066f, 12.37f, 4.61f),
                    PathNode.CurveTo(12.185f, 4.919f, 12.062f, 5.166f, 11.938f, 5.413f),
                    PathNode.CurveTo(11.815f, 5.166f, 11.692f, 4.919f, 11.507f, 4.61f),
                    PathNode.CurveTo(10.705f, 3.005f, 8.979f, 2.572f, 7.5f, 3.437f),
                    PathNode.CurveTo(5.959f, 4.302f, 5.527f, 6.031f, 6.452f, 7.574f),
                    PathNode.CurveTo(6.637f, 7.884f, 6.76f, 8.13f, 6.945f, 8.315f),
                    PathNode.CurveTo(6.699f, 8.254f, 6.39f, 8.254f, 6.021f, 8.254f),
                    PathNode.CurveTo(4.233f, 8.254f, 3.0f, 9.489f, 3.0f, 11.218f),
                    PathNode.CurveTo(3.0f, 12.947f, 4.233f, 14.182f, 6.02f, 14.182f)
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
                    PathNode.MoveTo(4.073f, 21.0f),
                    PathNode.CurveTo(8.359f, 18.244f, 9.973f, 15.746f, 12.0f, 12.0f)
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
        return _michelinStarGreen!!
    }

private var _michelinStarGreen: ImageVector? = null
