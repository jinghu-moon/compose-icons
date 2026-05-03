package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowGuide: ImageVector
    get() {
        if (_arrowGuide != null) return _arrowGuide!!
        _arrowGuide = tablerFilledIcon(
            name = "ArrowGuide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.707f, 3.293f),
                    PathNode.LineTo(21.707f, 6.293f),
                    PathNode.QuadTo(21.761f, 6.346f, 21.804f, 6.405f),
                    PathNode.LineTo(21.875f, 6.515f),
                    PathNode.LineTo(21.929f, 6.629f),
                    PathNode.LineTo(21.964f, 6.734f),
                    PathNode.LineTo(21.994f, 6.882f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.LineTo(21.997f, 7.075f),
                    PathNode.LineTo(21.98f, 7.201f),
                    PathNode.LineTo(21.95f, 7.312f),
                    PathNode.LineTo(21.906f, 7.423f),
                    PathNode.LineTo(21.854f, 7.521f),
                    PathNode.LineTo(21.787f, 7.617f),
                    PathNode.LineTo(21.707f, 7.707f),
                    PathNode.LineTo(18.707f, 10.707f),
                    PathNode.CurveTo(18.31462f, 11.085972f, 17.690916f, 11.080552f, 17.305182f, 10.694818f),
                    PathNode.CurveTo(16.919447f, 10.309085f, 16.914028f, 9.685379f, 17.293f, 9.293f),
                    PathNode.LineTo(18.585f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.447715f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 18.656855f, 11.656855f, 20.0f, 10.0f, 20.0f),
                    PathNode.LineTo(7.829f, 20.0f),
                    PathNode.CurveTo(7.340446f, 21.375866f, 5.932579f, 22.200468f, 4.493571f, 21.953598f),
                    PathNode.CurveTo(3.054562f, 21.706728f, 2.002039f, 20.46003f, 2.0f, 19.0f),
                    PathNode.LineTo(2.005f, 18.824f),
                    PathNode.CurveTo(2.08685f, 17.396772f, 3.164405f, 16.22557f, 4.579885f, 16.025337f),
                    PathNode.CurveTo(5.995365f, 15.825105f, 7.355495f, 16.651474f, 7.83f, 18.0f),
                    PathNode.LineTo(10.0f, 18.0f),
                    PathNode.CurveTo(10.552285f, 18.0f, 11.0f, 17.552284f, 11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 7.343146f, 12.343145f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(18.585f, 6.0f),
                    PathNode.LineTo(17.293f, 4.707f),
                    PathNode.CurveTo(16.936766f, 4.350732f, 16.901197f, 3.785085f, 17.21f, 3.387f),
                    PathNode.LineTo(17.293f, 3.293f),
                    PathNode.CurveTo(17.6835f, 2.902618f, 18.3165f, 2.902618f, 18.707f, 3.293f)
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
        return _arrowGuide!!
    }

private var _arrowGuide: ImageVector? = null
