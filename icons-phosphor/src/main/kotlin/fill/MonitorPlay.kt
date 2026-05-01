package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorFillIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 219.58173f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 189.25484f, 221.25484f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(34.745167f, 200.0f, 24.0f, 189.25484f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 50.745167f, 34.745167f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(221.25484f, 40.0f, 232.0f, 50.745167f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(163.99927f, 117.39127f, 162.72662f, 114.946754f, 160.59f, 113.45f),
                    PathNode.LineTo(120.59f, 85.45f),
                    PathNode.CurveTo(118.14674f, 83.73844f, 114.95415f, 83.52846f, 112.307755f, 84.90525f),
                    PathNode.CurveTo(109.66137f, 86.28204f, 108.00084f, 89.01689f, 108.0f, 92.0f),
                    PathNode.LineTo(108.0f, 148.0f),
                    PathNode.CurveTo(108.00084f, 150.98311f, 109.66137f, 153.71796f, 112.307755f, 155.09476f),
                    PathNode.CurveTo(114.95415f, 156.47154f, 118.14674f, 156.26155f, 120.59f, 154.55f),
                    PathNode.LineTo(160.59f, 126.55f),
                    PathNode.CurveTo(162.72662f, 125.053246f, 163.99927f, 122.60873f, 164.0f, 120.0f),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
