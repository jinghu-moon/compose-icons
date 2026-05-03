package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorLightIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 50.0f),
                    PathNode.LineTo(64.0f, 50.0f),
                    PathNode.CurveTo(56.268013f, 50.0f, 50.0f, 56.268013f, 50.0f, 64.0f),
                    PathNode.LineTo(50.0f, 192.0f),
                    PathNode.CurveTo(50.0f, 199.73198f, 56.268013f, 206.0f, 64.0f, 206.0f),
                    PathNode.LineTo(192.0f, 206.0f),
                    PathNode.CurveTo(199.73198f, 206.0f, 206.0f, 199.73198f, 206.0f, 192.0f),
                    PathNode.LineTo(206.0f, 64.0f),
                    PathNode.CurveTo(206.0f, 56.268013f, 199.73198f, 50.0f, 192.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 192.0f),
                    PathNode.CurveTo(194.0f, 193.10457f, 193.10457f, 194.0f, 192.0f, 194.0f),
                    PathNode.LineTo(64.0f, 194.0f),
                    PathNode.CurveTo(62.89543f, 194.0f, 62.0f, 193.10457f, 62.0f, 192.0f),
                    PathNode.LineTo(62.0f, 64.0f),
                    PathNode.CurveTo(62.0f, 62.89543f, 62.89543f, 62.0f, 64.0f, 62.0f),
                    PathNode.LineTo(192.0f, 62.0f),
                    PathNode.CurveTo(193.10457f, 62.0f, 194.0f, 62.89543f, 194.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 56.0f),
                    PathNode.LineTo(238.0f, 200.0f),
                    PathNode.CurveTo(238.0f, 203.3137f, 235.3137f, 206.0f, 232.0f, 206.0f),
                    PathNode.CurveTo(228.6863f, 206.0f, 226.0f, 203.3137f, 226.0f, 200.0f),
                    PathNode.LineTo(226.0f, 56.0f),
                    PathNode.CurveTo(226.0f, 52.68629f, 228.6863f, 50.0f, 232.0f, 50.0f),
                    PathNode.CurveTo(235.3137f, 50.0f, 238.0f, 52.68629f, 238.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 56.0f),
                    PathNode.LineTo(30.0f, 200.0f),
                    PathNode.CurveTo(30.0f, 203.3137f, 27.31371f, 206.0f, 24.0f, 206.0f),
                    PathNode.CurveTo(20.68629f, 206.0f, 18.0f, 203.3137f, 18.0f, 200.0f),
                    PathNode.LineTo(18.0f, 56.0f),
                    PathNode.CurveTo(18.0f, 52.68629f, 20.68629f, 50.0f, 24.0f, 50.0f),
                    PathNode.CurveTo(27.31371f, 50.0f, 30.0f, 52.68629f, 30.0f, 56.0f),
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
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
