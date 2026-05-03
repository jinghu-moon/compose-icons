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
                pathData = parseSvgPathData("M 12.000 1.992 C 6.983 1.993 2.744 5.711 2.088 10.684 C 1.432 15.657 4.562 20.347 9.406 21.649 C 14.251 22.951 19.311 20.462 21.236 15.830 C 21.577 15.010 20.760 14.186 19.938 14.520 C 17.031 15.698 13.698 14.631 12.014 11.985 C 10.330 9.339 10.776 5.868 13.074 3.733 L 13.151 3.653 C 13.702 3.023 13.264 2.000 12.393 2.000 L 12.127 2.000 L 12.059 1.994 L 11.999 1.992 Z"),
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
