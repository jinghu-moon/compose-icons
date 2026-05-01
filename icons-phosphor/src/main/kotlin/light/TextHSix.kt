package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorLightIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 146.0f),
                    PathNode.CurveTo(210.12366f, 146.0041f, 208.25078f, 146.16132f, 206.4f, 146.47f),
                    PathNode.LineTo(225.15f, 115.08f),
                    PathNode.CurveTo(226.85104f, 112.23573f, 225.92427f, 108.55104f, 223.08f, 106.85f),
                    PathNode.CurveTo(220.23573f, 105.14896f, 216.55104f, 106.07574f, 214.85f, 108.92f),
                    PathNode.LineTo(182.6f, 162.92f),
                    PathNode.LineTo(182.38f, 163.33f),
                    PathNode.CurveTo(174.85178f, 176.71233f, 177.227f, 193.47961f, 188.1759f, 204.24449f),
                    PathNode.CurveTo(199.12479f, 215.00937f, 215.92992f, 217.10011f, 229.18274f, 209.34618f),
                    PathNode.CurveTo(242.43556f, 201.59224f, 248.84685f, 185.9181f, 244.82718f, 171.09909f),
                    PathNode.CurveTo(240.8075f, 156.28009f, 227.3545f, 145.99416f, 212.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 202.0f),
                    PathNode.CurveTo(199.84973f, 202.0f, 190.0f, 192.15027f, 190.0f, 180.0f),
                    PathNode.CurveTo(190.0f, 167.84973f, 199.84973f, 158.0f, 212.0f, 158.0f),
                    PathNode.CurveTo(224.15027f, 158.0f, 234.0f, 167.84973f, 234.0f, 180.0f),
                    PathNode.CurveTo(234.0f, 192.15027f, 224.15027f, 202.0f, 212.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 56.0f),
                    PathNode.LineTo(150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 179.3137f, 147.3137f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(140.6863f, 182.0f, 138.0f, 179.3137f, 138.0f, 176.0f),
                    PathNode.LineTo(138.0f, 122.0f),
                    PathNode.LineTo(46.0f, 122.0f),
                    PathNode.LineTo(46.0f, 176.0f),
                    PathNode.CurveTo(46.0f, 179.3137f, 43.31371f, 182.0f, 40.0f, 182.0f),
                    PathNode.CurveTo(36.68629f, 182.0f, 34.0f, 179.3137f, 34.0f, 176.0f),
                    PathNode.LineTo(34.0f, 56.0f),
                    PathNode.CurveTo(34.0f, 52.68629f, 36.68629f, 50.0f, 40.0f, 50.0f),
                    PathNode.CurveTo(43.31371f, 50.0f, 46.0f, 52.68629f, 46.0f, 56.0f),
                    PathNode.LineTo(46.0f, 110.0f),
                    PathNode.LineTo(138.0f, 110.0f),
                    PathNode.LineTo(138.0f, 56.0f),
                    PathNode.CurveTo(138.0f, 52.68629f, 140.6863f, 50.0f, 144.0f, 50.0f),
                    PathNode.CurveTo(147.3137f, 50.0f, 150.0f, 52.68629f, 150.0f, 56.0f),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
