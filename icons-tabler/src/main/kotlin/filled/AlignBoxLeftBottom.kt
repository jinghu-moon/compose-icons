package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxLeftBottom: ImageVector
    get() {
        if (_alignBoxLeftBottom != null) return _alignBoxLeftBottom!!
        _alignBoxLeftBottom = tablerFilledIcon(
            name = "AlignBoxLeftBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 8.000 17.000 L 6.000 17.000 L 5.883 17.007 C 5.358 17.069 4.972 17.530 5.003 18.059 C 5.034 18.587 5.471 18.999 6.000 19.000 L 8.000 19.000 L 8.117 18.993 C 8.642 18.931 9.028 18.470 8.997 17.941 C 8.966 17.413 8.529 17.001 8.000 17.000 ZM 12.000 14.000 L 6.000 14.000 L 5.883 14.007 C 5.358 14.069 4.972 14.530 5.003 15.059 C 5.034 15.587 5.471 15.999 6.000 16.000 L 12.000 16.000 L 12.117 15.993 C 12.642 15.931 13.028 15.470 12.997 14.941 C 12.966 14.413 12.529 14.001 12.000 14.000 ZM 10.000 11.000 L 6.000 11.000 L 5.883 11.007 C 5.358 11.069 4.972 11.530 5.003 12.059 C 5.034 12.587 5.471 12.999 6.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.642 12.931 11.028 12.470 10.997 11.941 C 10.966 11.413 10.529 11.001 10.000 11.000 Z"),
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
        return _alignBoxLeftBottom!!
    }

private var _alignBoxLeftBottom: ImageVector? = null
