package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorBoldIcon(
            name = "DiceFour",
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
                    PathNode.MoveTo(112.0f, 96.0f),
                    PathNode.CurveTo(112.0f, 104.836555f, 104.836555f, 112.0f, 96.0f, 112.0f),
                    PathNode.CurveTo(87.163445f, 112.0f, 80.0f, 104.836555f, 80.0f, 96.0f),
                    PathNode.CurveTo(80.0f, 87.163445f, 87.163445f, 80.0f, 96.0f, 80.0f),
                    PathNode.CurveTo(104.836555f, 80.0f, 112.0f, 87.163445f, 112.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 104.836555f, 168.83656f, 112.0f, 160.0f, 112.0f),
                    PathNode.CurveTo(151.16344f, 112.0f, 144.0f, 104.836555f, 144.0f, 96.0f),
                    PathNode.CurveTo(144.0f, 87.163445f, 151.16344f, 80.0f, 160.0f, 80.0f),
                    PathNode.CurveTo(168.83656f, 80.0f, 176.0f, 87.163445f, 176.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 160.0f),
                    PathNode.CurveTo(112.0f, 168.83656f, 104.836555f, 176.0f, 96.0f, 176.0f),
                    PathNode.CurveTo(87.163445f, 176.0f, 80.0f, 168.83656f, 80.0f, 160.0f),
                    PathNode.CurveTo(80.0f, 151.16344f, 87.163445f, 144.0f, 96.0f, 144.0f),
                    PathNode.CurveTo(104.836555f, 144.0f, 112.0f, 151.16344f, 112.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.CurveTo(176.0f, 168.83656f, 168.83656f, 176.0f, 160.0f, 176.0f),
                    PathNode.CurveTo(151.16344f, 176.0f, 144.0f, 168.83656f, 144.0f, 160.0f),
                    PathNode.CurveTo(144.0f, 151.16344f, 151.16344f, 144.0f, 160.0f, 144.0f),
                    PathNode.CurveTo(168.83656f, 144.0f, 176.0f, 151.16344f, 176.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
