package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorFillIcon(
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
                    PathNode.CurveTo(24.005505f, 122.5163f, 25.194597f, 124.88337f, 27.21f, 126.39f),
                    PathNode.LineTo(27.21f, 126.39f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _parachute!!
    }

private var _parachute: ImageVector? = null
