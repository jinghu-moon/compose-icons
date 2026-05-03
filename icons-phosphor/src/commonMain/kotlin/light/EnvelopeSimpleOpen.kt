package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) return _envelopeSimpleOpen!!
        _envelopeSimpleOpen = phosphorLightIcon(
            name = "EnvelopeSimpleOpen",
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
                    PathNode.MoveTo(128.0f, 39.21f),
                    PathNode.LineTo(213.43f, 96.21f),
                    PathNode.LineTo(143.53f, 146.0f),
                    PathNode.LineTo(112.47f, 146.0f),
                    PathNode.LineTo(42.57f, 96.17f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 107.65f),
                    PathNode.LineTo(107.06f, 156.89f),
                    PathNode.CurveTo(108.08102f, 157.61108f, 109.30003f, 157.9988f, 110.55f, 158.0f),
                    PathNode.LineTo(145.45f, 158.0f),
                    PathNode.CurveTo(146.69997f, 157.9988f, 147.91899f, 157.61108f, 148.94f, 156.89f),
                    PathNode.LineTo(218.0f, 107.65f),
                    PathNode.LineTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _envelopeSimpleOpen!!
    }

private var _envelopeSimpleOpen: ImageVector? = null
