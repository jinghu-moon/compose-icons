package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorRegularIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.055107f, 79.42178f, 79.42178f, 40.055107f, 128.0f, 40.0f),
                    PathNode.CurveTo(150.09138f, 40.0f, 168.0f, 57.90861f, 168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 102.09139f, 150.09138f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(108.79572f, 119.99535f, 90.92851f, 129.83168f, 80.66143f, 146.061f),
                    PathNode.CurveTo(70.394356f, 162.29036f, 69.15959f, 182.64879f, 77.39f, 200.0f),
                    PathNode.CurveTo(53.94706f, 183.51938f, 39.9969f, 156.65628f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(105.90861f, 216.0f, 88.0f, 198.09138f, 88.0f, 176.0f),
                    PathNode.CurveTo(88.0f, 153.90862f, 105.90861f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(147.19023f, 135.99655f, 165.04227f, 126.16692f, 175.30643f, 109.952354f),
                    PathNode.CurveTo(185.57059f, 93.737785f, 186.81726f, 73.396645f, 178.61f, 56.05f),
                    PathNode.CurveTo(209.96799f, 78.13242f, 223.41277f, 117.98075f, 211.84279f, 154.54703f),
                    PathNode.CurveTo(200.2728f, 191.1133f, 166.35304f, 215.97495f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 182.62741f, 134.62741f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(121.37258f, 188.0f, 116.0f, 182.62741f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 169.37259f, 121.37258f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(134.62741f, 164.0f, 140.0f, 169.37259f, 140.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 134.62741f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(121.37258f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
