package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CheckDoubleFill: ImageVector
    get() {
        if (_checkDoubleFill != null) return _checkDoubleFill!!
        _checkDoubleFill = remixIcon(
            name = "CheckDoubleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.602 13.760 L 13.014 15.172 L 21.479 6.706 L 22.894 8.121 L 13.014 18.000 L 6.650 11.636 L 8.064 10.222 L 10.189 12.347 L 11.602 13.759 L 11.602 13.760 ZM 11.604 10.932 L 16.556 5.979 L 17.967 7.390 L 13.014 12.342 L 11.604 10.932 ZM 8.777 16.587 L 7.364 18.000 L 1.000 11.636 L 2.414 10.222 L 3.827 11.635 L 3.826 11.636 L 8.777 16.587 Z"),
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
        return _checkDoubleFill!!
    }

private var _checkDoubleFill: ImageVector? = null
