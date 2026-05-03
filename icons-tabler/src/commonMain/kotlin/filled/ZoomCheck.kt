package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCheck: ImageVector
    get() {
        if (_zoomCheck != null) return _zoomCheck!!
        _zoomCheck = tablerFilledIcon(
            name = "ZoomCheck",
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
                    PathNode.MoveTo(13.707f, 7.292f),
                    PathNode.CurveTo(13.3165f, 6.901618f, 12.6835f, 6.901618f, 12.293f, 7.292f),
                    PathNode.LineTo(9.0f, 10.586f),
                    PathNode.LineTo(7.707f, 9.293f),
                    PathNode.LineTo(7.613f, 9.21f),
                    PathNode.CurveTo(7.195871f, 8.887465f, 6.599979f, 8.94423f, 6.251249f, 9.339722f),
                    PathNode.CurveTo(5.902519f, 9.735212f, 5.920789f, 10.333524f, 6.293f, 10.707f),
                    PathNode.LineTo(8.293f, 12.707f),
                    PathNode.LineTo(8.387f, 12.79f),
                    PathNode.CurveTo(8.785086f, 13.098803f, 9.350732f, 13.063235f, 9.707f, 12.707f),
                    PathNode.LineTo(13.707f, 8.707f),
                    PathNode.LineTo(13.79f, 8.613f),
                    PathNode.CurveTo(14.098803f, 8.214915f, 14.063235f, 7.649269f, 13.707f, 7.293f),
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
        return _zoomCheck!!
    }

private var _zoomCheck: ImageVector? = null
