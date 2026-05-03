package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorBoldIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 28.0f),
                    PathNode.LineTo(92.0f, 28.0f),
                    PathNode.CurveTo(76.536026f, 28.0f, 64.0f, 40.53603f, 64.0f, 56.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 215.46397f, 76.536026f, 228.0f, 92.0f, 228.0f),
                    PathNode.LineTo(164.0f, 228.0f),
                    PathNode.CurveTo(179.46397f, 228.0f, 192.0f, 215.46397f, 192.0f, 200.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(192.0f, 40.53603f, 179.46397f, 28.0f, 164.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 202.20914f, 166.20914f, 204.0f, 164.0f, 204.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.CurveTo(89.79086f, 204.0f, 88.0f, 202.20914f, 88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 53.79086f, 89.79086f, 52.0f, 92.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.CurveTo(166.20914f, 52.0f, 168.0f, 53.79086f, 168.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 100.0f),
                    PathNode.LineTo(232.0f, 156.0f),
                    PathNode.CurveTo(232.0f, 162.62741f, 226.62741f, 168.0f, 220.0f, 168.0f),
                    PathNode.CurveTo(213.37259f, 168.0f, 208.0f, 162.62741f, 208.0f, 156.0f),
                    PathNode.LineTo(208.0f, 100.0f),
                    PathNode.CurveTo(208.0f, 93.37258f, 213.37259f, 88.0f, 220.0f, 88.0f),
                    PathNode.CurveTo(226.62741f, 88.0f, 232.0f, 93.37258f, 232.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 100.0f),
                    PathNode.LineTo(48.0f, 156.0f),
                    PathNode.CurveTo(48.0f, 162.62741f, 42.62742f, 168.0f, 36.0f, 168.0f),
                    PathNode.CurveTo(29.372583f, 168.0f, 24.0f, 162.62741f, 24.0f, 156.0f),
                    PathNode.LineTo(24.0f, 100.0f),
                    PathNode.CurveTo(24.0f, 93.37258f, 29.372583f, 88.0f, 36.0f, 88.0f),
                    PathNode.CurveTo(42.62742f, 88.0f, 48.0f, 93.37258f, 48.0f, 100.0f),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
