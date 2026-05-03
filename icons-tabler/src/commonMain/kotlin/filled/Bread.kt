package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = tablerFilledIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.541498f, 3.000239f, 20.945688f, 3.886243f, 21.609497f, 5.277492f),
                    PathNode.CurveTo(22.27331f, 6.668741f, 22.078604f, 8.317631f, 21.109f, 9.516f),
                    PathNode.LineTo(20.999f, 9.642f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.000088f, 19.588558f, 19.761822f, 20.901804f, 18.176f, 20.995f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 9.644f),
                    PathNode.LineTo(2.884f, 9.508f),
                    PathNode.CurveTo(2.066907f, 8.493163f, 1.795276f, 7.143964f, 2.156f, 5.892f),
                    PathNode.LineTo(2.223f, 5.682f),
                    PathNode.CurveTo(2.755f, 4.157f, 4.153f, 3.102f, 5.824f, 3.005f),
                    PathNode.LineTo(17.903f, 3.006f),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
