package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUpRight: ImageVector
    get() {
        if (_circleArrowUpRight != null) return _circleArrowUpRight!!
        _circleArrowUpRight = tablerFilledIcon(
            name = "CircleArrowUpRight",
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
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(8.883f, 8.007f),
                    PathNode.CurveTo(8.379507f, 8.066316f, 8.000067f, 8.493025f, 8.0f, 9.0f),
                    PathNode.LineTo(8.007f, 9.117f),
                    PathNode.CurveTo(8.066316f, 9.620493f, 8.493025f, 9.999933f, 9.0f, 10.0f),
                    PathNode.LineTo(12.584f, 10.0f),
                    PathNode.LineTo(8.293f, 14.293f),
                    PathNode.LineTo(8.21f, 14.387f),
                    PathNode.CurveTo(7.887466f, 14.80413f, 7.944231f, 15.400022f, 8.339722f, 15.748752f),
                    PathNode.CurveTo(8.735212f, 16.09748f, 9.333524f, 16.07921f, 9.707f, 15.707f),
                    PathNode.LineTo(14.0f, 11.414f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(14.007f, 15.117f),
                    PathNode.CurveTo(14.06949f, 15.64239f, 14.530421f, 16.02818f, 15.058605f, 15.997172f),
                    PathNode.CurveTo(15.586789f, 15.966165f, 15.999413f, 15.529094f, 16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.LineTo(15.993f, 8.883f),
                    PathNode.LineTo(15.964f, 8.734f),
                    PathNode.LineTo(15.929f, 8.629f),
                    PathNode.LineTo(15.875f, 8.516f),
                    PathNode.LineTo(15.804f, 8.405f),
                    PathNode.CurveTo(15.774452f, 8.365342f, 15.742032f, 8.327909f, 15.707f, 8.293f),
                    PathNode.LineTo(15.617f, 8.213001f),
                    PathNode.LineTo(15.521f, 8.146f),
                    PathNode.LineTo(15.423f, 8.094f),
                    PathNode.LineTo(15.313f, 8.05f),
                    PathNode.LineTo(15.201f, 8.020001f),
                    PathNode.LineTo(15.075f, 8.003001f),
                    PathNode.LineTo(15.0f, 8.0f),
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
        return _circleArrowUpRight!!
    }

private var _circleArrowUpRight: ImageVector? = null
