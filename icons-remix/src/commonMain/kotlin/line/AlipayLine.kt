package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlipayLine: ImageVector
    get() {
        if (_alipayLine != null) return _alipayLine!!
        _alipayLine = remixIcon(
            name = "AlipayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.408 16.790 C 16.235 15.840 14.689 15.144 13.768 14.704 C 12.368 16.400 10.896 17.424 8.688 17.424 C 6.480 17.424 5.000 16.064 5.176 14.392 C 5.296 13.296 6.048 11.504 9.304 11.816 C 11.024 11.976 11.808 12.296 13.216 12.760 C 13.576 12.096 13.880 11.360 14.104 10.584 L 7.880 10.584 L 7.880 9.968 L 10.952 9.968 L 10.952 8.864 L 7.200 8.864 L 7.200 8.184 L 10.952 8.184 L 10.952 6.592 C 10.952 6.592 10.984 6.344 11.264 6.344 L 12.800 6.344 L 12.800 8.192 L 16.800 8.192 L 16.800 8.872 L 12.800 8.872 L 12.800 9.976 L 16.064 9.976 C 15.768 11.200 15.312 12.320 14.744 13.296 C 15.254 13.478 16.841 13.972 19.504 14.778 C 19.825 13.913 20.000 12.977 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.622 20.000 16.949 18.739 18.408 16.790 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 8.432 16.368 C 9.872 16.368 11.256 15.496 12.392 14.016 C 10.784 13.240 9.448 12.856 7.952 12.856 C 6.648 12.856 5.968 13.656 5.848 14.272 C 5.728 14.888 6.096 16.368 8.432 16.368 Z"),
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
        return _alipayLine!!
    }

private var _alipayLine: ImageVector? = null
