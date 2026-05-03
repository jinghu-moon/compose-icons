package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorBoldIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(154.21f, 133.69f),
                    PathNode.CurveTo(156.3965f, 137.2299f, 156.59328f, 141.6498f, 154.73f, 145.37f),
                    PathNode.LineTo(138.73f, 177.37f),
                    PathNode.CurveTo(136.849f, 181.26855f, 133.01419f, 183.85193f, 128.69456f, 184.13052f),
                    PathNode.CurveTo(124.37493f, 184.40912f, 120.24004f, 182.33977f, 117.87383f, 178.71512f),
                    PathNode.CurveTo(115.50763f, 175.0905f, 115.27689f, 170.47244f, 117.27f, 166.63f),
                    PathNode.LineTo(124.58f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(107.84064f, 151.9995f, 103.97815f, 149.84518f, 101.79222f, 146.30653f),
                    PathNode.CurveTo(99.606285f, 142.7679f, 99.40868f, 138.34966f, 101.27f, 134.63f),
                    PathNode.LineTo(117.27f, 102.63f),
                    PathNode.CurveTo(119.15099f, 98.73145f, 122.98581f, 96.14807f, 127.30544f, 95.86948f),
                    PathNode.CurveTo(131.62508f, 95.59088f, 135.75996f, 97.660255f, 138.12616f, 101.28488f),
                    PathNode.CurveTo(140.49237f, 104.90951f, 140.72311f, 109.52756f, 138.73f, 113.37f),
                    PathNode.LineTo(131.42f, 128.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(148.15947f, 127.99898f, 152.02281f, 130.15201f, 154.21f, 133.69f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(158.62741f, 24.0f, 164.0f, 18.627417f, 164.0f, 12.0f),
                    PathNode.CurveTo(164.0f, 5.372583f, 158.62741f, 0f, 152.0f, 0f),
                    PathNode.LineTo(104.0f, 0f),
                    PathNode.CurveTo(97.37258f, 0f, 92.0f, 5.372583f, 92.0f, 12.0f),
                    PathNode.CurveTo(92.0f, 18.627417f, 97.37258f, 24.0f, 104.0f, 24.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
