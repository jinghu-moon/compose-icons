package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareCircleFill: ImageVector
    get() {
        if (_shareCircleFill != null) return _shareCircleFill!!
        _shareCircleFill = remixIcon(
            name = "ShareCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.049 L 11.000 4.062 C 7.054 4.554 4.000 7.920 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.080 20.000 19.446 16.946 19.938 13.000 L 21.951 13.000 C 21.449 18.053 17.185 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.815 5.947 2.551 11.000 2.049 ZM 18.707 6.707 L 12.000 13.414 L 10.586 12.000 L 17.293 5.293 L 14.000 2.000 L 22.000 2.000 L 22.000 10.000 L 18.707 6.707 Z"),
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
        return _shareCircleFill!!
    }

private var _shareCircleFill: ImageVector? = null
