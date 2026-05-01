package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryVerticalEmpty: ImageVector
    get() {
        if (_batteryVerticalEmpty != null) return _batteryVerticalEmpty!!
        _batteryVerticalEmpty = phosphorBoldIcon(
            name = "BatteryVerticalEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 12.0f),
                    PathNode.CurveTo(92.0f, 5.372583f, 97.37258f, 0f, 104.0f, 0f),
                    PathNode.LineTo(152.0f, 0f),
                    PathNode.CurveTo(158.62741f, 0f, 164.0f, 5.372583f, 164.0f, 12.0f),
                    PathNode.CurveTo(164.0f, 18.627417f, 158.62741f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(97.37258f, 24.0f, 92.0f, 18.627417f, 92.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 60.0f),
                    PathNode.LineTo(204.0f, 228.0f),
                    PathNode.CurveTo(204.0f, 243.46397f, 191.46397f, 256.0f, 176.0f, 256.0f),
                    PathNode.LineTo(80.0f, 256.0f),
                    PathNode.CurveTo(64.536026f, 256.0f, 52.0f, 243.46397f, 52.0f, 228.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.CurveTo(52.0f, 44.53603f, 64.536026f, 32.0f, 80.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(191.46397f, 32.0f, 204.0f, 44.53603f, 204.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 60.0f),
                    PathNode.CurveTo(180.0f, 57.79086f, 178.20914f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(77.79086f, 56.0f, 76.0f, 57.79086f, 76.0f, 60.0f),
                    PathNode.LineTo(76.0f, 228.0f),
                    PathNode.CurveTo(76.0f, 230.20914f, 77.79086f, 232.0f, 80.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(178.20914f, 232.0f, 180.0f, 230.20914f, 180.0f, 228.0f),
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
        return _batteryVerticalEmpty!!
    }

private var _batteryVerticalEmpty: ImageVector? = null
