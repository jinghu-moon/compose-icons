package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileLambda: ImageVector
    get() {
        if (_fileLambda != null) return _fileLambda!!
        _fileLambda = tablerFilledIcon(
            name = "FileLambda",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 10.000 10.000 C 9.471 10.001 9.034 10.413 9.003 10.941 C 8.972 11.470 9.358 11.931 9.883 11.993 L 10.000 12.000 C 10.342 12.000 10.662 12.362 11.166 13.445 L 9.168 16.445 C 8.861 16.905 8.985 17.525 9.445 17.832 C 9.905 18.139 10.525 18.015 10.832 17.555 L 12.122 15.621 C 12.947 17.359 13.630 18.000 15.000 18.000 C 15.529 17.999 15.966 17.587 15.997 17.059 C 16.028 16.530 15.642 16.069 15.117 16.007 L 15.000 16.000 C 14.610 16.000 14.250 15.530 13.613 14.062 L 13.198 13.086 C 12.213 10.812 11.542 10.000 10.000 10.000M 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _fileLambda!!
    }

private var _fileLambda: ImageVector? = null
