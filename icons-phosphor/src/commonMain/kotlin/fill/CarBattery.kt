package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorFillIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 47.163445f, 200.83656f, 40.0f, 192.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(151.16344f, 40.0f, 144.0f, 47.163445f, 144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 47.163445f, 104.836555f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(55.163445f, 40.0f, 48.0f, 47.163445f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(23.163445f, 72.0f, 16.0f, 79.163445f, 16.0f, 88.0f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 192.83656f, 23.163445f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(232.83656f, 200.0f, 240.0f, 192.83656f, 240.0f, 184.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 79.163445f, 232.83656f, 72.0f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(67.58172f, 144.0f, 64.0f, 140.41827f, 64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 131.58173f, 67.58172f, 128.0f, 72.0f, 128.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.CurveTo(108.41828f, 128.0f, 112.0f, 131.58173f, 112.0f, 136.0f),
                    PathNode.CurveTo(112.0f, 140.41827f, 108.41828f, 144.0f, 104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 144.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 156.41827f, 172.41827f, 160.0f, 168.0f, 160.0f),
                    PathNode.CurveTo(163.58173f, 160.0f, 160.0f, 156.41827f, 160.0f, 152.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.CurveTo(147.58173f, 144.0f, 144.0f, 140.41827f, 144.0f, 136.0f),
                    PathNode.CurveTo(144.0f, 131.58173f, 147.58173f, 128.0f, 152.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 115.58172f, 163.58173f, 112.0f, 168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 115.58172f, 176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.CurveTo(188.41827f, 128.0f, 192.0f, 131.58173f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 140.41827f, 188.41827f, 144.0f, 184.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
