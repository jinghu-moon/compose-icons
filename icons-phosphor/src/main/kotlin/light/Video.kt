package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorLightIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.33f, 107.0f),
                    PathNode.LineTo(115.33f, 75.0f),
                    PathNode.CurveTo(113.487656f, 73.770805f, 111.11799f, 73.656494f, 109.16588f, 74.70264f),
                    PathNode.CurveTo(107.21377f, 75.74879f, 105.99671f, 77.78524f, 106.0f, 80.0f),
                    PathNode.LineTo(106.0f, 144.0f),
                    PathNode.CurveTo(105.99671f, 146.21475f, 107.21377f, 148.25122f, 109.16588f, 149.29736f),
                    PathNode.CurveTo(111.11799f, 150.3435f, 113.487656f, 150.22919f, 115.33f, 149.0f),
                    PathNode.LineTo(163.33f, 117.0f),
                    PathNode.CurveTo(165.00587f, 115.88835f, 166.01338f, 114.01105f, 166.01338f, 112.0f),
                    PathNode.CurveTo(166.01338f, 109.98895f, 165.00587f, 108.11165f, 163.33f, 107.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 132.79f),
                    PathNode.LineTo(118.0f, 91.21f),
                    PathNode.LineTo(149.18f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 168.0f),
                    PathNode.CurveTo(26.0f, 175.73198f, 32.268013f, 182.0f, 40.0f, 182.0f),
                    PathNode.LineTo(216.0f, 182.0f),
                    PathNode.CurveTo(223.73198f, 182.0f, 230.0f, 175.73198f, 230.0f, 168.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 168.0f),
                    PathNode.CurveTo(218.0f, 169.10457f, 217.10457f, 170.0f, 216.0f, 170.0f),
                    PathNode.LineTo(40.0f, 170.0f),
                    PathNode.CurveTo(38.89543f, 170.0f, 38.0f, 169.10457f, 38.0f, 168.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(28.68629f, 214.0f, 26.0f, 211.3137f, 26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 204.6863f, 28.68629f, 202.0f, 32.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
