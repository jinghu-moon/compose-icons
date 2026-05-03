package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CornerUpRightDoubleFill: ImageVector
    get() {
        if (_cornerUpRightDoubleFill != null) return _cornerUpRightDoubleFill!!
        _cornerUpRightDoubleFill = remixIcon(
            name = "CornerUpRightDoubleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 19.000 L 4.000 10.000 L 9.586 10.000 L 9.586 4.586 L 16.000 11.000 L 9.586 17.414 L 9.586 12.000 L 6.000 12.000 L 6.000 19.000 L 4.000 19.000 ZM 13.836 6.050 L 15.250 4.636 L 21.615 11.000 L 15.250 17.364 L 13.836 15.950 L 18.786 11.000 L 13.836 6.050 Z"),
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
        return _cornerUpRightDoubleFill!!
    }

private var _cornerUpRightDoubleFill: ImageVector? = null
