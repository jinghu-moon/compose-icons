package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorThinIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 100.0f),
                    PathNode.LineTo(40.0f, 100.0f),
                    PathNode.CurveTo(37.79086f, 100.0f, 36.0f, 98.20914f, 36.0f, 96.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 45.79086f, 37.79086f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(42.20914f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 86.34f),
                    PathNode.LineTo(65.46f, 64.89f),
                    PathNode.CurveTo(82.548836f, 47.704304f, 105.76425f, 38.010235f, 130.0f, 37.94f),
                    PathNode.LineTo(130.51f, 37.94f),
                    PathNode.CurveTo(154.54973f, 37.878586f, 177.64644f, 47.28756f, 194.8f, 64.13f),
                    PathNode.CurveTo(196.37953f, 65.6764f, 196.4064f, 68.210464f, 194.86f, 69.79f),
                    PathNode.CurveTo(193.3136f, 71.36954f, 190.77954f, 71.3964f, 189.2f, 69.85f),
                    PathNode.CurveTo(173.54485f, 54.4742f, 152.46301f, 45.88411f, 130.52f, 45.94f),
                    PathNode.LineTo(130.05f, 45.94f),
                    PathNode.CurveTo(107.92013f, 46.007614f, 86.7217f, 54.855274f, 71.11f, 70.54f),
                    PathNode.LineTo(49.66f, 92.0f),
                    PathNode.LineTo(88.0f, 92.0f),
                    PathNode.CurveTo(90.20914f, 92.0f, 92.0f, 93.79086f, 92.0f, 96.0f),
                    PathNode.CurveTo(92.0f, 98.20914f, 90.20914f, 100.0f, 88.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 156.0f),
                    PathNode.LineTo(168.0f, 156.0f),
                    PathNode.CurveTo(165.79086f, 156.0f, 164.0f, 157.79086f, 164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 162.20914f, 165.79086f, 164.0f, 168.0f, 164.0f),
                    PathNode.LineTo(206.34f, 164.0f),
                    PathNode.LineTo(184.89f, 185.46f),
                    PathNode.CurveTo(169.29054f, 201.1325f, 148.11253f, 209.97916f, 126.0f, 210.06f),
                    PathNode.LineTo(125.53f, 210.06f),
                    PathNode.CurveTo(103.56969f, 210.12906f, 82.46748f, 201.53798f, 66.8f, 186.15f),
                    PathNode.CurveTo(65.22047f, 184.6036f, 62.686398f, 184.63046f, 61.14f, 186.21f),
                    PathNode.CurveTo(59.5936f, 187.78954f, 59.620464f, 190.32361f, 61.2f, 191.87f),
                    PathNode.CurveTo(78.3511f, 208.71f, 101.443726f, 218.11877f, 125.48f, 218.06f),
                    PathNode.LineTo(126.0f, 218.06f),
                    PathNode.CurveTo(150.23921f, 217.99242f, 173.45871f, 208.29814f, 190.55f, 191.11f),
                    PathNode.LineTo(212.0f, 169.66f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 213.79086f, 212.0f, 216.0f, 212.0f),
                    PathNode.CurveTo(218.20914f, 212.0f, 220.0f, 210.20914f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 157.79086f, 218.20914f, 156.0f, 216.0f, 156.0f),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
