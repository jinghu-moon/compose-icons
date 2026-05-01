package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) return _slackLogo!!
        _slackLogo = phosphorLightIcon(
            name = "SlackLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(231.25484f, 118.05888f, 233.94113f, 99.25484f, 224.0f, 86.0f),
                    PathNode.CurveTo(214.05887f, 72.74516f, 195.25484f, 70.05888f, 182.0f, 80.0f),
                    PathNode.LineTo(182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 43.08709f, 173.73709f, 31.622923f, 161.48683f, 27.539501f),
                    PathNode.CurveTo(149.23657f, 23.45608f, 135.74774f, 27.66967f, 128.0f, 38.0f),
                    PathNode.CurveTo(118.05888f, 24.745167f, 99.25484f, 22.058874f, 86.0f, 32.0f),
                    PathNode.CurveTo(72.74516f, 41.941124f, 70.05888f, 60.745167f, 80.0f, 74.0f),
                    PathNode.LineTo(56.0f, 74.0f),
                    PathNode.CurveTo(43.08709f, 74.0f, 31.622923f, 82.2629f, 27.539501f, 94.51317f),
                    PathNode.CurveTo(23.45608f, 106.76343f, 27.66967f, 120.25225f, 38.0f, 128.0f),
                    PathNode.CurveTo(24.745167f, 137.94113f, 22.058874f, 156.74516f, 32.0f, 170.0f),
                    PathNode.CurveTo(41.941124f, 183.25484f, 60.745167f, 185.94113f, 74.0f, 176.0f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(74.0f, 212.91292f, 82.2629f, 224.37708f, 94.51317f, 228.4605f),
                    PathNode.CurveTo(106.76343f, 232.54391f, 120.25225f, 228.33032f, 128.0f, 218.0f),
                    PathNode.CurveTo(137.94113f, 231.25484f, 156.74516f, 233.94113f, 170.0f, 224.0f),
                    PathNode.CurveTo(183.25484f, 214.05887f, 185.94113f, 195.25484f, 176.0f, 182.0f),
                    PathNode.LineTo(200.0f, 182.0f),
                    PathNode.CurveTo(212.91292f, 182.0f, 224.37708f, 173.73709f, 228.4605f, 161.48683f),
                    PathNode.CurveTo(232.54391f, 149.23657f, 228.33032f, 135.74774f, 218.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 86.0f),
                    PathNode.CurveTo(209.94113f, 86.0f, 218.0f, 94.05888f, 218.0f, 104.0f),
                    PathNode.CurveTo(218.0f, 113.94112f, 209.94113f, 122.0f, 200.0f, 122.0f),
                    PathNode.LineTo(182.0f, 122.0f),
                    PathNode.LineTo(182.0f, 104.0f),
                    PathNode.CurveTo(182.0f, 94.05888f, 190.05887f, 86.0f, 200.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 38.0f),
                    PathNode.CurveTo(161.94113f, 38.0f, 170.0f, 46.058876f, 170.0f, 56.0f),
                    PathNode.LineTo(170.0f, 104.0f),
                    PathNode.CurveTo(170.0f, 113.94112f, 161.94113f, 122.0f, 152.0f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 56.0f),
                    PathNode.CurveTo(134.0f, 46.058876f, 142.05887f, 38.0f, 152.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 56.0f),
                    PathNode.CurveTo(86.0f, 46.058876f, 94.05888f, 38.0f, 104.0f, 38.0f),
                    PathNode.CurveTo(113.94112f, 38.0f, 122.0f, 46.058876f, 122.0f, 56.0f),
                    PathNode.LineTo(122.0f, 74.0f),
                    PathNode.LineTo(104.0f, 74.0f),
                    PathNode.CurveTo(94.05888f, 74.0f, 86.0f, 65.941124f, 86.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 104.0f),
                    PathNode.CurveTo(38.0f, 94.05888f, 46.058876f, 86.0f, 56.0f, 86.0f),
                    PathNode.LineTo(104.0f, 86.0f),
                    PathNode.CurveTo(113.94112f, 86.0f, 122.0f, 94.05888f, 122.0f, 104.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(56.0f, 122.0f),
                    PathNode.CurveTo(46.058876f, 122.0f, 38.0f, 113.94112f, 38.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 170.0f),
                    PathNode.CurveTo(46.058876f, 170.0f, 38.0f, 161.94113f, 38.0f, 152.0f),
                    PathNode.CurveTo(38.0f, 142.05887f, 46.058876f, 134.0f, 56.0f, 134.0f),
                    PathNode.LineTo(74.0f, 134.0f),
                    PathNode.LineTo(74.0f, 152.0f),
                    PathNode.CurveTo(74.0f, 161.94113f, 65.941124f, 170.0f, 56.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 218.0f),
                    PathNode.CurveTo(94.05888f, 218.0f, 86.0f, 209.94113f, 86.0f, 200.0f),
                    PathNode.LineTo(86.0f, 152.0f),
                    PathNode.CurveTo(86.0f, 142.05887f, 94.05888f, 134.0f, 104.0f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 200.0f),
                    PathNode.CurveTo(122.0f, 209.94113f, 113.94112f, 218.0f, 104.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 200.0f),
                    PathNode.CurveTo(170.0f, 209.94113f, 161.94113f, 218.0f, 152.0f, 218.0f),
                    PathNode.CurveTo(142.05887f, 218.0f, 134.0f, 209.94113f, 134.0f, 200.0f),
                    PathNode.LineTo(134.0f, 182.0f),
                    PathNode.LineTo(152.0f, 182.0f),
                    PathNode.CurveTo(161.94113f, 182.0f, 170.0f, 190.05887f, 170.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 170.0f),
                    PathNode.LineTo(152.0f, 170.0f),
                    PathNode.CurveTo(142.05887f, 170.0f, 134.0f, 161.94113f, 134.0f, 152.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(200.0f, 134.0f),
                    PathNode.CurveTo(209.94113f, 134.0f, 218.0f, 142.05887f, 218.0f, 152.0f),
                    PathNode.CurveTo(218.0f, 161.94113f, 209.94113f, 170.0f, 200.0f, 170.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
