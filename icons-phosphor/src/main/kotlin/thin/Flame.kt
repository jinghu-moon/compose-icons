package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorThinIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.9f, 54.24f),
                    PathNode.CurveTo(158.71301f, 41.39069f, 144.99748f, 30.0831f, 130.06f, 20.57f),
                    PathNode.CurveTo(128.79227f, 19.808348f, 127.20773f, 19.808348f, 125.94f, 20.57f),
                    PathNode.CurveTo(111.00252f, 30.0831f, 97.28699f, 41.39069f, 85.1f, 54.24f),
                    PathNode.CurveTo(58.21f, 82.48f, 44.0f, 113.51f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(174.39192f, 228.0f, 212.0f, 190.39192f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 113.51f, 197.79f, 82.48f, 170.9f, 54.24f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 184.0f),
                    PathNode.CurveTo(92.0f, 151.89f, 120.07f, 130.25f, 128.0f, 124.79f),
                    PathNode.CurveTo(135.93f, 130.26f, 164.0f, 151.89f, 164.0f, 184.0f),
                    PathNode.CurveTo(164.0f, 203.88223f, 147.88223f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(108.11775f, 220.0f, 92.0f, 203.88223f, 92.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.94f, 212.0f),
                    PathNode.CurveTo(168.45619f, 204.12553f, 172.01477f, 194.22095f, 172.0f, 184.0f),
                    PathNode.CurveTo(172.0f, 142.22f, 131.77f, 117.6f, 130.06f, 116.57f),
                    PathNode.CurveTo(128.79227f, 115.80835f, 127.20773f, 115.80835f, 125.94f, 116.57f),
                    PathNode.CurveTo(124.23f, 117.6f, 84.0f, 142.22f, 84.0f, 184.0f),
                    PathNode.CurveTo(83.98523f, 194.22095f, 87.54381f, 204.12553f, 94.06f, 212.0f),
                    PathNode.CurveTo(68.29758f, 199.1233f, 52.0166f, 172.80124f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 81.52f, 115.64f, 36.83f, 128.0f, 28.74f),
                    PathNode.CurveTo(140.36f, 36.83f, 204.0f, 81.52f, 204.0f, 144.0f),
                    PathNode.CurveTo(203.9834f, 172.80124f, 187.70242f, 199.1233f, 161.94f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flame!!
    }

private var _flame: ImageVector? = null
