package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandArrowUp: ImageVector
    get() {
        if (_handArrowUp != null) return _handArrowUp!!
        _handArrowUp = phosphorFillIcon(
            name = "HandArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.33f, 141.06f),
                    PathNode.CurveTo(224.29591f, 136.41739f, 216.44234f, 134.85333f, 209.09f, 136.83f),
                    PathNode.LineTo(167.25f, 146.45f),
                    PathNode.CurveTo(169.22212f, 138.11911f, 167.2746f, 129.3438f, 161.96342f, 122.629295f),
                    PathNode.CurveTo(156.65225f, 115.91481f, 148.56113f, 111.99908f, 140.0f, 112.0f),
                    PathNode.LineTo(89.94f, 112.0f),
                    PathNode.CurveTo(81.4486f, 111.97872f, 73.300934f, 115.35228f, 67.31f, 121.37f),
                    PathNode.LineTo(44.69f, 144.0f),
                    PathNode.LineTo(16.0f, 144.0f),
                    PathNode.CurveTo(7.163444f, 144.0f, 0f, 151.16344f, 0f, 160.0f),
                    PathNode.LineTo(0f, 200.0f),
                    PathNode.CurveTo(0f, 208.83656f, 7.163444f, 216.0f, 16.0f, 216.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.65409f, 216.00032f, 121.30571f, 215.91971f, 121.94f, 215.76f),
                    PathNode.LineTo(185.94f, 199.76f),
                    PathNode.CurveTo(186.35075f, 199.66139f, 186.75224f, 199.52757f, 187.14f, 199.36f),
                    PathNode.LineTo(226.0f, 182.82f),
                    PathNode.LineTo(226.44f, 182.62f),
                    PathNode.CurveTo(234.0345f, 178.82509f, 239.13547f, 171.38242f, 239.93472f, 162.93027f),
                    PathNode.CurveTo(240.73398f, 154.47812f, 237.11853f, 146.21121f, 230.37f, 141.06f),
                    PathNode.Close,
                    PathNode.MoveTo(219.43f, 168.21f),
                    PathNode.LineTo(181.43f, 184.39f),
                    PathNode.LineTo(119.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 155.31f),
                    PathNode.LineTo(78.63f, 132.69f),
                    PathNode.CurveTo(81.620255f, 129.67581f, 85.69421f, 127.986435f, 89.94f, 128.0f),
                    PathNode.LineTo(140.0f, 128.0f),
                    PathNode.CurveTo(146.62741f, 128.0f, 152.0f, 133.37259f, 152.0f, 140.0f),
                    PathNode.CurveTo(152.0f, 146.62741f, 146.62741f, 152.0f, 140.0f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(107.58172f, 152.0f, 104.0f, 155.58173f, 104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 164.41827f, 107.58172f, 168.0f, 112.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(144.60214f, 167.9983f, 145.20233f, 167.93124f, 145.79f, 167.8f),
                    PathNode.LineTo(212.79f, 152.39f),
                    PathNode.LineTo(213.1f, 152.31f),
                    PathNode.CurveTo(217.33574f, 151.1341f, 221.77643f, 153.34186f, 223.39574f, 157.42867f),
                    PathNode.CurveTo(225.01505f, 161.51549f, 223.29163f, 166.16562f, 219.4f, 168.21f),
                    PathNode.Close,
                    PathNode.MoveTo(154.34f, 61.66f),
                    PathNode.CurveTo(152.83777f, 60.159454f, 151.99371f, 58.123276f, 151.99371f, 56.0f),
                    PathNode.CurveTo(151.99371f, 53.876724f, 152.83777f, 51.840546f, 154.34f, 50.34f),
                    PathNode.LineTo(186.34f, 18.34f),
                    PathNode.CurveTo(187.84055f, 16.837784f, 189.87672f, 15.993707f, 192.0f, 15.993707f),
                    PathNode.CurveTo(194.12328f, 15.993707f, 196.15945f, 16.837784f, 197.66f, 18.34f),
                    PathNode.LineTo(229.66f, 50.34f),
                    PathNode.CurveTo(232.78593f, 53.46593f, 232.78593f, 58.53407f, 229.66f, 61.66f),
                    PathNode.CurveTo(226.53407f, 64.785934f, 221.46593f, 64.785934f, 218.34f, 61.66f),
                    PathNode.LineTo(200.0f, 43.31f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 108.41828f, 196.41827f, 112.0f, 192.0f, 112.0f),
                    PathNode.CurveTo(187.58173f, 112.0f, 184.0f, 108.41828f, 184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 43.31f),
                    PathNode.LineTo(165.66f, 61.66f),
                    PathNode.CurveTo(164.15945f, 63.162216f, 162.12328f, 64.006294f, 160.0f, 64.006294f),
                    PathNode.CurveTo(157.87672f, 64.006294f, 155.84055f, 63.162216f, 154.34f, 61.66f),
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
        return _handArrowUp!!
    }

private var _handArrowUp: ImageVector? = null
