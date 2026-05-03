package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) return _zoomOut!!
        _zoomOut = tablerFilledIcon(
            name = "ZoomOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.072f),
                    PathNode.CurveTo(15.925432f, 4.183712f, 17.301378f, 6.046552f, 17.797838f, 8.213745f),
                    PathNode.CurveTo(18.294296f, 10.380937f, 17.866482f, 12.656981f, 16.617f, 14.496f),
                    PathNode.LineTo(21.561f, 19.439f),
                    PathNode.CurveTo(22.132853f, 20.00251f, 22.15962f, 20.916376f, 21.621733f, 21.512392f),
                    PathNode.CurveTo(21.083849f, 22.108408f, 20.172031f, 22.17523f, 19.553f, 21.664f),
                    PathNode.LineTo(19.439f, 21.561f),
                    PathNode.LineTo(14.496f, 16.617f),
                    PathNode.CurveTo(12.087517f, 18.252972f, 8.980386f, 18.45126f, 6.383481f, 17.13472f),
                    PathNode.CurveTo(3.786576f, 15.818178f, 2.109982f, 13.194705f, 2.006f, 10.285f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.LineTo(2.005f, 9.715f),
                    PathNode.CurveTo(2.105063f, 6.90953f, 3.668295f, 4.361783f, 6.124089f, 3.001729f),
                    PathNode.CurveTo(8.579884f, 1.641675f, 11.568864f, 1.668344f, 14.0f, 3.072f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(6.883f, 9.007f),
                    PathNode.CurveTo(6.379949f, 9.066836f, 6.001115f, 9.493402f, 6.001115f, 10.0f),
                    PathNode.CurveTo(6.001115f, 10.506598f, 6.379949f, 10.933164f, 6.883f, 10.993f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(13.117f, 10.993f),
                    PathNode.CurveTo(13.62005f, 10.933164f, 13.998886f, 10.506598f, 13.998886f, 10.0f),
                    PathNode.CurveTo(13.998886f, 9.493402f, 13.62005f, 9.066836f, 13.117f, 9.007f),
                    PathNode.LineTo(13.0f, 9.0f),
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
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
