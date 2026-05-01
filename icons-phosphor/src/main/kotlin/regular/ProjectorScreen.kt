package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorRegularIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 39.163445f, 224.83656f, 32.0f, 216.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(31.163445f, 32.0f, 24.0f, 39.163445f, 24.0f, 48.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 72.836555f, 31.163445f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 179.58173f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 188.41827f, 27.581722f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 209.38f),
                    PathNode.CurveTo(108.97963f, 213.27629f, 102.369026f, 224.54533f, 104.345634f, 236.06586f),
                    PathNode.CurveTo(106.32224f, 247.5864f, 116.31113f, 256.00742f, 128.0f, 256.00742f),
                    PathNode.CurveTo(139.68887f, 256.00742f, 149.67775f, 247.5864f, 151.65436f, 236.06586f),
                    PathNode.CurveTo(153.63098f, 224.54533f, 147.02037f, 213.27629f, 136.0f, 209.38f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(228.41827f, 192.0f, 232.0f, 188.41827f, 232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 179.58173f, 228.41827f, 176.0f, 224.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(224.83656f, 80.0f, 232.0f, 72.836555f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 227.58173f, 123.58172f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 227.58173f, 136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.LineTo(200.0f, 80.0f),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
