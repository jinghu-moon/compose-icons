package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TriangleSquareCircle: ImageVector
    get() {
        if (_triangleSquareCircle != null) return _triangleSquareCircle!!
        _triangleSquareCircle = tablerFilledIcon(
            name = "TriangleSquareCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.132f, 2.504f),
                    PathNode.LineTo(7.132f, 9.504f),
                    PathNode.CurveTo(6.955234f, 9.813457f, 6.956518f, 10.193602f, 7.135372f, 10.501857f),
                    PathNode.CurveTo(7.314225f, 10.810111f, 7.643616f, 10.999885f, 8.0f, 11.0f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.CurveTo(16.356384f, 10.999885f, 16.685774f, 10.810111f, 16.864628f, 10.501857f),
                    PathNode.CurveTo(17.043482f, 10.193602f, 17.044767f, 9.813457f, 16.868f, 9.504f),
                    PathNode.LineTo(12.868f, 2.504f),
                    PathNode.CurveTo(12.689892f, 2.192664f, 12.358682f, 2.000564f, 12.0f, 2.000564f),
                    PathNode.CurveTo(11.641318f, 2.000564f, 11.310108f, 2.192664f, 11.132f, 2.504f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.CurveTo(3.895431f, 13.0f, 3.0f, 13.895431f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(10.104569f, 21.0f, 11.0f, 20.10457f, 11.0f, 19.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(11.0f, 13.895431f, 10.104569f, 13.0f, 9.0f, 13.0f),
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
        return _triangleSquareCircle!!
    }

private var _triangleSquareCircle: ImageVector? = null
