package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandGrab: ImageVector
    get() {
        if (_handGrab != null) return _handGrab!!
        _handGrab = tablerOutlineIcon(
            name = "HandGrab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 7.5f),
                    PathNode.CurveTo(8.0f, 6.671573f, 8.671573f, 6.0f, 9.5f, 6.0f),
                    PathNode.CurveTo(10.328427f, 6.0f, 11.0f, 6.671573f, 11.0f, 7.5f),
                    PathNode.LineTo(11.0f, 10.0f)
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
                    PathNode.MoveTo(11.0f, 9.5f),
                    PathNode.LineTo(11.0f, 6.5f),
                    PathNode.CurveTo(11.0f, 5.671573f, 11.671573f, 5.0f, 12.5f, 5.0f),
                    PathNode.CurveTo(13.328427f, 5.0f, 14.0f, 5.671573f, 14.0f, 6.5f),
                    PathNode.LineTo(14.0f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 7.5f),
                    PathNode.CurveTo(14.0f, 6.671573f, 14.671573f, 6.0f, 15.5f, 6.0f),
                    PathNode.CurveTo(16.328426f, 6.0f, 17.0f, 6.671573f, 17.0f, 7.5f),
                    PathNode.LineTo(17.0f, 10.0f)
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
                    PathNode.MoveTo(17.0f, 9.5f),
                    PathNode.CurveTo(17.0f, 8.671573f, 17.671574f, 8.0f, 18.5f, 8.0f),
                    PathNode.CurveTo(19.328426f, 8.0f, 20.0f, 8.671573f, 20.0f, 9.5f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 17.31371f, 17.31371f, 20.0f, 14.0f, 20.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(12.208f, 20.0f),
                    PathNode.CurveTo(10.189532f, 20.00034f, 8.306157f, 18.985754f, 7.196f, 17.3f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(6.688f, 16.521f, 5.593f, 14.612f, 3.714f, 11.272f),
                    PathNode.CurveTo(3.315704f, 10.564051f, 3.553315f, 9.667687f, 4.25f, 9.25f),
                    PathNode.CurveTo(4.98428f, 8.809417f, 5.924145f, 8.924839f, 6.53f, 9.53f),
                    PathNode.LineTo(8.0f, 11.0f)
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
        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
