package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorLightIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 26.0f),
                    PathNode.LineTo(40.0f, 26.0f),
                    PathNode.CurveTo(32.268013f, 26.0f, 26.0f, 32.268013f, 26.0f, 40.0f),
                    PathNode.LineTo(26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 223.73198f, 32.268013f, 230.0f, 40.0f, 230.0f),
                    PathNode.LineTo(216.0f, 230.0f),
                    PathNode.CurveTo(223.73198f, 230.0f, 230.0f, 223.73198f, 230.0f, 216.0f),
                    PathNode.LineTo(230.0f, 40.0f),
                    PathNode.CurveTo(230.0f, 32.268013f, 223.73198f, 26.0f, 216.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 216.0f),
                    PathNode.CurveTo(218.0f, 217.10457f, 217.10457f, 218.0f, 216.0f, 218.0f),
                    PathNode.LineTo(40.0f, 218.0f),
                    PathNode.CurveTo(38.89543f, 218.0f, 38.0f, 217.10457f, 38.0f, 216.0f),
                    PathNode.LineTo(38.0f, 40.0f),
                    PathNode.CurveTo(38.0f, 38.89543f, 38.89543f, 38.0f, 40.0f, 38.0f),
                    PathNode.LineTo(216.0f, 38.0f),
                    PathNode.CurveTo(217.10457f, 38.0f, 218.0f, 38.89543f, 218.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 112.0f),
                    PathNode.LineTo(94.0f, 176.0f),
                    PathNode.CurveTo(94.0f, 179.3137f, 91.313705f, 182.0f, 88.0f, 182.0f),
                    PathNode.CurveTo(84.686295f, 182.0f, 82.0f, 179.3137f, 82.0f, 176.0f),
                    PathNode.LineTo(82.0f, 112.0f),
                    PathNode.CurveTo(82.0f, 108.686295f, 84.686295f, 106.0f, 88.0f, 106.0f),
                    PathNode.CurveTo(91.313705f, 106.0f, 94.0f, 108.686295f, 94.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 140.0f),
                    PathNode.LineTo(182.0f, 176.0f),
                    PathNode.CurveTo(182.0f, 179.3137f, 179.3137f, 182.0f, 176.0f, 182.0f),
                    PathNode.CurveTo(172.6863f, 182.0f, 170.0f, 179.3137f, 170.0f, 176.0f),
                    PathNode.LineTo(170.0f, 140.0f),
                    PathNode.CurveTo(170.0f, 127.84974f, 160.15027f, 118.0f, 148.0f, 118.0f),
                    PathNode.CurveTo(135.84973f, 118.0f, 126.0f, 127.84974f, 126.0f, 140.0f),
                    PathNode.LineTo(126.0f, 176.0f),
                    PathNode.CurveTo(126.0f, 179.3137f, 123.313705f, 182.0f, 120.0f, 182.0f),
                    PathNode.CurveTo(116.686295f, 182.0f, 114.0f, 179.3137f, 114.0f, 176.0f),
                    PathNode.LineTo(114.0f, 112.0f),
                    PathNode.CurveTo(114.0f, 108.686295f, 116.686295f, 106.0f, 120.0f, 106.0f),
                    PathNode.CurveTo(123.313705f, 106.0f, 126.0f, 108.686295f, 126.0f, 112.0f),
                    PathNode.LineTo(126.0f, 114.11f),
                    PathNode.CurveTo(136.09613f, 105.541725f, 150.24841f, 103.61466f, 162.26791f, 109.17153f),
                    PathNode.CurveTo(174.28741f, 114.7284f, 181.98717f, 126.75813f, 182.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 84.0f),
                    PathNode.CurveTo(98.0f, 89.52285f, 93.52285f, 94.0f, 88.0f, 94.0f),
                    PathNode.CurveTo(82.47715f, 94.0f, 78.0f, 89.52285f, 78.0f, 84.0f),
                    PathNode.CurveTo(78.0f, 78.47715f, 82.47715f, 74.0f, 88.0f, 74.0f),
                    PathNode.CurveTo(93.52285f, 74.0f, 98.0f, 78.47715f, 98.0f, 84.0f),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
