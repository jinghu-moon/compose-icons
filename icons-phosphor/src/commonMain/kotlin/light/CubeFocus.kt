package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorLightIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 48.0f),
                    PathNode.LineTo(230.0f, 88.0f),
                    PathNode.CurveTo(230.0f, 91.313705f, 227.3137f, 94.0f, 224.0f, 94.0f),
                    PathNode.CurveTo(220.6863f, 94.0f, 218.0f, 91.313705f, 218.0f, 88.0f),
                    PathNode.LineTo(218.0f, 54.0f),
                    PathNode.LineTo(184.0f, 54.0f),
                    PathNode.CurveTo(180.6863f, 54.0f, 178.0f, 51.31371f, 178.0f, 48.0f),
                    PathNode.CurveTo(178.0f, 44.68629f, 180.6863f, 42.0f, 184.0f, 42.0f),
                    PathNode.LineTo(224.0f, 42.0f),
                    PathNode.CurveTo(227.3137f, 42.0f, 230.0f, 44.68629f, 230.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 202.0f),
                    PathNode.LineTo(38.0f, 202.0f),
                    PathNode.LineTo(38.0f, 168.0f),
                    PathNode.CurveTo(38.0f, 164.6863f, 35.31371f, 162.0f, 32.0f, 162.0f),
                    PathNode.CurveTo(28.68629f, 162.0f, 26.0f, 164.6863f, 26.0f, 168.0f),
                    PathNode.LineTo(26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 211.3137f, 28.68629f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(72.0f, 214.0f),
                    PathNode.CurveTo(75.313705f, 214.0f, 78.0f, 211.3137f, 78.0f, 208.0f),
                    PathNode.CurveTo(78.0f, 204.6863f, 75.313705f, 202.0f, 72.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 162.0f),
                    PathNode.CurveTo(220.6863f, 162.0f, 218.0f, 164.6863f, 218.0f, 168.0f),
                    PathNode.LineTo(218.0f, 202.0f),
                    PathNode.LineTo(184.0f, 202.0f),
                    PathNode.CurveTo(180.6863f, 202.0f, 178.0f, 204.6863f, 178.0f, 208.0f),
                    PathNode.CurveTo(178.0f, 211.3137f, 180.6863f, 214.0f, 184.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(227.3137f, 214.0f, 230.0f, 211.3137f, 230.0f, 208.0f),
                    PathNode.LineTo(230.0f, 168.0f),
                    PathNode.CurveTo(230.0f, 164.6863f, 227.3137f, 162.0f, 224.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 94.0f),
                    PathNode.CurveTo(35.31371f, 94.0f, 38.0f, 91.313705f, 38.0f, 88.0f),
                    PathNode.LineTo(38.0f, 54.0f),
                    PathNode.LineTo(72.0f, 54.0f),
                    PathNode.CurveTo(75.313705f, 54.0f, 78.0f, 51.31371f, 78.0f, 48.0f),
                    PathNode.CurveTo(78.0f, 44.68629f, 75.313705f, 42.0f, 72.0f, 42.0f),
                    PathNode.LineTo(32.0f, 42.0f),
                    PathNode.CurveTo(28.68629f, 42.0f, 26.0f, 44.68629f, 26.0f, 48.0f),
                    PathNode.LineTo(26.0f, 88.0f),
                    PathNode.CurveTo(26.0f, 91.313705f, 28.68629f, 94.0f, 32.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.0f, 165.21f),
                    PathNode.LineTo(131.0f, 197.21f),
                    PathNode.CurveTo(129.1436f, 198.2818f, 126.85641f, 198.2818f, 125.0f, 197.21f),
                    PathNode.LineTo(69.0f, 165.21f),
                    PathNode.CurveTo(67.139305f, 164.13573f, 65.99504f, 162.14854f, 66.0f, 160.0f),
                    PathNode.LineTo(66.0f, 96.0f),
                    PathNode.CurveTo(65.99504f, 93.85146f, 67.139305f, 91.864265f, 69.0f, 90.79f),
                    PathNode.LineTo(125.0f, 58.79f),
                    PathNode.CurveTo(126.85641f, 57.718204f, 129.1436f, 57.718204f, 131.0f, 58.79f),
                    PathNode.LineTo(187.0f, 90.79f),
                    PathNode.CurveTo(188.8607f, 91.864265f, 190.00496f, 93.85146f, 190.0f, 96.0f),
                    PathNode.LineTo(190.0f, 160.0f),
                    PathNode.CurveTo(190.00496f, 162.14854f, 188.8607f, 164.13573f, 187.0f, 165.21f),
                    PathNode.Close,
                    PathNode.MoveTo(84.09f, 96.0f),
                    PathNode.LineTo(128.0f, 121.09f),
                    PathNode.LineTo(171.91f, 96.0f),
                    PathNode.LineTo(128.0f, 70.91f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 156.52f),
                    PathNode.LineTo(122.0f, 181.66f),
                    PathNode.LineTo(122.0f, 131.48f),
                    PathNode.LineTo(78.0f, 106.34f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 156.52f),
                    PathNode.LineTo(178.0f, 106.34f),
                    PathNode.LineTo(134.0f, 131.48f),
                    PathNode.LineTo(134.0f, 181.66f),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
