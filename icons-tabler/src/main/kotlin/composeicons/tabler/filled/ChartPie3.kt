package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie3: ImageVector
    get() {
        if (_chartPie3 != null) return _chartPie3!!
        _chartPie3 = tablerFilledIcon(
            name = "ChartPie3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 20.66C13.4 22.738 8.89 22.373 5.672 19.743L12.414 13h9.536c-.322 3.201-2.164 6.052-4.95 7.66M11 2.05v9.534L4.257 18.328C2.797 16.542 2 14.307 2 12l.005-.324C2.167 6.667 6.013 2.551 11 2.05M17 3.34c2.786 1.608 4.628 4.459 4.95 7.66h-8.95v-8.95c1.41 .142 2.773 .582 4 1.29"),
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
        return _chartPie3!!
    }

private var _chartPie3: ImageVector? = null
