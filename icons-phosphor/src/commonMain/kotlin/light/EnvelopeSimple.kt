package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) return _envelopeSimple!!
        _envelopeSimple = phosphorLightIcon(
            name = "EnvelopeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(28.68629f, 50.0f, 26.0f, 52.68629f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 199.73198f, 32.268013f, 206.0f, 40.0f, 206.0f),
                    PathNode.LineTo(216.0f, 206.0f),
                    PathNode.CurveTo(223.73198f, 206.0f, 230.0f, 199.73198f, 230.0f, 192.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 52.68629f, 227.3137f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.58f, 62.0f),
                    PathNode.LineTo(128.0f, 135.86f),
                    PathNode.LineTo(47.42f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 194.0f),
                    PathNode.LineTo(40.0f, 194.0f),
                    PathNode.CurveTo(38.89543f, 194.0f, 38.0f, 193.10457f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 69.64f),
                    PathNode.LineTo(124.0f, 148.42f),
                    PathNode.CurveTo(126.292656f, 150.51746f, 129.80734f, 150.51746f, 132.1f, 148.42f),
                    PathNode.LineTo(218.0f, 69.64f),
                    PathNode.LineTo(218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 193.10457f, 217.10457f, 194.0f, 216.0f, 194.0f),
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
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null
