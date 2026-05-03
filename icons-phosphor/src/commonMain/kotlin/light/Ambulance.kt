package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorLightIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(82.0f, 120.0f),
                    PathNode.CurveTo(82.0f, 116.686295f, 84.686295f, 114.0f, 88.0f, 114.0f),
                    PathNode.LineTo(106.0f, 114.0f),
                    PathNode.LineTo(106.0f, 96.0f),
                    PathNode.CurveTo(106.0f, 92.686295f, 108.686295f, 90.0f, 112.0f, 90.0f),
                    PathNode.CurveTo(115.313705f, 90.0f, 118.0f, 92.686295f, 118.0f, 96.0f),
                    PathNode.LineTo(118.0f, 114.0f),
                    PathNode.LineTo(136.0f, 114.0f),
                    PathNode.CurveTo(139.3137f, 114.0f, 142.0f, 116.686295f, 142.0f, 120.0f),
                    PathNode.CurveTo(142.0f, 123.313705f, 139.3137f, 126.0f, 136.0f, 126.0f),
                    PathNode.LineTo(118.0f, 126.0f),
                    PathNode.LineTo(118.0f, 144.0f),
                    PathNode.CurveTo(118.0f, 147.3137f, 115.313705f, 150.0f, 112.0f, 150.0f),
                    PathNode.CurveTo(108.686295f, 150.0f, 106.0f, 147.3137f, 106.0f, 144.0f),
                    PathNode.LineTo(106.0f, 126.0f),
                    PathNode.LineTo(88.0f, 126.0f),
                    PathNode.CurveTo(84.686295f, 126.0f, 82.0f, 123.313705f, 82.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.0f, 120.0f),
                    PathNode.LineTo(254.0f, 184.0f),
                    PathNode.CurveTo(254.0f, 191.73198f, 247.73198f, 198.0f, 240.0f, 198.0f),
                    PathNode.LineTo(221.4f, 198.0f),
                    PathNode.CurveTo(218.56085f, 211.98195f, 206.2673f, 222.03008f, 192.0f, 222.03008f),
                    PathNode.CurveTo(177.7327f, 222.03008f, 165.43915f, 211.98195f, 162.6f, 198.0f),
                    PathNode.LineTo(109.4f, 198.0f),
                    PathNode.CurveTo(106.560844f, 211.98195f, 94.26729f, 222.03008f, 80.0f, 222.03008f),
                    PathNode.CurveTo(65.73271f, 222.03008f, 53.439156f, 211.98195f, 50.6f, 198.0f),
                    PathNode.LineTo(32.0f, 198.0f),
                    PathNode.CurveTo(24.268015f, 198.0f, 18.0f, 191.73198f, 18.0f, 184.0f),
                    PathNode.LineTo(18.0f, 72.0f),
                    PathNode.CurveTo(18.0f, 64.26801f, 24.268015f, 58.0f, 32.0f, 58.0f),
                    PathNode.LineTo(184.0f, 58.0f),
                    PathNode.CurveTo(187.3137f, 58.0f, 190.0f, 60.68629f, 190.0f, 64.0f),
                    PathNode.LineTo(190.0f, 74.0f),
                    PathNode.LineTo(226.58f, 74.0f),
                    PathNode.CurveTo(232.31099f, 73.97985f, 237.46947f, 77.47175f, 239.58f, 82.8f),
                    PathNode.LineTo(253.58f, 117.8f),
                    PathNode.CurveTo(253.85457f, 118.50113f, 253.99698f, 119.24703f, 254.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 86.0f),
                    PathNode.LineTo(190.0f, 114.0f),
                    PathNode.LineTo(239.14f, 114.0f),
                    PathNode.LineTo(228.44f, 87.26f),
                    PathNode.CurveTo(228.13675f, 86.49856f, 227.39961f, 85.99921f, 226.58f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 186.0f),
                    PathNode.LineTo(50.6f, 186.0f),
                    PathNode.CurveTo(53.439156f, 172.01805f, 65.73271f, 161.96992f, 80.0f, 161.96992f),
                    PathNode.CurveTo(94.26729f, 161.96992f, 106.560844f, 172.01805f, 109.4f, 186.0f),
                    PathNode.LineTo(162.6f, 186.0f),
                    PathNode.CurveTo(164.4153f, 177.20522f, 170.06267f, 169.68028f, 178.0f, 165.48f),
                    PathNode.LineTo(178.0f, 70.0f),
                    PathNode.LineTo(32.0f, 70.0f),
                    PathNode.CurveTo(30.89543f, 70.0f, 30.0f, 70.89543f, 30.0f, 72.0f),
                    PathNode.LineTo(30.0f, 184.0f),
                    PathNode.CurveTo(30.0f, 185.10457f, 30.89543f, 186.0f, 32.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 192.0f),
                    PathNode.CurveTo(98.0f, 182.05887f, 89.94112f, 174.0f, 80.0f, 174.0f),
                    PathNode.CurveTo(70.05888f, 174.0f, 62.0f, 182.05887f, 62.0f, 192.0f),
                    PathNode.CurveTo(62.0f, 201.94113f, 70.05888f, 210.0f, 80.0f, 210.0f),
                    PathNode.CurveTo(89.94112f, 210.0f, 98.0f, 201.94113f, 98.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 182.05887f, 201.94113f, 174.0f, 192.0f, 174.0f),
                    PathNode.CurveTo(182.05887f, 174.0f, 174.0f, 182.05887f, 174.0f, 192.0f),
                    PathNode.CurveTo(174.0f, 201.94113f, 182.05887f, 210.0f, 192.0f, 210.0f),
                    PathNode.CurveTo(201.94113f, 210.0f, 210.0f, 201.94113f, 210.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.0f, 184.0f),
                    PathNode.LineTo(242.0f, 126.0f),
                    PathNode.LineTo(190.0f, 126.0f),
                    PathNode.LineTo(190.0f, 162.07f),
                    PathNode.CurveTo(190.66f, 162.07f, 191.33f, 162.0f, 192.0f, 162.0f),
                    PathNode.CurveTo(206.25114f, 162.01645f, 218.5308f, 172.04065f, 221.4f, 186.0f),
                    PathNode.LineTo(240.0f, 186.0f),
                    PathNode.CurveTo(241.10457f, 186.0f, 242.0f, 185.10457f, 242.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
