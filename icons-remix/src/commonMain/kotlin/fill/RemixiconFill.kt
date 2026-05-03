package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RemixiconFill: ImageVector
    get() {
        if (_remixiconFill != null) return _remixiconFill!!
        _remixiconFill = remixIcon(
            name = "RemixiconFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.530 17.529 L 20.001 21.000 L 3.001 21.000 L 3.001 4.000 L 13.668 4.000 L 13.668 4.008 C 13.778 4.003 13.889 4.000 14.001 4.000 C 14.046 4.000 14.092 4.000 14.137 4.001 C 14.048 4.372 14.001 4.762 14.001 5.167 C 14.001 7.485 16.016 9.500 18.668 9.500 C 19.392 9.500 20.087 9.303 20.700 8.962 C 20.896 9.607 21.001 10.291 21.001 11.000 C 21.001 13.974 19.146 16.515 16.530 17.529 ZM 18.501 7.500 C 17.120 7.500 16.001 6.381 16.001 5.000 C 16.001 3.619 17.120 2.500 18.501 2.500 C 19.882 2.500 21.001 3.619 21.001 5.000 C 21.001 6.381 19.882 7.500 18.501 7.500 Z"),
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
        return _remixiconFill!!
    }

private var _remixiconFill: ImageVector? = null
