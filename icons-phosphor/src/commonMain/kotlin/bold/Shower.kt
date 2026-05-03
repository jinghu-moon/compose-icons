package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorBoldIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(68.0f, 236.0f),
                    PathNode.CurveTo(68.0f, 244.83656f, 60.836555f, 252.0f, 52.0f, 252.0f),
                    PathNode.CurveTo(43.163445f, 252.0f, 36.0f, 244.83656f, 36.0f, 236.0f),
                    PathNode.CurveTo(36.0f, 227.16344f, 43.163445f, 220.0f, 52.0f, 220.0f),
                    PathNode.CurveTo(60.836555f, 220.0f, 68.0f, 227.16344f, 68.0f, 236.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 188.0f),
                    PathNode.CurveTo(75.163445f, 188.0f, 68.0f, 195.16344f, 68.0f, 204.0f),
                    PathNode.CurveTo(68.0f, 212.83656f, 75.163445f, 220.0f, 84.0f, 220.0f),
                    PathNode.CurveTo(92.836555f, 220.0f, 100.0f, 212.83656f, 100.0f, 204.0f),
                    PathNode.CurveTo(100.0f, 195.16344f, 92.836555f, 188.0f, 84.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 188.0f),
                    PathNode.CurveTo(11.163444f, 188.0f, 4.0f, 195.16344f, 4.0f, 204.0f),
                    PathNode.CurveTo(4.0f, 212.83656f, 11.163444f, 220.0f, 20.0f, 220.0f),
                    PathNode.CurveTo(28.836555f, 220.0f, 36.0f, 212.83656f, 36.0f, 204.0f),
                    PathNode.CurveTo(36.0f, 195.16344f, 28.836555f, 188.0f, 20.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 188.0f),
                    PathNode.CurveTo(60.836555f, 188.0f, 68.0f, 180.83656f, 68.0f, 172.0f),
                    PathNode.CurveTo(68.0f, 163.16344f, 60.836555f, 156.0f, 52.0f, 156.0f),
                    PathNode.CurveTo(43.163445f, 156.0f, 36.0f, 163.16344f, 36.0f, 172.0f),
                    PathNode.CurveTo(36.0f, 180.83656f, 43.163445f, 188.0f, 52.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 40.0f),
                    PathNode.CurveTo(256.0f, 46.62742f, 250.62741f, 52.0f, 244.0f, 52.0f),
                    PathNode.LineTo(221.0f, 52.0f),
                    PathNode.LineTo(195.19f, 77.79f),
                    PathNode.LineTo(173.74f, 203.33f),
                    PathNode.CurveTo(172.48949f, 210.70628f, 167.22664f, 216.76784f, 160.09889f, 219.0413f),
                    PathNode.CurveTo(152.97116f, 221.31477f, 145.17053f, 219.41995f, 139.88f, 214.13f),
                    PathNode.LineTo(41.88f, 116.13f),
                    PathNode.CurveTo(36.577126f, 110.83507f, 34.679184f, 103.01995f, 36.962803f, 95.88258f),
                    PathNode.CurveTo(39.24642f, 88.74522f, 45.328392f, 83.48331f, 52.72f, 82.25f),
                    PathNode.LineTo(178.22f, 60.81f),
                    PathNode.LineTo(207.51f, 31.51f),
                    PathNode.CurveTo(209.76236f, 29.260138f, 212.81645f, 27.997498f, 216.0f, 28.0f),
                    PathNode.LineTo(244.0f, 28.0f),
                    PathNode.CurveTo(250.62741f, 28.0f, 256.0f, 33.37258f, 256.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(169.32f, 86.68f),
                    PathNode.LineTo(64.32f, 104.62f),
                    PathNode.LineTo(151.39f, 191.69f),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
