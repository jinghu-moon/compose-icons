package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorBoldIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 140.0f),
                    PathNode.CurveTo(200.0f, 146.62741f, 194.62741f, 152.0f, 188.0f, 152.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 156.0f),
                    PathNode.CurveTo(184.0f, 162.62741f, 178.62741f, 168.0f, 172.0f, 168.0f),
                    PathNode.CurveTo(165.37259f, 168.0f, 160.0f, 162.62741f, 160.0f, 156.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.CurveTo(149.37259f, 152.0f, 144.0f, 146.62741f, 144.0f, 140.0f),
                    PathNode.CurveTo(144.0f, 133.37259f, 149.37259f, 128.0f, 156.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(160.0f, 117.37258f, 165.37259f, 112.0f, 172.0f, 112.0f),
                    PathNode.CurveTo(178.62741f, 112.0f, 184.0f, 117.37258f, 184.0f, 124.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(188.0f, 128.0f),
                    PathNode.CurveTo(194.62741f, 128.0f, 200.0f, 133.37259f, 200.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 128.0f),
                    PathNode.LineTo(68.0f, 128.0f),
                    PathNode.CurveTo(61.37258f, 128.0f, 56.0f, 133.37259f, 56.0f, 140.0f),
                    PathNode.CurveTo(56.0f, 146.62741f, 61.37258f, 152.0f, 68.0f, 152.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.CurveTo(106.62742f, 152.0f, 112.0f, 146.62741f, 112.0f, 140.0f),
                    PathNode.CurveTo(112.0f, 133.37259f, 106.62742f, 128.0f, 100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 92.0f),
                    PathNode.LineTo(244.0f, 184.0f),
                    PathNode.CurveTo(244.0f, 195.0457f, 235.0457f, 204.0f, 224.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(20.954306f, 204.0f, 12.0f, 195.0457f, 12.0f, 184.0f),
                    PathNode.LineTo(12.0f, 92.0f),
                    PathNode.CurveTo(12.0f, 80.95431f, 20.954306f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 44.954304f, 52.954304f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(107.04569f, 36.0f, 116.0f, 44.954304f, 116.0f, 56.0f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.LineTo(140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.CurveTo(140.0f, 44.954304f, 148.9543f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(203.0457f, 36.0f, 212.0f, 44.954304f, 212.0f, 56.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(235.0457f, 72.0f, 244.0f, 80.95431f, 244.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 72.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.LineTo(188.0f, 60.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 72.0f),
                    PathNode.LineTo(92.0f, 72.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(68.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 96.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(220.0f, 180.0f),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
