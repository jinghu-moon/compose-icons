package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorBoldIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 180.0f),
                    PathNode.CurveTo(144.0f, 188.83656f, 136.83656f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(119.163445f, 196.0f, 112.0f, 188.83656f, 112.0f, 180.0f),
                    PathNode.CurveTo(112.0f, 171.16344f, 119.163445f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(136.83656f, 164.0f, 144.0f, 171.16344f, 144.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 81.60808f, 174.39192f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(81.60808f, 44.0f, 44.0f, 81.60808f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 174.39192f, 81.60808f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(174.37135f, 211.9504f, 211.9504f, 174.37135f, 212.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(103.74f, 64.0f, 84.0f, 81.94f, 84.0f, 104.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 114.62742f, 89.37258f, 120.0f, 96.0f, 120.0f),
                    PathNode.CurveTo(102.62742f, 120.0f, 108.0f, 114.62742f, 108.0f, 108.0f),
                    PathNode.LineTo(108.0f, 104.0f),
                    PathNode.CurveTo(108.0f, 95.18f, 117.0f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(139.0f, 88.0f, 148.0f, 95.18f, 148.0f, 104.0f),
                    PathNode.CurveTo(148.0f, 112.82f, 139.0f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(121.37258f, 120.0f, 116.0f, 125.37258f, 116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.CurveTo(115.98519f, 146.14027f, 120.607994f, 151.30112f, 126.71287f, 151.95972f),
                    PathNode.CurveTo(132.81773f, 152.6183f, 138.43488f, 148.56215f, 139.73f, 142.56f),
                    PathNode.CurveTo(158.31f, 137.88f, 172.0f, 122.37f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 81.94f, 152.26f, 64.0f, 128.0f, 64.0f),
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
        return _question!!
    }

private var _question: ImageVector? = null
