package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorFillIcon(
            name = "FileArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(157.66f, 165.66f),
                    PathNode.LineTo(133.66f, 189.66f),
                    PathNode.CurveTo(132.15945f, 191.16223f, 130.12328f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(125.876724f, 192.00629f, 123.840546f, 191.16223f, 122.34f, 189.66f),
                    PathNode.LineTo(98.34f, 165.66f),
                    PathNode.CurveTo(95.214066f, 162.53407f, 95.214066f, 157.46593f, 98.34f, 154.34f),
                    PathNode.CurveTo(101.465935f, 151.21407f, 106.534065f, 151.21407f, 109.66f, 154.34f),
                    PathNode.LineTo(120.0f, 164.69f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 164.69f),
                    PathNode.LineTo(146.34f, 154.34f),
                    PathNode.CurveTo(149.46593f, 151.21407f, 154.53407f, 151.21407f, 157.66f, 154.34f),
                    PathNode.CurveTo(160.78593f, 157.46593f, 160.78593f, 162.53407f, 157.66f, 165.66f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.LineTo(196.0f, 88.0f),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
