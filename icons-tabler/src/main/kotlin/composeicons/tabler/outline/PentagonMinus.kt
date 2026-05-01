package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonMinus: ImageVector
    get() {
        if (_pentagonMinus != null) return _pentagonMinus!!
        _pentagonMinus = tablerOutlineIcon(
            name = "PentagonMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 21.0f),
                    PathNode.QuadTo(10.68f, 21.0f, 7.042f, 21.005f),
                    PathNode.CurveTo(6.18529f, 21.004255f, 5.426234f, 20.45262f, 5.161f, 19.638f),
                    PathNode.LineTo(2.097f, 10.208f),
                    PathNode.CurveTo(1.832697f, 9.392764f, 2.122877f, 8.500029f, 2.816f, 7.996f),
                    PathNode.LineTo(10.837f, 2.168f),
                    PathNode.CurveTo(11.530621f, 1.664594f, 12.469379f, 1.664594f, 13.163f, 2.168f),
                    PathNode.LineTo(21.184f, 7.996f),
                    PathNode.CurveTo(21.878f, 8.5f, 22.168f, 9.393f, 21.903f, 10.208f),
                    PathNode.LineTo(20.344f, 15.0f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
        return _pentagonMinus!!
    }

private var _pentagonMinus: ImageVector? = null
