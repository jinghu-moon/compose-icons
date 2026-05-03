package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorLightIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 64.0f),
                    PathNode.LineTo(182.0f, 192.0f),
                    PathNode.CurveTo(182.0f, 195.3137f, 179.3137f, 198.0f, 176.0f, 198.0f),
                    PathNode.CurveTo(172.6863f, 198.0f, 170.0f, 195.3137f, 170.0f, 192.0f),
                    PathNode.LineTo(170.0f, 64.0f),
                    PathNode.CurveTo(170.0f, 60.68629f, 172.6863f, 58.0f, 176.0f, 58.0f),
                    PathNode.CurveTo(179.3137f, 58.0f, 182.0f, 60.68629f, 182.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 58.0f),
                    PathNode.CurveTo(220.6863f, 58.0f, 218.0f, 60.68629f, 218.0f, 64.0f),
                    PathNode.LineTo(218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 195.3137f, 220.6863f, 198.0f, 224.0f, 198.0f),
                    PathNode.CurveTo(227.3137f, 198.0f, 230.0f, 195.3137f, 230.0f, 192.0f),
                    PathNode.LineTo(230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 60.68629f, 227.3137f, 58.0f, 224.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 128.0f),
                    PathNode.CurveTo(142.0041f, 132.72601f, 139.5843f, 137.12396f, 135.59f, 139.65f),
                    PathNode.LineTo(47.41f, 195.8f),
                    PathNode.CurveTo(43.138332f, 198.53485f, 37.716682f, 198.7278f, 33.261414f, 196.30351f),
                    PathNode.CurveTo(28.806149f, 193.87923f, 26.023617f, 189.22208f, 26.0f, 184.15f),
                    PathNode.LineTo(26.0f, 71.85f),
                    PathNode.CurveTo(26.023617f, 66.77792f, 28.806149f, 62.12077f, 33.261414f, 59.696487f),
                    PathNode.CurveTo(37.716682f, 57.27221f, 43.138332f, 57.46515f, 47.41f, 60.2f),
                    PathNode.LineTo(135.59f, 116.35f),
                    PathNode.CurveTo(139.5843f, 118.87604f, 142.0041f, 123.27398f, 142.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.0f, 128.0f),
                    PathNode.CurveTo(130.00629f, 127.37579f, 129.6833f, 126.79443f, 129.15f, 126.47f),
                    PathNode.LineTo(41.0f, 70.32f),
                    PathNode.CurveTo(40.704067f, 70.120026f, 40.35705f, 70.00898f, 40.0f, 70.0f),
                    PathNode.CurveTo(39.65123f, 70.000206f, 39.30784f, 70.086044f, 39.0f, 70.25f),
                    PathNode.CurveTo(38.384796f, 70.54451f, 37.995144f, 71.16795f, 38.0f, 71.85f),
                    PathNode.LineTo(38.0f, 184.15f),
                    PathNode.CurveTo(37.995144f, 184.83205f, 38.384796f, 185.45549f, 39.0f, 185.75f),
                    PathNode.CurveTo(39.62593f, 186.1081f, 40.400635f, 186.08098f, 41.0f, 185.68f),
                    PathNode.LineTo(129.19f, 129.53f),
                    PathNode.CurveTo(129.70801f, 129.19585f, 130.01485f, 128.61626f, 130.0f, 128.0f),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
