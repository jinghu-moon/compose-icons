package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHeadlessui: ImageVector
    get() {
        if (_brandHeadlessui != null) return _brandHeadlessui!!
        _brandHeadlessui = tablerOutlineIcon(
            name = "BrandHeadlessui",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.744 4.325 L 14.564 3.058 C 16.993 2.665 19.281 4.315 19.675 6.744 L 20.942 14.564 C 21.335 16.993 19.685 19.281 17.256 19.675 L 9.436 20.942 C 7.007 21.335 4.719 19.685 4.325 17.256 L 3.058 9.436 C 2.665 7.007 4.315 4.719 6.744 4.325"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.252 7.704 L 15.149 6.424 C 15.411 6.382 15.679 6.445 15.894 6.600 C 16.109 6.756 16.254 6.990 16.296 7.252 L 16.656 9.475 L 7.094 12.985 L 6.424 8.851 C 6.382 8.589 6.445 8.321 6.600 8.106 C 6.756 7.891 6.990 7.746 7.252 7.704"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandHeadlessui!!
    }

private var _brandHeadlessui: ImageVector? = null
