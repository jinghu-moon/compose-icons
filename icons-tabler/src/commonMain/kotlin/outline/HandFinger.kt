package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFinger: ImageVector
    get() {
        if (_handFinger != null) return _handFinger!!
        _handFinger = tablerOutlineIcon(
            name = "HandFinger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 4.5f),
                    PathNode.CurveTo(8.0f, 3.671573f, 8.671573f, 3.0f, 9.5f, 3.0f),
                    PathNode.CurveTo(10.328427f, 3.0f, 11.0f, 3.671573f, 11.0f, 4.5f),
                    PathNode.LineTo(11.0f, 12.0f)
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
                    PathNode.MoveTo(11.0f, 11.5f),
                    PathNode.LineTo(11.0f, 9.5f),
                    PathNode.CurveTo(11.0f, 8.671573f, 11.671573f, 8.0f, 12.5f, 8.0f),
                    PathNode.CurveTo(13.328427f, 8.0f, 14.0f, 8.671573f, 14.0f, 9.5f),
                    PathNode.LineTo(14.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 10.5f),
                    PathNode.CurveTo(14.0f, 9.671573f, 14.671573f, 9.0f, 15.5f, 9.0f),
                    PathNode.CurveTo(16.328426f, 9.0f, 17.0f, 9.671573f, 17.0f, 10.5f),
                    PathNode.LineTo(17.0f, 12.0f)
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
                    PathNode.MoveTo(17.0f, 11.5f),
                    PathNode.CurveTo(17.0f, 10.671573f, 17.671574f, 10.0f, 18.5f, 10.0f),
                    PathNode.CurveTo(19.328426f, 10.0f, 20.0f, 10.671573f, 20.0f, 11.5f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.0f, 19.31371f, 17.31371f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(12.208f, 22.0f),
                    PathNode.CurveTo(10.189532f, 22.00034f, 8.306157f, 20.985754f, 7.196f, 19.3f),
                    PathNode.CurveTo(7.13041f, 19.200169f, 7.065077f, 19.100168f, 7.0f, 19.0f),
                    PathNode.CurveTo(6.688f, 18.521f, 5.593f, 16.612f, 3.714f, 13.272f),
                    PathNode.CurveTo(3.315704f, 12.564051f, 3.553315f, 11.667687f, 4.25f, 11.25f),
                    PathNode.CurveTo(4.98428f, 10.809417f, 5.924145f, 10.924839f, 6.53f, 11.53f),
                    PathNode.LineTo(8.0f, 13.0f)
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
        return _handFinger!!
    }

private var _handFinger: ImageVector? = null
