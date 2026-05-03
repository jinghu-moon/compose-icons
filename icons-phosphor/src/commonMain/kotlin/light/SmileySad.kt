package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorLightIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 108.0f),
                    PathNode.CurveTo(82.0f, 102.47715f, 86.47715f, 98.0f, 92.0f, 98.0f),
                    PathNode.CurveTo(97.52285f, 98.0f, 102.0f, 102.47715f, 102.0f, 108.0f),
                    PathNode.CurveTo(102.0f, 113.52285f, 97.52285f, 118.0f, 92.0f, 118.0f),
                    PathNode.CurveTo(86.47715f, 118.0f, 82.0f, 113.52285f, 82.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 108.0f),
                    PathNode.CurveTo(174.0f, 113.52285f, 169.52284f, 118.0f, 164.0f, 118.0f),
                    PathNode.CurveTo(158.47716f, 118.0f, 154.0f, 113.52285f, 154.0f, 108.0f),
                    PathNode.CurveTo(154.0f, 102.47715f, 158.47716f, 98.0f, 164.0f, 98.0f),
                    PathNode.CurveTo(169.52284f, 98.0f, 174.0f, 102.47715f, 174.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.19f, 173.0f),
                    PathNode.CurveTo(174.6804f, 175.8491f, 173.65994f, 179.36664f, 170.87616f, 180.97575f),
                    PathNode.CurveTo(168.09238f, 182.58488f, 164.53497f, 181.71352f, 162.81f, 179.0f),
                    PathNode.CurveTo(154.97f, 165.46f, 142.61f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(113.39f, 158.0f, 101.0f, 165.46f, 93.19f, 179.0f),
                    PathNode.CurveTo(92.117516f, 180.8576f, 90.13497f, 182.00137f, 87.99f, 182.0f),
                    PathNode.CurveTo(86.935585f, 182.00293f, 85.89966f, 181.72322f, 84.99f, 181.19f),
                    PathNode.CurveTo(82.12979f, 179.5278f, 81.15461f, 175.86417f, 82.81f, 173.0f),
                    PathNode.CurveTo(92.73f, 155.84f, 109.2f, 146.0f, 128.0f, 146.0f),
                    PathNode.CurveTo(146.8f, 146.0f, 163.27f, 155.84f, 173.19f, 173.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
