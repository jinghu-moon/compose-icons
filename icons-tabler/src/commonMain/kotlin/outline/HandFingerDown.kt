package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerDown: ImageVector
    get() {
        if (_handFingerDown != null) return _handFingerDown!!
        _handFingerDown = tablerOutlineIcon(
            name = "HandFingerDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(8.0f, 20.5f),
                    PathNode.CurveTo(8.0f, 21.328426f, 8.671573f, 22.0f, 9.5f, 22.0f),
                    PathNode.CurveTo(10.328427f, 22.0f, 11.0f, 21.328426f, 11.0f, 20.5f),
                    PathNode.LineTo(11.0f, 13.0f)
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
                    PathNode.MoveTo(11.0f, 13.5f),
                    PathNode.LineTo(11.0f, 15.5f),
                    PathNode.CurveTo(11.0f, 16.328426f, 11.671573f, 17.0f, 12.5f, 17.0f),
                    PathNode.CurveTo(13.328427f, 17.0f, 14.0f, 16.328426f, 14.0f, 15.5f),
                    PathNode.LineTo(14.0f, 13.0f)
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
                    PathNode.MoveTo(14.0f, 14.5f),
                    PathNode.CurveTo(14.0f, 15.328427f, 14.671573f, 16.0f, 15.5f, 16.0f),
                    PathNode.CurveTo(16.328426f, 16.0f, 17.0f, 15.328427f, 17.0f, 14.5f),
                    PathNode.LineTo(17.0f, 13.0f)
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
                    PathNode.MoveTo(17.0f, 13.5f),
                    PathNode.CurveTo(17.0f, 14.328427f, 17.671574f, 15.0f, 18.5f, 15.0f),
                    PathNode.CurveTo(19.328426f, 15.0f, 20.0f, 14.328427f, 20.0f, 13.5f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 5.686292f, 17.31371f, 3.0f, 14.0f, 3.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(12.208f, 3.0f),
                    PathNode.CurveTo(10.189532f, 2.99966f, 8.306157f, 4.014247f, 7.196f, 5.7f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.QuadTo(6.532f, 6.718f, 3.714f, 11.728f),
                    PathNode.CurveTo(3.315704f, 12.435949f, 3.553315f, 13.332313f, 4.25f, 13.75f),
                    PathNode.CurveTo(4.984f, 14.19f, 5.924f, 14.075f, 6.53f, 13.47f),
                    PathNode.LineTo(8.0f, 12.0f)
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
        return _handFingerDown!!
    }

private var _handFingerDown: ImageVector? = null
