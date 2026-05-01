package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorLightIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.33f, 91.0f),
                    PathNode.LineTo(131.33f, 27.0f),
                    PathNode.CurveTo(129.31378f, 25.654802f, 126.68622f, 25.654802f, 124.67f, 27.0f),
                    PathNode.LineTo(28.67f, 91.0f),
                    PathNode.CurveTo(26.999222f, 92.114716f, 25.997023f, 93.99149f, 26.0f, 96.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 96.0f),
                    PathNode.CurveTo(230.00298f, 93.99149f, 229.00078f, 92.114716f, 227.33f, 91.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.18f, 152.0f),
                    PathNode.LineTo(38.0f, 195.9f),
                    PathNode.LineTo(38.0f, 107.65f),
                    PathNode.Close,
                    PathNode.MoveTo(112.45f, 158.0f),
                    PathNode.LineTo(143.55f, 158.0f),
                    PathNode.LineTo(205.84f, 202.0f),
                    PathNode.LineTo(50.16f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.82f, 152.0f),
                    PathNode.LineTo(218.0f, 107.65f),
                    PathNode.LineTo(218.0f, 195.9f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 39.21f),
                    PathNode.LineTo(213.43f, 96.21f),
                    PathNode.LineTo(143.53f, 146.0f),
                    PathNode.LineTo(112.47f, 146.0f),
                    PathNode.LineTo(42.57f, 96.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
