package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonOff: ImageVector
    get() {
        if (_pentagonOff != null) return _pentagonOff!!
        _pentagonOff = tablerOutlineIcon(
            name = "PentagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.133001f, 4.133f),
                    PathNode.LineTo(10.837f, 2.168f),
                    PathNode.CurveTo(11.530416f, 1.663965f, 12.469584f, 1.663965f, 13.163f, 2.168f),
                    PathNode.LineTo(21.184f, 7.996f),
                    PathNode.CurveTo(21.878f, 8.5f, 22.168f, 9.393f, 21.903f, 10.208f),
                    PathNode.LineTo(20.016f, 16.016f),
                    PathNode.MoveTo(19.035f, 19.036f),
                    PathNode.LineTo(18.839f, 19.638f),
                    PathNode.CurveTo(18.5743f, 20.453007f, 17.814915f, 21.004885f, 16.958f, 21.005f),
                    PathNode.LineTo(7.042f, 21.005f),
                    PathNode.CurveTo(6.185086f, 21.004885f, 5.425699f, 20.453007f, 5.161f, 19.638f),
                    PathNode.LineTo(2.097f, 10.208f),
                    PathNode.CurveTo(1.832035f, 9.392764f, 2.122341f, 8.49964f, 2.816f, 7.996f),
                    PathNode.LineTo(5.81f, 5.82f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _pentagonOff!!
    }

private var _pentagonOff: ImageVector? = null
