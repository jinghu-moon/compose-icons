package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TailwindCssLine: ImageVector
    get() {
        if (_tailwindCssLine != null) return _tailwindCssLine!!
        _tailwindCssLine = remixIcon(
            name = "TailwindCssLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.127 6.219 C 9.178 5.378 10.499 5.000 12.001 5.000 C 13.410 5.000 14.486 5.331 15.359 5.834 C 16.098 6.259 16.713 6.841 17.307 7.445 C 17.953 8.101 18.303 8.420 18.744 8.530 C 19.217 8.648 19.617 8.612 19.983 8.456 C 20.362 8.293 20.774 7.969 21.201 7.400 L 22.972 8.243 C 22.601 9.727 21.924 10.943 20.876 11.781 C 19.825 12.622 18.504 13.000 17.001 13.000 C 15.593 13.000 14.517 12.669 13.644 12.166 C 12.810 11.686 12.201 11.068 11.723 10.583 C 11.061 9.911 10.706 9.582 10.259 9.470 C 9.786 9.352 9.386 9.388 9.020 9.544 C 8.641 9.707 8.228 10.031 7.801 10.600 L 6.031 9.757 C 6.402 8.273 7.079 7.058 8.127 6.219 ZM 12.001 7.000 C 11.173 7.000 10.506 7.146 9.968 7.408 C 11.288 7.490 12.149 8.303 13.025 9.129 C 13.529 9.605 14.038 10.085 14.642 10.433 C 15.201 10.755 15.931 11.000 17.001 11.000 C 17.830 11.000 18.497 10.854 19.035 10.592 C 17.715 10.509 16.854 9.697 15.979 8.871 C 15.474 8.395 14.965 7.915 14.361 7.567 C 13.802 7.245 13.072 7.000 12.001 7.000 ZM 3.127 12.219 C 4.178 11.378 5.499 11.000 7.001 11.000 C 8.410 11.000 9.486 11.331 10.359 11.834 C 11.098 12.259 11.713 12.841 12.307 13.445 C 12.953 14.101 13.303 14.420 13.744 14.530 C 14.217 14.648 14.617 14.613 14.983 14.456 C 15.362 14.293 15.774 13.969 16.201 13.400 L 17.972 14.243 C 17.601 15.727 16.924 16.942 15.876 17.781 C 14.825 18.622 13.504 19.000 12.001 19.000 C 10.593 19.000 9.517 18.669 8.644 18.166 C 7.810 17.686 7.201 17.068 6.723 16.583 C 6.061 15.911 5.706 15.582 5.259 15.470 C 4.786 15.352 4.386 15.387 4.020 15.544 C 3.641 15.707 3.228 16.031 2.801 16.600 L 1.031 15.757 C 1.402 14.273 2.079 13.057 3.127 12.219 ZM 7.001 13.000 C 6.173 13.000 5.506 13.146 4.968 13.408 C 6.288 13.491 7.149 14.303 8.025 15.129 L 8.025 15.129 C 8.529 15.605 9.038 16.085 9.642 16.433 C 10.201 16.755 10.931 17.000 12.001 17.000 C 12.830 17.000 13.497 16.854 14.035 16.592 C 12.715 16.510 11.854 15.697 10.979 14.871 C 10.474 14.395 9.965 13.915 9.361 13.567 C 8.802 13.245 8.072 13.000 7.001 13.000 Z"),
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
        return _tailwindCssLine!!
    }

private var _tailwindCssLine: ImageVector? = null
