package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = tablerFilledIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.799f, 7.0f),
                    PathNode.LineTo(17.943f, 7.23f),
                    PathNode.CurveTo(18.634064f, 8.340372f, 19.000233f, 9.622141f, 19.0f, 10.93f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.656855f, 17.656855f, 22.0f, 16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(6.343146f, 22.0f, 5.0f, 20.656855f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 10.929f),
                    PathNode.CurveTo(5.00014f, 9.62182f, 5.366296f, 8.340796f, 6.057f, 7.231f),
                    PathNode.LineTo(6.199f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(10.411443f, 12.999911f, 9.098195f, 14.238178f, 9.005f, 15.824f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 17.656855f, 10.343145f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(13.656855f, 19.0f, 15.0f, 17.656855f, 15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 14.343145f, 13.656855f, 13.0f, 12.0f, 13.0f),
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(12.552285f, 15.0f, 13.0f, 15.447715f, 13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 16.552284f, 12.552285f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(11.447715f, 17.0f, 11.0f, 16.552284f, 11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 15.447715f, 11.447715f, 15.0f, 12.0f, 15.0f),
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(9.447715f, 9.0f, 9.0f, 9.447715f, 9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 10.552285f, 9.447715f, 11.0f, 10.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.CurveTo(14.552285f, 11.0f, 15.0f, 10.552285f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 9.447715f, 14.552285f, 9.0f, 14.0f, 9.0f),
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(16.10457f, 2.0f, 17.0f, 2.895431f, 17.0f, 4.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.CurveTo(7.0f, 2.895431f, 7.895431f, 2.0f, 9.0f, 2.0f),
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
        return _milk!!
    }

private var _milk: ImageVector? = null
