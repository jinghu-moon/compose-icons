package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerRight: ImageVector
    get() {
        if (_handFingerRight != null) return _handFingerRight!!
        _handFingerRight = tablerOutlineIcon(
            name = "HandFingerRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(20.5f, 8.0f),
                    PathNode.CurveTo(21.328426f, 8.0f, 22.0f, 8.671573f, 22.0f, 9.5f),
                    PathNode.CurveTo(22.0f, 10.328427f, 21.328426f, 11.0f, 20.5f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f)
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
                    PathNode.MoveTo(13.5f, 11.0f),
                    PathNode.LineTo(15.5f, 11.0f),
                    PathNode.CurveTo(16.328426f, 11.0f, 17.0f, 11.671573f, 17.0f, 12.5f),
                    PathNode.CurveTo(17.0f, 13.328427f, 16.328426f, 14.0f, 15.5f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f)
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
                    PathNode.MoveTo(14.5f, 14.0f),
                    PathNode.CurveTo(15.328427f, 14.0f, 16.0f, 14.671573f, 16.0f, 15.5f),
                    PathNode.CurveTo(16.0f, 16.328426f, 15.328427f, 17.0f, 14.5f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f)
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
                    PathNode.MoveTo(13.5f, 17.0f),
                    PathNode.CurveTo(14.328427f, 17.0f, 15.0f, 17.671574f, 15.0f, 18.5f),
                    PathNode.CurveTo(15.0f, 19.328426f, 14.328427f, 20.0f, 13.5f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(5.686292f, 20.0f, 3.0f, 17.31371f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.208f),
                    PathNode.CurveTo(2.99966f, 10.189532f, 4.014247f, 8.306157f, 5.7f, 7.196f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.QuadTo(6.718f, 6.532f, 11.728f, 3.714f),
                    PathNode.CurveTo(12.435949f, 3.315704f, 13.332313f, 3.553315f, 13.75f, 4.25f),
                    PathNode.CurveTo(14.19f, 4.984f, 14.075f, 5.924f, 13.47f, 6.53f),
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _handFingerRight!!
    }

private var _handFingerRight: ImageVector? = null
