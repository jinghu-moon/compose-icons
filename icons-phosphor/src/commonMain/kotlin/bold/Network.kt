package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorBoldIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 108.0f),
                    PathNode.LineTo(140.0f, 108.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(144.0f, 92.0f),
                    PathNode.CurveTo(155.0457f, 92.0f, 164.0f, 83.04569f, 164.0f, 72.0f),
                    PathNode.LineTo(164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 28.954306f, 155.0457f, 20.0f, 144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(100.95431f, 20.0f, 92.0f, 28.954306f, 92.0f, 40.0f),
                    PathNode.LineTo(92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 83.04569f, 100.95431f, 92.0f, 112.0f, 92.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.LineTo(116.0f, 108.0f),
                    PathNode.LineTo(24.0f, 108.0f),
                    PathNode.CurveTo(17.372583f, 108.0f, 12.0f, 113.37258f, 12.0f, 120.0f),
                    PathNode.CurveTo(12.0f, 126.62742f, 17.372583f, 132.0f, 24.0f, 132.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.LineTo(48.0f, 156.0f),
                    PathNode.CurveTo(36.954304f, 156.0f, 28.0f, 164.9543f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(91.04569f, 228.0f, 100.0f, 219.0457f, 100.0f, 208.0f),
                    PathNode.LineTo(100.0f, 176.0f),
                    PathNode.CurveTo(100.0f, 164.9543f, 91.04569f, 156.0f, 80.0f, 156.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.LineTo(180.0f, 156.0f),
                    PathNode.LineTo(176.0f, 156.0f),
                    PathNode.CurveTo(164.9543f, 156.0f, 156.0f, 164.9543f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 219.0457f, 164.9543f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 164.9543f, 219.0457f, 156.0f, 208.0f, 156.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(204.0f, 132.0f),
                    PathNode.LineTo(232.0f, 132.0f),
                    PathNode.CurveTo(238.62741f, 132.0f, 244.0f, 126.62742f, 244.0f, 120.0f),
                    PathNode.CurveTo(244.0f, 113.37258f, 238.62741f, 108.0f, 232.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 44.0f),
                    PathNode.LineTo(140.0f, 44.0f),
                    PathNode.LineTo(140.0f, 68.0f),
                    PathNode.LineTo(116.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.LineTo(76.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.LineTo(180.0f, 180.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _network!!
    }

private var _network: ImageVector? = null
