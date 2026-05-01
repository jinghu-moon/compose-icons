package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigUpLine: ImageVector
    get() {
        if (_arrowBigUpLine != null) return _arrowBigUpLine!!
        _arrowBigUpLine = tablerFilledIcon(
            name = "ArrowBigUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.586f, 3.0f),
                    PathNode.LineTo(4.0f, 9.586f),
                    PathNode.CurveTo(3.42767f, 10.157971f, 3.256364f, 11.018445f, 3.566f, 11.766f),
                    PathNode.LineTo(3.634f, 11.911f),
                    PathNode.CurveTo(3.975939f, 12.579289f, 4.663312f, 12.999823f, 5.414f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.CurveTo(8.0f, 18.552284f, 8.447715f, 19.0f, 9.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(15.117f, 18.993f),
                    PathNode.CurveTo(15.620493f, 18.933683f, 15.999933f, 18.506975f, 16.0f, 18.0f),
                    PathNode.LineTo(15.999f, 13.0f),
                    PathNode.LineTo(18.586f, 13.0f),
                    PathNode.CurveTo(19.394793f, 12.999827f, 20.123869f, 12.512545f, 20.433355f, 11.765309f),
                    PathNode.CurveTo(20.742844f, 11.018073f, 20.571815f, 10.157989f, 20.0f, 9.586f),
                    PathNode.LineTo(13.414f, 3.0f),
                    PathNode.CurveTo(12.633f, 2.219236f, 11.367f, 2.219236f, 10.586f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 20.0f),
                    PathNode.CurveTo(15.529094f, 20.000587f, 15.966165f, 20.41321f, 15.997172f, 20.941395f),
                    PathNode.CurveTo(16.02818f, 21.46958f, 15.64239f, 21.93051f, 15.117f, 21.993f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(8.470906f, 21.999413f, 8.033836f, 21.58679f, 8.002828f, 21.058605f),
                    PathNode.CurveTo(7.971821f, 20.53042f, 8.35761f, 20.06949f, 8.883f, 20.007f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
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
        return _arrowBigUpLine!!
    }

private var _arrowBigUpLine: ImageVector? = null
