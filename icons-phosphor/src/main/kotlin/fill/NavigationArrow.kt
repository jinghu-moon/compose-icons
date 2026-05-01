package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorFillIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 121.58f),
                    PathNode.CurveTo(247.95027f, 128.52058f, 243.36577f, 134.61157f, 236.71f, 136.58f),
                    PathNode.LineTo(236.51f, 136.64f),
                    PathNode.LineTo(158.51f, 158.48f),
                    PathNode.LineTo(136.67f, 236.48f),
                    PathNode.LineTo(136.61f, 236.68f),
                    PathNode.CurveTo(134.63875f, 243.33382f, 128.54948f, 247.91702f, 121.61f, 247.97f),
                    PathNode.LineTo(121.31f, 247.97f),
                    PathNode.CurveTo(114.51189f, 248.03346f, 108.4383f, 243.73318f, 106.24f, 237.3f),
                    PathNode.LineTo(41.0f, 61.41f),
                    PathNode.CurveTo(40.978886f, 61.35816f, 40.96216f, 61.304634f, 40.95f, 61.25f),
                    PathNode.CurveTo(38.960854f, 55.47281f, 40.435627f, 49.067127f, 44.750763f, 44.741364f),
                    PathNode.CurveTo(49.0659f, 40.415596f, 55.46793f, 38.92507f, 61.25f, 40.9f),
                    PathNode.LineTo(61.41f, 40.95f),
                    PathNode.LineTo(237.33f, 106.21f),
                    PathNode.CurveTo(243.86807f, 108.44482f, 248.19188f, 114.673195f, 248.0f, 121.58f),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
