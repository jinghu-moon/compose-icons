package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorLightIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 112.0f),
                    PathNode.LineTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.CurveTo(220.6863f, 214.0f, 218.0f, 211.3137f, 218.0f, 208.0f),
                    PathNode.LineTo(218.0f, 123.21f),
                    PathNode.LineTo(203.33f, 133.0f),
                    PathNode.CurveTo(200.56857f, 134.83911f, 196.83911f, 134.09143f, 195.0f, 131.33f),
                    PathNode.CurveTo(193.16089f, 128.56857f, 193.90857f, 124.83911f, 196.67f, 123.0f),
                    PathNode.LineTo(220.67f, 107.0f),
                    PathNode.CurveTo(222.51236f, 105.770805f, 224.88202f, 105.656494f, 226.83412f, 106.70264f),
                    PathNode.CurveTo(228.78622f, 107.74879f, 230.00328f, 109.78524f, 230.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 50.0f),
                    PathNode.CurveTo(140.6863f, 50.0f, 138.0f, 52.68629f, 138.0f, 56.0f),
                    PathNode.LineTo(138.0f, 110.0f),
                    PathNode.LineTo(46.0f, 110.0f),
                    PathNode.LineTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 52.68629f, 43.31371f, 50.0f, 40.0f, 50.0f),
                    PathNode.CurveTo(36.68629f, 50.0f, 34.0f, 52.68629f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 179.3137f, 36.68629f, 182.0f, 40.0f, 182.0f),
                    PathNode.CurveTo(43.31371f, 182.0f, 46.0f, 179.3137f, 46.0f, 176.0f),
                    PathNode.LineTo(46.0f, 122.0f),
                    PathNode.LineTo(138.0f, 122.0f),
                    PathNode.LineTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 179.3137f, 140.6863f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(147.3137f, 182.0f, 150.0f, 179.3137f, 150.0f, 176.0f),
                    PathNode.LineTo(150.0f, 56.0f),
                    PathNode.CurveTo(150.0f, 52.68629f, 147.3137f, 50.0f, 144.0f, 50.0f),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
