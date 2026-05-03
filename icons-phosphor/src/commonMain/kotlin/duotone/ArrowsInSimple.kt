package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorDuotoneIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
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
                    PathNode.MoveTo(213.66f, 53.66f),
                    PathNode.LineTo(163.31f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(196.41827f, 104.0f, 200.0f, 107.58172f, 200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 116.41828f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(139.58173f, 120.0f, 136.0f, 116.41828f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 59.581722f, 139.58173f, 56.0f, 144.0f, 56.0f),
                    PathNode.CurveTo(148.41827f, 56.0f, 152.0f, 59.581722f, 152.0f, 64.0f),
                    PathNode.LineTo(152.0f, 92.69f),
                    PathNode.LineTo(202.34f, 42.34f),
                    PathNode.CurveTo(205.46593f, 39.21407f, 210.53407f, 39.21407f, 213.66f, 42.34f),
                    PathNode.CurveTo(216.78593f, 45.46593f, 216.78593f, 50.53407f, 213.66f, 53.66f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 139.58173f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 148.41827f, 59.581722f, 152.0f, 64.0f, 152.0f),
                    PathNode.LineTo(92.69f, 152.0f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(104.0f, 163.31f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.CurveTo(104.0f, 196.41827f, 107.58172f, 200.0f, 112.0f, 200.0f),
                    PathNode.CurveTo(116.41828f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 139.58173f, 116.41828f, 136.0f, 112.0f, 136.0f),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
