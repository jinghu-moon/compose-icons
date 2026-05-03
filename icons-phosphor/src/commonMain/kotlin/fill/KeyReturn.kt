package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorFillIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 140.41827f, 180.41827f, 144.0f, 176.0f, 144.0f),
                    PathNode.LineTo(99.31f, 144.0f),
                    PathNode.LineTo(109.66f, 154.34f),
                    PathNode.CurveTo(112.785934f, 157.46593f, 112.785934f, 162.53407f, 109.66f, 165.66f),
                    PathNode.CurveTo(106.534065f, 168.78593f, 101.465935f, 168.78593f, 98.34f, 165.66f),
                    PathNode.LineTo(74.34f, 141.66f),
                    PathNode.CurveTo(72.83778f, 140.15945f, 71.993706f, 138.12328f, 71.993706f, 136.0f),
                    PathNode.CurveTo(71.993706f, 133.87672f, 72.83778f, 131.84055f, 74.34f, 130.34f),
                    PathNode.LineTo(98.34f, 106.34f),
                    PathNode.CurveTo(101.465935f, 103.214066f, 106.534065f, 103.214066f, 109.66f, 106.34f),
                    PathNode.CurveTo(112.785934f, 109.465935f, 112.785934f, 114.534065f, 109.66f, 117.66f),
                    PathNode.LineTo(99.31f, 128.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 99.58172f, 171.58173f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(180.41827f, 96.0f, 184.0f, 99.58172f, 184.0f, 104.0f),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
