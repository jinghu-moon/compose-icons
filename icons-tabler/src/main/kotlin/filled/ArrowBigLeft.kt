package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = tablerFilledIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.586 4.000 L 3.000 10.586 C 2.219 11.367 2.219 12.633 3.000 13.414 L 9.586 20.000 C 10.158 20.572 11.018 20.744 11.766 20.434 L 11.911 20.366 C 12.579 20.024 13.000 19.337 13.000 18.586 L 13.000 16.000 L 20.000 16.000 C 21.105 16.000 22.000 15.105 22.000 14.000 L 22.000 10.000 L 21.995 9.850 C 21.917 8.806 21.047 8.000 20.000 8.000 L 13.000 7.999 L 13.000 5.414 C 13.000 4.605 12.513 3.876 11.765 3.567 C 11.018 3.257 10.158 3.428 9.586 4.000 Z"),
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
