package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlipayFill: ImageVector
    get() {
        if (_alipayFill != null) return _alipayFill!!
        _alipayFill = remixIcon(
            name = "AlipayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.422 15.358 C 17.593 14.205 15.367 13.518 14.744 13.296 C 15.312 12.320 15.768 11.200 16.064 9.976 L 12.800 9.976 L 12.800 8.872 L 16.800 8.872 L 16.800 8.192 L 12.800 8.192 L 12.800 6.344 L 11.264 6.344 C 10.984 6.344 10.952 6.592 10.952 6.592 L 10.952 8.184 L 7.200 8.184 L 7.200 8.864 L 10.952 8.864 L 10.952 9.968 L 7.880 9.968 L 7.880 10.584 L 14.104 10.584 C 13.880 11.360 13.576 12.096 13.216 12.760 C 11.808 12.296 11.024 11.976 9.304 11.816 C 6.048 11.504 5.296 13.296 5.176 14.392 C 5.000 16.064 6.480 17.424 8.688 17.424 C 10.896 17.424 12.368 16.400 13.768 14.704 C 14.935 15.262 17.106 16.229 20.282 17.606 C 18.483 20.258 15.445 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 13.178 21.796 14.308 21.422 15.358 ZM 8.432 16.368 C 6.096 16.368 5.728 14.888 5.848 14.272 C 5.968 13.656 6.648 12.856 7.952 12.856 C 9.448 12.856 10.784 13.240 12.392 14.016 C 11.256 15.496 9.872 16.368 8.432 16.368 Z"),
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
        return _alipayFill!!
    }

private var _alipayFill: ImageVector? = null
