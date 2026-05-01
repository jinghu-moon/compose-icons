package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorBoldIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 60.0f),
                    PathNode.LineTo(232.0f, 196.0f),
                    PathNode.CurveTo(232.0f, 207.0457f, 223.0457f, 216.0f, 212.0f, 216.0f),
                    PathNode.LineTo(172.0f, 216.0f),
                    PathNode.CurveTo(165.37259f, 216.0f, 160.0f, 210.62741f, 160.0f, 204.0f),
                    PathNode.CurveTo(160.0f, 197.37259f, 165.37259f, 192.0f, 172.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 68.0f),
                    PathNode.CurveTo(48.0f, 74.62742f, 42.62742f, 80.0f, 36.0f, 80.0f),
                    PathNode.CurveTo(29.372583f, 80.0f, 24.0f, 74.62742f, 24.0f, 68.0f),
                    PathNode.LineTo(24.0f, 60.0f),
                    PathNode.CurveTo(24.0f, 48.954304f, 32.954304f, 40.0f, 44.0f, 40.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(223.0457f, 40.0f, 232.0f, 48.954304f, 232.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 176.0f),
                    PathNode.CurveTo(29.372583f, 176.0f, 24.0f, 181.37259f, 24.0f, 188.0f),
                    PathNode.CurveTo(24.0f, 194.62741f, 29.372583f, 200.0f, 36.0f, 200.0f),
                    PathNode.CurveTo(38.20914f, 200.0f, 40.0f, 201.79086f, 40.0f, 204.0f),
                    PathNode.CurveTo(40.0f, 210.62741f, 45.37258f, 216.0f, 52.0f, 216.0f),
                    PathNode.CurveTo(58.62742f, 216.0f, 64.0f, 210.62741f, 64.0f, 204.0f),
                    PathNode.CurveTo(64.0f, 188.53603f, 51.46397f, 176.0f, 36.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 136.0f),
                    PathNode.CurveTo(29.372583f, 136.0f, 24.0f, 141.37259f, 24.0f, 148.0f),
                    PathNode.CurveTo(24.0f, 154.62741f, 29.372583f, 160.0f, 36.0f, 160.0f),
                    PathNode.CurveTo(60.28911f, 160.02756f, 79.97244f, 179.71089f, 80.0f, 204.0f),
                    PathNode.CurveTo(80.0f, 210.62741f, 85.37258f, 216.0f, 92.0f, 216.0f),
                    PathNode.CurveTo(98.62742f, 216.0f, 104.0f, 210.62741f, 104.0f, 204.0f),
                    PathNode.CurveTo(103.96142f, 166.46065f, 73.53937f, 136.03859f, 36.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 96.0f),
                    PathNode.CurveTo(29.372583f, 96.0f, 24.0f, 101.37258f, 24.0f, 108.0f),
                    PathNode.CurveTo(24.0f, 114.62742f, 29.372583f, 120.0f, 36.0f, 120.0f),
                    PathNode.CurveTo(82.37135f, 120.04961f, 119.95039f, 157.62865f, 120.0f, 204.0f),
                    PathNode.CurveTo(120.0f, 210.62741f, 125.37258f, 216.0f, 132.0f, 216.0f),
                    PathNode.CurveTo(138.62741f, 216.0f, 144.0f, 210.62741f, 144.0f, 204.0f),
                    PathNode.CurveTo(143.93387f, 144.38066f, 95.61934f, 96.06613f, 36.0f, 96.0f),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
