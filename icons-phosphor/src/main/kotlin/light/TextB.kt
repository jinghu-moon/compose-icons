package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorLightIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.69f, 116.41f),
                    PathNode.CurveTo(188.36407f, 105.13949f, 193.49344f, 86.49935f, 187.51064f, 69.819695f),
                    PathNode.CurveTo(181.52785f, 53.14003f, 165.7202f, 42.00976f, 148.0f, 42.0f),
                    PathNode.LineTo(80.0f, 42.0f),
                    PathNode.CurveTo(76.686295f, 42.0f, 74.0f, 44.68629f, 74.0f, 48.0f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(74.0f, 203.3137f, 76.686295f, 206.0f, 80.0f, 206.0f),
                    PathNode.LineTo(160.0f, 206.0f),
                    PathNode.CurveTo(182.5308f, 205.99808f, 201.7442f, 189.67708f, 205.38988f, 167.44319f),
                    PathNode.CurveTo(209.03555f, 145.2093f, 196.04037f, 123.60709f, 174.69f, 116.41f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 54.0f),
                    PathNode.LineTo(148.0f, 54.0f),
                    PathNode.CurveTo(164.56854f, 54.0f, 178.0f, 67.43146f, 178.0f, 84.0f),
                    PathNode.CurveTo(178.0f, 100.56854f, 164.56854f, 114.0f, 148.0f, 114.0f),
                    PathNode.LineTo(86.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 194.0f),
                    PathNode.LineTo(86.0f, 194.0f),
                    PathNode.LineTo(86.0f, 126.0f),
                    PathNode.LineTo(160.0f, 126.0f),
                    PathNode.CurveTo(178.77768f, 126.0f, 194.0f, 141.22232f, 194.0f, 160.0f),
                    PathNode.CurveTo(194.0f, 178.77768f, 178.77768f, 194.0f, 160.0f, 194.0f),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
