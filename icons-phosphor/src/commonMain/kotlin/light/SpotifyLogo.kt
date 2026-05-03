package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorLightIcon(
            name = "SpotifyLogo",
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
                    PathNode.MoveTo(157.31f, 168.8f),
                    PathNode.CurveTo(156.568f, 170.2089f, 155.29636f, 171.26505f, 153.7752f, 171.73582f),
                    PathNode.CurveTo(152.25406f, 172.20662f, 150.60814f, 172.05342f, 149.2f, 171.31f),
                    PathNode.CurveTo(135.96349f, 164.18954f, 120.03651f, 164.18954f, 106.8f, 171.31f),
                    PathNode.CurveTo(103.86737f, 172.8564f, 100.2364f, 171.73264f, 98.69f, 168.8f),
                    PathNode.CurveTo(97.1436f, 165.86737f, 98.267365f, 162.2364f, 101.2f, 160.69f),
                    PathNode.CurveTo(117.96842f, 151.83067f, 138.03157f, 151.83067f, 154.8f, 160.69f),
                    PathNode.CurveTo(156.2089f, 161.432f, 157.26505f, 162.70364f, 157.73582f, 164.2248f),
                    PathNode.CurveTo(158.20662f, 165.74594f, 158.05342f, 167.39186f, 157.31f, 168.8f),
                    PathNode.Close,
                    PathNode.MoveTo(189.31f, 112.8f),
                    PathNode.CurveTo(187.74681f, 115.72131f, 184.11162f, 116.82262f, 181.19f, 115.26f),
                    PathNode.CurveTo(147.97287f, 97.480255f, 108.06712f, 97.480255f, 74.85f, 115.26f),
                    PathNode.CurveTo(72.95672f, 116.30706f, 70.64634f, 116.25376f, 68.80337f, 115.120476f),
                    PathNode.CurveTo(66.960396f, 113.9872f, 65.87027f, 111.94948f, 65.95034f, 109.78743f),
                    PathNode.CurveTo(66.0304f, 107.625374f, 67.26825f, 105.67387f, 69.19f, 104.68f),
                    PathNode.CurveTo(105.9425f, 85.005104f, 150.0975f, 85.005104f, 186.85f, 104.68f),
                    PathNode.CurveTo(188.25475f, 105.43413f, 189.30159f, 106.71636f, 189.7594f, 108.2436f),
                    PathNode.CurveTo(190.21718f, 109.77084f, 190.0483f, 111.41749f, 189.29f, 112.82f),
                    PathNode.Close,
                    PathNode.MoveTo(173.31f, 140.8f),
                    PathNode.CurveTo(172.27089f, 142.76933f, 170.22665f, 144.00127f, 168.0f, 144.0f),
                    PathNode.CurveTo(167.0172f, 143.9984f, 166.04947f, 143.7582f, 165.18f, 143.3f),
                    PathNode.CurveTo(141.94284f, 130.90533f, 114.05717f, 130.90533f, 90.82f, 143.3f),
                    PathNode.CurveTo(87.89289f, 144.85744f, 84.25745f, 143.74712f, 82.7f, 140.82f),
                    PathNode.CurveTo(81.142555f, 137.89288f, 82.25289f, 134.25745f, 85.18f, 132.7f),
                    PathNode.CurveTo(111.94283f, 118.428f, 144.05716f, 118.428f, 170.82f, 132.7f),
                    PathNode.CurveTo(172.22635f, 133.44722f, 173.27794f, 134.72287f, 173.7431f, 136.24594f),
                    PathNode.CurveTo(174.20828f, 137.76901f, 174.04887f, 139.41454f, 173.3f, 140.82f),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
