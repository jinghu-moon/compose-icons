package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorDuotoneIcon(
            name = "X",
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
                    PathNode.MoveTo(205.66f, 194.34f),
                    PathNode.CurveTo(208.78593f, 197.46593f, 208.78593f, 202.53407f, 205.66f, 205.66f),
                    PathNode.CurveTo(202.53407f, 208.78593f, 197.46593f, 208.78593f, 194.34f, 205.66f),
                    PathNode.LineTo(128.0f, 139.31f),
                    PathNode.LineTo(61.66f, 205.66f),
                    PathNode.CurveTo(58.53407f, 208.78593f, 53.46593f, 208.78593f, 50.34f, 205.66f),
                    PathNode.CurveTo(47.21407f, 202.53407f, 47.21407f, 197.46593f, 50.34f, 194.34f),
                    PathNode.LineTo(116.69f, 128.0f),
                    PathNode.LineTo(50.34f, 61.66f),
                    PathNode.CurveTo(47.21407f, 58.53407f, 47.21407f, 53.46593f, 50.34f, 50.34f),
                    PathNode.CurveTo(53.46593f, 47.21407f, 58.53407f, 47.21407f, 61.66f, 50.34f),
                    PathNode.LineTo(128.0f, 116.69f),
                    PathNode.LineTo(194.34f, 50.34f),
                    PathNode.CurveTo(197.46593f, 47.21407f, 202.53407f, 47.21407f, 205.66f, 50.34f),
                    PathNode.CurveTo(208.78593f, 53.46593f, 208.78593f, 58.53407f, 205.66f, 61.66f),
                    PathNode.LineTo(139.31f, 128.0f),
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
        return _x!!
    }

private var _x: ImageVector? = null
