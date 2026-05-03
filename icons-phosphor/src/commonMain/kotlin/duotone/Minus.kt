package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Minus: ImageVector
    get() {
        if (_minus != null) return _minus!!
        _minus = phosphorDuotoneIcon(
            name = "Minus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(47.163445f, 216.0f, 40.0f, 208.83656f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(208.83656f, 40.0f, 216.0f, 47.163445f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 132.41827f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 123.58172f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
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
        return _minus!!
    }

private var _minus: ImageVector? = null
