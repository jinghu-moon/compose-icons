package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorFillIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 100.41828f, 236.41827f, 104.0f, 232.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(216.0f, 124.41828f, 212.41827f, 128.0f, 208.0f, 128.0f),
                    PathNode.CurveTo(203.58173f, 128.0f, 200.0f, 124.41828f, 200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(179.58173f, 104.0f, 176.0f, 100.41828f, 176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 91.58172f, 179.58173f, 88.0f, 184.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(200.0f, 67.58172f, 203.58173f, 64.0f, 208.0f, 64.0f),
                    PathNode.CurveTo(212.41827f, 64.0f, 216.0f, 67.58172f, 216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(236.41827f, 88.0f, 240.0f, 91.58172f, 240.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 56.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.CurveTo(152.0f, 68.41828f, 155.58173f, 72.0f, 160.0f, 72.0f),
                    PathNode.CurveTo(164.41827f, 72.0f, 168.0f, 68.41828f, 168.0f, 64.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 52.418278f, 184.0f, 48.0f),
                    PathNode.CurveTo(184.0f, 43.581722f, 180.41827f, 40.0f, 176.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(168.0f, 27.581722f, 164.41827f, 24.0f, 160.0f, 24.0f),
                    PathNode.CurveTo(155.58173f, 24.0f, 152.0f, 27.581722f, 152.0f, 32.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(139.58173f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 52.418278f, 139.58173f, 56.0f, 144.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.14f, 150.33f),
                    PathNode.CurveTo(180.32344f, 156.02333f, 150.56523f, 146.97531f, 129.79497f, 126.20504f),
                    PathNode.CurveTo(109.02469f, 105.43477f, 99.97667f, 75.67656f, 105.67f, 46.86f),
                    PathNode.CurveTo(106.22917f, 44.024757f, 105.21578f, 41.108337f, 103.019005f, 39.23072f),
                    PathNode.CurveTo(100.822235f, 37.3531f, 97.78359f, 36.806183f, 95.07f, 37.8f),
                    PathNode.CurveTo(53.31861f, 53.066933f, 27.510427f, 95.001785f, 32.693336f, 139.15375f),
                    PathNode.CurveTo(37.876247f, 183.3057f, 72.694305f, 218.12375f, 116.84627f, 223.30666f),
                    PathNode.CurveTo(160.99821f, 228.48958f, 202.93306f, 202.68138f, 218.2f, 160.93f),
                    PathNode.CurveTo(219.19382f, 158.2164f, 218.6469f, 155.17776f, 216.76929f, 152.98099f),
                    PathNode.CurveTo(214.89166f, 150.78423f, 211.97525f, 149.77083f, 209.14f, 150.33f),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
