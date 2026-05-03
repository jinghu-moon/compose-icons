package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorFillIcon(
            name = "FileMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 148.0f),
                    PathNode.CurveTo(144.0f, 159.0457f, 135.0457f, 168.0f, 124.0f, 168.0f),
                    PathNode.CurveTo(112.95431f, 168.0f, 104.0f, 159.0457f, 104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 136.9543f, 112.95431f, 128.0f, 124.0f, 128.0f),
                    PathNode.CurveTo(135.0457f, 128.0f, 144.0f, 136.9543f, 144.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 178.34f),
                    PathNode.LineTo(154.46f, 167.15f),
                    PathNode.CurveTo(164.2351f, 151.61705f, 160.78041f, 131.21957f, 146.4356f, 119.77178f),
                    PathNode.CurveTo(132.09079f, 108.32399f, 111.435165f, 109.48038f, 98.45777f, 122.45777f),
                    PathNode.CurveTo(85.48038f, 135.43517f, 84.32399f, 156.09079f, 95.77178f, 170.4356f),
                    PathNode.CurveTo(107.219574f, 184.78041f, 127.61704f, 188.2351f, 143.15f, 178.46f),
                    PathNode.LineTo(154.34f, 189.66f),
                    PathNode.CurveTo(157.46593f, 192.78593f, 162.53407f, 192.78593f, 165.66f, 189.66f),
                    PathNode.CurveTo(168.78593f, 186.53407f, 168.78593f, 181.46593f, 165.66f, 178.34f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 88.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.LineTo(152.0f, 88.0f),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
