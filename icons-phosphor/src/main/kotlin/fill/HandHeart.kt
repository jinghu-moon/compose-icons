package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = phosphorFillIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.33f, 141.06f),
                    PathNode.CurveTo(225.0431f, 136.98555f, 218.31496f, 135.26105f, 211.72f, 136.29f),
                    PathNode.CurveTo(230.5f, 117.33f, 240.0f, 98.48f, 240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 53.53f, 218.71f, 32.0f, 192.54f, 32.0f),
                    PathNode.CurveTo(178.48375f, 31.911728f, 165.10782f, 38.04328f, 156.0f, 48.75f),
                    PathNode.CurveTo(146.89218f, 38.04328f, 133.51625f, 31.911728f, 119.46f, 32.0f),
                    PathNode.CurveTo(93.29f, 32.0f, 72.0f, 53.53f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 91.0f, 75.24f, 101.69f, 82.06f, 113.0f),
                    PathNode.CurveTo(76.47438f, 114.415115f, 71.3769f, 117.318085f, 67.31f, 121.4f),
                    PathNode.LineTo(44.69f, 144.0f),
                    PathNode.LineTo(16.0f, 144.0f),
                    PathNode.CurveTo(7.163444f, 144.0f, 0f, 151.16344f, 0f, 160.0f),
                    PathNode.LineTo(0f, 200.0f),
                    PathNode.CurveTo(0f, 208.83656f, 7.163444f, 216.0f, 16.0f, 216.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.65409f, 216.00032f, 121.30571f, 215.91971f, 121.94f, 215.76f),
                    PathNode.LineTo(185.94f, 199.76f),
                    PathNode.CurveTo(186.34793f, 199.66289f, 186.74623f, 199.529f, 187.13f, 199.36f),
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
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
