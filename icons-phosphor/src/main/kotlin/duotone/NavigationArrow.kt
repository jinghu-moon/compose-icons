package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorDuotoneIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.35f, 129.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.LineTo(129.0f, 234.35f),
                    PathNode.CurveTo(127.98544f, 237.66118f, 124.95557f, 239.9436f, 121.49299f, 240.00507f),
                    PathNode.CurveTo(118.03041f, 240.06653f, 114.92143f, 237.89308f, 113.79f, 234.62f),
                    PathNode.LineTo(48.51f, 58.62f),
                    PathNode.CurveTo(47.530476f, 55.73998f, 48.26913f, 52.553627f, 50.415928f, 50.398342f),
                    PathNode.CurveTo(52.562725f, 48.24306f, 55.746136f, 47.491844f, 58.63f, 48.46f),
                    PathNode.LineTo(234.63f, 113.74f),
                    PathNode.CurveTo(237.94266f, 114.84931f, 240.15242f, 117.97985f, 240.08833f, 121.472725f),
                    PathNode.CurveTo(240.02425f, 124.96559f, 237.70113f, 128.01295f, 234.35f, 129.0f),
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
