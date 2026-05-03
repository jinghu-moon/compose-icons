package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorBoldIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 108.0f),
                    PathNode.CurveTo(76.0f, 99.163445f, 83.163445f, 92.0f, 92.0f, 92.0f),
                    PathNode.CurveTo(100.836555f, 92.0f, 108.0f, 99.163445f, 108.0f, 108.0f),
                    PathNode.CurveTo(108.0f, 116.836555f, 100.836555f, 124.0f, 92.0f, 124.0f),
                    PathNode.CurveTo(83.163445f, 124.0f, 76.0f, 116.836555f, 76.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 116.836555f, 172.83656f, 124.0f, 164.0f, 124.0f),
                    PathNode.CurveTo(155.16344f, 124.0f, 148.0f, 116.836555f, 148.0f, 108.0f),
                    PathNode.CurveTo(148.0f, 99.163445f, 155.16344f, 92.0f, 164.0f, 92.0f),
                    PathNode.CurveTo(172.83656f, 92.0f, 180.0f, 99.163445f, 180.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.74f, 165.0f),
                    PathNode.CurveTo(180.36365f, 170.37903f, 179.05754f, 177.66393f, 173.79086f, 181.449f),
                    PathNode.CurveTo(168.52419f, 185.2341f, 161.20305f, 184.14949f, 157.26f, 179.0f),
                    PathNode.CurveTo(150.49901f, 169.56741f, 139.60538f, 163.97266f, 128.0f, 163.97266f),
                    PathNode.CurveTo(116.39462f, 163.97266f, 105.50099f, 169.56741f, 98.74f, 179.0f),
                    PathNode.CurveTo(94.79695f, 184.14949f, 87.475815f, 185.2341f, 82.20914f, 181.449f),
                    PathNode.CurveTo(76.94245f, 177.66393f, 75.63635f, 170.37903f, 79.26f, 165.0f),
                    PathNode.CurveTo(90.53088f, 149.30072f, 108.67384f, 139.9916f, 128.0f, 139.9916f),
                    PathNode.CurveTo(147.32616f, 139.9916f, 165.46912f, 149.30072f, 176.74f, 165.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
