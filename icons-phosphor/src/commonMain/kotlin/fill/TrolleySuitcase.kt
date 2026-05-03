package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorFillIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 232.83656f, 80.836555f, 240.0f, 72.0f, 240.0f),
                    PathNode.CurveTo(63.163445f, 240.0f, 56.0f, 232.83656f, 56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 215.16344f, 63.163445f, 208.0f, 72.0f, 208.0f),
                    PathNode.CurveTo(80.836555f, 208.0f, 88.0f, 215.16344f, 88.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 208.0f),
                    PathNode.CurveTo(207.16344f, 208.0f, 200.0f, 215.16344f, 200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 232.83656f, 207.16344f, 240.0f, 216.0f, 240.0f),
                    PathNode.CurveTo(224.83656f, 240.0f, 232.0f, 232.83656f, 232.0f, 224.0f),
                    PathNode.CurveTo(232.0f, 215.16344f, 224.83656f, 208.0f, 216.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 75.31f),
                    PathNode.CurveTo(56.013565f, 71.06421f, 54.32419f, 66.99025f, 51.31f, 64.0f),
                    PathNode.LineTo(29.66f, 42.34f),
                    PathNode.CurveTo(26.53407f, 39.21407f, 21.46593f, 39.21407f, 18.34f, 42.34f),
                    PathNode.CurveTo(15.214068f, 45.46593f, 15.214068f, 50.53407f, 18.34f, 53.66f),
                    PathNode.LineTo(40.0f, 75.31f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 179.58173f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 188.41827f, 27.581722f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(244.41827f, 192.0f, 248.0f, 188.41827f, 248.0f, 184.0f),
                    PathNode.CurveTo(248.0f, 179.58173f, 244.41827f, 176.0f, 240.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.CurveTo(72.0f, 63.163445f, 79.163445f, 56.0f, 88.0f, 56.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 31.163445f, 127.163445f, 24.0f, 136.0f, 24.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(176.83656f, 24.0f, 184.0f, 31.163445f, 184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(224.83656f, 56.0f, 232.0f, 63.163445f, 232.0f, 72.0f),
                    PathNode.LineTo(232.0f, 144.0f),
                    PathNode.CurveTo(232.0f, 152.83656f, 224.83656f, 160.0f, 216.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(79.163445f, 160.0f, 72.0f, 152.83656f, 72.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
