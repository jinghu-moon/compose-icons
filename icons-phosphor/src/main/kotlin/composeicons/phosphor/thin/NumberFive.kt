package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorThinIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 160c.002 20.508-12.05 39.101-30.771 47.474-18.721 8.372-40.614 4.959-55.899-8.714-1.657-1.475-1.805-4.013-.33-5.67 1.475-1.657 4.013-1.805 5.67-.33 17.533 15.678 44.295 14.796 60.757-2.004 16.462-16.799 16.801-43.574 .77-60.785C136.166 112.761 109.434 111.201 91.51 126.43c-1.292 1.089-3.129 1.248-4.59 .398-1.46-.85-2.229-2.526-1.92-4.188L100.09 47.22c.371-1.867 2.007-3.214 3.91-3.22h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-60.72L94.77 114.53c16.107-8.937 35.739-8.687 51.613 .659 15.873 9.346 25.618 26.391 25.617 44.811Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
