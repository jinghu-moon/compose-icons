package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorLightIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 120.0f),
                    PathNode.LineTo(22.0f, 168.0f),
                    PathNode.CurveTo(22.0f, 171.3137f, 19.31371f, 174.0f, 16.0f, 174.0f),
                    PathNode.CurveTo(12.686292f, 174.0f, 10.0f, 171.3137f, 10.0f, 168.0f),
                    PathNode.LineTo(10.0f, 120.0f),
                    PathNode.CurveTo(10.0f, 116.686295f, 12.686292f, 114.0f, 16.0f, 114.0f),
                    PathNode.CurveTo(19.31371f, 114.0f, 22.0f, 116.686295f, 22.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 90.0f),
                    PathNode.CurveTo(44.68629f, 90.0f, 42.0f, 92.686295f, 42.0f, 96.0f),
                    PathNode.LineTo(42.0f, 192.0f),
                    PathNode.CurveTo(42.0f, 195.3137f, 44.68629f, 198.0f, 48.0f, 198.0f),
                    PathNode.CurveTo(51.31371f, 198.0f, 54.0f, 195.3137f, 54.0f, 192.0f),
                    PathNode.LineTo(54.0f, 96.0f),
                    PathNode.CurveTo(54.0f, 92.686295f, 51.31371f, 90.0f, 48.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 82.0f),
                    PathNode.CurveTo(76.686295f, 82.0f, 74.0f, 84.686295f, 74.0f, 88.0f),
                    PathNode.LineTo(74.0f, 192.0f),
                    PathNode.CurveTo(74.0f, 195.3137f, 76.686295f, 198.0f, 80.0f, 198.0f),
                    PathNode.CurveTo(83.313705f, 198.0f, 86.0f, 195.3137f, 86.0f, 192.0f),
                    PathNode.LineTo(86.0f, 88.0f),
                    PathNode.CurveTo(86.0f, 84.686295f, 83.313705f, 82.0f, 80.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 50.0f),
                    PathNode.CurveTo(108.686295f, 50.0f, 106.0f, 52.68629f, 106.0f, 56.0f),
                    PathNode.LineTo(106.0f, 192.0f),
                    PathNode.CurveTo(106.0f, 195.3137f, 108.686295f, 198.0f, 112.0f, 198.0f),
                    PathNode.CurveTo(115.313705f, 198.0f, 118.0f, 195.3137f, 118.0f, 192.0f),
                    PathNode.LineTo(118.0f, 56.0f),
                    PathNode.CurveTo(118.0f, 52.68629f, 115.313705f, 50.0f, 112.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.06f, 107.88f),
                    PathNode.CurveTo(215.09294f, 69.9446f, 182.40182f, 41.996365f, 144.0f, 42.0f),
                    PathNode.CurveTo(140.6863f, 42.0f, 138.0f, 44.68629f, 138.0f, 48.0f),
                    PathNode.CurveTo(138.0f, 51.31371f, 140.6863f, 54.0f, 144.0f, 54.0f),
                    PathNode.CurveTo(177.91588f, 53.879223f, 206.35857f, 79.57594f, 209.67f, 113.33f),
                    PathNode.CurveTo(209.9353f, 115.9664f, 211.89854f, 118.11662f, 214.5f, 118.62f),
                    PathNode.CurveTo(231.70755f, 121.951866f, 243.56259f, 137.8186f, 241.8796f, 155.26477f),
                    PathNode.CurveTo(240.1966f, 172.71094f, 225.52715f, 186.01892f, 208.0f, 186.0f),
                    PathNode.LineTo(144.0f, 186.0f),
                    PathNode.CurveTo(140.6863f, 186.0f, 138.0f, 188.6863f, 138.0f, 192.0f),
                    PathNode.CurveTo(138.0f, 195.3137f, 140.6863f, 198.0f, 144.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(230.87325f, 198.02173f, 250.28769f, 181.23412f, 253.56816f, 158.59732f),
                    PathNode.CurveTo(256.84863f, 135.96054f, 242.99844f, 114.35228f, 221.06f, 107.88f),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
