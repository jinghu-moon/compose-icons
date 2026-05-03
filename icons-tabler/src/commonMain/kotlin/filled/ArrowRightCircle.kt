package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightCircle: ImageVector
    get() {
        if (_arrowRightCircle != null) return _arrowRightCircle!!
        _arrowRightCircle = tablerFilledIcon(
            name = "ArrowRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 15.0f),
                    PathNode.CurveTo(3.343146f, 15.0f, 2.0f, 13.656855f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.824f),
                    PathNode.CurveTo(2.08685f, 10.396772f, 3.164405f, 9.22557f, 4.579885f, 9.025337f),
                    PathNode.CurveTo(5.995365f, 8.825105f, 7.355495f, 9.651474f, 7.83f, 11.0f),
                    PathNode.LineTo(18.586f, 11.0f),
                    PathNode.LineTo(17.294f, 9.707f),
                    PathNode.CurveTo(16.937765f, 9.350732f, 16.902197f, 8.785086f, 17.211f, 8.387f),
                    PathNode.LineTo(17.294f, 8.293f),
                    PathNode.CurveTo(17.6845f, 7.902618f, 18.317501f, 7.902618f, 18.708f, 8.293f),
                    PathNode.LineTo(21.708f, 11.293f),
                    PathNode.LineTo(21.805f, 11.405f),
                    PathNode.LineTo(21.876f, 11.515f),
                    PathNode.LineTo(21.907f, 11.577f),
                    PathNode.LineTo(21.941f, 11.658f),
                    PathNode.LineTo(21.965f, 11.734f),
                    PathNode.LineTo(21.995f, 11.882f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.996f, 12.085f),
                    PathNode.LineTo(21.98f, 12.201f),
                    PathNode.LineTo(21.95f, 12.312f),
                    PathNode.LineTo(21.906f, 12.423f),
                    PathNode.LineTo(21.854f, 12.521f),
                    PathNode.LineTo(21.78f, 12.625f),
                    PathNode.LineTo(21.707f, 12.707f),
                    PathNode.LineTo(18.707f, 15.707f),
                    PathNode.CurveTo(18.31462f, 16.085972f, 17.690916f, 16.080553f, 17.305182f, 15.694818f),
                    PathNode.CurveTo(16.919447f, 15.309085f, 16.914028f, 14.685379f, 17.293f, 14.293f),
                    PathNode.LineTo(18.585f, 13.0f),
                    PathNode.LineTo(7.829f, 13.0f),
                    PathNode.CurveTo(7.405147f, 14.198837f, 6.271559f, 15.000243f, 5.0f, 15.0f)
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
        return _arrowRightCircle!!
    }

private var _arrowRightCircle: ImageVector? = null
