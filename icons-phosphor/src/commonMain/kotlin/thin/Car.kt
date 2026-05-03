package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorThinIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 108.0f),
                    PathNode.LineTo(226.6f, 108.0f),
                    PathNode.LineTo(197.77f, 43.13f),
                    PathNode.CurveTo(195.84006f, 38.783657f, 191.52554f, 35.987076f, 186.77f, 36.0f),
                    PathNode.LineTo(69.2f, 36.0f),
                    PathNode.CurveTo(64.44445f, 35.987076f, 60.129948f, 38.783657f, 58.2f, 43.13f),
                    PathNode.LineTo(29.4f, 108.0f),
                    PathNode.LineTo(16.0f, 108.0f),
                    PathNode.CurveTo(13.790861f, 108.0f, 12.0f, 109.79086f, 12.0f, 112.0f),
                    PathNode.CurveTo(12.0f, 114.20914f, 13.790861f, 116.0f, 16.0f, 116.0f),
                    PathNode.LineTo(28.0f, 116.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(70.62742f, 212.0f, 76.0f, 206.62741f, 76.0f, 200.0f),
                    PathNode.LineTo(76.0f, 180.0f),
                    PathNode.LineTo(180.0f, 180.0f),
                    PathNode.LineTo(180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 206.62741f, 185.37259f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.LineTo(240.0f, 116.0f),
                    PathNode.CurveTo(242.20914f, 116.0f, 244.0f, 114.20914f, 244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 109.79086f, 242.20914f, 108.0f, 240.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(65.54f, 46.38f),
                    PathNode.CurveTo(66.181335f, 44.93213f, 67.61645f, 43.998917f, 69.2f, 44.0f),
                    PathNode.LineTo(186.8f, 44.0f),
                    PathNode.CurveTo(188.38358f, 43.998917f, 189.81866f, 44.93213f, 190.46f, 46.38f),
                    PathNode.LineTo(217.84f, 108.0f),
                    PathNode.LineTo(38.16f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 202.20914f, 66.20914f, 204.0f, 64.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(68.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 204.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(189.79086f, 204.0f, 188.0f, 202.20914f, 188.0f, 200.0f),
                    PathNode.LineTo(188.0f, 180.0f),
                    PathNode.LineTo(220.0f, 180.0f),
                    PathNode.LineTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 172.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(36.0f, 116.0f),
                    PathNode.LineTo(220.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 141.79086f, 61.79086f, 140.0f, 64.0f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(82.20914f, 140.0f, 84.0f, 141.79086f, 84.0f, 144.0f),
                    PathNode.CurveTo(84.0f, 146.20914f, 82.20914f, 148.0f, 80.0f, 148.0f),
                    PathNode.LineTo(64.0f, 148.0f),
                    PathNode.CurveTo(61.79086f, 148.0f, 60.0f, 146.20914f, 60.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 141.79086f, 173.79086f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(192.0f, 140.0f),
                    PathNode.CurveTo(194.20914f, 140.0f, 196.0f, 141.79086f, 196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 146.20914f, 194.20914f, 148.0f, 192.0f, 148.0f),
                    PathNode.LineTo(176.0f, 148.0f),
                    PathNode.CurveTo(173.79086f, 148.0f, 172.0f, 146.20914f, 172.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _car!!
    }

private var _car: ImageVector? = null
