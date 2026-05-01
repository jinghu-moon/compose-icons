package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorThinIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 138.20914f, 162.20914f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(132.0f, 168.0f),
                    PathNode.CurveTo(132.0f, 170.20914f, 130.20914f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(125.79086f, 172.0f, 124.0f, 170.20914f, 124.0f, 168.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(93.79086f, 140.0f, 92.0f, 138.20914f, 92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 133.79086f, 93.79086f, 132.0f, 96.0f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 104.0f),
                    PathNode.CurveTo(124.0f, 101.79086f, 125.79086f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(130.20914f, 100.0f, 132.0f, 101.79086f, 132.0f, 104.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.CurveTo(162.20914f, 132.0f, 164.0f, 133.79086f, 164.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 80.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 203.0457f, 219.0457f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(36.954304f, 212.0f, 28.0f, 203.0457f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 68.95431f, 36.954304f, 60.0f, 48.0f, 60.0f),
                    PathNode.LineTo(77.86f, 60.0f),
                    PathNode.LineTo(90.3f, 41.34f),
                    PathNode.CurveTo(92.52944f, 37.998444f, 96.28299f, 35.994045f, 100.3f, 36.0f),
                    PathNode.LineTo(155.74f, 36.0f),
                    PathNode.CurveTo(159.757f, 35.994045f, 163.51056f, 37.998444f, 165.74f, 41.34f),
                    PathNode.LineTo(178.14f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(219.0457f, 60.0f, 228.0f, 68.95431f, 228.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 73.37258f, 214.62741f, 68.0f, 208.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(174.66217f, 68.00087f, 173.41249f, 67.33287f, 172.67f, 66.22f),
                    PathNode.LineTo(159.05f, 45.78f),
                    PathNode.CurveTo(158.30751f, 44.66713f, 157.05782f, 43.99913f, 155.72f, 44.0f),
                    PathNode.LineTo(100.28f, 44.0f),
                    PathNode.CurveTo(98.95992f, 44.015705f, 97.732605f, 44.68175f, 97.0f, 45.78f),
                    PathNode.LineTo(83.33f, 66.22f),
                    PathNode.CurveTo(82.58751f, 67.33287f, 81.33782f, 68.00087f, 80.0f, 68.0f),
                    PathNode.LineTo(48.0f, 68.0f),
                    PathNode.CurveTo(41.37258f, 68.0f, 36.0f, 73.37258f, 36.0f, 80.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(214.62741f, 204.0f, 220.0f, 198.62741f, 220.0f, 192.0f),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
