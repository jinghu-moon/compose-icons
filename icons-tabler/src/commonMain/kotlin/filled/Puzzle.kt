package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = tablerFilledIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.CurveTo(11.588557f, 1.999912f, 12.901805f, 3.238179f, 12.995f, 4.824f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(17.046625f, 5.999669f, 17.916504f, 6.806323f, 17.995f, 7.85f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(20.623695f, 10.998435f, 21.95395f, 12.288967f, 22.001598f, 13.911963f),
                    PathNode.CurveTo(22.049248f, 15.534959f, 20.79699f, 16.901308f, 19.176f, 16.995f),
                    PathNode.LineTo(19.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.000332f, 21.046625f, 17.193678f, 21.916504f, 16.15f, 21.995f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.CurveTo(11.953375f, 22.000332f, 11.083497f, 21.193678f, 11.005f, 20.15f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(10.999413f, 18.470907f, 10.586789f, 18.033834f, 10.058605f, 18.002829f),
                    PathNode.CurveTo(9.530421f, 17.97182f, 9.06949f, 18.357609f, 9.007f, 18.883f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(9.000331f, 21.046625f, 8.193677f, 21.916504f, 7.15f, 21.995f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(2.953375f, 22.000332f, 2.083497f, 21.193678f, 2.005f, 20.15f),
                    PathNode.LineTo(2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(1.999669f, 15.953375f, 2.806323f, 15.083497f, 3.85f, 15.005f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(5.529094f, 14.999413f, 5.966165f, 14.586789f, 5.997172f, 14.058605f),
                    PathNode.CurveTo(6.028179f, 13.530421f, 5.642391f, 13.06949f, 5.117f, 13.007f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(2.953375f, 13.000331f, 2.083497f, 12.193677f, 2.005f, 11.15f),
                    PathNode.LineTo(2.0f, 11.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(1.999669f, 6.953376f, 2.806323f, 6.083497f, 3.85f, 6.005f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.343146f, 8.343146f, 2.0f, 10.0f, 2.0f),
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
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
