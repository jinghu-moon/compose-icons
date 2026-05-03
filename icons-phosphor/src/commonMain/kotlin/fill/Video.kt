package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorFillIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 203.58173f, 27.581722f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 176.83656f, 224.83656f, 184.0f, 216.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(31.163445f, 184.0f, 24.0f, 176.83656f, 24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 112.0f),
                    PathNode.CurveTo(163.99927f, 109.39127f, 162.72662f, 106.946754f, 160.59f, 105.45f),
                    PathNode.LineTo(120.59f, 77.45f),
                    PathNode.CurveTo(118.14674f, 75.73844f, 114.95415f, 75.52846f, 112.307755f, 76.90525f),
                    PathNode.CurveTo(109.66137f, 78.28204f, 108.00084f, 81.01689f, 108.0f, 84.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.CurveTo(108.00084f, 142.98311f, 109.66137f, 145.71796f, 112.307755f, 147.09476f),
                    PathNode.CurveTo(114.95415f, 148.47154f, 118.14674f, 148.26155f, 120.59f, 146.55f),
                    PathNode.LineTo(160.59f, 118.55f),
                    PathNode.CurveTo(162.72662f, 117.053246f, 163.99927f, 114.60873f, 164.0f, 112.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
