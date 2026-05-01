package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorThinIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 60.0f),
                    PathNode.LineTo(178.13f, 60.0f),
                    PathNode.LineTo(163.32f, 37.78f),
                    PathNode.CurveTo(162.57948f, 36.670074f, 161.33427f, 36.002472f, 160.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(94.66572f, 36.002472f, 93.420525f, 36.670074f, 92.68f, 37.78f),
                    PathNode.LineTo(77.85f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(36.954304f, 60.0f, 28.0f, 68.95431f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(219.0457f, 212.0f, 228.0f, 203.0457f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 68.95431f, 219.0457f, 60.0f, 208.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 198.62741f, 214.62741f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(41.37258f, 204.0f, 36.0f, 198.62741f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 73.37258f, 41.37258f, 68.0f, 48.0f, 68.0f),
                    PathNode.LineTo(80.0f, 68.0f),
                    PathNode.CurveTo(81.33782f, 68.00087f, 82.58751f, 67.33287f, 83.33f, 66.22f),
                    PathNode.LineTo(98.13f, 44.0f),
                    PathNode.LineTo(157.85f, 44.0f),
                    PathNode.LineTo(172.67f, 66.22f),
                    PathNode.CurveTo(173.41249f, 67.33287f, 174.66217f, 68.00087f, 176.0f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.CurveTo(214.62741f, 68.0f, 220.0f, 73.37258f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 96.0f),
                    PathNode.LineTo(172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 122.20914f, 170.20914f, 124.0f, 168.0f, 124.0f),
                    PathNode.LineTo(144.0f, 124.0f),
                    PathNode.CurveTo(141.79086f, 124.0f, 140.0f, 122.20914f, 140.0f, 120.0f),
                    PathNode.CurveTo(140.0f, 117.79086f, 141.79086f, 116.0f, 144.0f, 116.0f),
                    PathNode.LineTo(158.66f, 116.0f),
                    PathNode.LineTo(153.39f, 110.48f),
                    PathNode.CurveTo(140.69319f, 97.9102f, 120.7142f, 96.51167f, 106.39f, 107.19f),
                    PathNode.CurveTo(105.25395f, 108.125656f, 103.69586f, 108.36188f, 102.333534f, 107.80501f),
                    PathNode.CurveTo(100.9712f, 107.24813f, 100.02471f, 105.98813f, 99.86937f, 104.5246f),
                    PathNode.CurveTo(99.71403f, 103.061066f, 100.37492f, 101.63045f, 101.59f, 100.8f),
                    PathNode.CurveTo(119.12935f, 87.73899f, 143.58559f, 89.47827f, 159.1f, 104.89f),
                    PathNode.LineTo(164.0f, 110.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 93.79086f, 165.79086f, 92.0f, 168.0f, 92.0f),
                    PathNode.CurveTo(170.20914f, 92.0f, 172.0f, 93.79086f, 172.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.2f, 157.6f),
                    PathNode.CurveTo(156.52548f, 159.36731f, 156.16731f, 161.87451f, 154.4f, 163.2f),
                    PathNode.CurveTo(136.8632f, 176.26974f, 112.40065f, 174.53001f, 96.89f, 159.11f),
                    PathNode.LineTo(92.0f, 154.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 170.20914f, 90.20914f, 172.0f, 88.0f, 172.0f),
                    PathNode.CurveTo(85.79086f, 172.0f, 84.0f, 170.20914f, 84.0f, 168.0f),
                    PathNode.LineTo(84.0f, 144.0f),
                    PathNode.CurveTo(84.0f, 141.79086f, 85.79086f, 140.0f, 88.0f, 140.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.CurveTo(114.20914f, 140.0f, 116.0f, 141.79086f, 116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 146.20914f, 114.20914f, 148.0f, 112.0f, 148.0f),
                    PathNode.LineTo(97.34f, 148.0f),
                    PathNode.LineTo(102.61f, 153.52f),
                    PathNode.CurveTo(115.30683f, 166.0898f, 135.2858f, 167.48833f, 149.61f, 156.81f),
                    PathNode.CurveTo(151.37297f, 155.48914f, 153.8721f, 155.84232f, 155.2f, 157.6f),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
