package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxRightTop: ImageVector
    get() {
        if (_alignBoxRightTop != null) return _alignBoxRightTop!!
        _alignBoxRightTop = tablerFilledIcon(
            name = "AlignBoxRightTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 18.000 11.000 L 16.000 11.000 L 15.883 11.007 C 15.358 11.069 14.972 11.530 15.003 12.059 C 15.034 12.587 15.471 12.999 16.000 13.000 L 18.000 13.000 L 18.117 12.993 C 18.642 12.931 19.028 12.470 18.997 11.941 C 18.966 11.413 18.529 11.001 18.000 11.000 ZM 18.000 8.000 L 12.000 8.000 L 11.883 8.007 C 11.358 8.069 10.972 8.530 11.003 9.059 C 11.034 9.587 11.471 9.999 12.000 10.000 L 18.000 10.000 L 18.117 9.993 C 18.642 9.931 19.028 9.470 18.997 8.941 C 18.966 8.413 18.529 8.001 18.000 8.000 ZM 18.000 5.000 L 14.000 5.000 L 13.883 5.007 C 13.358 5.069 12.972 5.530 13.003 6.059 C 13.034 6.587 13.471 6.999 14.000 7.000 L 18.000 7.000 L 18.117 6.993 C 18.642 6.931 19.028 6.470 18.997 5.941 C 18.966 5.413 18.529 5.001 18.000 5.000 Z"),
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
        return _alignBoxRightTop!!
    }

private var _alignBoxRightTop: ImageVector? = null
