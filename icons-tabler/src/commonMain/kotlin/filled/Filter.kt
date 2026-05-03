package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Filter: ImageVector
    get() {
        if (_filter != null) return _filter!!
        _filter = tablerFilledIcon(
            name = "Filter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.CurveTo(3.447715f, 3.0f, 3.0f, 3.447715f, 3.0f, 4.0f),
                    PathNode.LineTo(3.0f, 6.227f),
                    PathNode.LineTo(3.008f, 6.45f),
                    PathNode.CurveTo(3.057808f, 7.11772f, 3.329563f, 7.749584f, 3.78f, 8.245f),
                    PathNode.LineTo(8.0f, 12.886f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(7.999923f, 21.321444f, 8.154372f, 21.62333f, 8.415094f, 21.811342f),
                    PathNode.CurveTo(8.675818f, 21.999357f, 9.011027f, 22.050575f, 9.316f, 21.949f),
                    PathNode.LineTo(15.316f, 19.949f),
                    PathNode.LineTo(15.424f, 19.906f),
                    PathNode.CurveTo(15.775579f, 19.741402f, 16.000132f, 19.388203f, 16.0f, 19.0f),
                    PathNode.LineTo(16.0f, 12.414f),
                    PathNode.LineTo(20.121f, 8.294f),
                    PathNode.CurveTo(20.68414f, 7.731032f, 21.00036f, 6.967278f, 21.0f, 6.171f),
                    PathNode.LineTo(21.0f, 4.0f),
                    PathNode.CurveTo(21.0f, 3.447715f, 20.552284f, 3.0f, 20.0f, 3.0f),
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
        return _filter!!
    }

private var _filter: ImageVector? = null
