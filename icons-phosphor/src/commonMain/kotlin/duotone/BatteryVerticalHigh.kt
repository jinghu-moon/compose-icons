package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryVerticalHigh: ImageVector
    get() {
        if (_batteryVerticalHigh != null) return _batteryVerticalHigh!!
        _batteryVerticalHigh = phosphorDuotoneIcon(
            name = "BatteryVerticalHigh",
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
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 8.0f),
                    PathNode.CurveTo(88.0f, 3.581722f, 91.58172f, 0f, 96.0f, 0f),
                    PathNode.LineTo(160.0f, 0f),
                    PathNode.CurveTo(164.41827f, 0f, 168.0f, 3.581722f, 168.0f, 8.0f),
                    PathNode.CurveTo(168.0f, 12.418278f, 164.41827f, 16.0f, 160.0f, 16.0f),
                    PathNode.LineTo(96.0f, 16.0f),
                    PathNode.CurveTo(91.58172f, 16.0f, 88.0f, 12.418278f, 88.0f, 8.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(91.58172f, 112.0f, 88.0f, 115.58172f, 88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 124.41828f, 91.58172f, 128.0f, 96.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(164.41827f, 128.0f, 168.0f, 124.41828f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 115.58172f, 164.41827f, 112.0f, 160.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 155.58173f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 164.41827f, 91.58172f, 168.0f, 96.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(164.41827f, 168.0f, 168.0f, 164.41827f, 168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 155.58173f, 164.41827f, 152.0f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(91.58172f, 192.0f, 88.0f, 195.58173f, 88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 204.41827f, 91.58172f, 208.0f, 96.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(164.41827f, 208.0f, 168.0f, 204.41827f, 168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 195.58173f, 164.41827f, 192.0f, 160.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryVerticalHigh!!
    }

private var _batteryVerticalHigh: ImageVector? = null
