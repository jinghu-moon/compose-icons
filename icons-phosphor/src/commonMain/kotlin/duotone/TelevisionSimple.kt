package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorDuotoneIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 204.41827f, 220.41827f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 204.41827f, 32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 75.58172f, 35.581722f, 72.0f, 40.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 75.58172f, 224.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(147.31f, 64.0f),
                    PathNode.LineTo(181.66f, 29.66f),
                    PathNode.CurveTo(184.78593f, 26.53407f, 184.78593f, 21.46593f, 181.66f, 18.34f),
                    PathNode.CurveTo(178.53407f, 15.214068f, 173.46593f, 15.214068f, 170.34f, 18.34f),
                    PathNode.LineTo(128.0f, 60.69f),
                    PathNode.LineTo(85.66f, 18.34f),
                    PathNode.CurveTo(82.534065f, 15.214068f, 77.465935f, 15.214068f, 74.34f, 18.34f),
                    PathNode.CurveTo(71.214066f, 21.46593f, 71.214066f, 26.53407f, 74.34f, 29.66f),
                    PathNode.LineTo(108.69f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(31.163445f, 64.0f, 24.0f, 71.163445f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 71.163445f, 224.83656f, 64.0f, 216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
