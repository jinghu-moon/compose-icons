package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorFillIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(105.94f, 184.0f, 88.0f, 169.65f, 88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 147.58173f, 91.58172f, 144.0f, 96.0f, 144.0f),
                    PathNode.CurveTo(100.41828f, 144.0f, 104.0f, 147.58173f, 104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 160.67f, 115.0f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(141.0f, 168.0f, 152.0f, 160.67f, 152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 142.52f, 143.39f, 139.0f, 125.12f, 133.74f),
                    PathNode.CurveTo(109.37f, 129.2f, 89.78f, 123.55f, 89.78f, 104.0f),
                    PathNode.CurveTo(89.78f, 85.76f, 106.21f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(143.72f, 72.0f, 157.18f, 79.3f, 163.12f, 91.0f),
                    PathNode.CurveTo(164.51549f, 93.56086f, 164.40685f, 96.67821f, 162.83647f, 99.135704f),
                    PathNode.CurveTo(161.26608f, 101.59319f, 158.4828f, 103.00141f, 155.57262f, 102.81088f),
                    PathNode.CurveTo(152.66248f, 102.62035f, 150.08656f, 100.86127f, 148.85f, 98.22f),
                    PathNode.CurveTo(145.64f, 91.94f, 137.65f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(115.33f, 88.0f, 105.78f, 94.88f, 105.78f, 104.0f),
                    PathNode.CurveTo(105.78f, 111.0f, 114.78f, 114.1f, 129.55f, 118.36f),
                    PathNode.CurveTo(145.78f, 123.0f, 168.0f, 129.45f, 168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 169.65f, 150.06f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
