package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = tablerFilledIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.992C6.983 1.993 2.744 5.711 2.088 10.684c-.656 4.973 2.474 9.663 7.319 10.965 4.845 1.302 9.904-1.187 11.83-5.819 .341-.82-.476-1.644-1.298-1.31-2.907 1.178-6.24 .111-7.924-2.535C10.33 9.339 10.776 5.868 13.074 3.733l.077-.08C13.702 3.023 13.264 2 12.393 2h-.266l-.068-.006-.06-.002Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _moon!!
    }

private var _moon: ImageVector? = null
