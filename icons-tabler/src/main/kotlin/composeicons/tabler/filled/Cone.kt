package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = tablerFilledIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.001c.72 0 1.385 .387 1.749 1.03l8.13 14.99c.079 .146 .121 .31 .121 .477v.498c0 2.46-4.306 3.945-9.677 4.002L12 22C6.48 22 2 20.505 2 17.997v-.5c-0-.167 .042-.331 .121-.477L10.26 2.015C10.615 1.388 11.28 1 12 1"),
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
        return _cone!!
    }

private var _cone: ImageVector? = null
