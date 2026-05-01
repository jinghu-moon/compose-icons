package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorFillIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.52f, 24.81f),
                    PathNode.CurveTo(160.7727f, 23.468376f, 157.50098f, 23.809908f, 155.09f, 25.69f),
                    PathNode.LineTo(85.25f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(31.163445f, 80.0f, 24.0f, 87.163445f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 168.83656f, 31.163445f, 176.0f, 40.0f, 176.0f),
                    PathNode.LineTo(85.25f, 176.0f),
                    PathNode.LineTo(155.09f, 230.31f),
                    PathNode.CurveTo(156.491f, 231.40771f, 158.2202f, 232.0029f, 160.0f, 232.0f),
                    PathNode.CurveTo(164.41827f, 232.0f, 168.0f, 228.41827f, 168.0f, 224.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(168.0023f, 28.944445f, 166.26389f, 26.154444f, 163.52f, 24.81f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.31f, 128.0f),
                    PathNode.LineTo(253.66f, 109.66f),
                    PathNode.CurveTo(256.78592f, 106.534065f, 256.78592f, 101.465935f, 253.66f, 98.34f),
                    PathNode.CurveTo(250.53407f, 95.214066f, 245.46593f, 95.214066f, 242.34f, 98.34f),
                    PathNode.LineTo(224.0f, 116.69f),
                    PathNode.LineTo(205.66f, 98.34f),
                    PathNode.CurveTo(202.53407f, 95.214066f, 197.46593f, 95.214066f, 194.34f, 98.34f),
                    PathNode.CurveTo(191.21407f, 101.465935f, 191.21407f, 106.534065f, 194.34f, 109.66f),
                    PathNode.LineTo(212.69f, 128.0f),
                    PathNode.LineTo(194.34f, 146.34f),
                    PathNode.CurveTo(191.21407f, 149.46593f, 191.21407f, 154.53407f, 194.34f, 157.66f),
                    PathNode.CurveTo(197.46593f, 160.78593f, 202.53407f, 160.78593f, 205.66f, 157.66f),
                    PathNode.LineTo(224.0f, 139.31f),
                    PathNode.LineTo(242.34f, 157.66f),
                    PathNode.CurveTo(245.46593f, 160.78593f, 250.53407f, 160.78593f, 253.66f, 157.66f),
                    PathNode.CurveTo(256.78592f, 154.53407f, 256.78592f, 149.46593f, 253.66f, 146.34f),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
