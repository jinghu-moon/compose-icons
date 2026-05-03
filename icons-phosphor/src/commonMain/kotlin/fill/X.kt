package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorFillIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.66f, 170.34f),
                    PathNode.CurveTo(184.78593f, 173.46593f, 184.78593f, 178.53407f, 181.66f, 181.66f),
                    PathNode.CurveTo(178.53407f, 184.78593f, 173.46593f, 184.78593f, 170.34f, 181.66f),
                    PathNode.LineTo(128.0f, 139.31f),
                    PathNode.LineTo(85.66f, 181.66f),
                    PathNode.CurveTo(82.534065f, 184.78593f, 77.465935f, 184.78593f, 74.34f, 181.66f),
                    PathNode.CurveTo(71.214066f, 178.53407f, 71.214066f, 173.46593f, 74.34f, 170.34f),
                    PathNode.LineTo(116.69f, 128.0f),
                    PathNode.LineTo(74.34f, 85.66f),
                    PathNode.CurveTo(71.214066f, 82.534065f, 71.214066f, 77.465935f, 74.34f, 74.34f),
                    PathNode.CurveTo(77.465935f, 71.214066f, 82.534065f, 71.214066f, 85.66f, 74.34f),
                    PathNode.LineTo(128.0f, 116.69f),
                    PathNode.LineTo(170.34f, 74.34f),
                    PathNode.CurveTo(173.46593f, 71.214066f, 178.53407f, 71.214066f, 181.66f, 74.34f),
                    PathNode.CurveTo(184.78593f, 77.465935f, 184.78593f, 82.534065f, 181.66f, 85.66f),
                    PathNode.LineTo(139.31f, 128.0f),
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
        return _x!!
    }

private var _x: ImageVector? = null
