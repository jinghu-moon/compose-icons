package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorLightIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 204.0f),
                    PathNode.CurveTo(138.0f, 209.52284f, 133.52284f, 214.0f, 128.0f, 214.0f),
                    PathNode.CurveTo(122.47715f, 214.0f, 118.0f, 209.52284f, 118.0f, 204.0f),
                    PathNode.CurveTo(118.0f, 198.47716f, 122.47715f, 194.0f, 128.0f, 194.0f),
                    PathNode.CurveTo(133.52284f, 194.0f, 138.0f, 198.47716f, 138.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.53f, 160.15f),
                    PathNode.CurveTo(145.57964f, 141.2735f, 110.42038f, 141.2735f, 84.47f, 160.15f),
                    PathNode.CurveTo(81.873245f, 162.12668f, 81.33258f, 165.81639f, 83.25305f, 168.455f),
                    PathNode.CurveTo(85.17352f, 171.0936f, 88.85076f, 171.71336f, 91.53f, 169.85f),
                    PathNode.CurveTo(113.27174f, 154.0356f, 142.72826f, 154.0356f, 164.47f, 169.85f),
                    PathNode.CurveTo(167.14877f, 171.79877f, 170.90001f, 171.20787f, 172.85f, 168.53f),
                    PathNode.CurveTo(174.79877f, 165.85123f, 174.20787f, 162.09999f, 171.53f, 160.15f),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
