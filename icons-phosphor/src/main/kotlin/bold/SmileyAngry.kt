package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorBoldIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 156.0f),
                    PathNode.CurveTo(83.163445f, 156.0f, 76.0f, 148.83656f, 76.0f, 140.0f),
                    PathNode.CurveTo(76.0f, 131.16344f, 83.163445f, 124.0f, 92.0f, 124.0f),
                    PathNode.CurveTo(100.836555f, 124.0f, 108.0f, 131.16344f, 108.0f, 140.0f),
                    PathNode.CurveTo(108.0f, 148.83656f, 100.836555f, 156.0f, 92.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 124.0f),
                    PathNode.CurveTo(155.16344f, 124.0f, 148.0f, 131.16344f, 148.0f, 140.0f),
                    PathNode.CurveTo(148.0f, 148.83656f, 155.16344f, 156.0f, 164.0f, 156.0f),
                    PathNode.CurveTo(172.83656f, 156.0f, 180.0f, 148.83656f, 180.0f, 140.0f),
                    PathNode.CurveTo(180.0f, 131.16344f, 172.83656f, 124.0f, 164.0f, 124.0f),
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
                    PathNode.MoveTo(85.34f, 102.0f),
                    PathNode.LineTo(121.34f, 126.0f),
                    PathNode.CurveTo(125.37245f, 128.6904f, 130.62756f, 128.6904f, 134.66f, 126.0f),
                    PathNode.LineTo(170.66f, 102.0f),
                    PathNode.CurveTo(176.18285f, 98.321785f, 177.67822f, 90.86285f, 174.0f, 85.34f),
                    PathNode.CurveTo(170.32178f, 79.817154f, 162.86285f, 78.321785f, 157.34f, 82.0f),
                    PathNode.LineTo(128.0f, 101.58f),
                    PathNode.LineTo(98.66f, 82.0f),
                    PathNode.CurveTo(93.13715f, 78.321785f, 85.678215f, 79.817154f, 82.0f, 85.34f),
                    PathNode.CurveTo(78.321785f, 90.86285f, 79.817154f, 98.321785f, 85.34f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 167.12f),
                    PathNode.CurveTo(137.96251f, 157.64136f, 118.0375f, 157.64136f, 102.0f, 167.12f),
                    PathNode.CurveTo(98.09426f, 169.16315f, 95.62305f, 173.18314f, 95.56339f, 177.5906f),
                    PathNode.CurveTo(95.50374f, 181.99806f, 97.865234f, 186.08345f, 101.71425f, 188.23157f),
                    PathNode.CurveTo(105.563255f, 190.3797f, 110.28013f, 190.2447f, 114.0f, 187.88f),
                    PathNode.CurveTo(122.612274f, 182.69159f, 133.38773f, 182.69159f, 142.0f, 187.88f),
                    PathNode.CurveTo(145.71985f, 190.2447f, 150.43674f, 190.3797f, 154.28575f, 188.23157f),
                    PathNode.CurveTo(158.13477f, 186.08345f, 160.49626f, 181.99806f, 160.43658f, 177.5906f),
                    PathNode.CurveTo(160.37695f, 173.18314f, 157.90575f, 169.16315f, 154.0f, 167.12f),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
