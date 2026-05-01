package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorRegularIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.33f, 106.21f),
                    PathNode.LineTo(61.41f, 41.0f),
                    PathNode.LineTo(61.25f, 40.95f),
                    PathNode.CurveTo(55.47281f, 38.960854f, 49.067127f, 40.435627f, 44.741364f, 44.750763f),
                    PathNode.CurveTo(40.415596f, 49.0659f, 38.92507f, 55.46793f, 40.9f, 61.25f),
                    PathNode.CurveTo(40.91216f, 61.304634f, 40.928886f, 61.35816f, 40.95f, 61.41f),
                    PathNode.LineTo(106.21f, 237.33f),
                    PathNode.CurveTo(108.4083f, 243.76318f, 114.48189f, 248.06346f, 121.28f, 248.0f),
                    PathNode.LineTo(121.58f, 248.0f),
                    PathNode.CurveTo(128.51947f, 247.94702f, 134.60875f, 243.36382f, 136.58f, 236.71f),
                    PathNode.LineTo(136.64f, 236.51f),
                    PathNode.LineTo(158.48f, 158.51f),
                    PathNode.LineTo(236.48f, 136.67f),
                    PathNode.LineTo(236.68f, 136.61f),
                    PathNode.CurveTo(243.2782f, 134.57962f, 247.83011f, 128.54619f, 247.97096f, 121.644104f),
                    PathNode.CurveTo(248.11182f, 114.74202f, 243.80986f, 108.527885f, 237.3f, 106.23f),
                    PathNode.Close,
                    PathNode.MoveTo(149.84f, 144.3f),
                    PathNode.CurveTo(147.15356f, 145.05417f, 145.05417f, 147.15356f, 144.3f, 149.84f),
                    PathNode.LineTo(121.3f, 232.0f),
                    PathNode.LineTo(121.24f, 231.83f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.LineTo(231.82f, 121.22f),
                    PathNode.LineTo(231.98f, 121.28f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
