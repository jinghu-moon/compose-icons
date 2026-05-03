package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = phosphorBoldIcon(
            name = "DeviceTablet",
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
                    PathNode.MoveTo(60.0f, 84.0f),
                    PathNode.LineTo(196.0f, 84.0f),
                    PathNode.LineTo(196.0f, 172.0f),
                    PathNode.LineTo(60.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(194.20914f, 44.0f, 196.0f, 45.79086f, 196.0f, 48.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 61.79086f, 44.0f, 64.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(61.79086f, 212.0f, 60.0f, 210.20914f, 60.0f, 208.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(196.0f, 208.0f),
                    PathNode.CurveTo(196.0f, 210.20914f, 194.20914f, 212.0f, 192.0f, 212.0f),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
