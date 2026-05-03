package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorLightIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(26.0f, 104.0f),
                    PathNode.CurveTo(26.0f, 100.686295f, 28.68629f, 98.0f, 32.0f, 98.0f),
                    PathNode.LineTo(112.0f, 98.0f),
                    PathNode.CurveTo(115.313705f, 98.0f, 118.0f, 100.686295f, 118.0f, 104.0f),
                    PathNode.CurveTo(118.0f, 107.313705f, 115.313705f, 110.0f, 112.0f, 110.0f),
                    PathNode.LineTo(32.0f, 110.0f),
                    PathNode.CurveTo(28.68629f, 110.0f, 26.0f, 107.313705f, 26.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 98.0f),
                    PathNode.LineTo(144.0f, 98.0f),
                    PathNode.CurveTo(140.6863f, 98.0f, 138.0f, 100.686295f, 138.0f, 104.0f),
                    PathNode.CurveTo(138.0f, 107.313705f, 140.6863f, 110.0f, 144.0f, 110.0f),
                    PathNode.LineTo(224.0f, 110.0f),
                    PathNode.CurveTo(227.3137f, 110.0f, 230.0f, 107.313705f, 230.0f, 104.0f),
                    PathNode.CurveTo(230.0f, 100.686295f, 227.3137f, 98.0f, 224.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 138.0f),
                    PathNode.LineTo(32.0f, 138.0f),
                    PathNode.CurveTo(28.68629f, 138.0f, 26.0f, 140.6863f, 26.0f, 144.0f),
                    PathNode.CurveTo(26.0f, 147.3137f, 28.68629f, 150.0f, 32.0f, 150.0f),
                    PathNode.LineTo(72.0f, 150.0f),
                    PathNode.CurveTo(75.313705f, 150.0f, 78.0f, 147.3137f, 78.0f, 144.0f),
                    PathNode.CurveTo(78.0f, 140.6863f, 75.313705f, 138.0f, 72.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 138.0f),
                    PathNode.LineTo(184.0f, 138.0f),
                    PathNode.CurveTo(180.6863f, 138.0f, 178.0f, 140.6863f, 178.0f, 144.0f),
                    PathNode.CurveTo(178.0f, 147.3137f, 180.6863f, 150.0f, 184.0f, 150.0f),
                    PathNode.LineTo(224.0f, 150.0f),
                    PathNode.CurveTo(227.3137f, 150.0f, 230.0f, 147.3137f, 230.0f, 144.0f),
                    PathNode.CurveTo(230.0f, 140.6863f, 227.3137f, 138.0f, 224.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 144.0f),
                    PathNode.CurveTo(98.0f, 147.3137f, 100.686295f, 150.0f, 104.0f, 150.0f),
                    PathNode.LineTo(152.0f, 150.0f),
                    PathNode.CurveTo(155.3137f, 150.0f, 158.0f, 147.3137f, 158.0f, 144.0f),
                    PathNode.CurveTo(158.0f, 140.6863f, 155.3137f, 138.0f, 152.0f, 138.0f),
                    PathNode.LineTo(104.0f, 138.0f),
                    PathNode.CurveTo(100.686295f, 138.0f, 98.0f, 140.6863f, 98.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(28.68629f, 178.0f, 26.0f, 180.6863f, 26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 187.3137f, 28.68629f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(56.0f, 190.0f),
                    PathNode.CurveTo(59.31371f, 190.0f, 62.0f, 187.3137f, 62.0f, 184.0f),
                    PathNode.CurveTo(62.0f, 180.6863f, 59.31371f, 178.0f, 56.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 178.0f),
                    PathNode.LineTo(88.0f, 178.0f),
                    PathNode.CurveTo(84.686295f, 178.0f, 82.0f, 180.6863f, 82.0f, 184.0f),
                    PathNode.CurveTo(82.0f, 187.3137f, 84.686295f, 190.0f, 88.0f, 190.0f),
                    PathNode.LineTo(112.0f, 190.0f),
                    PathNode.CurveTo(115.313705f, 190.0f, 118.0f, 187.3137f, 118.0f, 184.0f),
                    PathNode.CurveTo(118.0f, 180.6863f, 115.313705f, 178.0f, 112.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 178.0f),
                    PathNode.LineTo(144.0f, 178.0f),
                    PathNode.CurveTo(140.6863f, 178.0f, 138.0f, 180.6863f, 138.0f, 184.0f),
                    PathNode.CurveTo(138.0f, 187.3137f, 140.6863f, 190.0f, 144.0f, 190.0f),
                    PathNode.LineTo(168.0f, 190.0f),
                    PathNode.CurveTo(171.3137f, 190.0f, 174.0f, 187.3137f, 174.0f, 184.0f),
                    PathNode.CurveTo(174.0f, 180.6863f, 171.3137f, 178.0f, 168.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 178.0f),
                    PathNode.LineTo(200.0f, 178.0f),
                    PathNode.CurveTo(196.6863f, 178.0f, 194.0f, 180.6863f, 194.0f, 184.0f),
                    PathNode.CurveTo(194.0f, 187.3137f, 196.6863f, 190.0f, 200.0f, 190.0f),
                    PathNode.LineTo(224.0f, 190.0f),
                    PathNode.CurveTo(227.3137f, 190.0f, 230.0f, 187.3137f, 230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 180.6863f, 227.3137f, 178.0f, 224.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 70.0f),
                    PathNode.LineTo(224.0f, 70.0f),
                    PathNode.CurveTo(227.3137f, 70.0f, 230.0f, 67.313705f, 230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 60.68629f, 227.3137f, 58.0f, 224.0f, 58.0f),
                    PathNode.LineTo(32.0f, 58.0f),
                    PathNode.CurveTo(28.68629f, 58.0f, 26.0f, 60.68629f, 26.0f, 64.0f),
                    PathNode.CurveTo(26.0f, 67.313705f, 28.68629f, 70.0f, 32.0f, 70.0f),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
