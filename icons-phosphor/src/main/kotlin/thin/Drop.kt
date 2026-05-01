package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorThinIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.0f, 50.38f),
                    PathNode.CurveTo(158.86241f, 36.354607f, 145.20168f, 23.723536f, 130.27f, 12.72f),
                    PathNode.CurveTo(128.89441f, 11.759492f, 127.06559f, 11.759492f, 125.69f, 12.72f),
                    PathNode.CurveTo(110.77231f, 23.725864f, 97.12508f, 36.356853f, 85.0f, 50.38f),
                    PathNode.CurveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(174.39192f, 228.0f, 212.0f, 190.39192f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.38f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(86.04464f, 219.9559f, 52.044098f, 185.95538f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 108.1f, 73.15f, 76.2f, 90.9f, 55.76f),
                    PathNode.CurveTo(102.07788f, 42.966408f, 114.5063f, 31.321882f, 128.0f, 21.0f),
                    PathNode.CurveTo(141.49562f, 31.334482f, 153.9241f, 42.99247f, 165.1f, 55.8f),
                    PathNode.CurveTo(182.85f, 76.2f, 204.0f, 108.1f, 204.0f, 144.0f),
                    PathNode.CurveTo(203.9559f, 185.95538f, 169.95538f, 219.9559f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.94f, 152.67f),
                    PathNode.CurveTo(175.99913f, 174.73409f, 158.72499f, 192.00423f, 136.66f, 195.94f),
                    PathNode.CurveTo(136.44225f, 195.97981f, 136.22136f, 195.9999f, 136.0f, 196.0f),
                    PathNode.CurveTo(133.93074f, 195.9847f, 132.21475f, 194.39366f, 132.04333f, 192.33147f),
                    PathNode.CurveTo(131.87192f, 190.26926f, 133.30167f, 188.41675f, 135.34f, 188.06f),
                    PathNode.CurveTo(153.52f, 185.0f, 168.97f, 169.55f, 172.06f, 151.33f),
                    PathNode.CurveTo(172.50688f, 149.23244f, 174.5285f, 147.86057f, 176.64278f, 148.2201f),
                    PathNode.CurveTo(178.75706f, 148.57964f, 180.21158f, 150.54263f, 179.94f, 152.67f),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
