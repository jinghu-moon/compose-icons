package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorLightIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.65f, 108.1f),
                    PathNode.LineTo(60.72f, 42.83f),
                    PathNode.LineTo(60.59f, 42.83f),
                    PathNode.CurveTo(55.53504f, 41.088127f, 49.929367f, 42.377464f, 46.143402f, 46.1528f),
                    PathNode.CurveTo(42.357433f, 49.92814f, 41.052345f, 55.530167f, 42.78f, 60.59f),
                    PathNode.CurveTo(42.78f, 60.59f, 42.78f, 60.68f, 42.78f, 60.72f),
                    PathNode.LineTo(108.1f, 236.65f),
                    PathNode.CurveTo(110.010475f, 242.2879f, 115.32749f, 246.05984f, 121.28f, 246.0f),
                    PathNode.LineTo(121.54f, 246.0f),
                    PathNode.CurveTo(127.61781f, 245.95964f, 132.95364f, 241.94762f, 134.68f, 236.12f),
                    PathNode.LineTo(134.68f, 235.97f),
                    PathNode.LineTo(156.82f, 156.87f),
                    PathNode.LineTo(236.0f, 134.73f),
                    PathNode.LineTo(236.15f, 134.73f),
                    PathNode.CurveTo(241.92049f, 132.94939f, 245.89888f, 127.66927f, 246.01926f, 121.6315f),
                    PathNode.CurveTo(246.13966f, 115.59374f, 242.37492f, 110.159225f, 236.68f, 108.15f),
                    PathNode.Close,
                    PathNode.MoveTo(232.65f, 123.2f),
                    PathNode.LineTo(150.39f, 146.2f),
                    PathNode.CurveTo(148.37201f, 146.76505f, 146.79504f, 148.34201f, 146.23f, 150.36f),
                    PathNode.LineTo(123.23f, 232.62f),
                    PathNode.CurveTo(123.00246f, 233.45123f, 122.231094f, 234.01524f, 121.37f, 233.98f),
                    PathNode.CurveTo(120.486565f, 234.0579f, 119.6756f, 233.48769f, 119.45f, 232.63f),
                    PathNode.CurveTo(119.45394f, 232.5901f, 119.45394f, 232.54991f, 119.45f, 232.51f),
                    PathNode.LineTo(54.11f, 56.62f),
                    PathNode.CurveTo(53.88491f, 55.908306f, 54.074875f, 55.130497f, 54.602688f, 54.602688f),
                    PathNode.CurveTo(55.130497f, 54.074875f, 55.908306f, 53.88491f, 56.62f, 54.11f),
                    PathNode.LineTo(232.53f, 119.37f),
                    PathNode.LineTo(232.65f, 119.37f),
                    PathNode.CurveTo(233.46307f, 119.64439f, 234.01048f, 120.406876f, 234.01048f, 121.265f),
                    PathNode.CurveTo(234.01048f, 122.12312f, 233.46307f, 122.88561f, 232.65f, 123.16f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
