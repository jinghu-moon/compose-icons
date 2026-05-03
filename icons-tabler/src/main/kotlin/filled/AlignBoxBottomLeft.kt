package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxBottomLeft: ImageVector
    get() {
        if (_alignBoxBottomLeft != null) return _alignBoxBottomLeft!!
        _alignBoxBottomLeft = tablerFilledIcon(
            name = "AlignBoxBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 6.000 15.000 C 5.448 15.000 5.000 15.448 5.000 16.000 L 5.000 18.000 L 5.007 18.117 C 5.069 18.642 5.530 19.028 6.059 18.997 C 6.587 18.966 6.999 18.529 7.000 18.000 L 7.000 16.000 L 6.993 15.883 C 6.934 15.380 6.507 15.000 6.000 15.000 ZM 9.000 11.000 C 8.448 11.000 8.000 11.448 8.000 12.000 L 8.000 18.000 L 8.007 18.117 C 8.069 18.642 8.530 19.028 9.059 18.997 C 9.587 18.966 9.999 18.529 10.000 18.000 L 10.000 12.000 L 9.993 11.883 C 9.934 11.380 9.507 11.000 9.000 11.000 ZM 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000 L 11.000 18.000 L 11.007 18.117 C 11.069 18.642 11.530 19.028 12.059 18.997 C 12.587 18.966 12.999 18.529 13.000 18.000 L 13.000 14.000 L 12.993 13.883 C 12.934 13.380 12.507 13.000 12.000 13.000 Z"),
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
        return _alignBoxBottomLeft!!
    }

private var _alignBoxBottomLeft: ImageVector? = null
