package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GhostOff: ImageVector
    get() {
        if (_ghostOff != null) return _ghostOff!!
        _ghostOff = tablerOutlineIcon(
            name = "GhostOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.794f, 4.776f),
                    PathNode.CurveTo(10.964246f, 3.65786f, 13.560264f, 3.751198f, 15.644606f, 5.022308f),
                    PathNode.CurveTo(17.728949f, 6.293418f, 19.000465f, 8.558647f, 19.0f, 11.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(18.88f, 18.898f),
                    PathNode.CurveTo(18.646666f, 19.467014f, 18.13599f, 19.875158f, 17.529535f, 19.97732f),
                    PathNode.CurveTo(16.923082f, 20.079481f, 16.306875f, 19.861168f, 15.9f, 19.4f),
                    PathNode.CurveTo(15.58729f, 18.999926f, 15.107786f, 18.76612f, 14.6f, 18.76612f),
                    PathNode.CurveTo(14.092215f, 18.76612f, 13.61271f, 18.999926f, 13.3f, 19.4f),
                    PathNode.CurveTo(12.98729f, 19.800074f, 12.507786f, 20.03388f, 12.0f, 20.03388f),
                    PathNode.CurveTo(11.492214f, 20.03388f, 11.01271f, 19.800074f, 10.7f, 19.4f),
                    PathNode.CurveTo(10.38729f, 18.999926f, 9.907785f, 18.76612f, 9.4f, 18.76612f),
                    PathNode.CurveTo(8.892214f, 18.76612f, 8.41271f, 18.999926f, 8.100001f, 19.4f),
                    PathNode.CurveTo(7.582999f, 19.985031f, 6.745107f, 20.164873f, 6.033567f, 19.84353f),
                    PathNode.CurveTo(5.322026f, 19.52219f, 4.902938f, 18.77468f, 5.0f, 18.0f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.CurveTo(5.0f, 9.317f, 5.594f, 7.773f, 6.583f, 6.566f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(14.01f, 10.0f)
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
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.CurveTo(11.20199f, 14.836958f, 12.79801f, 14.836958f, 14.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _ghostOff!!
    }

private var _ghostOff: ImageVector? = null
