package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorLightIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(78.0f, 48.0f),
                    PathNode.CurveTo(78.0f, 51.31371f, 75.313705f, 54.0f, 72.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 72.0f),
                    PathNode.CurveTo(38.0f, 75.313705f, 35.31371f, 78.0f, 32.0f, 78.0f),
                    PathNode.CurveTo(28.68629f, 78.0f, 26.0f, 75.313705f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(75.313705f, 42.0f, 78.0f, 44.68629f, 78.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 150.0f),
                    PathNode.CurveTo(35.31371f, 150.0f, 38.0f, 147.3137f, 38.0f, 144.0f),
                    PathNode.LineTo(38.0f, 112.0f),
                    PathNode.CurveTo(38.0f, 108.686295f, 35.31371f, 106.0f, 32.0f, 106.0f),
                    PathNode.CurveTo(28.68629f, 106.0f, 26.0f, 108.686295f, 26.0f, 112.0f),
                    PathNode.LineTo(26.0f, 144.0f),
                    PathNode.CurveTo(26.0f, 147.3137f, 28.68629f, 150.0f, 32.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 184.0f),
                    PathNode.CurveTo(38.0f, 180.6863f, 35.31371f, 178.0f, 32.0f, 178.0f),
                    PathNode.CurveTo(28.68629f, 178.0f, 26.0f, 180.6863f, 26.0f, 184.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(72.0f, 214.0f),
                    PathNode.CurveTo(75.313705f, 214.0f, 78.0f, 211.3137f, 78.0f, 208.0f),
                    PathNode.CurveTo(78.0f, 204.6863f, 75.313705f, 202.0f, 72.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 202.0f),
                    PathNode.LineTo(112.0f, 202.0f),
                    PathNode.CurveTo(108.686295f, 202.0f, 106.0f, 204.6863f, 106.0f, 208.0f),
                    PathNode.CurveTo(106.0f, 211.3137f, 108.686295f, 214.0f, 112.0f, 214.0f),
                    PathNode.LineTo(144.0f, 214.0f),
                    PathNode.CurveTo(147.3137f, 214.0f, 150.0f, 211.3137f, 150.0f, 208.0f),
                    PathNode.CurveTo(150.0f, 204.6863f, 147.3137f, 202.0f, 144.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 178.0f),
                    PathNode.CurveTo(220.6863f, 178.0f, 218.0f, 180.6863f, 218.0f, 184.0f),
                    PathNode.LineTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(184.0f, 202.0f),
                    PathNode.CurveTo(180.6863f, 202.0f, 178.0f, 204.6863f, 178.0f, 208.0f),
                    PathNode.CurveTo(178.0f, 211.3137f, 180.6863f, 214.0f, 184.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 180.6863f, 227.3137f, 178.0f, 224.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 106.0f),
                    PathNode.CurveTo(220.6863f, 106.0f, 218.0f, 108.686295f, 218.0f, 112.0f),
                    PathNode.LineTo(218.0f, 144.0f),
                    PathNode.CurveTo(218.0f, 147.3137f, 220.6863f, 150.0f, 224.0f, 150.0f),
                    PathNode.CurveTo(227.3137f, 150.0f, 230.0f, 147.3137f, 230.0f, 144.0f),
                    PathNode.LineTo(230.0f, 112.0f),
                    PathNode.CurveTo(230.0f, 108.686295f, 227.3137f, 106.0f, 224.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(184.0f, 42.0f),
                    PathNode.CurveTo(180.6863f, 42.0f, 178.0f, 44.68629f, 178.0f, 48.0f),
                    PathNode.CurveTo(178.0f, 51.31371f, 180.6863f, 54.0f, 184.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.LineTo(218.0f, 72.0f),
                    PathNode.CurveTo(218.0f, 75.313705f, 220.6863f, 78.0f, 224.0f, 78.0f),
                    PathNode.CurveTo(227.3137f, 78.0f, 230.0f, 75.313705f, 230.0f, 72.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 42.0f),
                    PathNode.LineTo(112.0f, 42.0f),
                    PathNode.CurveTo(108.686295f, 42.0f, 106.0f, 44.68629f, 106.0f, 48.0f),
                    PathNode.CurveTo(106.0f, 51.31371f, 108.686295f, 54.0f, 112.0f, 54.0f),
                    PathNode.LineTo(144.0f, 54.0f),
                    PathNode.CurveTo(147.3137f, 54.0f, 150.0f, 51.31371f, 150.0f, 48.0f),
                    PathNode.CurveTo(150.0f, 44.68629f, 147.3137f, 42.0f, 144.0f, 42.0f),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
