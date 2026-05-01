package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorBoldIcon(
            name = "DiceTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(44.11775f, 28.0f, 28.0f, 44.11775f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 211.88223f, 44.11775f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(211.88223f, 228.0f, 228.0f, 211.88223f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 44.11775f, 211.88223f, 28.0f, 192.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 192.0f),
                    PathNode.CurveTo(204.0f, 198.62741f, 198.62741f, 204.0f, 192.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(57.37258f, 204.0f, 52.0f, 198.62741f, 52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 57.37258f, 57.37258f, 52.0f, 64.0f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(198.62741f, 52.0f, 204.0f, 57.37258f, 204.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 112.836555f, 112.836555f, 120.0f, 104.0f, 120.0f),
                    PathNode.CurveTo(95.163445f, 120.0f, 88.0f, 112.836555f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 95.163445f, 95.163445f, 88.0f, 104.0f, 88.0f),
                    PathNode.CurveTo(112.836555f, 88.0f, 120.0f, 95.163445f, 120.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 160.83656f, 160.83656f, 168.0f, 152.0f, 168.0f),
                    PathNode.CurveTo(143.16344f, 168.0f, 136.0f, 160.83656f, 136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 143.16344f, 143.16344f, 136.0f, 152.0f, 136.0f),
                    PathNode.CurveTo(160.83656f, 136.0f, 168.0f, 143.16344f, 168.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
