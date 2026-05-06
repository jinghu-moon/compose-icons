package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Assembly: ImageVector
    get() {
        if (_assembly != null) return _assembly!!
        _assembly = tablerFilledIcon(
            name = "Assembly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98q.1 .06 .18 .133l.009 .008 .106 .075c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C1.999 7.051 2.631 5.976 3.65 5.409L10.425 1.414c1.01-.554 2.235-.549 3.24 .015M13.025 6.772c-.618-.356-1.377-.361-2-.014L8.002 8.562C7.38 8.918 6.997 9.581 7 10.298v3.278c-0 .727 .394 1.397 1.03 1.75l2.946 1.89c.657 .367 1.39 .367 1.994 .033l3.054-1.955c.582-.322 .976-.992 .976-1.719v-3.277l-.005-.164c-.042-.543-.304-1.045-.725-1.391l-.092-.07-.056-.047c-.031-.023-.063-.045-.096-.064Z"),
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
        return _assembly!!
    }

private var _assembly: ImageVector? = null
