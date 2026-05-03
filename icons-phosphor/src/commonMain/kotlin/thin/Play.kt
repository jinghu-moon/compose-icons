package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorThinIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.32f, 117.9f),
                    PathNode.LineTo(86.24f, 29.79f),
                    PathNode.CurveTo(82.5318f, 27.489601f, 77.86247f, 27.401356f, 74.07f, 29.56f),
                    PathNode.CurveTo(70.30492f, 31.62914f, 67.9752f, 35.593887f, 68.0f, 39.89f),
                    PathNode.LineTo(68.0f, 216.11f),
                    PathNode.CurveTo(67.9752f, 220.40611f, 70.30492f, 224.37086f, 74.07f, 226.44f),
                    PathNode.CurveTo(77.86247f, 228.59866f, 82.5318f, 228.51039f, 86.24f, 226.21f),
                    PathNode.LineTo(230.32f, 138.1f),
                    PathNode.CurveTo(233.8468f, 135.9559f, 235.99977f, 132.12741f, 235.99977f, 128.0f),
                    PathNode.CurveTo(235.99977f, 123.87259f, 233.8468f, 120.0441f, 230.32f, 117.9f),
                    PathNode.Close,
                    PathNode.MoveTo(226.14f, 131.27f),
                    PathNode.LineTo(82.06f, 219.39f),
                    PathNode.CurveTo(80.81753f, 220.1535f, 79.257996f, 220.18034f, 77.99f, 219.46f),
                    PathNode.CurveTo(76.75242f, 218.80196f, 75.98208f, 217.51163f, 75.99f, 216.11f),
                    PathNode.LineTo(75.99f, 39.89f),
                    PathNode.CurveTo(75.98208f, 38.488365f, 76.75242f, 37.198048f, 77.99f, 36.54f),
                    PathNode.CurveTo(79.257996f, 35.81967f, 80.81753f, 35.846493f, 82.06f, 36.61f),
                    PathNode.LineTo(226.14f, 124.73f),
                    PathNode.CurveTo(227.29553f, 125.41405f, 228.00426f, 126.65717f, 228.00426f, 128.0f),
                    PathNode.CurveTo(228.00426f, 129.34283f, 227.29553f, 130.58595f, 226.14f, 131.27f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _play!!
    }

private var _play: ImageVector? = null
