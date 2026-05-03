package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerLeft: ImageVector
    get() {
        if (_handFingerLeft != null) return _handFingerLeft!!
        _handFingerLeft = tablerOutlineIcon(
            name = "HandFingerLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(3.5f, 8.0f),
                    PathNode.CurveTo(2.671573f, 8.0f, 2.0f, 8.671573f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.0f, 10.328427f, 2.671573f, 11.0f, 3.5f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f)
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
                    PathNode.MoveTo(10.5f, 11.0f),
                    PathNode.LineTo(8.5f, 11.0f),
                    PathNode.CurveTo(7.671573f, 11.0f, 7.0f, 11.671573f, 7.0f, 12.5f),
                    PathNode.CurveTo(7.0f, 13.328427f, 7.671573f, 14.0f, 8.5f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f)
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
                    PathNode.MoveTo(9.5f, 14.0f),
                    PathNode.CurveTo(8.671573f, 14.0f, 8.0f, 14.671573f, 8.0f, 15.5f),
                    PathNode.CurveTo(8.0f, 16.328426f, 8.671573f, 17.0f, 9.5f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f)
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
                    PathNode.MoveTo(10.5f, 17.0f),
                    PathNode.CurveTo(9.671573f, 17.0f, 9.0f, 17.671574f, 9.0f, 18.5f),
                    PathNode.CurveTo(9.0f, 19.328426f, 9.671573f, 20.0f, 10.5f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(18.31371f, 20.0f, 21.0f, 17.31371f, 21.0f, 14.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.208f),
                    PathNode.CurveTo(21.00034f, 10.189532f, 19.985754f, 8.306157f, 18.3f, 7.196f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.QuadTo(17.282f, 6.532f, 12.272f, 3.714f),
                    PathNode.CurveTo(11.564051f, 3.315704f, 10.667687f, 3.553315f, 10.25f, 4.25f),
                    PathNode.CurveTo(9.810525f, 4.984515f, 9.925858f, 5.92365f, 10.53f, 6.53f),
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _handFingerLeft!!
    }

private var _handFingerLeft: ImageVector? = null
