package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) return _chevronDown!!
        _chevronDown = tablerFilledIcon(
            name = "ChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.707 8.293 C 19.097 8.684 19.097 9.316 18.707 9.707 L 12.707 15.707 C 12.316 16.097 11.684 16.097 11.293 15.707 L 5.293 9.707 C 4.914 9.315 4.919 8.691 5.305 8.305 C 5.691 7.919 6.315 7.914 6.707 8.293 L 12.000 13.586 L 17.293 8.293 C 17.684 7.903 18.316 7.903 18.707 8.293"),
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
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
