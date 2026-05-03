package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorThinIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.LineTo(228.0f, 196.0f),
                    PathNode.LineTo(228.0f, 98.67f),
                    PathNode.CurveTo(228.00595f, 94.65299f, 226.00156f, 90.89944f, 222.66f, 88.67f),
                    PathNode.LineTo(134.66f, 30.0f),
                    PathNode.CurveTo(130.62756f, 27.309605f, 125.37245f, 27.309605f, 121.34f, 30.0f),
                    PathNode.LineTo(33.34f, 88.67f),
                    PathNode.CurveTo(29.998442f, 90.89944f, 27.994045f, 94.65299f, 28.0f, 98.67f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.LineTo(16.0f, 196.0f),
                    PathNode.CurveTo(13.790861f, 196.0f, 12.0f, 197.79086f, 12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 202.20914f, 13.790861f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 202.20914f, 244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 197.79086f, 242.20914f, 196.0f, 240.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 98.67f),
                    PathNode.CurveTo(35.99913f, 97.33218f, 36.66713f, 96.08249f, 37.78f, 95.34f),
                    PathNode.LineTo(125.78f, 36.68f),
                    PathNode.CurveTo(127.124146f, 35.783203f, 128.87585f, 35.783203f, 130.22f, 36.68f),
                    PathNode.LineTo(218.22f, 95.34f),
                    PathNode.CurveTo(219.33287f, 96.08249f, 220.00087f, 97.33218f, 220.0f, 98.67f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(188.0f, 196.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 133.79086f, 186.20914f, 132.0f, 184.0f, 132.0f),
                    PathNode.LineTo(72.0f, 132.0f),
                    PathNode.CurveTo(69.79086f, 132.0f, 68.0f, 133.79086f, 68.0f, 136.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 140.0f),
                    PathNode.LineTo(180.0f, 164.0f),
                    PathNode.LineTo(132.0f, 164.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 164.0f),
                    PathNode.LineTo(76.0f, 164.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 172.0f),
                    PathNode.LineTo(124.0f, 172.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 172.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(132.0f, 196.0f),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
