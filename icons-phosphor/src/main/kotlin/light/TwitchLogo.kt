package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorLightIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 199.73198f, 40.268013f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(66.0f, 206.0f),
                    PathNode.LineTo(66.0f, 240.0f),
                    PathNode.CurveTo(66.0001f, 242.3278f, 67.346596f, 244.4455f, 69.45453f, 245.43303f),
                    PathNode.CurveTo(71.56246f, 246.4206f, 74.05138f, 246.0998f, 75.84f, 244.61f),
                    PathNode.LineTo(122.17f, 206.0f),
                    PathNode.LineTo(165.1f, 206.0f),
                    PathNode.CurveTo(168.3886f, 206.00734f, 171.57483f, 204.85677f, 174.1f, 202.75f),
                    PathNode.LineTo(217.0f, 167.0f),
                    PathNode.CurveTo(220.17926f, 164.33182f, 222.0107f, 160.3905f, 222.0f, 156.24f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 156.25f),
                    PathNode.CurveTo(210.00096f, 156.84486f, 209.73708f, 157.40929f, 209.28f, 157.79f),
                    PathNode.LineTo(166.38f, 193.54f),
                    PathNode.CurveTo(166.02017f, 193.83817f, 165.5673f, 194.00092f, 165.1f, 194.0f),
                    PathNode.LineTo(120.0f, 194.0f),
                    PathNode.CurveTo(118.59685f, 194.00008f, 117.23809f, 194.49191f, 116.16f, 195.39f),
                    PathNode.LineTo(78.0f, 227.19f),
                    PathNode.LineTo(78.0f, 200.0f),
                    PathNode.CurveTo(78.0f, 196.6863f, 75.313705f, 194.0f, 72.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(46.89543f, 194.0f, 46.0f, 193.10457f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 88.0f),
                    PathNode.LineTo(174.0f, 136.0f),
                    PathNode.CurveTo(174.0f, 139.3137f, 171.3137f, 142.0f, 168.0f, 142.0f),
                    PathNode.CurveTo(164.6863f, 142.0f, 162.0f, 139.3137f, 162.0f, 136.0f),
                    PathNode.LineTo(162.0f, 88.0f),
                    PathNode.CurveTo(162.0f, 84.686295f, 164.6863f, 82.0f, 168.0f, 82.0f),
                    PathNode.CurveTo(171.3137f, 82.0f, 174.0f, 84.686295f, 174.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(126.0f, 88.0f),
                    PathNode.LineTo(126.0f, 136.0f),
                    PathNode.CurveTo(126.0f, 139.3137f, 123.313705f, 142.0f, 120.0f, 142.0f),
                    PathNode.CurveTo(116.686295f, 142.0f, 114.0f, 139.3137f, 114.0f, 136.0f),
                    PathNode.LineTo(114.0f, 88.0f),
                    PathNode.CurveTo(114.0f, 84.686295f, 116.686295f, 82.0f, 120.0f, 82.0f),
                    PathNode.CurveTo(123.313705f, 82.0f, 126.0f, 84.686295f, 126.0f, 88.0f),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
