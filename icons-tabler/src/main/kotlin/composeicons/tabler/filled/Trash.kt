package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = tablerFilledIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 6.0f),
                    PathNode.CurveTo(20.529093f, 6.000587f, 20.966166f, 6.413211f, 20.997171f, 6.941395f),
                    PathNode.CurveTo(21.02818f, 7.469579f, 20.642391f, 7.930509f, 20.117f, 7.993f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.LineTo(19.919f, 8.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.000088f, 20.588558f, 17.761822f, 21.901804f, 16.176f, 21.995f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(6.402f, 22.0f, 5.096f, 20.751f, 5.008f, 19.25f),
                    PathNode.LineTo(5.003f, 19.083f),
                    PathNode.LineTo(4.08f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(3.470907f, 7.999413f, 3.033835f, 7.58679f, 3.002828f, 7.058605f),
                    PathNode.CurveTo(2.971821f, 6.530421f, 3.35761f, 6.069491f, 3.883f, 6.007f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.CurveTo(9.447715f, 10.0f, 9.0f, 10.447715f, 9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 17.552284f, 9.447715f, 18.0f, 10.0f, 18.0f),
                    PathNode.CurveTo(10.552285f, 18.0f, 11.0f, 17.552284f, 11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.0f, 10.447715f, 10.552285f, 10.0f, 10.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.CurveTo(13.447715f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 17.552284f, 13.447715f, 18.0f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.552285f, 18.0f, 15.0f, 17.552284f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 10.447715f, 14.552285f, 10.0f, 14.0f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.CurveTo(15.999413f, 4.529094f, 15.586789f, 4.966165f, 15.058605f, 4.997172f),
                    PathNode.CurveTo(14.530421f, 5.028179f, 14.06949f, 4.642391f, 14.007f, 4.117f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(9.993f, 4.117f),
                    PathNode.CurveTo(9.93051f, 4.642391f, 9.469579f, 5.028179f, 8.941395f, 4.997172f),
                    PathNode.CurveTo(8.413211f, 4.966165f, 8.000587f, 4.529094f, 8.0f, 4.0f),
                    PathNode.CurveTo(7.999669f, 2.953375f, 8.806323f, 2.083497f, 9.85f, 2.005f),
                    PathNode.LineTo(10.0f, 2.0f),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
