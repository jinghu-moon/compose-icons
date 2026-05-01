package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorFillIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(55.163445f, 56.0f, 48.0f, 63.163445f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(47.999924f, 226.99675f, 49.674698f, 229.74225f, 52.33931f, 231.11353f),
                    PathNode.CurveTo(55.00392f, 232.4848f, 58.211464f, 232.25186f, 60.65f, 230.51f),
                    PathNode.LineTo(112.0f, 193.83f),
                    PathNode.LineTo(163.36f, 230.51f),
                    PathNode.CurveTo(165.79837f, 232.2461f, 169.0019f, 232.47575f, 171.66298f, 231.10521f),
                    PathNode.CurveTo(174.32405f, 229.7347f, 175.9974f, 226.99327f, 176.0f, 224.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(176.0f, 63.163445f, 168.83656f, 56.0f, 160.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.LineTo(88.0f, 24.0f),
                    PathNode.CurveTo(83.58172f, 24.0f, 80.0f, 27.581722f, 80.0f, 32.0f),
                    PathNode.CurveTo(80.0f, 36.418278f, 83.58172f, 40.0f, 88.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 196.41827f, 195.58173f, 200.0f, 200.0f, 200.0f),
                    PathNode.CurveTo(204.41827f, 200.0f, 208.0f, 196.41827f, 208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 31.163445f, 200.83656f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
