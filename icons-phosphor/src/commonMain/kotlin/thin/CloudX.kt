package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorThinIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 44.0f),
                    PathNode.CurveTo(127.11817f, 44.02993f, 97.26893f, 63.21845f, 83.59f, 93.12f),
                    PathNode.CurveTo(79.77148f, 92.37618f, 75.8903f, 92.00113f, 72.0f, 92.0f),
                    PathNode.CurveTo(38.862915f, 92.0f, 12.0f, 118.862915f, 12.0f, 152.0f),
                    PathNode.CurveTo(12.0f, 185.13708f, 38.862915f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(206.39192f, 212.0f, 244.0f, 174.39192f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 81.60808f, 206.39192f, 44.0f, 160.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 204.0f),
                    PathNode.LineTo(72.0f, 204.0f),
                    PathNode.CurveTo(52.406754f, 203.98244f, 34.486694f, 192.95303f, 25.643822f, 175.46878f),
                    PathNode.CurveTo(16.800953f, 157.98451f, 18.536655f, 137.01398f, 30.133795f, 121.221504f),
                    PathNode.CurveTo(41.730934f, 105.42904f, 61.220493f, 97.49597f, 80.55f, 100.7f),
                    PathNode.CurveTo(77.528175f, 109.48427f, 75.99047f, 118.7105f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 130.20914f, 77.79086f, 132.0f, 80.0f, 132.0f),
                    PathNode.CurveTo(82.20914f, 132.0f, 84.0f, 130.20914f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 86.02636f, 118.02636f, 52.0f, 160.0f, 52.0f),
                    PathNode.CurveTo(201.97365f, 52.0f, 236.0f, 86.02636f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 169.97365f, 201.97365f, 204.0f, 160.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.83f, 114.83f),
                    PathNode.LineTo(165.66f, 136.0f),
                    PathNode.LineTo(186.83f, 157.17f),
                    PathNode.CurveTo(188.39296f, 158.73297f, 188.39296f, 161.26703f, 186.83f, 162.83f),
                    PathNode.CurveTo(185.26703f, 164.39296f, 182.73297f, 164.39296f, 181.17f, 162.83f),
                    PathNode.LineTo(160.0f, 141.66f),
                    PathNode.LineTo(138.83f, 162.83f),
                    PathNode.CurveTo(137.26703f, 164.39296f, 134.73297f, 164.39296f, 133.17f, 162.83f),
                    PathNode.CurveTo(131.60704f, 161.26703f, 131.60704f, 158.73297f, 133.17f, 157.17f),
                    PathNode.LineTo(154.34f, 136.0f),
                    PathNode.LineTo(133.17f, 114.83f),
                    PathNode.CurveTo(131.60704f, 113.26704f, 131.60704f, 110.73296f, 133.17f, 109.17f),
                    PathNode.CurveTo(134.73297f, 107.60703f, 137.26703f, 107.60703f, 138.83f, 109.17f),
                    PathNode.LineTo(160.0f, 130.34f),
                    PathNode.LineTo(181.17f, 109.17f),
                    PathNode.CurveTo(182.73297f, 107.60703f, 185.26703f, 107.60703f, 186.83f, 109.17f),
                    PathNode.CurveTo(188.39296f, 110.73296f, 188.39296f, 113.26704f, 186.83f, 114.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
