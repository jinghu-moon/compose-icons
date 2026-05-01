package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorBoldIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.24f, 150.73f),
                    PathNode.CurveTo(227.27213f, 153.18036f, 228.24734f, 156.33777f, 227.95102f, 159.50731f),
                    PathNode.CurveTo(227.6547f, 162.67686f, 226.11111f, 165.59879f, 223.66f, 167.63f),
                    PathNode.CurveTo(205.49f, 182.7f, 189.06f, 188.0f, 174.15f, 188.0f),
                    PathNode.CurveTo(154.39f, 188.0f, 137.29f, 178.71f, 122.27f, 170.56f),
                    PathNode.CurveTo(97.21f, 156.94f, 77.41f, 146.19f, 47.66f, 170.86f),
                    PathNode.CurveTo(42.55689f, 175.0905f, 34.9905f, 174.38312f, 30.76f, 169.28f),
                    PathNode.CurveTo(26.5295f, 164.1769f, 27.236889f, 156.61052f, 32.34f, 152.38f),
                    PathNode.CurveTo(74.59f, 117.38f, 107.34f, 135.15f, 133.73f, 149.46f),
                    PathNode.CurveTo(158.79f, 163.07f, 178.59f, 173.83f, 208.34f, 149.15f),
                    PathNode.CurveTo(210.79036f, 147.11787f, 213.94777f, 146.14265f, 217.11731f, 146.43898f),
                    PathNode.CurveTo(220.28687f, 146.7353f, 223.20879f, 148.27888f, 225.24f, 150.73f),
                    PathNode.Close,
                    PathNode.MoveTo(47.66f, 106.85f),
                    PathNode.CurveTo(77.41f, 82.17f, 97.21f, 92.93f, 122.27f, 106.54f),
                    PathNode.CurveTo(137.27f, 114.7f, 154.39f, 123.99f, 174.15f, 123.99f),
                    PathNode.CurveTo(189.06f, 123.99f, 205.49f, 118.69f, 223.66f, 103.62f),
                    PathNode.CurveTo(228.7631f, 99.389496f, 229.4705f, 91.82311f, 225.24f, 86.72f),
                    PathNode.CurveTo(221.0095f, 81.61689f, 213.44312f, 80.90951f, 208.34f, 85.14f),
                    PathNode.CurveTo(178.59f, 109.81f, 158.79f, 99.06f, 133.73f, 85.44f),
                    PathNode.CurveTo(107.38f, 71.14f, 74.59f, 53.33f, 32.34f, 88.37f),
                    PathNode.CurveTo(27.236889f, 92.6005f, 26.5295f, 100.166885f, 30.76f, 105.27f),
                    PathNode.CurveTo(34.9905f, 110.3731f, 42.55689f, 111.0805f, 47.66f, 106.85f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
