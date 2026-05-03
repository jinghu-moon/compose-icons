package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorFillIcon(
            name = "GreaterThanOrEqual",
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
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(75.58172f, 184.0f, 72.0f, 180.41827f, 72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 171.58173f, 75.58172f, 168.0f, 80.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(188.41827f, 168.0f, 192.0f, 171.58173f, 192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 180.41827f, 188.41827f, 184.0f, 184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.35f, 119.65f),
                    PathNode.LineTo(82.35f, 151.65f),
                    PathNode.CurveTo(78.12502f, 152.94788f, 73.647865f, 150.57498f, 72.35f, 146.35f),
                    PathNode.CurveTo(71.05213f, 142.12502f, 73.42502f, 137.64787f, 77.65f, 136.35f),
                    PathNode.LineTo(156.8f, 112.0f),
                    PathNode.LineTo(77.65f, 87.65f),
                    PathNode.CurveTo(73.42502f, 86.35213f, 71.05213f, 81.87498f, 72.35f, 77.65f),
                    PathNode.CurveTo(73.64787f, 73.42502f, 78.12502f, 71.05213f, 82.35f, 72.35f),
                    PathNode.LineTo(186.35f, 104.35f),
                    PathNode.CurveTo(189.71292f, 105.37884f, 192.0096f, 108.483215f, 192.0096f, 112.0f),
                    PathNode.CurveTo(192.0096f, 115.516785f, 189.71292f, 118.62116f, 186.35f, 119.65f),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
