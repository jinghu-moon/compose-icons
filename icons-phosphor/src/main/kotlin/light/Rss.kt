package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorLightIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(105.5f, 150.5f),
                    PathNode.CurveTo(118.67039f, 163.5997f, 126.05227f, 181.42424f, 126.0f, 200.0f),
                    PathNode.CurveTo(126.0f, 203.3137f, 123.313705f, 206.0f, 120.0f, 206.0f),
                    PathNode.CurveTo(116.686295f, 206.0f, 114.0f, 203.3137f, 114.0f, 200.0f),
                    PathNode.CurveTo(114.0f, 167.96748f, 88.03252f, 142.0f, 56.0f, 142.0f),
                    PathNode.CurveTo(52.68629f, 142.0f, 50.0f, 139.3137f, 50.0f, 136.0f),
                    PathNode.CurveTo(50.0f, 132.6863f, 52.68629f, 130.0f, 56.0f, 130.0f),
                    PathNode.CurveTo(74.57576f, 129.94774f, 92.40029f, 137.3296f, 105.5f, 150.5f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 82.0f),
                    PathNode.CurveTo(52.68629f, 82.0f, 50.0f, 84.686295f, 50.0f, 88.0f),
                    PathNode.CurveTo(50.0f, 91.313705f, 52.68629f, 94.0f, 56.0f, 94.0f),
                    PathNode.CurveTo(114.54218f, 94.0f, 162.0f, 141.45781f, 162.0f, 200.0f),
                    PathNode.CurveTo(162.0f, 203.3137f, 164.6863f, 206.0f, 168.0f, 206.0f),
                    PathNode.CurveTo(171.3137f, 206.0f, 174.0f, 203.3137f, 174.0f, 200.0f),
                    PathNode.CurveTo(174.0f, 134.8304f, 121.1696f, 82.0f, 56.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.38f, 82.62f),
                    PathNode.CurveTo(142.31664f, 51.387703f, 100.04969f, 33.8803f, 56.0f, 34.0f),
                    PathNode.CurveTo(52.68629f, 34.0f, 50.0f, 36.68629f, 50.0f, 40.0f),
                    PathNode.CurveTo(50.0f, 43.31371f, 52.68629f, 46.0f, 56.0f, 46.0f),
                    PathNode.CurveTo(96.86437f, 45.891666f, 136.07397f, 62.135075f, 164.89f, 91.11f),
                    PathNode.CurveTo(193.86493f, 119.926025f, 210.10834f, 159.13562f, 210.0f, 200.0f),
                    PathNode.CurveTo(210.0f, 203.3137f, 212.6863f, 206.0f, 216.0f, 206.0f),
                    PathNode.CurveTo(219.3137f, 206.0f, 222.0f, 203.3137f, 222.0f, 200.0f),
                    PathNode.CurveTo(222.1197f, 155.95032f, 204.6123f, 113.68337f, 173.38f, 82.62f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 186.0f),
                    PathNode.CurveTo(54.477154f, 186.0f, 50.0f, 190.47716f, 50.0f, 196.0f),
                    PathNode.CurveTo(50.0f, 201.52284f, 54.477154f, 206.0f, 60.0f, 206.0f),
                    PathNode.CurveTo(65.52285f, 206.0f, 70.0f, 201.52284f, 70.0f, 196.0f),
                    PathNode.CurveTo(70.0f, 190.47716f, 65.52285f, 186.0f, 60.0f, 186.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
