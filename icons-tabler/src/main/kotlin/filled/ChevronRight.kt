package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) return _chevronRight!!
        _chevronRight = tablerFilledIcon(
            name = "ChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.707 5.293 L 15.707 11.293 C 16.097 11.684 16.097 12.316 15.707 12.707 L 9.707 18.707 C 9.456 18.967 9.084 19.071 8.734 18.980 C 8.385 18.888 8.112 18.615 8.020 18.266 C 7.929 17.916 8.033 17.544 8.293 17.293 L 13.586 12.000 L 8.293 6.707 C 7.914 6.315 7.919 5.691 8.305 5.305 C 8.691 4.919 9.315 4.914 9.707 5.293"),
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
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
