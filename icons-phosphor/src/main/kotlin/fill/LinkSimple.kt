package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorFillIcon(
            name = "LinkSimple",
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
                    PathNode.MoveTo(144.56f, 173.66f),
                    PathNode.LineTo(123.11f, 195.11f),
                    PathNode.CurveTo(105.86401f, 211.9076f, 78.32032f, 211.72621f, 61.29706f, 194.70294f),
                    PathNode.CurveTo(44.273796f, 177.67969f, 44.09241f, 150.13599f, 60.89f, 132.89f),
                    PathNode.LineTo(82.34f, 111.43f),
                    PathNode.CurveTo(85.46317f, 108.30407f, 90.52906f, 108.30183f, 93.655f, 111.425f),
                    PathNode.CurveTo(96.78093f, 114.548164f, 96.78317f, 119.61407f, 93.66f, 122.74f),
                    PathNode.LineTo(72.2f, 144.2f),
                    PathNode.CurveTo(61.264763f, 155.13524f, 61.264763f, 172.86476f, 72.2f, 183.8f),
                    PathNode.CurveTo(83.13524f, 194.73524f, 100.86476f, 194.73524f, 111.8f, 183.8f),
                    PathNode.LineTo(133.25f, 162.34f),
                    PathNode.CurveTo(136.37593f, 159.21683f, 141.44183f, 159.21907f, 144.565f, 162.345f),
                    PathNode.CurveTo(147.68817f, 165.47093f, 147.68594f, 170.53683f, 144.56f, 173.66f),
                    PathNode.Close,
                    PathNode.MoveTo(109.66f, 157.66f),
                    PathNode.CurveTo(106.534065f, 160.78593f, 101.465935f, 160.78593f, 98.34f, 157.66f),
                    PathNode.CurveTo(95.214066f, 154.53407f, 95.214066f, 149.46593f, 98.34f, 146.34f),
                    PathNode.LineTo(146.34f, 98.34f),
                    PathNode.CurveTo(149.46593f, 95.214066f, 154.53407f, 95.214066f, 157.66f, 98.34f),
                    PathNode.CurveTo(160.78593f, 101.465935f, 160.78593f, 106.534065f, 157.66f, 109.66f),
                    PathNode.Close,
                    PathNode.MoveTo(195.11f, 123.11f),
                    PathNode.LineTo(173.66f, 144.56f),
                    PathNode.CurveTo(170.53683f, 147.68594f, 165.47093f, 147.68817f, 162.345f, 144.565f),
                    PathNode.CurveTo(159.21907f, 141.44183f, 159.21683f, 136.37593f, 162.34f, 133.25f),
                    PathNode.LineTo(183.8f, 111.8f),
                    PathNode.CurveTo(194.73524f, 100.86476f, 194.73524f, 83.13524f, 183.8f, 72.2f),
                    PathNode.CurveTo(172.86476f, 61.264763f, 155.13524f, 61.264763f, 144.2f, 72.2f),
                    PathNode.LineTo(122.74f, 93.66f),
                    PathNode.CurveTo(119.61407f, 96.78317f, 114.548164f, 96.78093f, 111.425f, 93.655f),
                    PathNode.CurveTo(108.30183f, 90.52906f, 108.30407f, 85.46317f, 111.43f, 82.34f),
                    PathNode.LineTo(132.89f, 60.89f),
                    PathNode.CurveTo(150.13599f, 44.09241f, 177.67969f, 44.273796f, 194.70294f, 61.29706f),
                    PathNode.CurveTo(211.72621f, 78.32032f, 211.9076f, 105.86401f, 195.11f, 123.11f),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
