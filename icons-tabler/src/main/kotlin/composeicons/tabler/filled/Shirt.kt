package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Shirt: ImageVector
    get() {
        if (_shirt != null) return _shirt!!
        _shirt = tablerFilledIcon(
            name = "Shirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.883f, 3.007f),
                    PathNode.LineTo(14.978f, 3.0f),
                    PathNode.LineTo(15.09f, 3.004f),
                    PathNode.LineTo(15.203f, 3.021f),
                    PathNode.LineTo(15.316f, 3.051f),
                    PathNode.LineTo(21.316f, 5.051f),
                    PathNode.CurveTo(21.684198f, 5.173759f, 21.948109f, 5.498482f, 21.993f, 5.884f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(21.999933f, 11.506975f, 21.620493f, 11.933684f, 21.117f, 11.993f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.000332f, 20.046625f, 18.193678f, 20.916504f, 17.15f, 20.995f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.953376f, 21.000332f, 5.083497f, 20.193678f, 5.005f, 19.15f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(2.493025f, 11.999933f, 2.066316f, 11.620493f, 2.007f, 11.117f),
                    PathNode.LineTo(2.0f, 11.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(1.999869f, 5.611799f, 2.22442f, 5.258598f, 2.576f, 5.094f),
                    PathNode.LineTo(2.684f, 5.051f),
                    PathNode.LineTo(8.684f, 3.051f),
                    PathNode.CurveTo(8.988973f, 2.949424f, 9.324182f, 3.000644f, 9.584906f, 3.188658f),
                    PathNode.CurveTo(9.845629f, 3.376672f, 10.000077f, 3.678557f, 10.0f, 4.0f),
                    PathNode.CurveTo(9.995173f, 5.07883f, 10.846859f, 5.967063f, 11.924939f, 6.007542f),
                    PathNode.CurveTo(13.003019f, 6.048021f, 13.918915f, 5.226154f, 13.995f, 4.15f),
                    PathNode.LineTo(14.004f, 3.91f),
                    PathNode.LineTo(14.021f, 3.797f),
                    PathNode.LineTo(14.058f, 3.663f),
                    PathNode.LineTo(14.102f, 3.56f),
                    PathNode.LineTo(14.152f, 3.468f),
                    PathNode.LineTo(14.22f, 3.375f),
                    PathNode.LineTo(14.289f, 3.295f),
                    PathNode.CurveTo(14.345f, 3.241f, 14.402f, 3.195f, 14.464f, 3.155f),
                    PathNode.LineTo(14.56f, 3.102f),
                    PathNode.LineTo(14.663f, 3.058f),
                    PathNode.LineTo(14.771f, 3.026f),
                    PathNode.LineTo(14.883f, 3.006f),
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
        return _shirt!!
    }

private var _shirt: ImageVector? = null
