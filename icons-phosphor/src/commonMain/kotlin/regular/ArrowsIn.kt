package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorRegularIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 104.0f),
                    PathNode.LineTo(144.0f, 64.0f),
                    PathNode.CurveTo(144.0f, 59.581722f, 147.58173f, 56.0f, 152.0f, 56.0f),
                    PathNode.CurveTo(156.41827f, 56.0f, 160.0f, 59.581722f, 160.0f, 64.0f),
                    PathNode.LineTo(160.0f, 84.69f),
                    PathNode.LineTo(202.34f, 42.34f),
                    PathNode.CurveTo(205.46593f, 39.21407f, 210.53407f, 39.21407f, 213.66f, 42.34f),
                    PathNode.CurveTo(216.78593f, 45.46593f, 216.78593f, 50.53407f, 213.66f, 53.66f),
                    PathNode.LineTo(171.31f, 96.0f),
                    PathNode.LineTo(192.0f, 96.0f),
                    PathNode.CurveTo(196.41827f, 96.0f, 200.0f, 99.58172f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 108.41828f, 196.41827f, 112.0f, 192.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.CurveTo(147.58173f, 112.0f, 144.0f, 108.41828f, 144.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 147.58173f, 56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 156.41827f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.LineTo(84.69f, 160.0f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(96.0f, 171.31f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 99.58172f, 200.0f, 104.0f, 200.0f),
                    PathNode.CurveTo(108.41828f, 200.0f, 112.0f, 196.41827f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(112.0f, 147.58173f, 108.41828f, 144.0f, 104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.31f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 156.41827f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 147.58173f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.CurveTo(147.58173f, 144.0f, 144.0f, 147.58173f, 144.0f, 152.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 196.41827f, 147.58173f, 200.0f, 152.0f, 200.0f),
                    PathNode.CurveTo(156.41827f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 171.31f),
                    PathNode.LineTo(202.34f, 213.66f),
                    PathNode.CurveTo(205.46593f, 216.78593f, 210.53407f, 216.78593f, 213.66f, 213.66f),
                    PathNode.CurveTo(216.78593f, 210.53407f, 216.78593f, 205.46593f, 213.66f, 202.34f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 56.0f),
                    PathNode.CurveTo(99.58172f, 56.0f, 96.0f, 59.581722f, 96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 84.69f),
                    PathNode.LineTo(53.66f, 42.34f),
                    PathNode.CurveTo(50.53407f, 39.21407f, 45.46593f, 39.21407f, 42.34f, 42.34f),
                    PathNode.CurveTo(39.21407f, 45.46593f, 39.21407f, 50.53407f, 42.34f, 53.66f),
                    PathNode.LineTo(84.69f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 99.58172f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 108.41828f, 59.581722f, 112.0f, 64.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.CurveTo(108.41828f, 112.0f, 112.0f, 108.41828f, 112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 59.581722f, 108.41828f, 56.0f, 104.0f, 56.0f),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
