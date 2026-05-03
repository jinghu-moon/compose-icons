package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = tablerFilledIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.586 3.000 L 4.000 9.586 C 3.428 10.158 3.256 11.018 3.566 11.766 L 3.634 11.911 C 3.976 12.579 4.663 13.000 5.414 13.000 L 8.000 13.000 L 8.000 20.000 C 8.000 21.105 8.895 22.000 10.000 22.000 L 14.000 22.000 L 14.150 21.995 C 15.194 21.917 16.000 21.047 16.000 20.000 L 15.999 13.000 L 18.586 13.000 C 19.395 13.000 20.124 12.513 20.433 11.765 C 20.743 11.018 20.572 10.158 20.000 9.586 L 13.414 3.000 C 12.633 2.219 11.367 2.219 10.586 3.000 Z"),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
