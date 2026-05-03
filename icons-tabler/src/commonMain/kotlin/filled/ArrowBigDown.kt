package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = tablerFilledIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.LineTo(9.85f, 2.005f),
                    PathNode.CurveTo(8.806323f, 2.083497f, 7.999669f, 2.953375f, 8.0f, 4.0f),
                    PathNode.LineTo(8.0f, 10.999f),
                    PathNode.LineTo(5.414f, 11.0f),
                    PathNode.CurveTo(4.605209f, 11.000173f, 3.876132f, 11.487455f, 3.566644f, 12.234691f),
                    PathNode.CurveTo(3.257156f, 12.981927f, 3.428184f, 13.842011f, 4.0f, 14.414f),
                    PathNode.LineTo(10.586f, 21.0f),
                    PathNode.CurveTo(11.367f, 21.780764f, 12.633f, 21.780764f, 13.414f, 21.0f),
                    PathNode.LineTo(20.0f, 14.414f),
                    PathNode.CurveTo(20.57233f, 13.842029f, 20.743635f, 12.981555f, 20.434f, 12.234f),
                    PathNode.LineTo(20.366f, 12.089f),
                    PathNode.CurveTo(20.024061f, 11.420711f, 19.336687f, 11.000177f, 18.586f, 11.0f),
                    PathNode.LineTo(16.0f, 10.999f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 2.895431f, 15.104569f, 2.0f, 14.0f, 2.0f),
                    PathNode.LineTo(10.0f, 2.0f),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
