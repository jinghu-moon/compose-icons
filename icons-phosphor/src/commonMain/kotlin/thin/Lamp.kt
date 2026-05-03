package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorThinIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.68f, 150.42f),
                    PathNode.LineTo(195.68f, 38.42f),
                    PathNode.CurveTo(195.04788f, 36.949814f, 193.60033f, 35.99789f, 192.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(62.39968f, 35.99789f, 60.952126f, 36.949814f, 60.32f, 38.42f),
                    PathNode.LineTo(12.32f, 150.42f),
                    PathNode.CurveTo(11.788194f, 151.65686f, 11.914286f, 153.07828f, 12.655516f, 154.20221f),
                    PathNode.CurveTo(13.396745f, 155.32614f, 14.653659f, 156.00177f, 16.0f, 156.0f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(93.79086f, 212.0f, 92.0f, 213.79086f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 218.20914f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(162.20914f, 220.0f, 164.0f, 218.20914f, 164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 213.79086f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 156.0f),
                    PathNode.LineTo(196.0f, 156.0f),
                    PathNode.LineTo(196.0f, 192.0f),
                    PathNode.CurveTo(196.0f, 194.20914f, 197.79086f, 196.0f, 200.0f, 196.0f),
                    PathNode.CurveTo(202.20914f, 196.0f, 204.0f, 194.20914f, 204.0f, 192.0f),
                    PathNode.LineTo(204.0f, 156.0f),
                    PathNode.LineTo(240.0f, 156.0f),
                    PathNode.CurveTo(241.34633f, 156.00177f, 242.60327f, 155.32614f, 243.34448f, 154.20221f),
                    PathNode.CurveTo(244.08571f, 153.07828f, 244.2118f, 151.65686f, 243.68f, 150.42f),
                    PathNode.Close,
                    PathNode.MoveTo(22.07f, 148.0f),
                    PathNode.LineTo(66.64f, 44.0f),
                    PathNode.LineTo(189.36f, 44.0f),
                    PathNode.LineTo(233.93f, 148.0f),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
