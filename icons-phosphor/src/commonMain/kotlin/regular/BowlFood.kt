package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorRegularIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(215.63f, 104.0f),
                    PathNode.CurveTo(211.46404f, 58.71355f, 173.47766f, 24.061209f, 128.0f, 24.061209f),
                    PathNode.CurveTo(82.52234f, 24.061209f, 44.535965f, 58.71355f, 40.37f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.CurveTo(27.581722f, 104.0f, 24.0f, 107.58172f, 24.0f, 112.0f),
                    PathNode.CurveTo(24.07164f, 150.77542f, 45.637978f, 186.31366f, 80.0f, 204.28f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 216.83656f, 87.163445f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(168.83656f, 224.0f, 176.0f, 216.83656f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 204.28f),
                    PathNode.CurveTo(210.36201f, 186.31366f, 231.92834f, 150.77542f, 232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 107.58172f, 228.41827f, 104.0f, 224.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.54f, 104.0f),
                    PathNode.LineTo(148.12f, 104.0f),
                    PathNode.CurveTo(157.81917f, 89.44885f, 172.49286f, 78.935135f, 189.39f, 74.43f),
                    PathNode.CurveTo(194.91472f, 83.416534f, 198.38103f, 93.5149f, 199.54f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.48f, 56.23f),
                    PathNode.QuadTo(176.23f, 58.48f, 178.75f, 60.98f),
                    PathNode.CurveTo(157.45363f, 68.47151f, 139.85507f, 83.86802f, 129.6f, 103.98f),
                    PathNode.LineTo(100.1f, 103.98f),
                    PathNode.CurveTo(110.344536f, 75.263535f, 137.51097f, 56.066994f, 168.0f, 56.0f),
                    PathNode.CurveTo(169.83f, 56.0f, 171.66f, 56.09f, 173.48f, 56.23f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(134.4197f, 40.004246f, 140.80988f, 40.868603f, 147.0f, 42.57f),
                    PathNode.CurveTo(116.31529f, 50.181767f, 92.03539f, 73.60747f, 83.33f, 104.0f),
                    PathNode.LineTo(56.46f, 104.0f),
                    PathNode.CurveTo(60.56829f, 67.58154f, 91.35058f, 40.043575f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.66f, 192.0f),
                    PathNode.CurveTo(161.80997f, 193.30946f, 159.98802f, 196.16356f, 160.0f, 199.3f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 199.3f),
                    PathNode.CurveTo(96.01198f, 196.16356f, 94.19004f, 193.30946f, 91.34f, 192.0f),
                    PathNode.CurveTo(62.7068f, 178.82397f, 43.26937f, 151.38292f, 40.34f, 120.0f),
                    PathNode.LineTo(215.63f, 120.0f),
                    PathNode.CurveTo(212.70645f, 151.37627f, 193.28156f, 178.81578f, 164.66f, 192.0f),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
