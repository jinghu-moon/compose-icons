package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyX: ImageVector
    get() {
        if (_copyX != null) return _copyX!!
        _copyX = tablerFilledIcon(
            name = "CopyX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 6.000 C 20.358 6.000 22.000 7.642 22.000 9.667 L 22.000 18.333 C 22.000 20.358 20.358 22.000 18.333 22.000 L 9.667 22.000 C 7.642 22.000 6.000 20.358 6.000 18.333 L 6.000 9.667 C 6.000 7.642 7.642 6.000 9.667 6.000 ZM 15.000 2.000 C 16.094 2.000 16.828 2.533 17.374 3.514 C 17.642 3.997 17.469 4.606 16.986 4.874 C 16.503 5.142 15.894 4.969 15.626 4.486 C 15.405 4.088 15.284 4.000 15.000 4.000 L 5.000 4.000 C 4.452 4.000 4.000 4.452 4.000 5.000 L 4.000 14.998 C 4.000 15.318 4.154 15.616 4.407 15.803 L 4.507 15.868 C 4.987 16.141 5.154 16.752 4.881 17.232 C 4.608 17.712 3.997 17.879 3.517 17.606 C 2.580 17.073 2.001 16.078 2.000 15.000 L 2.000 5.000 C 2.000 3.348 3.348 2.000 5.000 2.000 ZM 15.800 10.786 L 13.963 12.585 L 12.214 10.800 C 11.861 10.440 11.296 10.399 10.895 10.704 L 10.800 10.786 C 10.406 11.173 10.399 11.806 10.786 12.200 L 12.535 13.985 L 10.700 15.785 C 10.340 16.138 10.299 16.704 10.604 17.105 L 10.686 17.200 C 11.073 17.594 11.706 17.601 12.100 17.214 L 13.936 15.414 L 15.686 17.200 C 16.039 17.560 16.604 17.601 17.005 17.296 L 17.100 17.214 C 17.494 16.827 17.501 16.194 17.114 15.800 L 15.364 14.014 L 17.200 12.214 C 17.560 11.861 17.601 11.296 17.296 10.895 L 17.214 10.800 C 16.827 10.406 16.194 10.399 15.800 10.786"),
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
        return _copyX!!
    }

private var _copyX: ImageVector? = null
