package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorFillIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(191.83f, 51.48f),
                    PathNode.LineTo(205.66f, 37.66f),
                    PathNode.CurveTo(208.78593f, 34.53407f, 208.78593f, 29.46593f, 205.66f, 26.34f),
                    PathNode.CurveTo(202.53407f, 23.21407f, 197.46593f, 23.214067f, 194.34f, 26.34f),
                    PathNode.LineTo(179.79f, 40.9f),
                    PathNode.CurveTo(148.93935f, 18.368208f, 107.06065f, 18.368208f, 76.21f, 40.9f),
                    PathNode.LineTo(61.66f, 26.34f),
                    PathNode.CurveTo(58.53407f, 23.21407f, 53.46593f, 23.21407f, 50.34f, 26.34f),
                    PathNode.CurveTo(47.21407f, 29.46593f, 47.21407f, 34.53407f, 50.34f, 37.66f),
                    PathNode.LineTo(64.17f, 51.48f),
                    PathNode.CurveTo(48.64076f, 67.801155f, 39.98626f, 89.47141f, 40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 200.60106f, 79.39894f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(176.60106f, 240.0f, 216.0f, 200.60106f, 216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.01373f, 89.47141f, 207.35924f, 67.801155f, 191.83f, 51.48f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(167.74623f, 40.04409f, 199.95592f, 72.25378f, 200.0f, 112.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.04409f, 72.25378f, 88.25378f, 40.04409f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 92.0f),
                    PathNode.CurveTo(144.0f, 85.37258f, 149.37259f, 80.0f, 156.0f, 80.0f),
                    PathNode.CurveTo(162.62741f, 80.0f, 168.0f, 85.37258f, 168.0f, 92.0f),
                    PathNode.CurveTo(168.0f, 98.62742f, 162.62741f, 104.0f, 156.0f, 104.0f),
                    PathNode.CurveTo(149.37259f, 104.0f, 144.0f, 98.62742f, 144.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 92.0f),
                    PathNode.CurveTo(88.0f, 85.37258f, 93.37258f, 80.0f, 100.0f, 80.0f),
                    PathNode.CurveTo(106.62742f, 80.0f, 112.0f, 85.37258f, 112.0f, 92.0f),
                    PathNode.CurveTo(112.0f, 98.62742f, 106.62742f, 104.0f, 100.0f, 104.0f),
                    PathNode.CurveTo(93.37258f, 104.0f, 88.0f, 98.62742f, 88.0f, 92.0f),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
