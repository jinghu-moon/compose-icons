package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorBoldIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.14f, 24.08f),
                    PathNode.CurveTo(165.28f, 16.29f, 147.12f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(108.88f, 12.0f, 90.72f, 16.29f, 76.86f, 24.08f),
                    PathNode.CurveTo(60.83f, 33.1f, 52.0f, 45.86f, 52.0f, 60.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.CurveTo(52.0f, 210.14f, 60.83f, 222.9f, 76.86f, 231.92f),
                    PathNode.CurveTo(90.72f, 239.71f, 108.88f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(147.12f, 244.0f, 165.28f, 239.71f, 179.14f, 231.92f),
                    PathNode.CurveTo(195.14f, 222.92f, 204.0f, 210.14f, 204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.CurveTo(204.0f, 45.86f, 195.17f, 33.1f, 179.14f, 24.08f),
                    PathNode.Close,
                    PathNode.MoveTo(88.63f, 45.0f),
                    PathNode.CurveTo(98.8f, 39.28f, 113.15f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(142.85f, 36.0f, 157.2f, 39.28f, 167.37f, 45.0f),
                    PathNode.CurveTo(175.37f, 49.52f, 180.0f, 55.0f, 180.0f, 60.0f),
                    PathNode.CurveTo(180.0f, 65.0f, 175.4f, 70.48f, 167.37f, 75.0f),
                    PathNode.CurveTo(157.2f, 80.72f, 142.85f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(113.15f, 84.0f, 98.8f, 80.72f, 88.63f, 75.0f),
                    PathNode.CurveTo(80.6f, 70.48f, 76.0f, 65.0f, 76.0f, 60.0f),
                    PathNode.CurveTo(76.0f, 55.0f, 80.6f, 49.52f, 88.63f, 45.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.37f, 211.0f),
                    PathNode.CurveTo(157.2f, 216.72f, 142.85f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(113.15f, 220.0f, 98.8f, 216.72f, 88.63f, 211.0f),
                    PathNode.CurveTo(80.6f, 206.48f, 76.0f, 201.0f, 76.0f, 196.0f),
                    PathNode.LineTo(76.0f, 95.4f),
                    PathNode.LineTo(76.86f, 95.92f),
                    PathNode.CurveTo(90.72f, 103.71f, 108.88f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(147.12f, 108.0f, 165.28f, 103.71f, 179.14f, 95.92f),
                    PathNode.LineTo(180.0f, 95.4f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.CurveTo(180.0f, 201.0f, 175.4f, 206.48f, 167.37f, 211.0f),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
