package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxRightBottom: ImageVector
    get() {
        if (_alignBoxRightBottom != null) return _alignBoxRightBottom!!
        _alignBoxRightBottom = tablerFilledIcon(
            name = "AlignBoxRightBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 18.000 17.000 L 16.000 17.000 L 15.883 17.007 C 15.358 17.069 14.972 17.530 15.003 18.059 C 15.034 18.587 15.471 18.999 16.000 19.000 L 18.000 19.000 L 18.117 18.993 C 18.642 18.931 19.028 18.470 18.997 17.941 C 18.966 17.413 18.529 17.001 18.000 17.000 ZM 18.000 14.000 L 12.000 14.000 L 11.883 14.007 C 11.358 14.069 10.972 14.530 11.003 15.059 C 11.034 15.587 11.471 15.999 12.000 16.000 L 18.000 16.000 L 18.117 15.993 C 18.642 15.931 19.028 15.470 18.997 14.941 C 18.966 14.413 18.529 14.001 18.000 14.000 ZM 18.000 11.000 L 14.000 11.000 L 13.883 11.007 C 13.358 11.069 12.972 11.530 13.003 12.059 C 13.034 12.587 13.471 12.999 14.000 13.000 L 18.000 13.000 L 18.117 12.993 C 18.642 12.931 19.028 12.470 18.997 11.941 C 18.966 11.413 18.529 11.001 18.000 11.000 Z"),
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
        return _alignBoxRightBottom!!
    }

private var _alignBoxRightBottom: ImageVector? = null
