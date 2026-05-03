package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BnbLine: ImageVector
    get() {
        if (_bnbLine != null) return _bnbLine!!
        _bnbLine = remixIcon(
            name = "BnbLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 20.689 L 9.991 19.526 L 9.988 21.835 L 12.000 23.000 L 14.012 21.836 L 14.009 19.526 L 12.000 20.689 ZM 16.007 18.369 L 16.010 20.678 L 21.500 17.500 L 21.500 11.146 L 19.500 12.297 L 19.500 16.347 L 16.007 18.369 ZM 19.500 9.989 L 21.500 8.838 L 21.500 6.500 L 19.504 5.344 L 17.508 6.500 L 19.500 7.653 L 19.500 9.989 ZM 15.512 5.344 L 17.508 4.189 L 12.000 1.000 L 6.492 4.189 L 8.488 5.345 L 12.000 3.311 L 15.512 5.344 ZM 6.492 6.500 L 4.496 5.345 L 2.500 6.500 L 2.500 8.838 L 4.500 9.990 L 4.500 7.653 L 6.492 6.500 ZM 2.500 11.146 L 4.500 12.298 L 4.500 16.347 L 7.992 18.369 L 7.989 20.678 L 2.500 17.500 L 2.500 11.146 ZM 17.500 8.806 L 15.512 7.656 L 12.000 9.689 L 8.488 7.656 L 6.500 8.806 L 6.500 11.141 L 9.998 13.156 L 9.994 17.216 L 12.000 18.378 L 14.006 17.217 L 14.001 13.155 L 17.500 11.141 L 17.500 8.806 ZM 7.995 16.059 L 7.997 14.311 L 6.500 13.449 L 6.500 15.194 L 7.995 16.059 ZM 10.483 6.500 L 12.000 7.378 L 13.516 6.500 L 12.000 5.622 L 10.483 6.500 ZM 16.003 14.311 L 17.500 13.449 L 17.500 15.194 L 16.005 16.060 L 16.003 14.311 Z"),
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
        return _bnbLine!!
    }

private var _bnbLine: ImageVector? = null
