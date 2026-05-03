package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorBoldIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 96.0f),
                    PathNode.LineTo(180.0f, 160.0f),
                    PathNode.CurveTo(180.00096f, 164.61417f, 177.35622f, 168.82019f, 173.19728f, 170.81862f),
                    PathNode.CurveTo(169.03835f, 172.81702f, 164.10193f, 172.25385f, 160.5f, 169.37f),
                    PathNode.LineTo(124.0f, 140.17f),
                    PathNode.LineTo(124.0f, 160.0f),
                    PathNode.CurveTo(124.00096f, 164.61417f, 121.35622f, 168.82019f, 117.19728f, 170.81862f),
                    PathNode.CurveTo(113.03834f, 172.81702f, 108.10193f, 172.25385f, 104.5f, 169.37f),
                    PathNode.LineTo(64.5f, 137.37f),
                    PathNode.CurveTo(61.653732f, 135.09271f, 59.996872f, 131.64517f, 59.996872f, 128.0f),
                    PathNode.CurveTo(59.996872f, 124.354836f, 61.653732f, 120.90728f, 64.5f, 118.63f),
                    PathNode.LineTo(104.5f, 86.63f),
                    PathNode.CurveTo(108.10193f, 83.74615f, 113.03834f, 83.18296f, 117.19728f, 85.18138f),
                    PathNode.CurveTo(121.35622f, 87.17981f, 124.00096f, 91.38584f, 124.0f, 96.0f),
                    PathNode.LineTo(124.0f, 115.83f),
                    PathNode.LineTo(160.5f, 86.63f),
                    PathNode.CurveTo(164.10193f, 83.74615f, 169.03835f, 83.18296f, 173.19728f, 85.18138f),
                    PathNode.CurveTo(177.35622f, 87.17981f, 180.00096f, 91.38584f, 180.0f, 96.0f),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
