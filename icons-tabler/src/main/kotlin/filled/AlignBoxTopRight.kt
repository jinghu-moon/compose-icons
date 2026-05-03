package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxTopRight: ImageVector
    get() {
        if (_alignBoxTopRight != null) return _alignBoxTopRight!!
        _alignBoxTopRight = tablerFilledIcon(
            name = "AlignBoxTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 15.000 5.000 C 14.448 5.000 14.000 5.448 14.000 6.000 L 14.000 12.000 L 14.007 12.117 C 14.069 12.642 14.530 13.028 15.059 12.997 C 15.587 12.966 15.999 12.529 16.000 12.000 L 16.000 6.000 L 15.993 5.883 C 15.934 5.380 15.507 5.000 15.000 5.000 ZM 18.000 5.000 C 17.448 5.000 17.000 5.448 17.000 6.000 L 17.000 10.000 L 17.007 10.117 C 17.069 10.642 17.530 11.028 18.059 10.997 C 18.587 10.966 18.999 10.529 19.000 10.000 L 19.000 6.000 L 18.993 5.883 C 18.934 5.380 18.507 5.000 18.000 5.000 ZM 12.000 5.000 C 11.448 5.000 11.000 5.448 11.000 6.000 L 11.000 8.000 L 11.007 8.117 C 11.069 8.642 11.530 9.028 12.059 8.997 C 12.587 8.966 12.999 8.529 13.000 8.000 L 13.000 6.000 L 12.993 5.883 C 12.934 5.380 12.507 5.000 12.000 5.000 Z"),
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
        return _alignBoxTopRight!!
    }

private var _alignBoxTopRight: ImageVector? = null
