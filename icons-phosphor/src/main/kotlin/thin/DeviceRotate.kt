package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorThinIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 218.83f),
                    PathNode.LineTo(178.83f, 242.83f),
                    PathNode.CurveTo(177.26703f, 244.39296f, 174.73297f, 244.39296f, 173.17f, 242.83f),
                    PathNode.CurveTo(171.60704f, 241.26703f, 171.60704f, 238.73297f, 173.17f, 237.17f),
                    PathNode.LineTo(190.34f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(68.95431f, 220.0f, 60.0f, 211.0457f, 60.0f, 200.0f),
                    PathNode.LineTo(60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 101.79086f, 61.79086f, 100.0f, 64.0f, 100.0f),
                    PathNode.CurveTo(66.20914f, 100.0f, 68.0f, 101.79086f, 68.0f, 104.0f),
                    PathNode.LineTo(68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 206.62741f, 73.37258f, 212.0f, 80.0f, 212.0f),
                    PathNode.LineTo(190.34f, 212.0f),
                    PathNode.LineTo(173.17f, 194.83f),
                    PathNode.CurveTo(171.60704f, 193.26703f, 171.60704f, 190.73297f, 173.17f, 189.17f),
                    PathNode.CurveTo(174.73297f, 187.60704f, 177.26703f, 187.60704f, 178.83f, 189.17f),
                    PathNode.LineTo(202.83f, 213.17f),
                    PathNode.CurveTo(203.58112f, 213.92027f, 204.00314f, 214.93837f, 204.00314f, 216.0f),
                    PathNode.CurveTo(204.00314f, 217.06163f, 203.58112f, 218.07973f, 202.83f, 218.83f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 68.0f),
                    PathNode.CurveTo(81.61882f, 68.001274f, 83.07882f, 67.02669f, 83.69849f, 65.53116f),
                    PathNode.CurveTo(84.31816f, 64.03563f, 83.97532f, 62.314045f, 82.83f, 61.17f),
                    PathNode.LineTo(65.66f, 44.0f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(182.62741f, 44.0f, 188.0f, 49.37258f, 188.0f, 56.0f),
                    PathNode.LineTo(188.0f, 152.0f),
                    PathNode.CurveTo(188.0f, 154.20914f, 189.79086f, 156.0f, 192.0f, 156.0f),
                    PathNode.CurveTo(194.20914f, 156.0f, 196.0f, 154.20914f, 196.0f, 152.0f),
                    PathNode.LineTo(196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 44.954304f, 187.0457f, 36.0f, 176.0f, 36.0f),
                    PathNode.LineTo(65.66f, 36.0f),
                    PathNode.LineTo(82.83f, 18.83f),
                    PathNode.CurveTo(84.39297f, 17.267035f, 84.39297f, 14.732965f, 82.83f, 13.17f),
                    PathNode.CurveTo(81.26704f, 11.607035f, 78.73296f, 11.607034f, 77.17f, 13.17f),
                    PathNode.LineTo(53.17f, 37.17f),
                    PathNode.CurveTo(52.41889f, 37.920273f, 51.996853f, 38.938362f, 51.996853f, 40.0f),
                    PathNode.CurveTo(51.996853f, 41.061638f, 52.41889f, 42.079727f, 53.17f, 42.83f),
                    PathNode.LineTo(77.17f, 66.83f),
                    PathNode.CurveTo(77.92079f, 67.57996f, 78.93881f, 68.00083f, 80.0f, 68.0f),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
