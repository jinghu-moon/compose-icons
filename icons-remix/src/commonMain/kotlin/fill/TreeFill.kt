package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TreeFill: ImageVector
    get() {
        if (_treeFill != null) return _treeFill!!
        _treeFill = remixIcon(
            name = "TreeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 7.000 C 18.000 7.262 17.983 7.521 17.951 7.774 C 19.771 8.805 21.000 10.759 21.000 13.000 C 21.000 16.314 18.314 19.000 15.000 19.000 C 14.299 19.000 13.626 18.880 13.000 18.659 L 13.000 22.000 L 11.000 22.000 L 11.000 18.400 C 10.250 18.784 9.400 19.000 8.500 19.000 C 5.462 19.000 3.000 16.538 3.000 13.500 C 3.000 12.047 3.563 10.726 4.483 9.743 C 4.877 10.823 5.497 11.794 6.286 12.599 L 7.714 11.199 C 6.991 10.461 6.457 9.538 6.191 8.507 C 6.066 8.025 6.000 7.520 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 15.314 1.000 18.000 3.686 18.000 7.000 Z"),
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
        return _treeFill!!
    }

private var _treeFill: ImageVector? = null
