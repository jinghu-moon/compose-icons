package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorBoldIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(145.93f, 14.77f),
                    PathNode.CurveTo(142.92761f, 12.280913f, 138.90288f, 11.40613f, 135.13818f, 12.424372f),
                    PathNode.CurveTo(131.37346f, 13.442614f, 128.3384f, 16.226862f, 127.0f, 19.89f),
                    PathNode.LineTo(107.07f, 74.5f),
                    PathNode.LineTo(87.38f, 55.39f),
                    PathNode.CurveTo(84.91878f, 53.000034f, 81.55233f, 51.777767f, 78.13108f, 52.03197f),
                    PathNode.CurveTo(74.70984f, 52.286175f, 71.56099f, 53.99254f, 69.48f, 56.72f),
                    PathNode.CurveTo(47.27f, 85.82f, 36.0f, 115.19f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(178.8102f, 236.0f, 220.0f, 194.8102f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 82.85f, 168.2f, 33.25f, 145.93f, 14.77f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(90.46063f, 211.96141f, 60.038586f, 181.53935f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 124.06f, 67.0f, 103.38f, 80.71f, 82.36f),
                    PathNode.LineTo(103.64f, 104.61f),
                    PathNode.CurveTo(106.55885f, 107.442245f, 110.713615f, 108.60328f, 114.67789f, 107.69451f),
                    PathNode.CurveTo(118.64216f, 106.785736f, 121.87631f, 103.930855f, 123.27f, 100.11f),
                    PathNode.LineTo(143.48f, 44.71f),
                    PathNode.CurveTo(165.39f, 65.61f, 196.0f, 102.29f, 196.0f, 144.0f),
                    PathNode.CurveTo(195.96141f, 181.53935f, 165.53935f, 211.96141f, 128.0f, 212.0f),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
