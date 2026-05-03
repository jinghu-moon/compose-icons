package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorFillIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.00188f, 214.36336f, 203.46555f, 227.35336f, 190.28064f, 233.05107f),
                    PathNode.CurveTo(177.09573f, 238.7488f, 161.78561f, 236.06377f, 151.3264f, 226.21944f),
                    PathNode.CurveTo(140.86719f, 216.37512f, 137.2606f, 201.25554f, 142.15f, 187.75f),
                    PathNode.LineTo(89.15f, 153.7f),
                    PathNode.CurveTo(75.02073f, 167.55951f, 52.35319f, 167.41388f, 38.403183f, 153.37393f),
                    PathNode.CurveTo(24.453175f, 139.334f, 24.453175f, 116.666f, 38.403183f, 102.626076f),
                    PathNode.CurveTo(52.35319f, 88.586136f, 75.02073f, 88.44049f, 89.15f, 102.3f),
                    PathNode.LineTo(142.15f, 68.3f),
                    PathNode.CurveTo(135.86646f, 51.033634f, 143.55846f, 31.802633f, 160.01617f, 23.63231f),
                    PathNode.CurveTo(176.47388f, 15.461988f, 196.44287f, 20.960863f, 206.398f, 36.404503f),
                    PathNode.CurveTo(216.35312f, 51.84814f, 213.11601f, 72.30589f, 198.8792f, 83.921555f),
                    PathNode.CurveTo(184.6424f, 95.53722f, 163.95123f, 94.60229f, 150.82f, 81.75f),
                    PathNode.LineTo(97.82f, 115.8f),
                    PathNode.CurveTo(100.6844f, 123.71549f, 100.6844f, 132.3845f, 97.82f, 140.3f),
                    PathNode.LineTo(150.82f, 174.35f),
                    PathNode.CurveTo(161.1656f, 164.22498f, 176.56947f, 161.28143f, 189.91942f, 166.87846f),
                    PathNode.CurveTo(203.26936f, 172.4755f, 211.96837f, 185.52426f, 212.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
