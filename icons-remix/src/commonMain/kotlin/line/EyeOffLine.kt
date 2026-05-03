package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EyeOffLine: ImageVector
    get() {
        if (_eyeOffLine != null) return _eyeOffLine!!
        _eyeOffLine = remixIcon(
            name = "EyeOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.883 19.297 C 16.181 20.375 14.164 21.000 12.000 21.000 C 6.608 21.000 2.122 17.120 1.182 12.000 C 1.618 9.623 2.819 7.513 4.520 5.935 L 1.394 2.808 L 2.808 1.394 L 22.607 21.192 L 21.193 22.607 L 17.883 19.297 ZM 5.936 7.350 C 4.607 8.560 3.638 10.167 3.223 12.000 C 4.140 16.052 7.765 19.000 12.000 19.000 C 13.600 19.000 15.112 18.580 16.424 17.838 L 14.396 15.810 C 13.702 16.247 12.881 16.500 12.000 16.500 C 9.515 16.500 7.500 14.485 7.500 12.000 C 7.500 11.120 7.753 10.298 8.190 9.604 L 5.936 7.350 ZM 12.914 14.328 L 9.672 11.087 C 9.561 11.370 9.500 11.678 9.500 12.000 C 9.500 13.381 10.620 14.500 12.000 14.500 C 12.323 14.500 12.631 14.439 12.914 14.328 ZM 20.807 16.593 L 19.376 15.162 C 20.032 14.227 20.515 13.159 20.778 12.000 C 19.860 7.948 16.236 5.000 12.000 5.000 C 11.154 5.000 10.333 5.118 9.552 5.338 L 7.974 3.760 C 9.221 3.270 10.579 3.000 12.000 3.000 C 17.392 3.000 21.878 6.880 22.819 12.000 C 22.507 13.700 21.804 15.263 20.807 16.593 ZM 11.723 7.509 C 11.815 7.503 11.907 7.500 12.000 7.500 C 14.486 7.500 16.500 9.515 16.500 12.000 C 16.500 12.093 16.497 12.186 16.492 12.278 L 11.723 7.509 Z"),
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
        return _eyeOffLine!!
    }

private var _eyeOffLine: ImageVector? = null
