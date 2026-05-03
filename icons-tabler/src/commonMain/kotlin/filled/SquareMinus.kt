package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareMinus: ImageVector
    get() {
        if (_squareMinus != null) return _squareMinus!!
        _squareMinus = tablerFilledIcon(
            name = "SquareMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(8.883f, 11.007f),
                    PathNode.CurveTo(8.35761f, 11.06949f, 7.971821f, 11.530421f, 8.002828f, 12.058605f),
                    PathNode.CurveTo(8.033836f, 12.586789f, 8.470906f, 12.999413f, 9.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.117f, 12.993f),
                    PathNode.CurveTo(15.64239f, 12.93051f, 16.02818f, 12.469579f, 15.997172f, 11.941395f),
                    PathNode.CurveTo(15.966165f, 11.413211f, 15.529094f, 11.000587f, 15.0f, 11.0f),
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
        return _squareMinus!!
    }

private var _squareMinus: ImageVector? = null
