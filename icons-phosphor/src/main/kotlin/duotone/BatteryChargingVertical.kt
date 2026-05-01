package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorDuotoneIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 56.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(192.0f, 232.83656f, 184.83656f, 240.0f, 176.0f, 240.0f),
                    PathNode.LineTo(80.0f, 240.0f),
                    PathNode.CurveTo(71.163445f, 240.0f, 64.0f, 232.83656f, 64.0f, 224.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(64.0f, 47.163445f, 71.163445f, 40.0f, 80.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(184.83656f, 40.0f, 192.0f, 47.163445f, 192.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(150.81f, 131.79f),
                    PathNode.CurveTo(152.26996f, 134.15018f, 152.40242f, 137.0984f, 151.16f, 139.58f),
                    PathNode.LineTo(135.16f, 171.58f),
                    PathNode.CurveTo(133.18282f, 175.53436f, 128.37436f, 177.13718f, 124.42f, 175.16f),
                    PathNode.CurveTo(120.465645f, 173.18282f, 118.86282f, 168.37436f, 120.84f, 164.42f),
                    PathNode.LineTo(131.06f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.CurveTo(109.22591f, 144.00198f, 106.64879f, 142.56671f, 105.189896f, 140.2072f),
                    PathNode.CurveTo(103.731f, 137.8477f, 103.598595f, 134.90083f, 104.84f, 132.42f),
                    PathNode.LineTo(120.84f, 100.42f),
                    PathNode.CurveTo(122.81718f, 96.465645f, 127.62564f, 94.86282f, 131.58f, 96.84f),
                    PathNode.CurveTo(135.53436f, 98.81718f, 137.13718f, 103.62564f, 135.16f, 107.58f),
                    PathNode.LineTo(124.94f, 128.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(146.7735f, 127.99745f, 149.35045f, 129.43161f, 150.81f, 131.79f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 16.0f),
                    PathNode.LineTo(160.0f, 16.0f),
                    PathNode.CurveTo(164.41827f, 16.0f, 168.0f, 12.418278f, 168.0f, 8.0f),
                    PathNode.CurveTo(168.0f, 3.581722f, 164.41827f, 0f, 160.0f, 0f),
                    PathNode.LineTo(96.0f, 0f),
                    PathNode.CurveTo(91.58172f, 0f, 88.0f, 3.581722f, 88.0f, 8.0f),
                    PathNode.CurveTo(88.0f, 12.418278f, 91.58172f, 16.0f, 96.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 237.25484f, 189.25484f, 248.0f, 176.0f, 248.0f),
                    PathNode.LineTo(80.0f, 248.0f),
                    PathNode.CurveTo(66.74516f, 248.0f, 56.0f, 237.25484f, 56.0f, 224.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 42.745167f, 66.74516f, 32.0f, 80.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(189.25484f, 32.0f, 200.0f, 42.745167f, 200.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 51.581722f, 180.41827f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(75.58172f, 48.0f, 72.0f, 51.581722f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(72.0f, 228.41827f, 75.58172f, 232.0f, 80.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(180.41827f, 232.0f, 184.0f, 228.41827f, 184.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
