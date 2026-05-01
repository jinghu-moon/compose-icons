package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorRegularIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 48.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(55.163445f, 48.0f, 48.0f, 55.163445f, 48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(48.0f, 200.83656f, 55.163445f, 208.0f, 64.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(200.83656f, 208.0f, 208.0f, 200.83656f, 208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 55.163445f, 200.83656f, 48.0f, 192.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 204.41827f, 236.41827f, 208.0f, 232.0f, 208.0f),
                    PathNode.CurveTo(227.58173f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 227.58173f, 48.0f, 232.0f, 48.0f),
                    PathNode.CurveTo(236.41827f, 48.0f, 240.0f, 51.581722f, 240.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 204.41827f, 28.418278f, 208.0f, 24.0f, 208.0f),
                    PathNode.CurveTo(19.581722f, 208.0f, 16.0f, 204.41827f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 56.0f),
                    PathNode.CurveTo(16.0f, 51.581722f, 19.581722f, 48.0f, 24.0f, 48.0f),
                    PathNode.CurveTo(28.418278f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
