package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorFillIcon(
            name = "WashingMachine",
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
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(97.07206f, 184.0f, 72.0f, 158.92795f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 97.07206f, 97.07206f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(158.92795f, 72.0f, 184.0f, 97.07206f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 158.92795f, 158.92795f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 80.0f),
                    PathNode.CurveTo(181.37259f, 80.0f, 176.0f, 74.62742f, 176.0f, 68.0f),
                    PathNode.CurveTo(176.0f, 61.37258f, 181.37259f, 56.0f, 188.0f, 56.0f),
                    PathNode.CurveTo(194.62741f, 56.0f, 200.0f, 61.37258f, 200.0f, 68.0f),
                    PathNode.CurveTo(200.0f, 74.62742f, 194.62741f, 80.0f, 188.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(133.66f, 109.66f),
                    PathNode.LineTo(101.66f, 141.66f),
                    PathNode.CurveTo(98.534065f, 144.78593f, 93.465935f, 144.78593f, 90.34f, 141.66f),
                    PathNode.CurveTo(87.214066f, 138.53407f, 87.214066f, 133.46593f, 90.34f, 130.34f),
                    PathNode.LineTo(122.34f, 98.34f),
                    PathNode.CurveTo(125.465935f, 95.214066f, 130.53407f, 95.214066f, 133.66f, 98.34f),
                    PathNode.CurveTo(136.78593f, 101.465935f, 136.78593f, 106.534065f, 133.66f, 109.66f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 106.34f),
                    PathNode.CurveTo(167.16223f, 107.840546f, 168.00629f, 109.876724f, 168.00629f, 112.0f),
                    PathNode.CurveTo(168.00629f, 114.123276f, 167.16223f, 116.159454f, 165.66f, 117.66f),
                    PathNode.LineTo(117.66f, 165.66f),
                    PathNode.CurveTo(114.534065f, 168.78593f, 109.465935f, 168.78593f, 106.34f, 165.66f),
                    PathNode.CurveTo(103.214066f, 162.53407f, 103.214066f, 157.46593f, 106.34f, 154.34f),
                    PathNode.LineTo(154.34f, 106.34f),
                    PathNode.CurveTo(155.84055f, 104.83778f, 157.87672f, 103.993706f, 160.0f, 103.993706f),
                    PathNode.CurveTo(162.12328f, 103.993706f, 164.15945f, 104.83778f, 165.66f, 106.34f),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
