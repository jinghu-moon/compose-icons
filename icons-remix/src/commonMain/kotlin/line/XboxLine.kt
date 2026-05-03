package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.XboxLine: ImageVector
    get() {
        if (_xboxLine != null) return _xboxLine!!
        _xboxLine = remixIcon(
            name = "XboxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.798 15.485 C 5.922 12.965 7.998 10.046 9.285 8.523 C 8.037 7.277 7.123 6.592 6.467 6.223 C 4.947 7.679 4.001 9.729 4.001 12.000 C 4.001 13.249 4.287 14.432 4.798 15.485 ZM 8.849 4.645 C 10.449 5.051 12.001 5.959 12.001 5.959 L 12.001 5.954 C 12.001 5.954 13.553 5.050 15.152 4.645 C 14.185 4.230 13.120 4.000 12.001 4.000 C 10.882 4.000 9.816 4.230 8.849 4.645 ZM 17.535 6.223 C 16.880 6.592 15.967 7.278 14.719 8.523 C 16.006 10.046 18.081 12.964 19.205 15.484 C 19.715 14.431 20.001 13.249 20.001 12.000 C 20.001 9.729 19.055 7.679 17.535 6.223 ZM 17.943 17.357 C 16.540 15.120 13.853 12.412 12.001 11.013 C 10.150 12.412 7.462 15.121 6.060 17.358 C 7.524 18.980 9.643 20.000 12.001 20.000 C 14.359 20.000 16.479 18.980 17.943 17.357 ZM 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 Z"),
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
        return _xboxLine!!
    }

private var _xboxLine: ImageVector? = null
