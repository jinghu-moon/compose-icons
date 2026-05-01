package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorThinIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(62.3f, 171.62f),
                    PathNode.CurveTo(64.29929f, 172.55846f, 66.68083f, 171.69896f, 67.62f, 169.7f),
                    PathNode.LineTo(85.36f, 132.0f),
                    PathNode.LineTo(170.64f, 132.0f),
                    PathNode.LineTo(188.38f, 169.7f),
                    PathNode.CurveTo(188.97043f, 171.02095f, 190.2282f, 171.92007f, 191.66913f, 172.05125f),
                    PathNode.CurveTo(193.11009f, 172.18245f, 194.50955f, 171.52524f, 195.32881f, 170.33263f),
                    PathNode.CurveTo(196.14809f, 169.14001f, 196.25943f, 167.59795f, 195.62f, 166.3f),
                    PathNode.LineTo(131.62f, 30.3f),
                    PathNode.CurveTo(130.96059f, 28.897192f, 129.55006f, 28.001646f, 128.0f, 28.001646f),
                    PathNode.CurveTo(126.449936f, 28.001646f, 125.03941f, 28.897192f, 124.38f, 30.3f),
                    PathNode.LineTo(60.38f, 166.3f),
                    PathNode.CurveTo(59.441532f, 168.29929f, 60.301037f, 170.68083f, 62.3f, 171.62f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 41.39f),
                    PathNode.LineTo(166.87f, 124.0f),
                    PathNode.LineTo(89.13f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 218.20914f, 218.20914f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(37.79086f, 220.0f, 36.0f, 218.20914f, 36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 213.79086f, 37.79086f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(218.20914f, 212.0f, 220.0f, 213.79086f, 220.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
