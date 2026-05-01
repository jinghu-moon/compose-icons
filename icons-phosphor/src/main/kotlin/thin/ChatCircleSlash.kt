package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorThinIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(57.83f, 56.76f),
                    PathNode.CurveTo(25.834963f, 88.26294f, 18.76034f, 137.22916f, 40.53f, 176.5f),
                    PathNode.LineTo(28.63f, 212.19f),
                    PathNode.CurveTo(27.191862f, 216.5024f, 28.313967f, 221.2572f, 31.528385f, 224.47162f),
                    PathNode.CurveTo(34.7428f, 227.68604f, 39.49761f, 228.80812f, 43.81f, 227.37f),
                    PathNode.LineTo(79.5f, 215.47f),
                    PathNode.CurveTo(115.70629f, 235.53923f, 160.53523f, 231.22531f, 192.25f, 204.62f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(111.82468f, 220.0049f, 95.93396f, 215.74507f, 81.93f, 207.65f),
                    PathNode.CurveTo(80.937614f, 207.0766f, 79.74694f, 206.95644f, 78.66f, 207.32f),
                    PathNode.LineTo(41.28f, 219.78f),
                    PathNode.CurveTo(39.842537f, 220.2594f, 38.2576f, 219.88535f, 37.186127f, 218.81387f),
                    PathNode.CurveTo(36.114655f, 217.7424f, 35.74062f, 216.15747f, 36.22f, 214.72f),
                    PathNode.LineTo(48.68f, 177.34f),
                    PathNode.CurveTo(49.04356f, 176.25307f, 48.9234f, 175.06238f, 48.35f, 174.07f),
                    PathNode.CurveTo(27.42416f, 137.87718f, 33.53232f, 92.12556f, 63.22f, 62.69f),
                    PathNode.LineTo(186.86f, 198.69f),
                    PathNode.CurveTo(170.34482f, 212.47379f, 149.51147f, 220.01639f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(227.99637f, 144.52605f, 223.90851f, 160.79506f, 216.1f, 175.36f),
                    PathNode.CurveTo(215.40001f, 176.65681f, 214.04367f, 177.4637f, 212.57f, 177.46f),
                    PathNode.CurveTo(211.90958f, 177.46219f, 211.25935f, 177.29706f, 210.68f, 176.98f),
                    PathNode.CurveTo(209.7447f, 176.47781f, 209.0474f, 175.62444f, 208.74165f, 174.60783f),
                    PathNode.CurveTo(208.43594f, 173.59122f, 208.54684f, 172.49478f, 209.05f, 171.56f),
                    PathNode.CurveTo(227.53815f, 137.21024f, 222.35356f, 94.935074f, 196.1129f, 66.07081f),
                    PathNode.CurveTo(169.87225f, 37.20654f, 128.2809f, 28.028961f, 92.33f, 43.17f),
                    PathNode.CurveTo(90.30251f, 43.994415f, 87.98892f, 43.036247f, 87.138f, 41.019745f),
                    PathNode.CurveTo(86.28707f, 39.003246f, 87.21483f, 36.677288f, 89.22f, 35.8f),
                    PathNode.CurveTo(120.099976f, 22.835373f, 155.41873f, 26.181416f, 183.31467f, 44.714382f),
                    PathNode.CurveTo(211.2106f, 63.24736f, 227.9834f, 94.508896f, 228.0f, 128.0f),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
