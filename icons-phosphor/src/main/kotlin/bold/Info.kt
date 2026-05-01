package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorBoldIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 84.0f),
                    PathNode.CurveTo(108.0f, 75.163445f, 115.163445f, 68.0f, 124.0f, 68.0f),
                    PathNode.CurveTo(132.83656f, 68.0f, 140.0f, 75.163445f, 140.0f, 84.0f),
                    PathNode.CurveTo(140.0f, 92.836555f, 132.83656f, 100.0f, 124.0f, 100.0f),
                    PathNode.CurveTo(115.163445f, 100.0f, 108.0f, 92.836555f, 108.0f, 84.0f),
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
                    PathNode.MoveTo(140.0f, 164.68f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 120.95431f, 131.0457f, 112.0f, 120.0f, 112.0f),
                    PathNode.CurveTo(114.14861f, 111.99128f, 109.14407f, 116.204124f, 108.15485f, 121.9713f),
                    PathNode.CurveTo(107.16563f, 127.738464f, 110.48018f, 133.37825f, 116.0f, 135.32f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 179.0457f, 124.95431f, 188.0f, 136.0f, 188.0f),
                    PathNode.CurveTo(141.8514f, 188.00871f, 146.85593f, 183.79588f, 147.84515f, 178.0287f),
                    PathNode.CurveTo(148.83438f, 172.26154f, 145.51982f, 166.62175f, 140.0f, 164.68f),
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
        return _info!!
    }

private var _info: ImageVector? = null
