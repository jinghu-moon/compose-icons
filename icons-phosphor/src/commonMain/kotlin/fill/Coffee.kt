package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorFillIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(27.581722f, 80.0f, 24.0f, 83.58172f, 24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(24.04836f, 163.54968f, 35.89372f, 189.75945f, 56.54f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 211.58173f, 24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 220.41827f, 27.581722f, 224.0f, 32.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(212.41827f, 224.0f, 216.0f, 220.41827f, 216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 211.58173f, 212.41827f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(183.46f, 208.0f),
                    PathNode.CurveTo(195.71214f, 197.14085f, 205.00304f, 183.3456f, 210.46f, 167.91f),
                    PathNode.CurveTo(231.5506f, 166.61047f, 247.99246f, 149.13058f, 248.0f, 128.0f),
                    PathNode.LineTo(248.0f, 120.0f),
                    PathNode.CurveTo(248.0f, 97.90861f, 230.09138f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(231.99269f, 138.62968f, 224.9941f, 147.98827f, 214.8f, 151.0f),
                    PathNode.CurveTo(215.59276f, 146.03922f, 215.994f, 141.02373f, 216.0f, 136.0f),
                    PathNode.LineTo(216.0f, 97.38f),
                    PathNode.CurveTo(225.58655f, 100.769356f, 231.99686f, 109.83194f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 56.0f),
                    PathNode.LineTo(112.0f, 24.0f),
                    PathNode.CurveTo(112.0f, 19.581722f, 115.58172f, 16.0f, 120.0f, 16.0f),
                    PathNode.CurveTo(124.41828f, 16.0f, 128.0f, 19.581722f, 128.0f, 24.0f),
                    PathNode.LineTo(128.0f, 56.0f),
                    PathNode.CurveTo(128.0f, 60.418278f, 124.41828f, 64.0f, 120.0f, 64.0f),
                    PathNode.CurveTo(115.58172f, 64.0f, 112.0f, 60.418278f, 112.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 24.0f),
                    PathNode.CurveTo(144.0f, 19.581722f, 147.58173f, 16.0f, 152.0f, 16.0f),
                    PathNode.CurveTo(156.41827f, 16.0f, 160.0f, 19.581722f, 160.0f, 24.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 60.418278f, 156.41827f, 64.0f, 152.0f, 64.0f),
                    PathNode.CurveTo(147.58173f, 64.0f, 144.0f, 60.418278f, 144.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 24.0f),
                    PathNode.CurveTo(80.0f, 19.581722f, 83.58172f, 16.0f, 88.0f, 16.0f),
                    PathNode.CurveTo(92.41828f, 16.0f, 96.0f, 19.581722f, 96.0f, 24.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 60.418278f, 92.41828f, 64.0f, 88.0f, 64.0f),
                    PathNode.CurveTo(83.58172f, 64.0f, 80.0f, 60.418278f, 80.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _coffee!!
    }

private var _coffee: ImageVector? = null
