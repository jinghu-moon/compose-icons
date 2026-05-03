package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = tablerFilledIcon(
            name = "ArrowBigLeft",
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
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.CurveTo(21.10457f, 16.0f, 22.0f, 15.104569f, 22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.LineTo(21.995f, 9.85f),
                    PathNode.CurveTo(21.916504f, 8.806323f, 21.046625f, 7.999669f, 20.0f, 8.0f),
                    PathNode.LineTo(13.0f, 7.999f),
                    PathNode.LineTo(13.0f, 5.414f),
                    PathNode.CurveTo(12.999827f, 4.605209f, 12.512545f, 3.876132f, 11.765309f, 3.566644f),
                    PathNode.CurveTo(11.018073f, 3.257156f, 10.157989f, 3.428184f, 9.586f, 4.0f),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
