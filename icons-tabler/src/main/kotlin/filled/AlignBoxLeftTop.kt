package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxLeftTop: ImageVector
    get() {
        if (_alignBoxLeftTop != null) return _alignBoxLeftTop!!
        _alignBoxLeftTop = tablerFilledIcon(
            name = "AlignBoxLeftTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 8.000 11.000 L 6.000 11.000 L 5.883 11.007 C 5.358 11.069 4.972 11.530 5.003 12.059 C 5.034 12.587 5.471 12.999 6.000 13.000 L 8.000 13.000 L 8.117 12.993 C 8.642 12.931 9.028 12.470 8.997 11.941 C 8.966 11.413 8.529 11.001 8.000 11.000 ZM 12.000 8.000 L 6.000 8.000 L 5.883 8.007 C 5.358 8.069 4.972 8.530 5.003 9.059 C 5.034 9.587 5.471 9.999 6.000 10.000 L 12.000 10.000 L 12.117 9.993 C 12.642 9.931 13.028 9.470 12.997 8.941 C 12.966 8.413 12.529 8.001 12.000 8.000 ZM 10.000 5.000 L 6.000 5.000 L 5.883 5.007 C 5.358 5.069 4.972 5.530 5.003 6.059 C 5.034 6.587 5.471 6.999 6.000 7.000 L 10.000 7.000 L 10.117 6.993 C 10.642 6.931 11.028 6.470 10.997 5.941 C 10.966 5.413 10.529 5.001 10.000 5.000 Z"),
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
        return _alignBoxLeftTop!!
    }

private var _alignBoxLeftTop: ImageVector? = null
