package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorThinIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(153.76f, 28.41f),
                    PathNode.CurveTo(152.3869f, 27.73426f, 150.74858f, 27.901197f, 149.54f, 28.84f),
                    PathNode.LineTo(78.63f, 84.0f),
                    PathNode.LineTo(32.0f, 84.0f),
                    PathNode.CurveTo(25.372583f, 84.0f, 20.0f, 89.37258f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 166.62741f, 25.372583f, 172.0f, 32.0f, 172.0f),
                    PathNode.LineTo(78.63f, 172.0f),
                    PathNode.LineTo(149.54f, 227.16f),
                    PathNode.CurveTo(150.24614f, 227.70137f, 151.11023f, 227.99643f, 152.0f, 228.0f),
                    PathNode.CurveTo(152.6106f, 228.00227f, 153.21329f, 227.86188f, 153.76f, 227.59f),
                    PathNode.CurveTo(155.13033f, 226.91856f, 155.99924f, 225.52597f, 156.0f, 224.0f),
                    PathNode.LineTo(156.0f, 32.0f),
                    PathNode.CurveTo(155.99924f, 30.474026f, 155.13033f, 29.081429f, 153.76f, 28.41f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 160.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 93.79086f, 29.790861f, 92.0f, 32.0f, 92.0f),
                    PathNode.LineTo(76.0f, 92.0f),
                    PathNode.LineTo(76.0f, 164.0f),
                    PathNode.LineTo(32.0f, 164.0f),
                    PathNode.CurveTo(29.790861f, 164.0f, 28.0f, 162.20914f, 28.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 215.82f),
                    PathNode.LineTo(84.0f, 166.0f),
                    PathNode.LineTo(84.0f, 90.0f),
                    PathNode.LineTo(148.0f, 40.22f),
                    PathNode.Close,
                    PathNode.MoveTo(195.0f, 104.21f),
                    PathNode.CurveTo(206.9803f, 117.81139f, 206.9803f, 138.19861f, 195.0f, 151.8f),
                    PathNode.CurveTo(193.53644f, 153.45685f, 191.00685f, 153.61356f, 189.35f, 152.15f),
                    PathNode.CurveTo(187.69315f, 150.68645f, 187.53644f, 148.15686f, 189.0f, 146.5f),
                    PathNode.CurveTo(198.30954f, 135.92343f, 198.30954f, 120.07656f, 189.0f, 109.5f),
                    PathNode.CurveTo(187.6568f, 107.83234f, 187.86514f, 105.40266f, 189.47267f, 103.98804f),
                    PathNode.CurveTo(191.08022f, 102.57342f, 193.51665f, 102.67567f, 195.0f, 104.22f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.01292f, 146.69714f, 237.12238f, 164.74078f, 224.65f, 178.67f),
                    PathNode.CurveTo(223.17538f, 180.32686f, 220.63687f, 180.4746f, 218.98f, 179.0f),
                    PathNode.CurveTo(217.32315f, 177.5254f, 217.17538f, 174.98685f, 218.65f, 173.33f),
                    PathNode.CurveTo(241.73375f, 147.51817f, 241.73375f, 108.481834f, 218.65f, 82.67f),
                    PathNode.CurveTo(217.17538f, 81.013145f, 217.32315f, 78.4746f, 218.98f, 77.0f),
                    PathNode.CurveTo(220.63687f, 75.5254f, 223.17538f, 75.67315f, 224.65f, 77.33f),
                    PathNode.CurveTo(237.12238f, 91.25921f, 244.01292f, 109.30287f, 244.0f, 128.0f),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
