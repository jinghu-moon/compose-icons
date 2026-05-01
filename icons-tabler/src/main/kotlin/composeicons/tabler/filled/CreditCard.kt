package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = tablerFilledIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 18.209139f, 20.209139f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(3.790861f, 20.0f, 2.0f, 18.209139f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.01f, 14.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(6.447716f, 14.002762f, 6.002239f, 14.452715f, 6.005f, 15.005f),
                    PathNode.CurveTo(6.007762f, 15.557284f, 6.457715f, 16.002762f, 7.01f, 16.0f),
                    PathNode.CurveTo(7.562285f, 16.0f, 8.01f, 15.552285f, 8.01f, 15.0f),
                    PathNode.CurveTo(8.01f, 14.447715f, 7.562285f, 14.0f, 7.01f, 14.0f),
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(10.447715f, 14.0f, 10.0f, 14.447715f, 10.0f, 15.0f),
                    PathNode.CurveTo(10.0f, 15.552285f, 10.447715f, 16.0f, 11.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.552285f, 16.0f, 14.0f, 15.552285f, 14.0f, 15.0f),
                    PathNode.CurveTo(14.0f, 14.447715f, 13.552285f, 14.0f, 13.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(20.209139f, 4.0f, 22.0f, 5.790861f, 22.0f, 8.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 5.790861f, 3.790861f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
