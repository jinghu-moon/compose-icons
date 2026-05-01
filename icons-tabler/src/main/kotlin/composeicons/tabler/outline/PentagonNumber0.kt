package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonNumber0: ImageVector
    get() {
        if (_pentagonNumber0 != null) return _pentagonNumber0!!
        _pentagonNumber0 = tablerOutlineIcon(
            name = "PentagonNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.163f, 2.168f),
                    PathNode.LineTo(21.184f, 7.996f),
                    PathNode.CurveTo(21.878f, 8.5f, 22.168f, 9.393f, 21.903f, 10.208f),
                    PathNode.LineTo(18.839f, 19.638f),
                    PathNode.CurveTo(18.5743f, 20.453007f, 17.814915f, 21.004885f, 16.958f, 21.005f),
                    PathNode.LineTo(7.042f, 21.005f),
                    PathNode.CurveTo(6.185086f, 21.004885f, 5.425699f, 20.453007f, 5.161f, 19.638f),
                    PathNode.LineTo(2.097f, 10.208f),
                    PathNode.CurveTo(1.832035f, 9.392764f, 2.122341f, 8.49964f, 2.816f, 7.996f),
                    PathNode.LineTo(10.837f, 2.168f),
                    PathNode.CurveTo(11.530416f, 1.663965f, 12.469584f, 1.663965f, 13.163f, 2.168f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 15.104569f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 8.895431f, 13.104569f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.895431f, 8.0f, 10.0f, 8.895431f, 10.0f, 10.0f)
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
        return _pentagonNumber0!!
    }

private var _pentagonNumber0: ImageVector? = null
