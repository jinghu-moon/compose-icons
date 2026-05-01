package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorDuotoneIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
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
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 100.41828f, 212.41827f, 104.0f, 208.0f, 104.0f),
                    PathNode.CurveTo(203.58173f, 104.0f, 200.0f, 100.41828f, 200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 67.31f),
                    PathNode.LineTo(157.66f, 109.66f),
                    PathNode.CurveTo(154.53407f, 112.785934f, 149.46593f, 112.785934f, 146.34f, 109.66f),
                    PathNode.CurveTo(143.21407f, 106.534065f, 143.21407f, 101.465935f, 146.34f, 98.34f),
                    PathNode.LineTo(188.69f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(155.58173f, 56.0f, 152.0f, 52.418278f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 155.58173f, 40.0f, 160.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.34f, 146.34f),
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
                    PathNode.LineTo(109.66f, 157.66f),
                    PathNode.CurveTo(112.785934f, 154.53407f, 112.785934f, 149.46593f, 109.66f, 146.34f),
                    PathNode.CurveTo(106.534065f, 143.21407f, 101.465935f, 143.21407f, 98.34f, 146.34f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.CurveTo(203.58173f, 152.0f, 200.0f, 155.58173f, 200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 188.69f),
                    PathNode.LineTo(157.66f, 146.34f),
                    PathNode.CurveTo(154.53407f, 143.21407f, 149.46593f, 143.21407f, 146.34f, 146.34f),
                    PathNode.CurveTo(143.21407f, 149.46593f, 143.21407f, 154.53407f, 146.34f, 157.66f),
                    PathNode.LineTo(188.69f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(155.58173f, 200.0f, 152.0f, 203.58173f, 152.0f, 208.0f),
                    PathNode.CurveTo(152.0f, 212.41827f, 155.58173f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 155.58173f, 212.41827f, 152.0f, 208.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(67.31f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(100.41828f, 56.0f, 104.0f, 52.418278f, 104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 43.581722f, 100.41828f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 100.41828f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.CurveTo(52.418278f, 104.0f, 56.0f, 100.41828f, 56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 67.31f),
                    PathNode.LineTo(98.34f, 109.66f),
                    PathNode.CurveTo(101.465935f, 112.785934f, 106.534065f, 112.785934f, 109.66f, 109.66f),
                    PathNode.CurveTo(112.785934f, 106.534065f, 112.785934f, 101.465935f, 109.66f, 98.34f),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
