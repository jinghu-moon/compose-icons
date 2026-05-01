package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceTabletSpeaker: ImageVector
    get() {
        if (_deviceTabletSpeaker != null) return _deviceTabletSpeaker!!
        _deviceTabletSpeaker = phosphorBoldIcon(
            name = "DeviceTabletSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 20.0f),
                    PathNode.LineTo(64.0f, 20.0f),
                    PathNode.CurveTo(48.53603f, 20.0f, 36.0f, 32.536026f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 223.46397f, 48.53603f, 236.0f, 64.0f, 236.0f),
                    PathNode.LineTo(192.0f, 236.0f),
                    PathNode.CurveTo(207.46397f, 236.0f, 220.0f, 223.46397f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 32.536026f, 207.46397f, 20.0f, 192.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 208.0f),
                    PathNode.CurveTo(196.0f, 210.20914f, 194.20914f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(61.79086f, 212.0f, 60.0f, 210.20914f, 60.0f, 208.0f),
                    PathNode.LineTo(60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 61.79086f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(194.20914f, 44.0f, 196.0f, 45.79086f, 196.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 72.0f),
                    PathNode.CurveTo(172.0f, 78.62742f, 166.62741f, 84.0f, 160.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(89.37258f, 84.0f, 84.0f, 78.62742f, 84.0f, 72.0f),
                    PathNode.CurveTo(84.0f, 65.37258f, 89.37258f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(166.62741f, 60.0f, 172.0f, 65.37258f, 172.0f, 72.0f),
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
        return _deviceTabletSpeaker!!
    }

private var _deviceTabletSpeaker: ImageVector? = null
