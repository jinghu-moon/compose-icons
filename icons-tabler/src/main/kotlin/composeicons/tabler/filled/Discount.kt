package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Discount: ImageVector
    get() {
        if (_discount != null) return _discount!!
        _discount = tablerFilledIcon(
            name = "Discount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M14.5 13C13.672 13 13 13.672 13 14.5c0 .828 .672 1.5 1.5 1.5C15.328 16 16 15.328 16 14.5 16 13.672 15.328 13 14.5 13M15.707 8.293c-.391-.39-1.023-.39-1.414 0l-6 6c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l6-6c.39-.391 .39-1.023 0-1.414M9.5 8C8.672 8 8 8.672 8 9.5 8 10.328 8.672 11 9.5 11 10.328 11 11 10.328 11 9.5 11 8.672 10.328 8 9.5 8"),
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
        return _discount!!
    }

private var _discount: ImageVector? = null
