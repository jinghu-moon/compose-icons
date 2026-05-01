package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = tablerFilledIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.506975f, 6.000067f, 3.933684f, 6.379507f, 3.993f, 6.883f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(10.000067f, 7.493026f, 10.379507f, 7.066316f, 10.883f, 7.007f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.588558f, 6.999912f, 21.901804f, 8.238179f, 21.995f, 9.824f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(21.999413f, 18.529093f, 21.58679f, 18.966166f, 21.058605f, 18.997171f),
                    PathNode.CurveTo(20.53042f, 19.02818f, 20.06949f, 18.642391f, 20.007f, 18.117f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(3.999413f, 18.529093f, 3.58679f, 18.966166f, 3.058605f, 18.997171f),
                    PathNode.CurveTo(2.530421f, 19.02818f, 2.069491f, 18.642391f, 2.007f, 18.117f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 6.447716f, 2.447715f, 6.0f, 3.0f, 6.0f),
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
                    PathNode.MoveTo(7.0f, 8.0f),
                    PathNode.CurveTo(8.084994f, 8.000344f, 8.971833f, 8.865721f, 8.998752f, 9.95038f),
                    PathNode.CurveTo(9.02567f, 11.035039f, 8.182849f, 11.943342f, 7.099209f, 11.997506f),
                    PathNode.CurveTo(6.015569f, 12.05167f, 5.086375f, 11.231937f, 5.005f, 10.15f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.LineTo(5.005f, 9.85f),
                    PathNode.CurveTo(5.083497f, 8.806323f, 5.953376f, 7.999669f, 7.0f, 8.0f),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
