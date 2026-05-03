package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorThinIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 98.20914f, 218.20914f, 100.0f, 216.0f, 100.0f),
                    PathNode.LineTo(168.0f, 100.0f),
                    PathNode.CurveTo(165.79086f, 100.0f, 164.0f, 98.20914f, 164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 93.79086f, 165.79086f, 92.0f, 168.0f, 92.0f),
                    PathNode.LineTo(206.34f, 92.0f),
                    PathNode.LineTo(184.89f, 70.54f),
                    PathNode.CurveTo(152.35736f, 38.01052f, 99.71054f, 37.702904f, 66.8f, 69.85f),
                    PathNode.CurveTo(65.22047f, 71.3964f, 62.686398f, 71.36954f, 61.14f, 69.79f),
                    PathNode.CurveTo(59.5936f, 68.210464f, 59.620464f, 65.6764f, 61.2f, 64.13f),
                    PathNode.CurveTo(97.24645f, 28.920254f, 154.9098f, 29.259083f, 190.54f, 64.89f),
                    PathNode.LineTo(212.0f, 86.34f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 213.79086f, 44.0f, 216.0f, 44.0f),
                    PathNode.CurveTo(218.20914f, 44.0f, 220.0f, 45.79086f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.2f, 186.15f),
                    PathNode.CurveTo(173.54485f, 201.5258f, 152.46301f, 210.11589f, 130.52f, 210.06f),
                    PathNode.LineTo(130.05f, 210.06f),
                    PathNode.CurveTo(107.92013f, 209.99239f, 86.7217f, 201.14473f, 71.11f, 185.46f),
                    PathNode.LineTo(49.66f, 164.0f),
                    PathNode.LineTo(88.0f, 164.0f),
                    PathNode.CurveTo(90.20914f, 164.0f, 92.0f, 162.20914f, 92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 157.79086f, 90.20914f, 156.0f, 88.0f, 156.0f),
                    PathNode.LineTo(40.0f, 156.0f),
                    PathNode.CurveTo(37.79086f, 156.0f, 36.0f, 157.79086f, 36.0f, 160.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 210.20914f, 37.79086f, 212.0f, 40.0f, 212.0f),
                    PathNode.CurveTo(42.20914f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 169.66f),
                    PathNode.LineTo(65.46f, 191.11f),
                    PathNode.CurveTo(82.55134f, 208.29198f, 105.76514f, 217.98538f, 130.0f, 218.06f),
                    PathNode.LineTo(130.51f, 218.06f),
                    PathNode.CurveTo(154.54585f, 218.11662f, 177.6377f, 208.70818f, 194.79f, 191.87f),
                    PathNode.CurveTo(196.36954f, 190.32361f, 196.3964f, 187.78954f, 194.85f, 186.21f),
                    PathNode.CurveTo(193.3036f, 184.63046f, 190.76953f, 184.6036f, 189.19f, 186.15f),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
