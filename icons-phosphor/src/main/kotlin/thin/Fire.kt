package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorThinIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.94f, 152.67f),
                    PathNode.CurveTo(175.99913f, 174.73409f, 158.72499f, 192.00423f, 136.66f, 195.94f),
                    PathNode.CurveTo(136.44225f, 195.97981f, 136.22136f, 195.9999f, 136.0f, 196.0f),
                    PathNode.CurveTo(133.93074f, 195.9847f, 132.21475f, 194.39366f, 132.04333f, 192.33147f),
                    PathNode.CurveTo(131.87192f, 190.26926f, 133.30167f, 188.41675f, 135.34f, 188.06f),
                    PathNode.CurveTo(153.52f, 185.0f, 168.97f, 169.55f, 172.06f, 151.33f),
                    PathNode.CurveTo(172.50688f, 149.23244f, 174.5285f, 147.86057f, 176.64278f, 148.2201f),
                    PathNode.CurveTo(178.75706f, 148.57964f, 180.21158f, 150.54263f, 179.94f, 152.67f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 190.39192f, 174.39192f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(81.60808f, 228.0f, 44.0f, 190.39192f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 117.0f, 54.71f, 89.25f, 75.84f, 61.57f),
                    PathNode.CurveTo(76.534096f, 60.650257f, 77.59111f, 60.074512f, 78.74029f, 59.99024f),
                    PathNode.CurveTo(79.88946f, 59.905968f, 81.01915f, 60.32135f, 81.84f, 61.13f),
                    PathNode.LineTo(110.39f, 88.83f),
                    PathNode.LineTo(134.54f, 22.63f),
                    PathNode.CurveTo(134.9854f, 21.4084f, 135.99677f, 20.479513f, 137.25175f, 20.139412f),
                    PathNode.CurveTo(138.50674f, 19.79931f, 139.84875f, 20.090439f, 140.85f, 20.92f),
                    PathNode.CurveTo(162.22f, 38.69f, 212.0f, 86.24f, 212.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 93.18f, 162.27f, 50.09f, 140.06f, 30.77f),
                    PathNode.LineTo(115.76f, 97.37f),
                    PathNode.CurveTo(115.29633f, 98.6462f, 114.21691f, 99.600044f, 112.89336f, 99.90315f),
                    PathNode.CurveTo(111.56979f, 100.20626f, 110.182846f, 99.81723f, 109.21f, 98.87f),
                    PathNode.LineTo(79.5f, 70.0f),
                    PathNode.CurveTo(61.25f, 95.07f, 52.0f, 119.93f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 185.97365f, 86.02636f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(169.97365f, 220.0f, 204.0f, 185.97365f, 204.0f, 144.0f),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
