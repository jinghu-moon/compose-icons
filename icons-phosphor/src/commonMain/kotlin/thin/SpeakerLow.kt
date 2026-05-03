package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorThinIcon(
            name = "SpeakerLow",
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
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.00201f, 136.77127f, 200.80165f, 145.24155f, 195.0f, 151.82f),
                    PathNode.CurveTo(193.53644f, 153.47685f, 191.00685f, 153.63358f, 189.35f, 152.17f),
                    PathNode.CurveTo(187.69315f, 150.70645f, 187.53644f, 148.17685f, 189.0f, 146.52f),
                    PathNode.CurveTo(198.30954f, 135.94344f, 198.30954f, 120.09656f, 189.0f, 109.52f),
                    PathNode.CurveTo(187.6568f, 107.85234f, 187.86514f, 105.42266f, 189.47267f, 104.00803f),
                    PathNode.CurveTo(191.08022f, 102.593414f, 193.51665f, 102.69566f, 195.0f, 104.24f),
                    PathNode.CurveTo(200.788f, 110.802956f, 203.98741f, 119.2494f, 204.0f, 128.0f),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
