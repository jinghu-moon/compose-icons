package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryHigh: ImageVector
    get() {
        if (_batteryHigh != null) return _batteryHigh!!
        _batteryHigh = phosphorDuotoneIcon(
            name = "BatteryHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 184.83656f, 208.83656f, 192.0f, 200.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(23.163445f, 192.0f, 16.0f, 184.83656f, 16.0f, 176.0f),
                    PathNode.LineTo(16.0f, 80.0f),
                    PathNode.CurveTo(16.0f, 71.163445f, 23.163445f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(208.83656f, 64.0f, 216.0f, 71.163445f, 216.0f, 80.0f),
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
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(18.745167f, 56.0f, 8.0f, 66.74516f, 8.0f, 80.0f),
                    PathNode.LineTo(8.0f, 176.0f),
                    PathNode.CurveTo(8.0f, 189.25484f, 18.745167f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(213.25484f, 200.0f, 224.0f, 189.25484f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 66.74516f, 213.25484f, 56.0f, 200.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 180.41827f, 204.41827f, 184.0f, 200.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 75.58172f, 27.581722f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(204.41827f, 72.0f, 208.0f, 75.58172f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.CurveTo(144.0f, 164.41827f, 140.41827f, 168.0f, 136.0f, 168.0f),
                    PathNode.CurveTo(131.58173f, 168.0f, 128.0f, 164.41827f, 128.0f, 160.0f),
                    PathNode.LineTo(128.0f, 96.0f),
                    PathNode.CurveTo(128.0f, 91.58172f, 131.58173f, 88.0f, 136.0f, 88.0f),
                    PathNode.CurveTo(140.41827f, 88.0f, 144.0f, 91.58172f, 144.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 164.41827f, 100.41828f, 168.0f, 96.0f, 168.0f),
                    PathNode.CurveTo(91.58172f, 168.0f, 88.0f, 164.41827f, 88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 91.58172f, 91.58172f, 88.0f, 96.0f, 88.0f),
                    PathNode.CurveTo(100.41828f, 88.0f, 104.0f, 91.58172f, 104.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 96.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.CurveTo(64.0f, 164.41827f, 60.418278f, 168.0f, 56.0f, 168.0f),
                    PathNode.CurveTo(51.581722f, 168.0f, 48.0f, 164.41827f, 48.0f, 160.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 91.58172f, 51.581722f, 88.0f, 56.0f, 88.0f),
                    PathNode.CurveTo(60.418278f, 88.0f, 64.0f, 91.58172f, 64.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 96.0f),
                    PathNode.LineTo(256.0f, 160.0f),
                    PathNode.CurveTo(256.0f, 164.41827f, 252.41827f, 168.0f, 248.0f, 168.0f),
                    PathNode.CurveTo(243.58173f, 168.0f, 240.0f, 164.41827f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 91.58172f, 243.58173f, 88.0f, 248.0f, 88.0f),
                    PathNode.CurveTo(252.41827f, 88.0f, 256.0f, 91.58172f, 256.0f, 96.0f),
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
        return _batteryHigh!!
    }

private var _batteryHigh: ImageVector? = null
