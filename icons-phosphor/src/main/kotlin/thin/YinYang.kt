package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorThinIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.055115f, 77.21265f, 77.21265f, 36.055115f, 128.0f, 36.0f),
                    PathNode.CurveTo(152.30052f, 36.0f, 172.0f, 55.69947f, 172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 104.30053f, 152.30052f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(107.17901f, 124.03334f, 88.38521f, 136.48311f, 80.23389f, 155.6422f),
                    PathNode.CurveTo(72.082565f, 174.80128f, 76.145424f, 196.97552f, 90.56f, 212.0f),
                    PathNode.CurveTo(57.413296f, 197.1934f, 36.050453f, 164.30339f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(103.69947f, 220.0f, 84.0f, 200.30052f, 84.0f, 176.0f),
                    PathNode.CurveTo(84.0f, 151.69948f, 103.69947f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(148.82097f, 131.96666f, 167.61478f, 119.51689f, 175.76611f, 100.3578f),
                    PathNode.CurveTo(183.91743f, 81.19871f, 179.85457f, 59.02447f, 165.44f, 44.0f),
                    PathNode.CurveTo(205.06764f, 61.701866f, 226.93387f, 104.690834f, 217.90321f, 147.14261f),
                    PathNode.CurveTo(208.87256f, 189.59439f, 171.40169f, 219.96072f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 180.41827f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 171.58173f, 123.58172f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(132.41827f, 168.0f, 136.0f, 171.58173f, 136.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 84.41828f, 132.41827f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(123.58172f, 88.0f, 120.0f, 84.41828f, 120.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
