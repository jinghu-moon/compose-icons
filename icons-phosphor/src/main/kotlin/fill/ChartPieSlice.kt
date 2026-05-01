package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorFillIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 116.43f),
                    PathNode.CurveTo(102.47576f, 115.00062f, 104.00064f, 112.358765f, 104.0f, 109.5f),
                    PathNode.LineTo(104.0f, 37.5f),
                    PathNode.CurveTo(103.98551f, 34.91209f, 102.72005f, 32.491055f, 100.60346f, 31.001902f),
                    PathNode.CurveTo(98.486885f, 29.51275f, 95.780685f, 29.139467f, 93.34f, 30.0f),
                    PathNode.CurveTo(45.102192f, 47.07239f, 16.434929f, 96.68147f, 25.73f, 147.0f),
                    PathNode.CurveTo(26.203268f, 149.556f, 27.888891f, 151.72269f, 30.25f, 152.81f),
                    PathNode.CurveTo(31.298553f, 153.30034f, 32.442467f, 153.55302f, 33.6f, 153.55f),
                    PathNode.CurveTo(35.00413f, 153.55057f, 36.38367f, 153.18152f, 37.6f, 152.48f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 49.62f),
                    PathNode.LineTo(88.0f, 104.88f),
                    PathNode.LineTo(40.12f, 132.51f),
                    PathNode.CurveTo(40.0f, 131.0f, 40.0f, 129.48f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.028942f, 94.9374f, 58.562893f, 64.673004f, 88.0f, 49.62f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.01625f, 174.9349f, 200.59378f, 216.06458f, 155.30547f, 228.38745f),
                    PathNode.CurveTo(110.01714f, 240.71033f, 62.087112f, 221.17233f, 38.32f, 180.7f),
                    PathNode.CurveTo(37.231403f, 178.86322f, 36.922215f, 176.66751f, 37.461243f, 174.60153f),
                    PathNode.CurveTo(38.00027f, 172.53557f, 39.342793f, 170.7708f, 41.19f, 169.7f),
                    PathNode.LineTo(120.0f, 123.83f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 27.581722f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(164.9294f, 24.018843f, 199.08188f, 43.610657f, 217.74f, 75.48f),
                    PathNode.CurveTo(217.85f, 75.64f, 217.95f, 75.8f, 218.05f, 75.97f),
                    PathNode.CurveTo(218.15f, 76.14f, 218.25f, 76.34f, 218.34f, 76.52f),
                    PathNode.CurveTo(227.31322f, 92.19168f, 232.02298f, 109.941216f, 232.0f, 128.0f),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
