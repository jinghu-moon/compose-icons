package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandFacebook: ImageVector
    get() {
        if (_brandFacebook != null) return _brandFacebook!!
        _brandFacebook = tablerFilledIcon(
            name = "BrandFacebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(18.506975f, 2.000067f, 18.933683f, 2.379507f, 18.993f, 2.883f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(18.999933f, 7.506975f, 18.620493f, 7.933684f, 18.117f, 7.993f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.287989f, 9.00011f, 18.56195f, 9.124374f, 18.751741f, 9.340978f),
                    PathNode.CurveTo(18.941532f, 9.557581f, 19.028727f, 9.845492f, 18.991f, 10.131f),
                    PathNode.LineTo(18.971f, 10.243f),
                    PathNode.LineTo(17.971f, 14.243f),
                    PathNode.CurveTo(17.86936f, 14.647447f, 17.527407f, 14.946359f, 17.113f, 14.993f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(14.999933f, 21.506975f, 14.620493f, 21.933683f, 14.117f, 21.993f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(9.493025f, 21.999933f, 9.066316f, 21.620493f, 9.007f, 21.117f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(6.493026f, 14.999933f, 6.066316f, 14.620493f, 6.007f, 14.117f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 10.0f),
                    PathNode.CurveTo(6.000067f, 9.493025f, 6.379507f, 9.066316f, 6.883f, 9.007f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(8.999882f, 4.773758f, 11.551026f, 2.124984f, 14.775f, 2.004f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.LineTo(18.0f, 2.0f),
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
        return _brandFacebook!!
    }

private var _brandFacebook: ImageVector? = null
