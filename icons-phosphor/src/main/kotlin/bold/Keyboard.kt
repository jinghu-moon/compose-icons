package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorBoldIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 121.37258f, 57.37258f, 116.0f, 64.0f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(198.62741f, 116.0f, 204.0f, 121.37258f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 134.62741f, 198.62741f, 140.0f, 192.0f, 140.0f),
                    PathNode.LineTo(64.0f, 140.0f),
                    PathNode.CurveTo(57.37258f, 140.0f, 52.0f, 134.62741f, 52.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 92.0f),
                    PathNode.CurveTo(52.0f, 85.37258f, 57.37258f, 80.0f, 64.0f, 80.0f),
                    PathNode.LineTo(192.0f, 80.0f),
                    PathNode.CurveTo(198.62741f, 80.0f, 204.0f, 85.37258f, 204.0f, 92.0f),
                    PathNode.CurveTo(204.0f, 98.62742f, 198.62741f, 104.0f, 192.0f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.CurveTo(57.37258f, 104.0f, 52.0f, 98.62742f, 52.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 164.0f),
                    PathNode.CurveTo(52.0f, 157.37259f, 57.37258f, 152.0f, 64.0f, 152.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.CurveTo(78.62742f, 152.0f, 84.0f, 157.37259f, 84.0f, 164.0f),
                    PathNode.CurveTo(84.0f, 170.62741f, 78.62742f, 176.0f, 72.0f, 176.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(57.37258f, 176.0f, 52.0f, 170.62741f, 52.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 164.0f),
                    PathNode.CurveTo(160.0f, 170.62741f, 154.62741f, 176.0f, 148.0f, 176.0f),
                    PathNode.LineTo(108.0f, 176.0f),
                    PathNode.CurveTo(101.37258f, 176.0f, 96.0f, 170.62741f, 96.0f, 164.0f),
                    PathNode.CurveTo(96.0f, 157.37259f, 101.37258f, 152.0f, 108.0f, 152.0f),
                    PathNode.LineTo(148.0f, 152.0f),
                    PathNode.CurveTo(154.62741f, 152.0f, 160.0f, 157.37259f, 160.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 164.0f),
                    PathNode.CurveTo(204.0f, 170.62741f, 198.62741f, 176.0f, 192.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(177.37259f, 176.0f, 172.0f, 170.62741f, 172.0f, 164.0f),
                    PathNode.CurveTo(172.0f, 157.37259f, 177.37259f, 152.0f, 184.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(198.62741f, 152.0f, 204.0f, 157.37259f, 204.0f, 164.0f),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
