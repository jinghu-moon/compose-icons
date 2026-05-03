package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ad: ImageVector
    get() {
        if (_ad != null) return _ad!!
        _ad = tablerFilledIcon(
            name = "Ad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(3.343146f, 4.0f, 2.0f, 5.343146f, 2.0f, 7.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 18.656855f, 3.343146f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(20.656855f, 20.0f, 22.0f, 18.656855f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.343146f, 20.656855f, 4.0f, 19.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.CurveTo(10.588557f, 7.999912f, 11.901805f, 9.238178f, 11.995f, 10.824f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.999413f, 15.529094f, 11.586789f, 15.966165f, 11.058605f, 15.997172f),
                    PathNode.CurveTo(10.530421f, 16.02818f, 10.06949f, 15.64239f, 10.007f, 15.117f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.CurveTo(7.999413f, 15.529094f, 7.58679f, 15.966165f, 7.058605f, 15.997172f),
                    PathNode.CurveTo(6.530421f, 16.02818f, 6.069491f, 15.64239f, 6.007f, 15.117f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 9.343145f, 7.343146f, 8.0f, 9.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.CurveTo(8.493025f, 10.000067f, 8.066316f, 10.379507f, 8.007f, 10.883f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 10.447715f, 9.552285f, 10.0f, 9.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.506975f, 8.000067f, 17.933683f, 8.379507f, 17.993f, 8.883f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.CurveTo(17.999933f, 15.506975f, 17.620493f, 15.933684f, 17.117f, 15.993f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.LineTo(15.5f, 16.0f),
                    PathNode.CurveTo(14.568426f, 15.999011f, 13.71467f, 15.480138f, 13.284772f, 14.653688f),
                    PathNode.CurveTo(12.854874f, 13.827239f, 12.920148f, 12.83031f, 13.454137f, 12.066972f),
                    PathNode.CurveTo(13.988127f, 11.303633f, 14.90225f, 10.900512f, 15.826f, 11.021f),
                    PathNode.LineTo(16.0f, 11.05f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.CurveTo(16.000067f, 8.493025f, 16.379507f, 8.066316f, 16.883f, 8.007f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.59f, 13.008f),
                    PathNode.LineTo(15.5f, 13.0f),
                    PathNode.CurveTo(15.241011f, 12.999523f, 15.024526f, 13.196892f, 15.001124f, 13.454822f),
                    PathNode.CurveTo(14.977724f, 13.712752f, 15.155154f, 13.945859f, 15.41f, 13.992f),
                    PathNode.LineTo(15.5f, 14.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 13.5f),
                    PathNode.LineTo(15.992f, 13.41f),
                    PathNode.CurveTo(15.960308f, 13.236402f, 15.839454f, 13.092365f, 15.674f, 13.031f),
                    PathNode.LineTo(15.59f, 13.008f),
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
        return _ad!!
    }

private var _ad: ImageVector? = null
