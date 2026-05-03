package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorLightIcon(
            name = "Barcode",
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
                    PathNode.MoveTo(80.0f, 82.0f),
                    PathNode.CurveTo(76.686295f, 82.0f, 74.0f, 84.686295f, 74.0f, 88.0f),
                    PathNode.LineTo(74.0f, 168.0f),
                    PathNode.CurveTo(74.0f, 171.3137f, 76.686295f, 174.0f, 80.0f, 174.0f),
                    PathNode.CurveTo(83.313705f, 174.0f, 86.0f, 171.3137f, 86.0f, 168.0f),
                    PathNode.LineTo(86.0f, 88.0f),
                    PathNode.CurveTo(86.0f, 84.686295f, 83.313705f, 82.0f, 80.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 168.0f),
                    PathNode.LineTo(182.0f, 88.0f),
                    PathNode.CurveTo(182.0f, 84.686295f, 179.3137f, 82.0f, 176.0f, 82.0f),
                    PathNode.CurveTo(172.6863f, 82.0f, 170.0f, 84.686295f, 170.0f, 88.0f),
                    PathNode.LineTo(170.0f, 168.0f),
                    PathNode.CurveTo(170.0f, 171.3137f, 172.6863f, 174.0f, 176.0f, 174.0f),
                    PathNode.CurveTo(179.3137f, 174.0f, 182.0f, 171.3137f, 182.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 82.0f),
                    PathNode.CurveTo(140.6863f, 82.0f, 138.0f, 84.686295f, 138.0f, 88.0f),
                    PathNode.LineTo(138.0f, 168.0f),
                    PathNode.CurveTo(138.0f, 171.3137f, 140.6863f, 174.0f, 144.0f, 174.0f),
                    PathNode.CurveTo(147.3137f, 174.0f, 150.0f, 171.3137f, 150.0f, 168.0f),
                    PathNode.LineTo(150.0f, 88.0f),
                    PathNode.CurveTo(150.0f, 84.686295f, 147.3137f, 82.0f, 144.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 82.0f),
                    PathNode.CurveTo(108.686295f, 82.0f, 106.0f, 84.686295f, 106.0f, 88.0f),
                    PathNode.LineTo(106.0f, 168.0f),
                    PathNode.CurveTo(106.0f, 171.3137f, 108.686295f, 174.0f, 112.0f, 174.0f),
                    PathNode.CurveTo(115.313705f, 174.0f, 118.0f, 171.3137f, 118.0f, 168.0f),
                    PathNode.LineTo(118.0f, 88.0f),
                    PathNode.CurveTo(118.0f, 84.686295f, 115.313705f, 82.0f, 112.0f, 82.0f),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
