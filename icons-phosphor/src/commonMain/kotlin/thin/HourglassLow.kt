package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) return _hourglassLow!!
        _hourglassLow = phosphorThinIcon(
            name = "HourglassLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 75.64f),
                    PathNode.LineTo(196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 33.37258f, 190.62741f, 28.0f, 184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(65.37258f, 28.0f, 60.0f, 33.37258f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 76.0f),
                    PathNode.CurveTo(60.0f, 79.777084f, 61.77833f, 83.33374f, 64.8f, 85.6f),
                    PathNode.LineTo(121.33f, 128.0f),
                    PathNode.LineTo(64.8f, 170.4f),
                    PathNode.CurveTo(61.77833f, 172.66626f, 60.0f, 176.22292f, 60.0f, 180.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 222.62741f, 65.37258f, 228.0f, 72.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(190.62741f, 228.0f, 196.0f, 222.62741f, 196.0f, 216.0f),
                    PathNode.LineTo(196.0f, 180.36f),
                    PathNode.CurveTo(195.9923f, 176.60231f, 194.23204f, 173.06332f, 191.24f, 170.79f),
                    PathNode.LineTo(134.63f, 128.0f),
                    PathNode.LineTo(191.24f, 85.21f),
                    PathNode.CurveTo(194.23204f, 82.93668f, 195.9923f, 79.39769f, 196.0f, 75.64f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(69.79086f, 220.0f, 68.0f, 218.20914f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 188.0f),
                    PathNode.LineTo(188.0f, 188.0f),
                    PathNode.LineTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 218.20914f, 186.20914f, 220.0f, 184.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 180.0f),
                    PathNode.LineTo(68.0f, 180.0f),
                    PathNode.CurveTo(68.0f, 178.74097f, 68.59277f, 177.55542f, 69.6f, 176.8f),
                    PathNode.LineTo(128.0f, 133.0f),
                    PathNode.LineTo(186.42f, 177.16f),
                    PathNode.CurveTo(187.32484f, 177.84042f, 187.89897f, 178.87239f, 188.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 75.64f),
                    PathNode.CurveTo(187.99922f, 76.89375f, 187.41064f, 78.074615f, 186.41f, 78.83f),
                    PathNode.LineTo(128.0f, 123.0f),
                    PathNode.LineTo(69.6f, 79.2f),
                    PathNode.CurveTo(68.59277f, 78.44459f, 68.0f, 77.259026f, 68.0f, 76.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(186.20914f, 36.0f, 188.0f, 37.79086f, 188.0f, 40.0f),
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
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
