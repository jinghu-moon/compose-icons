package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorBoldIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 145.63f, 141.71f, 142.68f, 124.0f, 137.58f),
                    PathNode.CurveTo(107.86f, 132.93f, 85.77f, 126.58f, 85.77f, 104.0f),
                    PathNode.CurveTo(85.77f, 83.48f, 103.92f, 68.0f, 127.99f, 68.0f),
                    PathNode.CurveTo(145.23f, 68.0f, 160.05f, 76.14f, 166.68f, 89.24f),
                    PathNode.CurveTo(168.68636f, 93.07264f, 168.47452f, 97.68853f, 166.12553f, 101.32128f),
                    PathNode.CurveTo(163.77655f, 104.95403f, 159.65408f, 107.04127f, 155.33568f, 106.78424f),
                    PathNode.CurveTo(151.0173f, 106.52722f, 147.1715f, 103.96574f, 145.27f, 100.08f),
                    PathNode.CurveTo(142.8f, 95.17f, 136.0f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(117.78f, 92.0f, 109.78f, 97.27f, 109.78f, 104.0f),
                    PathNode.CurveTo(109.78f, 105.09f, 109.78f, 106.21f, 113.06f, 108.17f),
                    PathNode.CurveTo(117.24f, 110.65f, 124.06f, 112.62f, 130.66f, 114.52f),
                    PathNode.CurveTo(139.41f, 117.04f, 148.46f, 119.65f, 156.04f, 124.38f),
                    PathNode.CurveTo(169.23f, 132.61f, 172.04f, 143.94f, 172.04f, 152.0f),
                    PathNode.CurveTo(172.04f, 172.19f, 152.71f, 188.0f, 128.04f, 188.0f),
                    PathNode.CurveTo(106.78f, 188.0f, 88.58f, 175.65f, 84.77f, 158.62f),
                    PathNode.CurveTo(83.38958f, 152.18073f, 87.45663f, 145.83209f, 93.88331f, 144.39418f),
                    PathNode.CurveTo(100.30999f, 142.95627f, 106.69472f, 146.96643f, 108.19f, 153.38f),
                    PathNode.CurveTo(109.3f, 158.49f, 117.21f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(137.44f, 164.0f, 148.0f, 158.87f, 148.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
