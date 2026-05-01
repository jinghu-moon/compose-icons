package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorFillIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 171.58173f, 67.58172f, 168.0f, 72.0f, 168.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(180.41827f, 168.0f, 184.0f, 171.58173f, 184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 180.41827f, 180.41827f, 184.0f, 176.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.35f, 128.35f),
                    PathNode.CurveTo(182.57498f, 129.64787f, 184.94788f, 134.12502f, 183.65f, 138.35f),
                    PathNode.CurveTo(182.35213f, 142.57498f, 177.87498f, 144.94788f, 173.65f, 143.65f),
                    PathNode.LineTo(69.65f, 111.65f),
                    PathNode.CurveTo(66.28707f, 110.62116f, 63.99041f, 107.516785f, 63.99041f, 104.0f),
                    PathNode.CurveTo(63.99041f, 100.483215f, 66.28707f, 97.37884f, 69.65f, 96.35f),
                    PathNode.LineTo(173.65f, 64.35f),
                    PathNode.CurveTo(177.87498f, 63.05213f, 182.35213f, 65.42502f, 183.65f, 69.65f),
                    PathNode.CurveTo(184.94788f, 73.87498f, 182.57498f, 78.35213f, 178.35f, 79.65f),
                    PathNode.LineTo(99.2f, 104.0f),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
