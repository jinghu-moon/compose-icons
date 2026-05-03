package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorLightIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 148.0f),
                    PathNode.CurveTo(174.0f, 153.52284f, 169.52284f, 158.0f, 164.0f, 158.0f),
                    PathNode.CurveTo(158.47716f, 158.0f, 154.0f, 153.52284f, 154.0f, 148.0f),
                    PathNode.CurveTo(154.0f, 142.47716f, 158.47716f, 138.0f, 164.0f, 138.0f),
                    PathNode.CurveTo(169.52284f, 138.0f, 174.0f, 142.47716f, 174.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 138.0f),
                    PathNode.CurveTo(86.47715f, 138.0f, 82.0f, 142.47716f, 82.0f, 148.0f),
                    PathNode.CurveTo(82.0f, 153.52284f, 86.47715f, 158.0f, 92.0f, 158.0f),
                    PathNode.CurveTo(97.52285f, 158.0f, 102.0f, 153.52284f, 102.0f, 148.0f),
                    PathNode.CurveTo(102.0f, 142.47716f, 97.52285f, 138.0f, 92.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 160.0f),
                    PathNode.LineTo(238.0f, 184.0f),
                    PathNode.CurveTo(238.0f, 191.73198f, 231.73198f, 198.0f, 224.0f, 198.0f),
                    PathNode.LineTo(32.0f, 198.0f),
                    PathNode.CurveTo(24.268015f, 198.0f, 18.0f, 191.73198f, 18.0f, 184.0f),
                    PathNode.LineTo(18.0f, 161.13f),
                    PathNode.CurveTo(17.974445f, 129.79366f, 31.143534f, 99.8946f, 54.28f, 78.76f),
                    PathNode.LineTo(27.76f, 52.24f),
                    PathNode.CurveTo(26.154774f, 50.744236f, 25.494007f, 48.491554f, 26.036915f, 46.36569f),
                    PathNode.CurveTo(26.579824f, 44.239822f, 28.239822f, 42.579826f, 30.365688f, 42.036915f),
                    PathNode.CurveTo(32.491554f, 41.494007f, 34.744236f, 42.154774f, 36.24f, 43.76f),
                    PathNode.LineTo(63.61f, 71.12f),
                    PathNode.CurveTo(82.1635f, 57.47052f, 104.57665f, 50.07418f, 127.61f, 50.0f),
                    PathNode.LineTo(128.0f, 50.0f),
                    PathNode.CurveTo(151.20396f, 49.936146f, 173.8247f, 57.2674f, 192.58f, 70.93f),
                    PathNode.LineTo(219.76f, 43.76f),
                    PathNode.CurveTo(222.12408f, 41.55713f, 225.80807f, 41.622128f, 228.09297f, 43.907024f),
                    PathNode.CurveTo(230.37787f, 46.19192f, 230.44287f, 49.875923f, 228.24f, 52.24f),
                    PathNode.LineTo(201.93f, 78.55f),
                    PathNode.CurveTo(203.19f, 79.7f, 204.43f, 80.87f, 205.65f, 82.08f),
                    PathNode.CurveTo(226.42809f, 102.67639f, 238.08075f, 130.74365f, 238.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 160.0f),
                    PathNode.CurveTo(226.0f, 105.87609f, 182.1239f, 62.0f, 128.0f, 62.0f),
                    PathNode.LineTo(127.65f, 62.0f),
                    PathNode.CurveTo(73.81f, 62.19f, 30.0f, 106.66f, 30.0f, 161.13f),
                    PathNode.LineTo(30.0f, 184.0f),
                    PathNode.CurveTo(30.0f, 185.10457f, 30.89543f, 186.0f, 32.0f, 186.0f),
                    PathNode.LineTo(224.0f, 186.0f),
                    PathNode.CurveTo(225.10457f, 186.0f, 226.0f, 185.10457f, 226.0f, 184.0f),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
