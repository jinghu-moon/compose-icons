package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) return _brandAngular!!
        _brandAngular = tablerOutlineIcon(
            name = "BrandAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.428f, 17.245f),
                    PathNode.LineTo(11.504f, 20.716f),
                    PathNode.CurveTo(11.811361f, 20.89157f, 12.188639f, 20.89157f, 12.496f, 20.716f),
                    PathNode.LineTo(18.572f, 17.245f),
                    PathNode.CurveTo(18.842215f, 17.090677f, 19.02519f, 16.819357f, 19.067f, 16.511f),
                    PathNode.LineTo(20.39f, 6.807f),
                    PathNode.CurveTo(20.45403f, 6.3371f, 20.179205f, 5.886849f, 19.732f, 5.729f),
                    PathNode.LineTo(12.332f, 3.117f),
                    PathNode.CurveTo(12.116824f, 3.041138f, 11.882176f, 3.041138f, 11.667f, 3.117f),
                    PathNode.LineTo(4.268f, 5.73f),
                    PathNode.CurveTo(3.820798f, 5.887849f, 3.545969f, 6.3381f, 3.61f, 6.808f),
                    PathNode.LineTo(4.933f, 16.512f),
                    PathNode.CurveTo(4.97481f, 16.820356f, 5.157785f, 17.091677f, 5.428f, 17.246f),
                    PathNode.LineTo(5.428f, 17.245f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(15.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
