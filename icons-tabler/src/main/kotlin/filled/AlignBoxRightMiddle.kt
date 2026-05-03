package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxRightMiddle: ImageVector
    get() {
        if (_alignBoxRightMiddle != null) return _alignBoxRightMiddle!!
        _alignBoxRightMiddle = tablerFilledIcon(
            name = "AlignBoxRightMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 18.000 14.000 L 16.000 14.000 L 15.883 14.007 C 15.380 14.067 15.001 14.493 15.001 15.000 C 15.001 15.507 15.380 15.933 15.883 15.993 L 16.000 16.000 L 18.000 16.000 L 18.117 15.993 C 18.620 15.933 18.999 15.507 18.999 15.000 C 18.999 14.493 18.620 14.067 18.117 14.007 L 18.000 14.000 ZM 18.000 11.000 L 12.000 11.000 L 11.883 11.007 C 11.380 11.067 11.001 11.493 11.001 12.000 C 11.001 12.507 11.380 12.933 11.883 12.993 L 12.000 13.000 L 18.000 13.000 L 18.117 12.993 C 18.620 12.933 18.999 12.507 18.999 12.000 C 18.999 11.493 18.620 11.067 18.117 11.007 L 18.000 11.000 ZM 18.000 8.000 L 14.000 8.000 L 13.883 8.007 C 13.380 8.067 13.001 8.493 13.001 9.000 C 13.001 9.507 13.380 9.933 13.883 9.993 L 14.000 10.000 L 18.000 10.000 L 18.117 9.993 C 18.620 9.933 18.999 9.507 18.999 9.000 C 18.999 8.493 18.620 8.067 18.117 8.007 L 18.000 8.000 Z"),
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
        return _alignBoxRightMiddle!!
    }

private var _alignBoxRightMiddle: ImageVector? = null
