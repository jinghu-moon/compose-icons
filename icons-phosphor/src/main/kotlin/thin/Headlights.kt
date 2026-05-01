package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorThinIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 77.79086f, 165.79086f, 76.0f, 168.0f, 76.0f),
                    PathNode.LineTo(240.0f, 76.0f),
                    PathNode.CurveTo(242.20914f, 76.0f, 244.0f, 77.79086f, 244.0f, 80.0f),
                    PathNode.CurveTo(244.0f, 82.20914f, 242.20914f, 84.0f, 240.0f, 84.0f),
                    PathNode.LineTo(168.0f, 84.0f),
                    PathNode.CurveTo(165.79086f, 84.0f, 164.0f, 82.20914f, 164.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 172.0f),
                    PathNode.LineTo(168.0f, 172.0f),
                    PathNode.CurveTo(165.79086f, 172.0f, 164.0f, 173.79086f, 164.0f, 176.0f),
                    PathNode.CurveTo(164.0f, 178.20914f, 165.79086f, 180.0f, 168.0f, 180.0f),
                    PathNode.LineTo(240.0f, 180.0f),
                    PathNode.CurveTo(242.20914f, 180.0f, 244.0f, 178.20914f, 244.0f, 176.0f),
                    PathNode.CurveTo(244.0f, 173.79086f, 242.20914f, 172.0f, 240.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 108.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.CurveTo(165.79086f, 108.0f, 164.0f, 109.79086f, 164.0f, 112.0f),
                    PathNode.CurveTo(164.0f, 114.20914f, 165.79086f, 116.0f, 168.0f, 116.0f),
                    PathNode.LineTo(240.0f, 116.0f),
                    PathNode.CurveTo(242.20914f, 116.0f, 244.0f, 114.20914f, 244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 109.79086f, 242.20914f, 108.0f, 240.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 140.0f),
                    PathNode.LineTo(168.0f, 140.0f),
                    PathNode.CurveTo(165.79086f, 140.0f, 164.0f, 141.79086f, 164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 146.20914f, 165.79086f, 148.0f, 168.0f, 148.0f),
                    PathNode.LineTo(240.0f, 148.0f),
                    PathNode.CurveTo(242.20914f, 148.0f, 244.0f, 146.20914f, 244.0f, 144.0f),
                    PathNode.CurveTo(244.0f, 141.79086f, 242.20914f, 140.0f, 240.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 64.0f),
                    PathNode.LineTo(140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 198.62741f, 134.62741f, 204.0f, 128.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(67.74265f, 204.0006f, 48.323334f, 195.9139f, 34.05378f, 181.53545f),
                    PathNode.CurveTo(19.784224f, 167.157f, 11.845405f, 147.67676f, 12.0f, 127.42f),
                    PathNode.CurveTo(12.31f, 85.83f, 46.81f, 52.0f, 88.9f, 52.0f),
                    PathNode.LineTo(128.0f, 52.0f),
                    PathNode.CurveTo(134.62741f, 52.0f, 140.0f, 57.37258f, 140.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 64.0f),
                    PathNode.CurveTo(132.0f, 61.79086f, 130.20914f, 60.0f, 128.0f, 60.0f),
                    PathNode.LineTo(88.9f, 60.0f),
                    PathNode.CurveTo(51.19f, 60.0f, 20.28f, 90.27f, 20.0f, 127.48f),
                    PathNode.CurveTo(19.861395f, 145.60464f, 26.964426f, 163.0346f, 39.731953f, 175.89977f),
                    PathNode.CurveTo(52.49948f, 188.76492f, 69.87482f, 196.00053f, 88.0f, 196.0f),
                    PathNode.LineTo(128.0f, 196.0f),
                    PathNode.CurveTo(130.20914f, 196.0f, 132.0f, 194.20914f, 132.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headlights!!
    }

private var _headlights: ImageVector? = null
