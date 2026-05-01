package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorDuotoneIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.LineTo(168.0f, 169.15f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 67.58172f, 164.41827f, 64.0f, 160.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.CurveTo(88.0f, 35.581722f, 91.58172f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(196.41827f, 32.0f, 200.0f, 35.581722f, 200.0f, 40.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.LineTo(96.0f, 24.0f),
                    PathNode.CurveTo(87.163445f, 24.0f, 80.0f, 31.163445f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(55.163445f, 56.0f, 48.0f, 63.163445f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(47.999924f, 226.99675f, 49.674698f, 229.74225f, 52.33931f, 231.11353f),
                    PathNode.CurveTo(55.00392f, 232.4848f, 58.211464f, 232.25186f, 60.65f, 230.51f),
                    PathNode.LineTo(112.0f, 193.83f),
                    PathNode.LineTo(163.36f, 230.51f),
                    PathNode.CurveTo(165.79837f, 232.2461f, 169.0019f, 232.47575f, 171.66298f, 231.10521f),
                    PathNode.CurveTo(174.32405f, 229.7347f, 175.9974f, 226.99327f, 176.0f, 224.0f),
                    PathNode.LineTo(176.0f, 184.69f),
                    PathNode.LineTo(195.35f, 198.51f),
                    PathNode.CurveTo(197.78853f, 200.25186f, 200.99608f, 200.4848f, 203.66069f, 199.11353f),
                    PathNode.CurveTo(206.3253f, 197.74225f, 208.00008f, 194.99675f, 208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 31.163445f, 200.83656f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 208.46f),
                    PathNode.LineTo(116.64f, 177.46f),
                    PathNode.CurveTo(113.858376f, 175.47307f, 110.12163f, 175.47307f, 107.34f, 177.46f),
                    PathNode.LineTo(64.0f, 208.45f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 176.46f),
                    PathNode.LineTo(176.0f, 165.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(176.0f, 63.163445f, 168.83656f, 56.0f, 160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
