package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigLeftLines: ImageVector
    get() {
        if (_arrowBigLeftLines != null) return _arrowBigLeftLines!!
        _arrowBigLeftLines = tablerFilledIcon(
            name = "ArrowBigLeftLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.586f, 4.0f),
                    PathNode.LineTo(3.0f, 10.586f),
                    PathNode.CurveTo(2.219236f, 11.367f, 2.219236f, 12.633f, 3.0f, 13.414f),
                    PathNode.LineTo(9.586f, 20.0f),
                    PathNode.CurveTo(10.157971f, 20.57233f, 11.018445f, 20.743635f, 11.766f, 20.434f),
                    PathNode.LineTo(11.911f, 20.366f),
                    PathNode.CurveTo(12.579289f, 20.024061f, 12.999823f, 19.336687f, 13.0f, 18.586f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.552285f, 16.0f, 16.0f, 15.552285f, 16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.LineTo(15.993f, 8.883f),
                    PathNode.CurveTo(15.933684f, 8.379507f, 15.506975f, 8.000067f, 15.0f, 8.0f),
                    PathNode.LineTo(13.0f, 7.999f),
                    PathNode.LineTo(13.0f, 5.414f),
                    PathNode.CurveTo(12.999827f, 4.605209f, 12.512545f, 3.876132f, 11.765309f, 3.566644f),
                    PathNode.CurveTo(11.018073f, 3.257156f, 10.157989f, 3.428184f, 9.586f, 4.0f),
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
                    PathNode.MoveTo(21.0f, 8.0f),
                    PathNode.CurveTo(21.506975f, 8.000067f, 21.933683f, 8.379507f, 21.993f, 8.883f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(21.999413f, 15.529094f, 21.58679f, 15.966165f, 21.058605f, 15.997172f),
                    PathNode.CurveTo(20.53042f, 16.02818f, 20.06949f, 15.64239f, 20.007f, 15.117f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 8.447715f, 20.447716f, 8.0f, 21.0f, 8.0f),
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
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.506975f, 8.000067f, 18.933683f, 8.379507f, 18.993f, 8.883f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(18.999413f, 15.529094f, 18.58679f, 15.966165f, 18.058605f, 15.997172f),
                    PathNode.CurveTo(17.53042f, 16.02818f, 17.06949f, 15.64239f, 17.007f, 15.117f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.CurveTo(17.0f, 8.447715f, 17.447716f, 8.0f, 18.0f, 8.0f),
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
        return _arrowBigLeftLines!!
    }

private var _arrowBigLeftLines: ImageVector? = null
