package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDownRight: ImageVector
    get() {
        if (_circleArrowDownRight != null) return _circleArrowDownRight!!
        _circleArrowDownRight = tablerFilledIcon(
            name = "CircleArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(14.883f, 8.007f),
                    PathNode.CurveTo(14.379507f, 8.066316f, 14.000067f, 8.493025f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 12.585f),
                    PathNode.LineTo(9.707f, 8.293f),
                    PathNode.LineTo(9.613f, 8.21f),
                    PathNode.CurveTo(9.19587f, 7.887466f, 8.599978f, 7.944231f, 8.251249f, 8.339722f),
                    PathNode.CurveTo(7.902519f, 8.735212f, 7.920789f, 9.333524f, 8.293f, 9.707f),
                    PathNode.LineTo(12.585f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(8.883f, 14.007f),
                    PathNode.CurveTo(8.35761f, 14.06949f, 7.971821f, 14.530421f, 8.002828f, 15.058605f),
                    PathNode.CurveTo(8.033836f, 15.586789f, 8.470906f, 15.999413f, 9.0f, 16.0f),
                    PathNode.LineTo(15.034f, 16.001f),
                    PathNode.CurveTo(15.096647f, 15.998528f, 15.158923f, 15.990157f, 15.22f, 15.976f),
                    PathNode.LineTo(15.273f, 15.962f),
                    PathNode.LineTo(15.339f, 15.942f),
                    PathNode.LineTo(15.469f, 15.883f),
                    PathNode.LineTo(15.562f, 15.828f),
                    PathNode.CurveTo(15.838992f, 15.644158f, 16.003893f, 15.332426f, 16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.LineTo(15.993f, 8.883f),
                    PathNode.CurveTo(15.933684f, 8.379507f, 15.506975f, 8.000067f, 15.0f, 8.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _circleArrowDownRight!!
    }

private var _circleArrowDownRight: ImageVector? = null
