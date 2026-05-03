package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = phosphorThinIcon(
            name = "Cloud",
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
