package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorLightIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.62f, 154.57f),
                    PathNode.CurveTo(221.63606f, 155.79518f, 222.12367f, 157.37389f, 221.97551f, 158.95865f),
                    PathNode.CurveTo(221.82735f, 160.54343f, 221.05556f, 162.0044f, 219.83f, 163.02f),
                    PathNode.CurveTo(202.96f, 177.02f, 187.83f, 182.02f, 174.08f, 182.02f),
                    PathNode.CurveTo(155.89f, 182.02f, 139.95f, 173.36f, 125.14f, 165.31f),
                    PathNode.CurveTo(99.14f, 151.19f, 76.7f, 139.0f, 43.83f, 166.31f),
                    PathNode.CurveTo(41.259113f, 168.42525f, 37.46025f, 168.0559f, 35.345f, 165.485f),
                    PathNode.CurveTo(33.229748f, 162.91411f, 33.599113f, 159.11525f, 36.17f, 157.0f),
                    PathNode.CurveTo(75.3f, 124.54f, 104.82f, 140.58f, 130.86f, 154.73f),
                    PathNode.CurveTo(156.9f, 168.88f, 179.3f, 181.04f, 212.17f, 153.73f),
                    PathNode.CurveTo(213.40146f, 152.7197f, 214.9841f, 152.24052f, 216.56915f, 152.39809f),
                    PathNode.CurveTo(218.1542f, 152.55565f, 219.61154f, 153.33702f, 220.62f, 154.57f),
                    PathNode.Close,
                    PathNode.MoveTo(43.83f, 102.22f),
                    PathNode.CurveTo(76.7f, 74.95f, 99.15f, 87.14f, 125.14f, 101.22f),
                    PathNode.CurveTo(139.95f, 109.22f, 155.89f, 117.93f, 174.08f, 117.93f),
                    PathNode.CurveTo(187.87f, 117.93f, 202.96f, 112.93f, 219.83f, 98.93f),
                    PathNode.CurveTo(222.38156f, 96.81475f, 222.73524f, 93.031555f, 220.62f, 90.48f),
                    PathNode.CurveTo(218.50475f, 87.92844f, 214.72156f, 87.57475f, 212.17f, 89.69f),
                    PathNode.CurveTo(179.3f, 116.96f, 156.85f, 104.77f, 130.86f, 90.69f),
                    PathNode.CurveTo(104.87f, 76.61f, 75.3f, 60.52f, 36.17f, 93.0f),
                    PathNode.CurveTo(33.618446f, 95.11525f, 33.264748f, 98.898445f, 35.38f, 101.45f),
                    PathNode.CurveTo(37.49525f, 104.00156f, 41.278446f, 104.35525f, 43.83f, 102.24f),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
