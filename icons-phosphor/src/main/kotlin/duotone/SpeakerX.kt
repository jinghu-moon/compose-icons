package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorDuotoneIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(27.581722f, 168.0f, 24.0f, 164.41827f, 24.0f, 160.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(24.0f, 91.58172f, 27.581722f, 88.0f, 32.0f, 88.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(155.51f, 24.81f),
                    PathNode.CurveTo(152.76537f, 23.472578f, 149.4988f, 23.813976f, 147.09f, 25.69f),
                    PathNode.LineTo(77.25f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(23.163445f, 80.0f, 16.0f, 87.163445f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 168.83656f, 23.163445f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(77.25f, 176.0f),
                    PathNode.LineTo(147.09f, 230.31f),
                    PathNode.CurveTo(149.50114f, 232.18442f, 152.76915f, 232.5225f, 155.51299f, 231.18141f),
                    PathNode.CurveTo(158.25682f, 229.84032f, 159.99771f, 227.05403f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(160.00043f, 28.942192f, 158.25777f, 26.151613f, 155.51f, 24.81f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 207.64f),
                    PathNode.LineTo(88.0f, 164.07f),
                    PathNode.LineTo(88.0f, 91.94f),
                    PathNode.LineTo(144.0f, 48.36f),
                    PathNode.Close,
                    PathNode.MoveTo(245.66f, 146.34f),
                    PathNode.CurveTo(248.78593f, 149.46593f, 248.78593f, 154.53407f, 245.66f, 157.66f),
                    PathNode.CurveTo(242.53407f, 160.78593f, 237.46593f, 160.78593f, 234.34f, 157.66f),
                    PathNode.LineTo(216.0f, 139.31f),
                    PathNode.LineTo(197.66f, 157.66f),
                    PathNode.CurveTo(194.53407f, 160.78593f, 189.46593f, 160.78593f, 186.34f, 157.66f),
                    PathNode.CurveTo(183.21407f, 154.53407f, 183.21407f, 149.46593f, 186.34f, 146.34f),
                    PathNode.LineTo(204.69f, 128.0f),
                    PathNode.LineTo(186.34f, 109.66f),
                    PathNode.CurveTo(183.21407f, 106.534065f, 183.21407f, 101.465935f, 186.34f, 98.34f),
                    PathNode.CurveTo(189.46593f, 95.214066f, 194.53407f, 95.214066f, 197.66f, 98.34f),
                    PathNode.LineTo(216.0f, 116.69f),
                    PathNode.LineTo(234.34f, 98.34f),
                    PathNode.CurveTo(237.46593f, 95.214066f, 242.53407f, 95.214066f, 245.66f, 98.34f),
                    PathNode.CurveTo(248.78593f, 101.465935f, 248.78593f, 106.534065f, 245.66f, 109.66f),
                    PathNode.LineTo(227.31f, 128.0f),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
