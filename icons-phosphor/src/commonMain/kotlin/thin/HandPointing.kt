package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorThinIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 92.0f),
                    PathNode.CurveTo(190.05989f, 91.99283f, 184.33035f, 94.19979f, 179.93f, 98.19f),
                    PathNode.CurveTo(179.23404f, 89.08303f, 173.42924f, 81.16046f, 164.95544f, 77.752266f),
                    PathNode.CurveTo(156.48163f, 74.34407f, 146.80782f, 76.04107f, 140.0f, 82.13f),
                    PathNode.LineTo(140.0f, 44.0f),
                    PathNode.CurveTo(140.0f, 30.745167f, 129.25484f, 20.0f, 116.0f, 20.0f),
                    PathNode.CurveTo(102.74516f, 20.0f, 92.0f, 30.745167f, 92.0f, 44.0f),
                    PathNode.LineTo(92.0f, 138.0f),
                    PathNode.LineTo(80.75f, 119.94f),
                    PathNode.CurveTo(74.10602f, 108.466286f, 59.418716f, 104.55102f, 47.945f, 111.195f),
                    PathNode.CurveTo(36.471283f, 117.83899f, 32.556015f, 132.52629f, 39.2f, 144.0f),
                    PathNode.LineTo(43.88f, 152.25f),
                    PathNode.CurveTo(61.21f, 182.8f, 72.66f, 203.0f, 85.66f, 216.33f),
                    PathNode.CurveTo(99.28f, 230.3f, 113.86f, 236.0f, 136.0f, 236.0f),
                    PathNode.CurveTo(182.37135f, 235.9504f, 219.9504f, 198.37135f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 116.0f),
                    PathNode.CurveTo(220.0f, 102.74516f, 209.25484f, 92.0f, 196.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 152.0f),
                    PathNode.CurveTo(211.95041f, 193.95308f, 177.95308f, 227.95041f, 136.0f, 228.0f),
                    PathNode.CurveTo(96.0f, 228.0f, 84.65f, 207.92f, 50.84f, 148.29f),
                    PathNode.LineTo(46.15f, 140.0f),
                    PathNode.LineTo(46.15f, 140.0f),
                    PathNode.CurveTo(41.863823f, 132.36073f, 44.517303f, 122.69502f, 52.103107f, 118.31491f),
                    PathNode.CurveTo(59.68891f, 113.9348f, 69.38662f, 116.46882f, 73.86f, 124.0f),
                    PathNode.CurveTo(73.88699f, 124.03775f, 73.91043f, 124.07792f, 73.93f, 124.12f),
                    PathNode.LineTo(92.61f, 154.12f),
                    PathNode.CurveTo(93.55649f, 155.63123f, 95.38899f, 156.33345f, 97.103004f, 155.84172f),
                    PathNode.CurveTo(98.817024f, 155.35002f, 99.99858f, 153.78316f, 100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 44.0f),
                    PathNode.CurveTo(100.0f, 35.163445f, 107.163445f, 28.0f, 116.0f, 28.0f),
                    PathNode.CurveTo(124.836555f, 28.0f, 132.0f, 35.163445f, 132.0f, 44.0f),
                    PathNode.LineTo(132.0f, 112.0f),
                    PathNode.CurveTo(132.0f, 114.20914f, 133.79086f, 116.0f, 136.0f, 116.0f),
                    PathNode.CurveTo(138.20914f, 116.0f, 140.0f, 114.20914f, 140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 100.0f),
                    PathNode.CurveTo(140.0f, 91.163445f, 147.16344f, 84.0f, 156.0f, 84.0f),
                    PathNode.CurveTo(164.83656f, 84.0f, 172.0f, 91.163445f, 172.0f, 100.0f),
                    PathNode.LineTo(172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 122.20914f, 173.79086f, 124.0f, 176.0f, 124.0f),
                    PathNode.CurveTo(178.20914f, 124.0f, 180.0f, 122.20914f, 180.0f, 120.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.CurveTo(180.0f, 107.163445f, 187.16344f, 100.0f, 196.0f, 100.0f),
                    PathNode.CurveTo(204.83656f, 100.0f, 212.0f, 107.163445f, 212.0f, 116.0f),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
