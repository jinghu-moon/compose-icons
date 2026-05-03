package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = tablerFilledIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.890 2.542 L 21.390 19.059 C 21.513 19.297 21.534 19.575 21.451 19.829 C 21.367 20.084 21.184 20.294 20.944 20.413 C 18.163 21.790 15.102 22.504 11.999 22.500 L 11.477 22.493 C 8.551 22.421 5.677 21.711 3.054 20.413 C 2.814 20.294 2.632 20.083 2.549 19.829 C 2.466 19.574 2.488 19.297 2.611 19.059 L 11.111 2.542 C 11.282 2.209 11.626 2.000 12.000 2.000 C 12.374 2.000 12.718 2.209 12.889 2.542M 5.825 17.182 L 4.865 19.047 L 5.274 19.217 C 7.258 20.004 9.366 20.436 11.500 20.493 L 12.000 20.500 C 14.297 20.503 16.573 20.069 18.708 19.221 L 19.132 19.045 L 18.242 17.317 C 16.323 18.102 14.269 18.504 12.196 18.500 C 10.005 18.504 7.836 18.056 5.826 17.182M 11.000 12.990 C 10.448 12.990 10.000 13.438 10.000 13.990 L 10.007 14.117 C 10.069 14.642 10.530 15.028 11.059 14.997 C 11.587 14.966 11.999 14.529 12.000 14.000 L 11.993 13.873 C 11.934 13.370 11.507 12.990 11.000 12.990M 13.000 10.000 C 12.448 10.000 12.000 10.448 12.000 11.000 L 12.007 11.127 C 12.069 11.652 12.530 12.038 13.059 12.007 C 13.587 11.976 13.999 11.539 14.000 11.010 L 13.993 10.883 C 13.934 10.380 13.507 10.000 13.000 10.000"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
