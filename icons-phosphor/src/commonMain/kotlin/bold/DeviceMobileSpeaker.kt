package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobileSpeaker: ImageVector
    get() {
        if (_deviceMobileSpeaker != null) return _deviceMobileSpeaker!!
        _deviceMobileSpeaker = phosphorBoldIcon(
            name = "DeviceMobileSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 12.0f),
                    PathNode.LineTo(80.0f, 12.0f),
                    PathNode.CurveTo(64.536026f, 12.0f, 52.0f, 24.536028f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 231.46397f, 64.536026f, 244.0f, 80.0f, 244.0f),
                    PathNode.LineTo(176.0f, 244.0f),
                    PathNode.CurveTo(191.46397f, 244.0f, 204.0f, 231.46397f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 24.536028f, 191.46397f, 12.0f, 176.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 218.20914f, 178.20914f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(77.79086f, 220.0f, 76.0f, 218.20914f, 76.0f, 216.0f),
                    PathNode.LineTo(76.0f, 40.0f),
                    PathNode.CurveTo(76.0f, 37.79086f, 77.79086f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(178.20914f, 36.0f, 180.0f, 37.79086f, 180.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 64.0f),
                    PathNode.CurveTo(164.0f, 70.62742f, 158.62741f, 76.0f, 152.0f, 76.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(97.37258f, 76.0f, 92.0f, 70.62742f, 92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 57.37258f, 97.37258f, 52.0f, 104.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(158.62741f, 52.0f, 164.0f, 57.37258f, 164.0f, 64.0f),
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
        return _deviceMobileSpeaker!!
    }

private var _deviceMobileSpeaker: ImageVector? = null
