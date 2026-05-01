package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorRegularIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.CurveTo(231.93387f, 62.589794f, 185.4102f, 16.066128f, 128.0f, 16.0f),
                    PathNode.LineTo(128.0f, 16.0f),
                    PathNode.CurveTo(70.5898f, 16.066128f, 24.066128f, 62.589794f, 24.0f, 120.0f),
                    PathNode.CurveTo(23.995537f, 122.44847f, 25.120968f, 124.76206f, 27.05f, 126.27f),
                    PathNode.CurveTo(27.095219f, 126.31856f, 27.145506f, 126.362144f, 27.2f, 126.4f),
                    PathNode.LineTo(120.0f, 196.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.CurveTo(107.58172f, 216.0f, 104.0f, 219.58173f, 104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 228.41827f, 107.58172f, 232.0f, 112.0f, 232.0f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.CurveTo(148.41827f, 232.0f, 152.0f, 228.41827f, 152.0f, 224.0f),
                    PathNode.CurveTo(152.0f, 219.58173f, 148.41827f, 216.0f, 144.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 196.0f),
                    PathNode.LineTo(228.8f, 126.4f),
                    PathNode.LineTo(228.8f, 126.4f),
                    PathNode.CurveTo(230.81445f, 124.88917f, 232.0f, 122.51806f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.64f, 112.0f),
                    PathNode.LineTo(175.83f, 112.0f),
                    PathNode.CurveTo(174.29f, 74.05f, 161.92f, 49.57f, 150.72f, 35.0f),
                    PathNode.CurveTo(186.32764f, 44.57351f, 212.22234f, 75.286575f, 215.64f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 34.0f),
                    PathNode.CurveTo(133.35838f, 38.734955f, 138.03006f, 44.194225f, 141.88f, 50.22f),
                    PathNode.CurveTo(149.49f, 62.0f, 158.45f, 81.87f, 159.82f, 112.0f),
                    PathNode.LineTo(96.18f, 112.0f),
                    PathNode.CurveTo(97.55f, 81.87f, 106.51f, 62.0f, 114.12f, 50.26f),
                    PathNode.CurveTo(117.96725f, 44.220337f, 122.63902f, 38.747494f, 128.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.4f, 128.0f),
                    PathNode.LineTo(128.0f, 175.53f),
                    PathNode.LineTo(101.6f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.29f, 128.0f),
                    PathNode.LineTo(102.79f, 163.09f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.71f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.LineTo(153.21f, 163.09f),
                    PathNode.Close,
                    PathNode.MoveTo(105.28f, 35.0f),
                    PathNode.CurveTo(94.08f, 49.57f, 81.71f, 74.05f, 80.17f, 112.0f),
                    PathNode.LineTo(40.36f, 112.0f),
                    PathNode.CurveTo(43.77766f, 75.286575f, 69.67236f, 44.57351f, 105.28f, 35.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _parachute!!
    }

private var _parachute: ImageVector? = null
