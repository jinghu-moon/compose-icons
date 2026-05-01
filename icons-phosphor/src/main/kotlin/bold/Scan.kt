package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorBoldIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 40.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 86.62742f, 222.62741f, 92.0f, 216.0f, 92.0f),
                    PathNode.CurveTo(209.37259f, 92.0f, 204.0f, 86.62742f, 204.0f, 80.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(169.37259f, 52.0f, 164.0f, 46.62742f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 33.37258f, 169.37259f, 28.0f, 176.0f, 28.0f),
                    PathNode.LineTo(216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 169.37259f, 46.62742f, 164.0f, 40.0f, 164.0f),
                    PathNode.CurveTo(33.37258f, 164.0f, 28.0f, 169.37259f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(86.62742f, 228.0f, 92.0f, 222.62741f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 209.37259f, 86.62742f, 204.0f, 80.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 164.0f),
                    PathNode.CurveTo(209.37259f, 164.0f, 204.0f, 169.37259f, 204.0f, 176.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(176.0f, 204.0f),
                    PathNode.CurveTo(169.37259f, 204.0f, 164.0f, 209.37259f, 164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 222.62741f, 169.37259f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 169.37259f, 222.62741f, 164.0f, 216.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 92.0f),
                    PathNode.CurveTo(46.62742f, 92.0f, 52.0f, 86.62742f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(80.0f, 52.0f),
                    PathNode.CurveTo(86.62742f, 52.0f, 92.0f, 46.62742f, 92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 33.37258f, 86.62742f, 28.0f, 80.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 86.62742f, 33.37258f, 92.0f, 40.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 72.0f),
                    PathNode.LineTo(172.0f, 72.0f),
                    PathNode.CurveTo(178.62741f, 72.0f, 184.0f, 77.37258f, 184.0f, 84.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.CurveTo(184.0f, 178.62741f, 178.62741f, 184.0f, 172.0f, 184.0f),
                    PathNode.LineTo(84.0f, 184.0f),
                    PathNode.CurveTo(77.37258f, 184.0f, 72.0f, 178.62741f, 72.0f, 172.0f),
                    PathNode.LineTo(72.0f, 84.0f),
                    PathNode.CurveTo(72.0f, 77.37258f, 77.37258f, 72.0f, 84.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
