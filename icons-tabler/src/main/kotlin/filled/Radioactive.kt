package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = tablerFilledIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 11.000 C 21.552 11.000 22.000 11.448 22.000 12.000 C 21.998 15.571 20.093 18.870 17.000 20.656 C 16.561 20.910 16.001 20.795 15.698 20.388 L 15.634 20.290 L 12.634 15.100 C 12.539 14.936 12.493 14.748 12.501 14.558 L 12.511 14.448 L 12.534 14.342 L 12.568 14.236 L 12.614 14.136 L 12.670 14.042 L 12.737 13.953 C 12.786 13.895 12.841 13.843 12.902 13.798 L 13.000 13.734 C 13.569 13.405 13.940 12.819 13.993 12.164 L 14.000 12.001 C 14.000 11.494 14.379 11.066 14.883 11.007 L 15.000 11.000 L 21.000 11.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 3.344 C 10.094 1.558 13.906 1.558 17.000 3.344 C 17.439 3.598 17.619 4.140 17.418 4.606 L 17.366 4.710 L 14.366 9.900 L 14.302 9.998 C 14.257 10.059 14.205 10.114 14.147 10.163 L 14.058 10.230 C 13.997 10.271 13.932 10.305 13.863 10.332 L 13.758 10.366 L 13.651 10.388 C 13.466 10.416 13.276 10.392 13.104 10.318 L 13.000 10.266 C 12.436 9.940 11.749 9.910 11.158 10.184 L 11.000 10.266 C 10.561 10.520 10.001 10.405 9.698 9.998 L 9.634 9.900 L 6.634 4.710 C 6.358 4.232 6.522 3.620 7.000 3.344 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 11.000 C 9.507 11.000 9.934 11.380 9.993 11.884 L 10.000 12.001 C 10.000 12.657 10.321 13.272 10.861 13.646 L 11.098 13.798 C 11.159 13.843 11.214 13.895 11.263 13.953 L 11.330 14.042 L 11.386 14.137 L 11.431 14.236 C 11.445 14.272 11.457 14.306 11.466 14.342 L 11.488 14.449 L 11.499 14.559 C 11.506 14.709 11.478 14.858 11.419 14.996 L 11.366 15.100 L 8.366 20.290 C 8.090 20.768 7.478 20.932 7.000 20.656 C 3.907 18.870 2.002 15.571 2.000 12.000 C 2.000 11.493 2.380 11.066 2.883 11.007 L 3.000 11.000 L 9.000 11.000 Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
