package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorThinIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 84.0f),
                    PathNode.LineTo(106.47f, 84.0f),
                    PathNode.LineTo(83.58f, 38.21f),
                    PathNode.CurveTo(82.90174f, 36.854572f, 81.515656f, 35.998917f, 80.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(45.79086f, 36.0f, 44.0f, 37.79086f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(24.0f, 84.0f),
                    PathNode.CurveTo(21.790861f, 84.0f, 20.0f, 85.79086f, 20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 90.20914f, 21.790861f, 92.0f, 24.0f, 92.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(24.0f, 212.0f),
                    PathNode.CurveTo(21.790861f, 212.0f, 20.0f, 213.79086f, 20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 218.20914f, 21.790861f, 220.0f, 24.0f, 220.0f),
                    PathNode.LineTo(128.0f, 220.0f),
                    PathNode.CurveTo(130.20914f, 220.0f, 132.0f, 218.20914f, 132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 213.79086f, 130.20914f, 212.0f, 128.0f, 212.0f),
                    PathNode.LineTo(108.0f, 212.0f),
                    PathNode.LineTo(108.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.LineTo(212.0f, 184.0f),
                    PathNode.CurveTo(212.0f, 186.20914f, 210.20914f, 188.0f, 208.0f, 188.0f),
                    PathNode.LineTo(192.0f, 188.0f),
                    PathNode.CurveTo(189.79086f, 188.0f, 188.0f, 186.20914f, 188.0f, 184.0f),
                    PathNode.LineTo(188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 173.79086f, 186.20914f, 172.0f, 184.0f, 172.0f),
                    PathNode.CurveTo(181.79086f, 172.0f, 180.0f, 173.79086f, 180.0f, 176.0f),
                    PathNode.LineTo(180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 190.62741f, 185.37259f, 196.0f, 192.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(214.62741f, 196.0f, 220.0f, 190.62741f, 220.0f, 184.0f),
                    PathNode.LineTo(220.0f, 92.0f),
                    PathNode.LineTo(240.0f, 92.0f),
                    PathNode.CurveTo(242.20914f, 92.0f, 244.0f, 90.20914f, 244.0f, 88.0f),
                    PathNode.CurveTo(244.0f, 85.79086f, 242.20914f, 84.0f, 240.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 44.0f),
                    PathNode.LineTo(77.53f, 44.0f),
                    PathNode.LineTo(97.53f, 84.0f),
                    PathNode.LineTo(52.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 212.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(100.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.LineTo(52.0f, 148.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.LineTo(100.0f, 92.0f),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
