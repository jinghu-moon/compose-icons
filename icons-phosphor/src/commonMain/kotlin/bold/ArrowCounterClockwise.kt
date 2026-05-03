package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorBoldIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.00491f, 182.70938f, 184.04446f, 227.26689f, 129.34f, 228.0f),
                    PathNode.LineTo(128.0f, 228.0f),
                    PathNode.CurveTo(102.47069f, 228.05382f, 77.89959f, 218.28195f, 59.38f, 200.71f),
                    PathNode.CurveTo(54.561317f, 196.15918f, 54.344173f, 188.56369f, 58.895f, 183.745f),
                    PathNode.CurveTo(63.445827f, 178.92632f, 71.04131f, 178.70917f, 75.86f, 183.26f),
                    PathNode.CurveTo(106.17456f, 211.87965f, 153.8859f, 210.73587f, 182.79422f, 180.69649f),
                    PathNode.CurveTo(211.70255f, 150.65706f, 211.0152f, 102.936966f, 181.2537f, 73.74262f),
                    PathNode.CurveTo(151.49219f, 44.548275f, 103.76769f, 44.779118f, 74.29f, 74.26f),
                    PathNode.CurveTo(74.16f, 74.39f, 74.04f, 74.51f, 73.9f, 74.63f),
                    PathNode.LineTo(54.89f, 92.0f),
                    PathNode.LineTo(72.0f, 92.0f),
                    PathNode.CurveTo(78.62742f, 92.0f, 84.0f, 97.37258f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 110.62742f, 78.62742f, 116.0f, 72.0f, 116.0f),
                    PathNode.LineTo(24.0f, 116.0f),
                    PathNode.CurveTo(17.372583f, 116.0f, 12.0f, 110.62742f, 12.0f, 104.0f),
                    PathNode.LineTo(12.0f, 56.0f),
                    PathNode.CurveTo(12.0f, 49.37258f, 17.372583f, 44.0f, 24.0f, 44.0f),
                    PathNode.CurveTo(30.627417f, 44.0f, 36.0f, 49.37258f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 76.72f),
                    PathNode.LineTo(57.48f, 57.06f),
                    PathNode.CurveTo(86.12702f, 28.566853f, 129.10594f, 20.112387f, 166.4108f, 35.63201f),
                    PathNode.CurveTo(203.71565f, 51.15164f, 228.01582f, 87.59566f, 228.0f, 128.0f),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
