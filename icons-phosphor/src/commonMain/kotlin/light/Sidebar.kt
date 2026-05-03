package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorLightIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 150.0f),
                    PathNode.LineTo(56.0f, 150.0f),
                    PathNode.CurveTo(59.31371f, 150.0f, 62.0f, 147.3137f, 62.0f, 144.0f),
                    PathNode.CurveTo(62.0f, 140.6863f, 59.31371f, 138.0f, 56.0f, 138.0f),
                    PathNode.LineTo(38.0f, 138.0f),
                    PathNode.LineTo(38.0f, 118.0f),
                    PathNode.LineTo(56.0f, 118.0f),
                    PathNode.CurveTo(59.31371f, 118.0f, 62.0f, 115.313705f, 62.0f, 112.0f),
                    PathNode.CurveTo(62.0f, 108.686295f, 59.31371f, 106.0f, 56.0f, 106.0f),
                    PathNode.LineTo(38.0f, 106.0f),
                    PathNode.LineTo(38.0f, 86.0f),
                    PathNode.LineTo(56.0f, 86.0f),
                    PathNode.CurveTo(59.31371f, 86.0f, 62.0f, 83.313705f, 62.0f, 80.0f),
                    PathNode.CurveTo(62.0f, 76.686295f, 59.31371f, 74.0f, 56.0f, 74.0f),
                    PathNode.LineTo(38.0f, 74.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(82.0f, 54.0f),
                    PathNode.LineTo(82.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(94.0f, 202.0f),
                    PathNode.LineTo(94.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
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
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
