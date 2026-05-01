package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceTabletSpeaker: ImageVector
    get() {
        if (_deviceTabletSpeaker != null) return _deviceTabletSpeaker!!
        _deviceTabletSpeaker = phosphorLightIcon(
            name = "DeviceTabletSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 26.0f),
                    PathNode.LineTo(64.0f, 26.0f),
                    PathNode.CurveTo(51.849735f, 26.0f, 42.0f, 35.849735f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 220.15027f, 51.849735f, 230.0f, 64.0f, 230.0f),
                    PathNode.LineTo(192.0f, 230.0f),
                    PathNode.CurveTo(204.15027f, 230.0f, 214.0f, 220.15027f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 48.0f),
                    PathNode.CurveTo(214.0f, 35.849735f, 204.15027f, 26.0f, 192.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 208.0f),
                    PathNode.CurveTo(202.0f, 213.52284f, 197.52284f, 218.0f, 192.0f, 218.0f),
                    PathNode.LineTo(64.0f, 218.0f),
                    PathNode.CurveTo(58.477154f, 218.0f, 54.0f, 213.52284f, 54.0f, 208.0f),
                    PathNode.LineTo(54.0f, 48.0f),
                    PathNode.CurveTo(54.0f, 42.477154f, 58.477154f, 38.0f, 64.0f, 38.0f),
                    PathNode.LineTo(192.0f, 38.0f),
                    PathNode.CurveTo(197.52284f, 38.0f, 202.0f, 42.477154f, 202.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 64.0f),
                    PathNode.CurveTo(166.0f, 67.313705f, 163.3137f, 70.0f, 160.0f, 70.0f),
                    PathNode.LineTo(96.0f, 70.0f),
                    PathNode.CurveTo(92.686295f, 70.0f, 90.0f, 67.313705f, 90.0f, 64.0f),
                    PathNode.CurveTo(90.0f, 60.68629f, 92.686295f, 58.0f, 96.0f, 58.0f),
                    PathNode.LineTo(160.0f, 58.0f),
                    PathNode.CurveTo(163.3137f, 58.0f, 166.0f, 60.68629f, 166.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceTabletSpeaker!!
    }

private var _deviceTabletSpeaker: ImageVector? = null
