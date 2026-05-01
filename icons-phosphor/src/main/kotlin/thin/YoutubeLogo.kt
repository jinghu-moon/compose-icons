package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorThinIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.22f, 124.67f),
                    PathNode.LineTo(114.22f, 92.67f),
                    PathNode.CurveTo(112.99226f, 91.85087f, 111.41322f, 91.77437f, 110.11206f, 92.47098f),
                    PathNode.CurveTo(108.81089f, 93.16758f, 107.99904f, 94.52409f, 108.0f, 96.0f),
                    PathNode.LineTo(108.0f, 160.0f),
                    PathNode.CurveTo(107.998276f, 161.47581f, 108.80932f, 162.83267f, 110.11f, 163.53f),
                    PathNode.CurveTo(111.41188f, 164.22714f, 112.99196f, 164.15025f, 114.22f, 163.33f),
                    PathNode.LineTo(162.22f, 131.33f),
                    PathNode.CurveTo(163.33435f, 130.58841f, 164.0039f, 129.33856f, 164.0039f, 128.0f),
                    PathNode.CurveTo(164.0039f, 126.66144f, 163.33435f, 125.4116f, 162.22f, 124.67f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 152.53f),
                    PathNode.LineTo(116.0f, 103.47f),
                    PathNode.LineTo(152.79f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.46f, 70.53f),
                    PathNode.CurveTo(228.87392f, 64.29588f, 224.38606f, 59.20519f, 218.4f, 56.85f),
                    PathNode.CurveTo(184.6f, 43.79f, 130.27f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(125.73f, 44.0f, 71.4f, 43.79f, 37.6f, 56.85f),
                    PathNode.CurveTo(31.616344f, 59.20319f, 27.128925f, 64.28967f, 25.54f, 70.52f),
                    PathNode.CurveTo(23.0f, 80.27f, 20.0f, 98.16f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 157.84f, 23.0f, 175.73f, 25.54f, 185.48f),
                    PathNode.CurveTo(27.128925f, 191.71033f, 31.616344f, 196.79681f, 37.6f, 199.15f),
                    PathNode.CurveTo(71.4f, 212.21f, 125.73f, 212.0f, 128.0f, 212.0f),
                    PathNode.LineTo(128.71f, 212.0f),
                    PathNode.CurveTo(135.6f, 212.0f, 186.29f, 211.57f, 218.43f, 199.15f),
                    PathNode.CurveTo(224.41365f, 196.79681f, 228.90108f, 191.71033f, 230.49f, 185.48f),
                    PathNode.CurveTo(233.0f, 175.72f, 236.0f, 157.84f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 98.16f, 233.0f, 80.27f, 230.46f, 70.52f),
                    PathNode.Close,
                    PathNode.MoveTo(222.72f, 183.53f),
                    PathNode.CurveTo(221.7771f, 187.26935f, 219.09453f, 190.3277f, 215.51f, 191.75f),
                    PathNode.CurveTo(183.14f, 204.19f, 128.57f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(127.43f, 204.0f, 72.89f, 204.19f, 40.52f, 191.69f),
                    PathNode.CurveTo(36.935467f, 190.2677f, 34.2529f, 187.20935f, 33.31f, 183.47f),
                    PathNode.CurveTo(30.87f, 174.17f, 28.0f, 157.0f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 99.0f, 30.87f, 81.83f, 33.28f, 72.53f),
                    PathNode.CurveTo(34.2229f, 68.79065f, 36.905468f, 65.7323f, 40.49f, 64.31f),
                    PathNode.CurveTo(72.86f, 51.81f, 127.43f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(128.57f, 52.0f, 183.11f, 51.8f, 215.48f, 64.31f),
                    PathNode.CurveTo(219.06453f, 65.7323f, 221.7471f, 68.79065f, 222.69f, 72.53f),
                    PathNode.CurveTo(225.13f, 81.83f, 228.0f, 99.0f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 157.0f, 225.13f, 174.17f, 222.72f, 183.47f),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
