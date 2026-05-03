package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorFillIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 228.41827f, 59.581722f, 232.0f, 64.0f, 232.0f),
                    PathNode.CurveTo(68.41828f, 232.0f, 72.0f, 228.41827f, 72.0f, 224.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 228.41827f, 187.58173f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(196.41827f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(179.09f, 136.0f),
                    PathNode.CurveTo(175.01785f, 153.86649f, 158.17467f, 165.82318f, 139.9649f, 163.77426f),
                    PathNode.CurveTo(121.75514f, 161.72534f, 107.99014f, 146.32466f, 107.99014f, 128.0f),
                    PathNode.CurveTo(107.99014f, 109.67533f, 121.75514f, 94.274666f, 139.9649f, 92.225746f),
                    PathNode.CurveTo(158.17467f, 90.17682f, 175.01785f, 102.13352f, 179.09f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 212.41827f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 139.0457f, 155.0457f, 148.0f, 144.0f, 148.0f),
                    PathNode.CurveTo(132.9543f, 148.0f, 124.0f, 139.0457f, 124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 116.95431f, 132.9543f, 108.0f, 144.0f, 108.0f),
                    PathNode.CurveTo(155.0457f, 108.0f, 164.0f, 116.95431f, 164.0f, 128.0f),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
