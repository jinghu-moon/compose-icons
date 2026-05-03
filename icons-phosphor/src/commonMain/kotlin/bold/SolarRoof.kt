package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorBoldIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.73f, 122.63f),
                    PathNode.LineTo(210.73f, 42.63f),
                    PathNode.CurveTo(208.69684f, 38.566933f, 204.54338f, 36.000538f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(51.456627f, 36.000538f, 47.303158f, 38.566933f, 45.27f, 42.63f),
                    PathNode.LineTo(5.27f, 122.63f),
                    PathNode.CurveTo(4.435266f, 124.29704f, 4.000437f, 126.13565f, 4.0f, 128.0f),
                    PathNode.LineTo(4.0f, 184.0f),
                    PathNode.CurveTo(4.0f, 195.0457f, 12.954305f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(232.0f, 204.0f),
                    PathNode.CurveTo(243.0457f, 204.0f, 252.0f, 195.0457f, 252.0f, 184.0f),
                    PathNode.LineTo(252.0f, 128.0f),
                    PathNode.CurveTo(251.99956f, 126.13565f, 251.56471f, 124.29704f, 250.73f, 122.63f),
                    PathNode.Close,
                    PathNode.MoveTo(96.58f, 60.0f),
                    PathNode.LineTo(104.58f, 76.0f),
                    PathNode.LineTo(83.42f, 76.0f),
                    PathNode.LineTo(75.42f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.58f, 60.0f),
                    PathNode.LineTo(152.58f, 76.0f),
                    PathNode.LineTo(131.42f, 76.0f),
                    PathNode.LineTo(123.42f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.42f, 116.0f),
                    PathNode.LineTo(95.42f, 100.0f),
                    PathNode.LineTo(116.58f, 100.0f),
                    PathNode.LineTo(124.58f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.42f, 116.0f),
                    PathNode.LineTo(143.42f, 100.0f),
                    PathNode.LineTo(164.58f, 100.0f),
                    PathNode.LineTo(172.58f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.42f, 116.0f),
                    PathNode.LineTo(191.42f, 100.0f),
                    PathNode.LineTo(212.58f, 100.0f),
                    PathNode.LineTo(220.58f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.58f, 76.0f),
                    PathNode.LineTo(179.42f, 76.0f),
                    PathNode.LineTo(171.42f, 60.0f),
                    PathNode.LineTo(192.58f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 130.83f),
                    PathNode.LineTo(56.0f, 74.83f),
                    PathNode.LineTo(84.0f, 130.83f),
                    PathNode.LineTo(84.0f, 180.0f),
                    PathNode.LineTo(28.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 180.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.LineTo(228.0f, 140.0f),
                    PathNode.LineTo(228.0f, 180.0f),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
