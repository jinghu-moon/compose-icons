package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowRight: ImageVector
    get() {
        if (_squareArrowRight != null) return _squareArrowRight!!
        _squareArrowRight = tablerFilledIcon(
            name = "SquareArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.613f, 7.21f),
                    PathNode.CurveTo(12.214914f, 6.901198f, 11.649268f, 6.936765f, 11.293f, 7.293f),
                    PathNode.LineTo(11.21f, 7.387f),
                    PathNode.CurveTo(10.901197f, 7.785085f, 10.936765f, 8.350732f, 11.293f, 8.707f),
                    PathNode.LineTo(13.585f, 11.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(7.883f, 11.007f),
                    PathNode.CurveTo(7.35761f, 11.06949f, 6.971821f, 11.530421f, 7.002828f, 12.058605f),
                    PathNode.CurveTo(7.033836f, 12.586789f, 7.470907f, 12.999413f, 8.0f, 13.0f),
                    PathNode.LineTo(13.585f, 13.0f),
                    PathNode.LineTo(11.293f, 15.293f),
                    PathNode.LineTo(11.21f, 15.387f),
                    PathNode.CurveTo(10.887465f, 15.80413f, 10.94423f, 16.400023f, 11.339722f, 16.74875f),
                    PathNode.CurveTo(11.735212f, 17.09748f, 12.333524f, 17.07921f, 12.707f, 16.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(16.78f, 12.625f),
                    PathNode.LineTo(16.854f, 12.521f),
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
        return _squareArrowRight!!
    }

private var _squareArrowRight: ImageVector? = null
