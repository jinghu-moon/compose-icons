package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorBoldIcon(
            name = "Keyhole",
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
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(110.868065f, 67.9956f, 95.29129f, 77.9356f, 88.078415f, 93.47515f),
                    PathNode.CurveTo(80.86554f, 109.014694f, 83.328224f, 127.32794f, 94.39f, 140.41f),
                    PathNode.LineTo(84.53f, 172.47f),
                    PathNode.CurveTo(83.40966f, 176.10999f, 84.083725f, 180.06567f, 86.34635f, 183.1292f),
                    PathNode.CurveTo(88.60898f, 186.19272f, 92.191505f, 188.0003f, 96.0f, 188.0f),
                    PathNode.LineTo(160.0f, 188.0f),
                    PathNode.CurveTo(163.8085f, 188.0003f, 167.39102f, 186.19272f, 169.65364f, 183.1292f),
                    PathNode.CurveTo(171.91628f, 180.06567f, 172.59033f, 176.10999f, 171.47f, 172.47f),
                    PathNode.LineTo(161.61f, 140.41f),
                    PathNode.CurveTo(172.67178f, 127.32794f, 175.13446f, 109.014694f, 167.92159f, 93.47515f),
                    PathNode.CurveTo(160.70871f, 77.9356f, 145.13193f, 67.9956f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.53f, 140.51f),
                    PathNode.LineTo(143.75f, 164.0f),
                    PathNode.LineTo(112.25f, 164.0f),
                    PathNode.LineTo(119.47f, 140.51f),
                    PathNode.CurveTo(120.908165f, 135.7996f, 119.32217f, 130.6887f, 115.47f, 127.62f),
                    PathNode.CurveTo(108.840675f, 122.312294f, 106.28614f, 113.396736f, 109.098724f, 105.38368f),
                    PathNode.CurveTo(111.91131f, 97.37062f, 119.47767f, 92.00751f, 127.97f, 92.00751f),
                    PathNode.CurveTo(136.46233f, 92.00751f, 144.02869f, 97.37062f, 146.84128f, 105.38368f),
                    PathNode.CurveTo(149.65385f, 113.396736f, 147.09932f, 122.312294f, 140.47f, 127.62f),
                    PathNode.CurveTo(136.63972f, 130.7036f, 135.07831f, 135.8119f, 136.53f, 140.51f),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
