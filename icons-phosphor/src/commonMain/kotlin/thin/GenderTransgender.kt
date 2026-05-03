package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorThinIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(165.79086f, 36.0f, 164.0f, 37.79086f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 42.20914f, 165.79086f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(206.34f, 44.0f),
                    PathNode.LineTo(168.0f, 82.35f),
                    PathNode.LineTo(146.83f, 61.18f),
                    PathNode.CurveTo(145.8298f, 60.125397f, 144.33626f, 59.696335f, 142.92883f, 60.059288f),
                    PathNode.CurveTo(141.52141f, 60.42224f, 140.42163f, 61.52008f, 140.05618f, 62.92686f),
                    PathNode.CurveTo(139.69075f, 64.33364f, 140.11717f, 65.82794f, 141.17f, 66.83f),
                    PathNode.LineTo(162.34f, 88.0f),
                    PathNode.LineTo(141.17f, 109.18f),
                    PathNode.CurveTo(113.6399f, 84.662445f, 71.60535f, 86.476974f, 46.290455f, 113.27572f),
                    PathNode.CurveTo(20.975563f, 140.07446f, 21.555777f, 182.14418f, 47.600098f, 208.23459f),
                    PathNode.CurveTo(73.64442f, 234.32501f, 115.713036f, 234.97961f, 142.5565f, 209.71216f),
                    PathNode.CurveTo(169.39998f, 184.44469f, 171.28883f, 142.4134f, 146.82f, 114.84f),
                    PathNode.LineTo(168.0f, 93.67f),
                    PathNode.LineTo(189.17f, 114.84f),
                    PathNode.CurveTo(190.73297f, 116.40297f, 193.26703f, 116.40297f, 194.83f, 114.84f),
                    PathNode.CurveTo(196.39296f, 113.27703f, 196.39296f, 110.742966f, 194.83f, 109.18f),
                    PathNode.LineTo(173.66f, 88.0f),
                    PathNode.LineTo(212.0f, 49.66f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 90.20914f, 213.79086f, 92.0f, 216.0f, 92.0f),
                    PathNode.CurveTo(218.20914f, 92.0f, 220.0f, 90.20914f, 220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 37.79086f, 218.20914f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.43f, 202.45f),
                    PathNode.CurveTo(118.192635f, 222.6908f, 86.47605f, 225.81879f, 62.674606f, 209.92125f),
                    PathNode.CurveTo(38.873158f, 194.02371f, 29.614862f, 163.52765f, 40.561066f, 137.08107f),
                    PathNode.CurveTo(51.507267f, 110.6345f, 79.60977f, 95.60202f, 107.68419f, 101.17584f),
                    PathNode.CurveTo(135.7586f, 106.749664f, 155.98703f, 131.37762f, 156.0f, 160.0f),
                    PathNode.CurveTo(155.99953f, 175.91913f, 149.68013f, 191.1871f, 138.43f, 202.45f),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
