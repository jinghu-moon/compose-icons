package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward30: ImageVector
    get() {
        if (_rewindForward30 != null) return _rewindForward30!!
        _rewindForward30 = tablerOutlineIcon(
            name = "RewindForward30",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.007f, 16.478f),
                    PathNode.CurveTo(3.149208f, 14.821239f, 2.507333f, 12.189432f, 3.393754f, 9.863382f),
                    PathNode.CurveTo(4.280175f, 7.537334f, 6.510774f, 6.00018f, 9.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(15.0f, 15.5f),
                    PathNode.LineTo(15.0f, 18.5f),
                    PathNode.CurveTo(15.0f, 19.328426f, 15.671573f, 20.0f, 16.5f, 20.0f),
                    PathNode.CurveTo(17.328426f, 20.0f, 18.0f, 19.328426f, 18.0f, 18.5f),
                    PathNode.LineTo(18.0f, 15.5f),
                    PathNode.CurveTo(18.0f, 14.671573f, 17.328426f, 14.0f, 16.5f, 14.0f),
                    PathNode.CurveTo(15.671573f, 14.0f, 15.0f, 14.671573f, 15.0f, 15.5f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.LineTo(17.0f, 3.0f)
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
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.LineTo(10.5f, 14.0f),
                    PathNode.CurveTo(11.328427f, 14.0f, 12.0f, 14.671573f, 12.0f, 15.5f),
                    PathNode.CurveTo(12.0f, 16.328426f, 11.328427f, 17.0f, 10.5f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(10.5f, 17.0f),
                    PathNode.CurveTo(11.328427f, 17.0f, 12.0f, 17.671574f, 12.0f, 18.5f),
                    PathNode.CurveTo(12.0f, 19.328426f, 11.328427f, 20.0f, 10.5f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f)
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
        return _rewindForward30!!
    }

private var _rewindForward30: ImageVector? = null
