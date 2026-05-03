package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorThinIcon(
            name = "SteamLogo",
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
                    PathNode.MoveTo(115.12f, 182.62f),
                    PathNode.LineTo(176.33f, 132.69f),
                    PathNode.CurveTo(185.85785f, 124.9974f, 190.16014f, 112.54189f, 187.41124f, 100.60876f),
                    PathNode.CurveTo(184.66235f, 88.67562f, 175.34438f, 79.35765f, 163.41124f, 76.60876f),
                    PathNode.CurveTo(151.47809f, 73.85986f, 139.0226f, 78.16215f, 131.33f, 87.69f),
                    PathNode.LineTo(85.48f, 143.83f),
                    PathNode.LineTo(40.68f, 99.0f),
                    PathNode.CurveTo(56.361122f, 51.84552f, 106.78045f, 25.79451f, 154.31372f, 40.286934f),
                    PathNode.CurveTo(201.84702f, 54.77935f, 229.15553f, 104.5288f, 215.86095f, 152.41092f),
                    PathNode.CurveTo(202.56636f, 200.29303f, 153.51814f, 228.84186f, 105.31737f, 216.7535f),
                    PathNode.CurveTo(57.1166f, 204.66512f, 27.345472f, 156.34904f, 38.22f, 107.86f),
                    PathNode.LineTo(80.45f, 150.09f),
                    PathNode.CurveTo(73.57144f, 159.87115f, 74.94246f, 173.22374f, 83.66515f, 181.40298f),
                    PathNode.CurveTo(92.38784f, 189.58224f, 105.80091f, 190.09268f, 115.12f, 182.6f),
                    PathNode.Close,
                    PathNode.MoveTo(124.03f, 109.22f),
                    PathNode.CurveTo(124.65565f, 125.94179f, 138.05884f, 139.35805f, 154.78f, 140.0f),
                    PathNode.LineTo(124.0f, 165.09f),
                    PathNode.CurveTo(124.0f, 164.73f, 124.0f, 164.37f, 124.0f, 164.0f),
                    PathNode.CurveTo(124.0f, 150.74516f, 113.25484f, 140.0f, 100.0f, 140.0f),
                    PathNode.CurveTo(99.63f, 140.0f, 99.27f, 140.0f, 98.91f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 132.0f),
                    PathNode.CurveTo(142.74516f, 132.0f, 132.0f, 121.25484f, 132.0f, 108.0f),
                    PathNode.CurveTo(132.0f, 94.74516f, 142.74516f, 84.0f, 156.0f, 84.0f),
                    PathNode.CurveTo(169.25484f, 84.0f, 180.0f, 94.74516f, 180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 121.25484f, 169.25484f, 132.0f, 156.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.CurveTo(108.836555f, 148.0f, 116.0f, 155.16344f, 116.0f, 164.0f),
                    PathNode.CurveTo(116.0f, 172.83656f, 108.836555f, 180.0f, 100.0f, 180.0f),
                    PathNode.CurveTo(91.163445f, 180.0f, 84.0f, 172.83656f, 84.0f, 164.0f),
                    PathNode.CurveTo(84.0f, 155.16344f, 91.163445f, 148.0f, 100.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
