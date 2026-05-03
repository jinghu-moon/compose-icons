package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorLightIcon(
            name = "WifiMedium",
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
                    PathNode.MoveTo(203.73f, 124.34f),
                    PathNode.CurveTo(159.35548f, 89.20698f, 96.64451f, 89.20698f, 52.27f, 124.34f),
                    PathNode.CurveTo(49.6715f, 126.400024f, 49.234978f, 130.1765f, 51.295f, 132.775f),
                    PathNode.CurveTo(53.355022f, 135.3735f, 57.1315f, 135.81003f, 59.73f, 133.75f),
                    PathNode.CurveTo(99.735565f, 102.08445f, 156.26443f, 102.08445f, 196.27f, 133.75f),
                    PathNode.CurveTo(197.33752f, 134.574f, 198.65152f, 135.01434f, 200.0f, 135.0f),
                    PathNode.CurveTo(202.55255f, 135.00015f, 204.82579f, 133.38533f, 205.66602f, 130.97502f),
                    PathNode.CurveTo(206.50624f, 128.56471f, 205.7295f, 125.88667f, 203.73f, 124.3f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
