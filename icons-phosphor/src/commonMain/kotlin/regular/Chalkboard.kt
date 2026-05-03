package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorRegularIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(11.581722f, 192.0f, 8.0f, 195.58173f, 8.0f, 200.0f),
                    PathNode.CurveTo(8.0f, 204.41827f, 11.581722f, 208.0f, 16.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(244.41827f, 208.0f, 248.0f, 204.41827f, 248.0f, 200.0f),
                    PathNode.CurveTo(248.0f, 195.58173f, 244.41827f, 192.0f, 240.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 163.58173f, 196.41827f, 160.0f, 192.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(115.58172f, 160.0f, 112.0f, 163.58173f, 112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 140.41827f, 187.58173f, 144.0f, 192.0f, 144.0f),
                    PathNode.CurveTo(196.41827f, 144.0f, 200.0f, 140.41827f, 200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 75.58172f, 196.41827f, 72.0f, 192.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(59.581722f, 72.0f, 56.0f, 75.58172f, 56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
