package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ViewNone: ImageVector
    get() {
        if (_viewNone != null) return _viewNone!!
        _viewNone = radixIcon(
            name = "ViewNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.653 1.008c.174 .018 .339 .066 .49 .138l.031-.025 .065 .077c.453 .258 .76 .744 .76 1.303v10l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L13.5 14h-12l-.153-.008c-.175-.018-.34-.066-.492-.139l-.029 .026L.76 13.804C.348 13.57 .058 13.147 .008 12.653L0 12.5v-10C0 1.723 .59 1.085 1.347 1.008L1.5 1h12l.153 .008ZM1.852 13h11.648c.276 0 .5-.224 .5-.5v-9.913L1.852 13ZM1.5 2C1.224 2 1 2.224 1 2.5v9.912L13.148 2h-11.648Z"),
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
        return _viewNone!!
    }

private var _viewNone: ImageVector? = null
