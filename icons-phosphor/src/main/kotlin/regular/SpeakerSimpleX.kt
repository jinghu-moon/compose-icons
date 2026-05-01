package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorRegularIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.51f, 24.81f),
                    PathNode.CurveTo(160.76537f, 23.472578f, 157.4988f, 23.813976f, 155.09f, 25.69f),
                    PathNode.LineTo(85.25f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(31.163445f, 80.0f, 24.0f, 87.163445f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 168.83656f, 31.163445f, 176.0f, 40.0f, 176.0f),
                    PathNode.LineTo(85.25f, 176.0f),
                    PathNode.LineTo(155.09f, 230.31f),
                    PathNode.CurveTo(157.50114f, 232.18442f, 160.76915f, 232.5225f, 163.51299f, 231.18141f),
                    PathNode.CurveTo(166.25682f, 229.84032f, 167.99771f, 227.05403f, 168.0f, 224.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(168.00043f, 28.942192f, 166.25777f, 26.151613f, 163.51f, 24.81f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 207.64f),
                    PathNode.LineTo(92.91f, 161.69f),
                    PathNode.CurveTo(91.50901f, 160.59229f, 89.77982f, 159.9971f, 88.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(89.77982f, 96.0029f, 91.50901f, 95.40772f, 92.91f, 94.31f),
                    PathNode.LineTo(152.0f, 48.36f),
                    PathNode.Close,
                    PathNode.MoveTo(253.66f, 146.34f),
                    PathNode.CurveTo(256.78592f, 149.46593f, 256.78592f, 154.53407f, 253.66f, 157.66f),
                    PathNode.CurveTo(250.53407f, 160.78593f, 245.46593f, 160.78593f, 242.34f, 157.66f),
                    PathNode.LineTo(224.0f, 139.31f),
                    PathNode.LineTo(205.66f, 157.66f),
                    PathNode.CurveTo(202.53407f, 160.78593f, 197.46593f, 160.78593f, 194.34f, 157.66f),
                    PathNode.CurveTo(191.21407f, 154.53407f, 191.21407f, 149.46593f, 194.34f, 146.34f),
                    PathNode.LineTo(212.69f, 128.0f),
                    PathNode.LineTo(194.34f, 109.66f),
                    PathNode.CurveTo(191.21407f, 106.534065f, 191.21407f, 101.465935f, 194.34f, 98.34f),
                    PathNode.CurveTo(197.46593f, 95.214066f, 202.53407f, 95.214066f, 205.66f, 98.34f),
                    PathNode.LineTo(224.0f, 116.69f),
                    PathNode.LineTo(242.34f, 98.34f),
                    PathNode.CurveTo(245.46593f, 95.214066f, 250.53407f, 95.214066f, 253.66f, 98.34f),
                    PathNode.CurveTo(256.78592f, 101.465935f, 256.78592f, 106.534065f, 253.66f, 109.66f),
                    PathNode.LineTo(235.31f, 128.0f),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
