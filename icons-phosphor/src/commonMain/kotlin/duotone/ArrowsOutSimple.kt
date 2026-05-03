package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorDuotoneIcon(
            name = "ArrowsOutSimple",
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
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 100.41828f, 212.41827f, 104.0f, 208.0f, 104.0f),
                    PathNode.CurveTo(203.58173f, 104.0f, 200.0f, 100.41828f, 200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 67.31f),
                    PathNode.LineTo(149.66f, 117.66f),
                    PathNode.CurveTo(146.53407f, 120.785934f, 141.46593f, 120.785934f, 138.34f, 117.66f),
                    PathNode.CurveTo(135.21407f, 114.534065f, 135.21407f, 109.465935f, 138.34f, 106.34f),
                    PathNode.LineTo(188.69f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(155.58173f, 56.0f, 152.0f, 52.418278f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 155.58173f, 40.0f, 160.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.34f, 138.34f),
                    PathNode.LineTo(56.0f, 188.69f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(56.0f, 155.58173f, 52.418278f, 152.0f, 48.0f, 152.0f),
                    PathNode.CurveTo(43.581722f, 152.0f, 40.0f, 155.58173f, 40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(100.41828f, 216.0f, 104.0f, 212.41827f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 203.58173f, 100.41828f, 200.0f, 96.0f, 200.0f),
                    PathNode.LineTo(67.31f, 200.0f),
                    PathNode.LineTo(117.66f, 149.66f),
                    PathNode.CurveTo(120.785934f, 146.53407f, 120.785934f, 141.46593f, 117.66f, 138.34f),
                    PathNode.CurveTo(114.534065f, 135.21407f, 109.465935f, 135.21407f, 106.34f, 138.34f),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
