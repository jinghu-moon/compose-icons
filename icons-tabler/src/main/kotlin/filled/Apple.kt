package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = tablerFilledIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 2.000 C 15.529 2.001 15.966 2.413 15.997 2.941 C 16.028 3.470 15.642 3.931 15.117 3.993 L 15.000 4.000 C 14.307 4.000 13.670 4.694 13.309 5.552 C 13.926 5.238 14.600 5.053 15.291 5.008 L 15.556 5.000 C 18.538 5.000 21.000 8.053 21.000 11.320 C 21.000 14.867 20.394 17.182 18.577 19.898 C 16.885 22.149 14.485 22.651 12.167 21.132 C 12.071 21.071 11.950 21.067 11.850 21.122 C 9.515 22.650 7.115 22.149 5.390 19.852 C 3.607 17.184 3.000 14.868 3.000 11.320 L 3.004 11.098 C 3.112 7.917 5.530 5.000 8.444 5.000 C 9.384 5.000 10.296 5.291 11.132 5.792 C 11.551 3.842 12.950 2.000 15.000 2.000M 7.966 8.154 C 6.606 9.012 6.000 10.214 6.000 12.000 C 6.000 12.552 6.448 13.000 7.000 13.000 C 7.552 13.000 8.000 12.552 8.000 12.000 C 8.000 10.875 8.280 10.322 9.034 9.846 C 9.501 9.551 9.641 8.933 9.346 8.466 C 9.051 7.999 8.433 7.859 7.966 8.154"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _apple!!
    }

private var _apple: ImageVector? = null
