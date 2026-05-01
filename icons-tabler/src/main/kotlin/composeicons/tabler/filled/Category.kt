package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Category: ImageVector
    get() {
        if (_category != null) return _category!!
        _category = tablerFilledIcon(
            name = "Category",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.CurveTo(3.447715f, 3.0f, 3.0f, 3.447715f, 3.0f, 4.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 10.552285f, 3.447715f, 11.0f, 4.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.552285f, 11.0f, 11.0f, 10.552285f, 11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 3.447715f, 10.552285f, 3.0f, 10.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.CurveTo(13.447715f, 3.0f, 13.0f, 3.447715f, 13.0f, 4.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.552285f, 13.447715f, 11.0f, 14.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f),
                    PathNode.CurveTo(20.552284f, 11.0f, 21.0f, 10.552285f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 4.0f),
                    PathNode.CurveTo(21.0f, 3.447715f, 20.552284f, 3.0f, 20.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(3.447715f, 13.0f, 3.0f, 13.447715f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 20.552284f, 3.447715f, 21.0f, 4.0f, 21.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.CurveTo(10.552285f, 21.0f, 11.0f, 20.552284f, 11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(11.0f, 13.447715f, 10.552285f, 13.0f, 10.0f, 13.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.CurveTo(19.183138f, 13.000002f, 20.963043f, 14.750477f, 20.999441f, 16.933311f),
                    PathNode.CurveTo(21.03584f, 19.116144f, 19.315285f, 20.924988f, 17.13336f, 20.997776f),
                    PathNode.CurveTo(14.951436f, 21.070564f, 13.114157f, 19.380407f, 13.005f, 17.2f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.005f, 16.8f),
                    PathNode.CurveTo(13.11157f, 14.671265f, 14.868599f, 12.999998f, 17.0f, 13.0f),
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
        return _category!!
    }

private var _category: ImageVector? = null
