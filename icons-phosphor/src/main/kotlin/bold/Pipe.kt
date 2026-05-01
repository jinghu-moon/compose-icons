package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorBoldIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 100.0f),
                    PathNode.LineTo(216.0f, 100.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.LineTo(232.0f, 60.0f),
                    PathNode.CurveTo(238.62741f, 60.0f, 244.0f, 54.62742f, 244.0f, 48.0f),
                    PathNode.CurveTo(244.0f, 41.37258f, 238.62741f, 36.0f, 232.0f, 36.0f),
                    PathNode.LineTo(212.0f, 36.0f),
                    PathNode.CurveTo(208.22292f, 30.963882f, 202.29515f, 28.0f, 196.0f, 28.0f),
                    PathNode.LineTo(172.0f, 28.0f),
                    PathNode.CurveTo(165.70485f, 28.0f, 159.77708f, 30.963882f, 156.0f, 36.0f),
                    PathNode.LineTo(144.0f, 36.0f),
                    PathNode.CurveTo(84.38066f, 36.066135f, 36.066135f, 84.38066f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.CurveTo(30.963882f, 159.77708f, 28.0f, 165.70485f, 28.0f, 172.0f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.CurveTo(28.0f, 202.29515f, 30.963882f, 208.22292f, 36.0f, 212.0f),
                    PathNode.LineTo(36.0f, 232.0f),
                    PathNode.CurveTo(36.0f, 238.62741f, 41.37258f, 244.0f, 48.0f, 244.0f),
                    PathNode.CurveTo(54.62742f, 244.0f, 60.0f, 238.62741f, 60.0f, 232.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.LineTo(100.0f, 216.0f),
                    PathNode.LineTo(100.0f, 232.0f),
                    PathNode.CurveTo(100.0f, 238.62741f, 105.37258f, 244.0f, 112.0f, 244.0f),
                    PathNode.CurveTo(118.62742f, 244.0f, 124.0f, 238.62741f, 124.0f, 232.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.CurveTo(129.03612f, 208.22292f, 132.0f, 202.29515f, 132.0f, 196.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.CurveTo(132.0f, 165.70485f, 129.03612f, 159.77708f, 124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 144.0f),
                    PathNode.CurveTo(124.0f, 132.9543f, 132.9543f, 124.0f, 144.0f, 124.0f),
                    PathNode.LineTo(156.0f, 124.0f),
                    PathNode.CurveTo(159.77708f, 129.03612f, 165.70485f, 132.0f, 172.0f, 132.0f),
                    PathNode.LineTo(196.0f, 132.0f),
                    PathNode.CurveTo(202.29515f, 132.0f, 208.22292f, 129.03612f, 212.0f, 124.0f),
                    PathNode.LineTo(232.0f, 124.0f),
                    PathNode.CurveTo(238.62741f, 124.0f, 244.0f, 118.62742f, 244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 105.37258f, 238.62741f, 100.0f, 232.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 176.0f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 144.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.LineTo(60.0f, 152.0f),
                    PathNode.LineTo(60.0f, 144.0f),
                    PathNode.CurveTo(60.049603f, 97.62865f, 97.62865f, 60.049603f, 144.0f, 60.0f),
                    PathNode.LineTo(152.0f, 60.0f),
                    PathNode.LineTo(152.0f, 100.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.CurveTo(119.71089f, 100.02756f, 100.02756f, 119.71089f, 100.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pipe!!
    }

private var _pipe: ImageVector? = null
