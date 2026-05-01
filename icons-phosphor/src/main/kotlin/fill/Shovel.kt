package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorFillIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.66f, 69.66f),
                    PathNode.CurveTo(244.15945f, 71.16222f, 242.12328f, 72.006294f, 240.0f, 72.006294f),
                    PathNode.CurveTo(237.87672f, 72.006294f, 235.84055f, 71.16222f, 234.34f, 69.66f),
                    PathNode.LineTo(216.0f, 51.31f),
                    PathNode.LineTo(145.0f, 122.31f),
                    PathNode.LineTo(133.66f, 111.0f),
                    PathNode.LineTo(204.66f, 40.0f),
                    PathNode.LineTo(186.34f, 21.66f),
                    PathNode.CurveTo(183.21407f, 18.53407f, 183.21407f, 13.465932f, 186.34f, 10.34f),
                    PathNode.CurveTo(189.46593f, 7.214069f, 194.53407f, 7.214069f, 197.66f, 10.34f),
                    PathNode.LineTo(245.66f, 58.34f),
                    PathNode.CurveTo(247.16223f, 59.840546f, 248.00629f, 61.876724f, 248.00629f, 64.0f),
                    PathNode.CurveTo(248.00629f, 66.123276f, 247.16223f, 68.159454f, 245.66f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 176.0f),
                    PathNode.CurveTo(84.762344f, 176.00255f, 81.84236f, 174.05338f, 80.60302f, 171.06232f),
                    PathNode.CurveTo(79.36368f, 168.07126f, 80.04936f, 164.6281f, 82.34f, 162.34f),
                    PathNode.LineTo(133.66f, 111.0f),
                    PathNode.LineTo(99.31f, 76.68f),
                    PathNode.CurveTo(93.06246f, 70.436554f, 82.93754f, 70.436554f, 76.69f, 76.68f),
                    PathNode.LineTo(20.69f, 132.68f),
                    PathNode.CurveTo(17.676182f, 135.67459f, 15.987116f, 139.7514f, 16.0f, 144.0f),
                    PathNode.LineTo(16.0f, 224.0f),
                    PathNode.CurveTo(16.0f, 232.83656f, 23.163445f, 240.0f, 32.0f, 240.0f),
                    PathNode.LineTo(112.0f, 240.0f),
                    PathNode.CurveTo(116.2458f, 240.01357f, 120.31974f, 238.32419f, 123.31f, 235.31f),
                    PathNode.LineTo(179.31f, 179.31f),
                    PathNode.CurveTo(185.55345f, 173.06245f, 185.55345f, 162.93755f, 179.31f, 156.69f),
                    PathNode.LineTo(145.0f, 122.34f),
                    PathNode.LineTo(93.66f, 173.66f),
                    PathNode.CurveTo(92.158424f, 175.15993f, 90.12237f, 176.00166f, 88.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
