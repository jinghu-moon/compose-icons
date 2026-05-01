package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorThinIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 212.0f),
                    PathNode.LineTo(220.0f, 212.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 89.37258f, 214.62741f, 84.0f, 208.0f, 84.0f),
                    PathNode.LineTo(140.0f, 84.0f),
                    PathNode.LineTo(140.0f, 32.0f),
                    PathNode.CurveTo(140.00658f, 27.570488f, 137.57246f, 23.497572f, 133.66824f, 21.40528f),
                    PathNode.CurveTo(129.76402f, 19.312984f, 125.02469f, 19.541613f, 121.34f, 22.0f),
                    PathNode.LineTo(41.34f, 75.33f),
                    PathNode.CurveTo(37.998444f, 77.55944f, 35.994045f, 81.31299f, 36.0f, 85.33f),
                    PathNode.LineTo(36.0f, 212.0f),
                    PathNode.LineTo(16.0f, 212.0f),
                    PathNode.CurveTo(13.790861f, 212.0f, 12.0f, 213.79086f, 12.0f, 216.0f),
                    PathNode.CurveTo(12.0f, 218.20914f, 13.790861f, 220.0f, 16.0f, 220.0f),
                    PathNode.LineTo(240.0f, 220.0f),
                    PathNode.CurveTo(242.20914f, 220.0f, 244.0f, 218.20914f, 244.0f, 216.0f),
                    PathNode.CurveTo(244.0f, 213.79086f, 242.20914f, 212.0f, 240.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 92.0f),
                    PathNode.CurveTo(210.20914f, 92.0f, 212.0f, 93.79086f, 212.0f, 96.0f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(140.0f, 212.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 85.34f),
                    PathNode.CurveTo(43.99578f, 83.998634f, 44.664177f, 82.74445f, 45.78f, 82.0f),
                    PathNode.LineTo(125.78f, 28.67f),
                    PathNode.CurveTo(127.00774f, 27.850872f, 128.58678f, 27.774368f, 129.88794f, 28.470976f),
                    PathNode.CurveTo(131.18912f, 29.167582f, 132.00096f, 30.524094f, 132.0f, 32.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 112.0f),
                    PathNode.LineTo(108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 130.20914f, 106.20914f, 132.0f, 104.0f, 132.0f),
                    PathNode.CurveTo(101.79086f, 132.0f, 100.0f, 130.20914f, 100.0f, 128.0f),
                    PathNode.LineTo(100.0f, 112.0f),
                    PathNode.CurveTo(100.0f, 109.79086f, 101.79086f, 108.0f, 104.0f, 108.0f),
                    PathNode.CurveTo(106.20914f, 108.0f, 108.0f, 109.79086f, 108.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 112.0f),
                    PathNode.LineTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 130.20914f, 74.20914f, 132.0f, 72.0f, 132.0f),
                    PathNode.CurveTo(69.79086f, 132.0f, 68.0f, 130.20914f, 68.0f, 128.0f),
                    PathNode.LineTo(68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 109.79086f, 69.79086f, 108.0f, 72.0f, 108.0f),
                    PathNode.CurveTo(74.20914f, 108.0f, 76.0f, 109.79086f, 76.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 168.0f),
                    PathNode.LineTo(76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 186.20914f, 74.20914f, 188.0f, 72.0f, 188.0f),
                    PathNode.CurveTo(69.79086f, 188.0f, 68.0f, 186.20914f, 68.0f, 184.0f),
                    PathNode.LineTo(68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 165.79086f, 69.79086f, 164.0f, 72.0f, 164.0f),
                    PathNode.CurveTo(74.20914f, 164.0f, 76.0f, 165.79086f, 76.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 168.0f),
                    PathNode.LineTo(108.0f, 184.0f),
                    PathNode.CurveTo(108.0f, 186.20914f, 106.20914f, 188.0f, 104.0f, 188.0f),
                    PathNode.CurveTo(101.79086f, 188.0f, 100.0f, 186.20914f, 100.0f, 184.0f),
                    PathNode.LineTo(100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 165.79086f, 101.79086f, 164.0f, 104.0f, 164.0f),
                    PathNode.CurveTo(106.20914f, 164.0f, 108.0f, 165.79086f, 108.0f, 168.0f),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
