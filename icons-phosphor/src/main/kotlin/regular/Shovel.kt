package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorRegularIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.66f, 58.34f),
                    PathNode.LineTo(197.66f, 10.34f),
                    PathNode.CurveTo(194.53407f, 7.214069f, 189.46593f, 7.214069f, 186.34f, 10.34f),
                    PathNode.CurveTo(183.21407f, 13.465932f, 183.21407f, 18.53407f, 186.34f, 21.66f),
                    PathNode.LineTo(204.69f, 40.0f),
                    PathNode.LineTo(133.69f, 111.0f),
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
                    PathNode.LineTo(216.0f, 51.34f),
                    PathNode.LineTo(234.34f, 69.69f),
                    PathNode.CurveTo(237.46593f, 72.81593f, 242.53407f, 72.81593f, 245.66f, 69.69f),
                    PathNode.CurveTo(248.78593f, 66.56407f, 248.78593f, 61.495934f, 245.66f, 58.37f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.LineTo(32.0f, 224.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(122.34f, 122.34f),
                    PathNode.LineTo(82.34f, 162.34f),
                    PathNode.CurveTo(79.214066f, 165.46593f, 79.214066f, 170.53407f, 82.34f, 173.66f),
                    PathNode.CurveTo(85.465935f, 176.78593f, 90.534065f, 176.78593f, 93.66f, 173.66f),
                    PathNode.LineTo(133.66f, 133.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
