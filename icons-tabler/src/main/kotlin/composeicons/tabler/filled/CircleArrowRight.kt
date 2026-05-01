package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowRight: ImageVector
    get() {
        if (_circleArrowRight != null) return _circleArrowRight!!
        _circleArrowRight = tablerFilledIcon(
            name = "CircleArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.324f, 2.005f),
                    PathNode.CurveTo(17.780811f, 2.181894f, 22.087145f, 6.702811f, 21.998688f, 12.161771f),
                    PathNode.CurveTo(21.910229f, 17.620731f, 17.459677f, 21.99975f, 12.0f, 21.99975f),
                    PathNode.CurveTo(6.540323f, 21.99975f, 2.089771f, 17.620731f, 2.001313f, 12.161771f),
                    PathNode.CurveTo(1.912854f, 6.702811f, 6.219189f, 2.181894f, 11.676f, 2.005f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.613f, 7.21f),
                    PathNode.CurveTo(12.19587f, 6.887466f, 11.599978f, 6.944231f, 11.251248f, 7.339721f),
                    PathNode.CurveTo(10.902519f, 7.735213f, 10.92079f, 8.333524f, 11.293f, 8.707f),
                    PathNode.LineTo(13.584f, 11.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(7.883f, 11.007f),
                    PathNode.CurveTo(7.35761f, 11.06949f, 6.971821f, 11.530421f, 7.002828f, 12.058605f),
                    PathNode.CurveTo(7.033836f, 12.586789f, 7.470907f, 12.999413f, 8.0f, 13.0f),
                    PathNode.LineTo(13.584f, 13.0f),
                    PathNode.LineTo(11.293f, 15.293f),
                    PathNode.LineTo(11.21f, 15.387f),
                    PathNode.CurveTo(10.887465f, 15.80413f, 10.94423f, 16.400023f, 11.339722f, 16.74875f),
                    PathNode.CurveTo(11.735212f, 17.09748f, 12.333524f, 17.07921f, 12.707f, 16.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(16.78f, 12.625f),
                    PathNode.LineTo(16.844f, 12.536f),
                    PathNode.LineTo(16.906f, 12.423f),
                    PathNode.LineTo(16.95f, 12.313f),
                    PathNode.LineTo(16.98f, 12.201f),
                    PathNode.LineTo(16.997f, 12.075f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(16.993f, 11.882f),
                    PathNode.LineTo(16.964f, 11.734f),
                    PathNode.LineTo(16.929f, 11.629f),
                    PathNode.LineTo(16.875f, 11.516f),
                    PathNode.LineTo(16.804f, 11.405f),
                    PathNode.CurveTo(16.774458f, 11.365337f, 16.742037f, 11.327903f, 16.707f, 11.293f),
                    PathNode.LineTo(12.707f, 7.293f),
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
        return _circleArrowRight!!
    }

private var _circleArrowRight: ImageVector? = null
