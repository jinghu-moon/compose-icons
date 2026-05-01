package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorBoldIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 134.62741f, 146.62741f, 140.0f, 140.0f, 140.0f),
                    PathNode.LineTo(128.0f, 140.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.CurveTo(128.0f, 158.62741f, 122.62742f, 164.0f, 116.0f, 164.0f),
                    PathNode.CurveTo(109.37258f, 164.0f, 104.0f, 158.62741f, 104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.CurveTo(85.37258f, 140.0f, 80.0f, 134.62741f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 121.37258f, 85.37258f, 116.0f, 92.0f, 116.0f),
                    PathNode.LineTo(104.0f, 116.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 97.37258f, 109.37258f, 92.0f, 116.0f, 92.0f),
                    PathNode.CurveTo(122.62742f, 92.0f, 128.0f, 97.37258f, 128.0f, 104.0f),
                    PathNode.LineTo(128.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.CurveTo(146.62741f, 116.0f, 152.0f, 121.37258f, 152.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 191.46397f, 211.46397f, 204.0f, 196.0f, 204.0f),
                    PathNode.LineTo(28.0f, 204.0f),
                    PathNode.CurveTo(12.536027f, 204.0f, 0f, 191.46397f, 0f, 176.0f),
                    PathNode.LineTo(0f, 80.0f),
                    PathNode.CurveTo(0f, 64.536026f, 12.536027f, 52.0f, 28.0f, 52.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.CurveTo(211.46397f, 52.0f, 224.0f, 64.536026f, 224.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 77.79086f, 198.20914f, 76.0f, 196.0f, 76.0f),
                    PathNode.LineTo(28.0f, 76.0f),
                    PathNode.CurveTo(25.790861f, 76.0f, 24.0f, 77.79086f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 178.20914f, 25.790861f, 180.0f, 28.0f, 180.0f),
                    PathNode.LineTo(196.0f, 180.0f),
                    PathNode.CurveTo(198.20914f, 180.0f, 200.0f, 178.20914f, 200.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 92.0f),
                    PathNode.CurveTo(237.37259f, 92.0f, 232.0f, 97.37258f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.0f, 158.62741f, 237.37259f, 164.0f, 244.0f, 164.0f),
                    PathNode.CurveTo(250.62741f, 164.0f, 256.0f, 158.62741f, 256.0f, 152.0f),
                    PathNode.LineTo(256.0f, 104.0f),
                    PathNode.CurveTo(256.0f, 97.37258f, 250.62741f, 92.0f, 244.0f, 92.0f),
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
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
