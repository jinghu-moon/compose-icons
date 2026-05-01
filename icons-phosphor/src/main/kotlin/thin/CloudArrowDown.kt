package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorThinIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.05243f, 146.18356f, 238.15208f, 163.8846f, 227.2f, 178.4f),
                    PathNode.CurveTo(225.87451f, 180.16731f, 223.36731f, 180.52548f, 221.6f, 179.2f),
                    PathNode.CurveTo(219.83269f, 177.87451f, 219.47452f, 175.36731f, 220.8f, 173.6f),
                    PathNode.CurveTo(240.6402f, 147.14642f, 241.09882f, 110.900055f, 221.93428f, 83.952934f),
                    PathNode.CurveTo(202.76976f, 57.005817f, 168.3807f, 45.542797f, 136.88081f, 55.601776f),
                    PathNode.CurveTo(105.38091f, 65.66075f, 84.0f, 94.933f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 130.20914f, 82.20914f, 132.0f, 80.0f, 132.0f),
                    PathNode.CurveTo(77.79086f, 132.0f, 76.0f, 130.20914f, 76.0f, 128.0f),
                    PathNode.CurveTo(75.99632f, 118.71912f, 77.54085f, 109.50263f, 80.57f, 100.73f),
                    PathNode.CurveTo(61.2116f, 97.451935f, 41.657383f, 105.35685f, 30.015507f, 121.16698f),
                    PathNode.CurveTo(18.37363f, 136.9771f, 16.629313f, 157.99644f, 25.505835f, 175.50931f),
                    PathNode.CurveTo(34.382355f, 193.02219f, 52.366062f, 204.04224f, 72.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(98.20914f, 204.0f, 100.0f, 205.79086f, 100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 210.20914f, 98.20914f, 212.0f, 96.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(49.17138f, 211.9923f, 28.324936f, 199.03049f, 18.21929f, 178.56047f),
                    PathNode.CurveTo(8.113642f, 158.09045f, 10.499841f, 133.65913f, 24.375326f, 115.53135f),
                    PathNode.CurveTo(38.25081f, 97.40356f, 61.21132f, 88.72036f, 83.61f, 93.13f),
                    PathNode.CurveTo(100.03446f, 57.21734f, 139.25655f, 37.594524f, 177.8454f, 45.98403f),
                    PathNode.CurveTo(216.43423f, 54.37354f, 243.9687f, 88.50973f, 244.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.17f, 173.17f),
                    PathNode.LineTo(156.0f, 198.34f),
                    PathNode.LineTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 125.79086f, 154.20914f, 124.0f, 152.0f, 124.0f),
                    PathNode.CurveTo(149.79086f, 124.0f, 148.0f, 125.79086f, 148.0f, 128.0f),
                    PathNode.LineTo(148.0f, 198.34f),
                    PathNode.LineTo(122.83f, 173.17f),
                    PathNode.CurveTo(121.26704f, 171.60704f, 118.73296f, 171.60704f, 117.17f, 173.17f),
                    PathNode.CurveTo(115.60703f, 174.73297f, 115.60703f, 177.26703f, 117.17f, 178.83f),
                    PathNode.LineTo(149.17f, 210.83f),
                    PathNode.CurveTo(149.92027f, 211.58112f, 150.93837f, 212.00314f, 152.0f, 212.00314f),
                    PathNode.CurveTo(153.06163f, 212.00314f, 154.07973f, 211.58112f, 154.83f, 210.83f),
                    PathNode.LineTo(186.83f, 178.83f),
                    PathNode.CurveTo(188.39296f, 177.26703f, 188.39296f, 174.73297f, 186.83f, 173.17f),
                    PathNode.CurveTo(185.26703f, 171.60704f, 182.73297f, 171.60704f, 181.17f, 173.17f),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
