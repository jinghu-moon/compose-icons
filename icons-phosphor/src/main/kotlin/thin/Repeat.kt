package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Repeat: ImageVector
    get() {
        if (_repeat != null) return _repeat!!
        _repeat = phosphorThinIcon(
            name = "Repeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 128.0f),
                    PathNode.CurveTo(28.038584f, 90.46063f, 58.460632f, 60.038586f, 96.0f, 60.0f),
                    PathNode.LineTo(214.34f, 60.0f),
                    PathNode.LineTo(197.17f, 42.83f),
                    PathNode.CurveTo(195.60704f, 41.267033f, 195.60704f, 38.732967f, 197.17f, 37.17f),
                    PathNode.CurveTo(198.73297f, 35.607033f, 201.26703f, 35.607033f, 202.83f, 37.17f),
                    PathNode.LineTo(226.83f, 61.17f),
                    PathNode.CurveTo(227.58112f, 61.920273f, 228.00314f, 62.938362f, 228.00314f, 64.0f),
                    PathNode.CurveTo(228.00314f, 65.06164f, 227.58112f, 66.07973f, 226.83f, 66.83f),
                    PathNode.LineTo(202.83f, 90.83f),
                    PathNode.CurveTo(201.26703f, 92.39297f, 198.73297f, 92.39297f, 197.17f, 90.83f),
                    PathNode.CurveTo(195.60704f, 89.26704f, 195.60704f, 86.73296f, 197.17f, 85.17f),
                    PathNode.LineTo(214.34f, 68.0f),
                    PathNode.LineTo(96.0f, 68.0f),
                    PathNode.CurveTo(62.878906f, 68.038574f, 36.038574f, 94.87891f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 34.20914f, 132.0f, 32.0f, 132.0f),
                    PathNode.CurveTo(29.790861f, 132.0f, 28.0f, 130.20914f, 28.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 124.0f),
                    PathNode.CurveTo(221.79086f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.96143f, 161.1211f, 193.1211f, 187.96143f, 160.0f, 188.0f),
                    PathNode.LineTo(41.66f, 188.0f),
                    PathNode.LineTo(58.83f, 170.83f),
                    PathNode.CurveTo(60.392967f, 169.26703f, 60.392967f, 166.73297f, 58.83f, 165.17f),
                    PathNode.CurveTo(57.267033f, 163.60704f, 54.732967f, 163.60704f, 53.17f, 165.17f),
                    PathNode.LineTo(29.17f, 189.17f),
                    PathNode.CurveTo(28.418892f, 189.92027f, 27.996853f, 190.93837f, 27.996853f, 192.0f),
                    PathNode.CurveTo(27.996853f, 193.06163f, 28.418892f, 194.07973f, 29.17f, 194.83f),
                    PathNode.LineTo(53.17f, 218.83f),
                    PathNode.CurveTo(54.732967f, 220.39296f, 57.267033f, 220.39296f, 58.83f, 218.83f),
                    PathNode.CurveTo(60.392967f, 217.26703f, 60.392967f, 214.73297f, 58.83f, 213.17f),
                    PathNode.LineTo(41.66f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(197.53935f, 195.96141f, 227.96141f, 165.53935f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 125.79086f, 226.20914f, 124.0f, 224.0f, 124.0f),
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
        return _repeat!!
    }

private var _repeat: ImageVector? = null
