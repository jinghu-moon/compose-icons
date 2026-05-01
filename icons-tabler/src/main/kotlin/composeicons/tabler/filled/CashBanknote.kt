package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CashBanknote: ImageVector
    get() {
        if (_cashBanknote != null) return _cashBanknote!!
        _cashBanknote = tablerFilledIcon(
            name = "CashBanknote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.CurveTo(20.656855f, 5.0f, 22.0f, 6.343146f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.656855f, 20.656855f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.343146f, 19.0f, 2.0f, 17.656855f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.343146f, 3.343146f, 5.0f, 5.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(10.401546f, 9.000132f, 9.083922f, 10.253545f, 9.004f, 11.85f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.MoveTo(18.01f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(17.447716f, 11.0f, 17.0f, 11.447715f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 12.552285f, 17.447716f, 13.0f, 18.0f, 13.0f),
                    PathNode.LineTo(18.01f, 13.0f),
                    PathNode.CurveTo(18.562284f, 13.0f, 19.01f, 12.552285f, 19.01f, 12.0f),
                    PathNode.CurveTo(19.01f, 11.447715f, 18.562284f, 11.0f, 18.01f, 11.0f),
                    PathNode.MoveTo(6.01f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(5.447716f, 11.002762f, 5.002239f, 11.452715f, 5.005f, 12.005f),
                    PathNode.CurveTo(5.007762f, 12.557284f, 5.457715f, 13.002762f, 6.01f, 13.0f),
                    PathNode.CurveTo(6.562285f, 13.0f, 7.01f, 12.552285f, 7.01f, 12.0f),
                    PathNode.CurveTo(7.01f, 11.447715f, 6.562285f, 11.0f, 6.01f, 11.0f)
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
        return _cashBanknote!!
    }

private var _cashBanknote: ImageVector? = null
