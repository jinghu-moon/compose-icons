package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Telegram2Line: ImageVector
    get() {
        if (_telegram2Line != null) return _telegram2Line!!
        _telegram2Line = remixIcon(
            name = "Telegram2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.094 7.146 C 17.687 6.931 17.982 6.854 18.145 6.826 C 18.146 6.878 18.145 6.921 18.142 6.948 C 17.910 9.392 16.891 15.405 16.367 18.203 C 16.245 18.858 16.151 19.170 15.518 18.798 C 15.101 18.553 14.724 18.245 14.321 17.980 C 12.996 17.112 11.100 15.819 11.256 15.897 C 9.952 15.037 10.498 14.511 11.226 13.809 C 11.343 13.696 11.466 13.578 11.586 13.453 C 11.640 13.397 11.903 13.152 12.273 12.808 C 13.461 11.703 15.757 9.569 15.815 9.322 C 15.825 9.281 15.833 9.130 15.744 9.051 C 15.654 8.971 15.521 8.998 15.426 9.020 C 15.290 9.051 13.133 10.477 8.952 13.299 C 8.340 13.719 7.785 13.924 7.288 13.913 L 7.293 13.916 C 6.638 13.685 5.985 13.486 5.329 13.286 C 4.897 13.155 4.465 13.023 4.029 12.881 C 3.922 12.847 3.819 12.814 3.721 12.783 C 8.248 10.811 11.263 9.512 12.774 8.884 C 14.968 7.971 16.270 7.446 17.094 7.146 ZM 19.517 5.218 C 19.264 5.012 18.985 4.918 18.792 4.872 C 18.592 4.824 18.402 4.809 18.258 4.811 C 17.781 4.820 17.270 4.955 16.412 5.266 C 15.537 5.584 14.193 6.128 12.006 7.037 C 10.464 7.679 7.394 9.001 2.804 11.001 C 2.400 11.162 2.031 11.345 1.739 11.562 C 1.469 11.762 1.092 12.120 1.023 12.671 C 0.971 13.087 1.092 13.471 1.338 13.774 C 1.552 14.037 1.826 14.197 2.035 14.298 C 2.345 14.448 2.763 14.579 3.130 14.694 C 3.703 14.874 4.274 15.057 4.849 15.233 C 6.627 15.777 8.091 16.225 9.701 17.287 C 10.882 18.065 12.041 18.878 13.224 19.653 C 13.656 19.936 14.059 20.261 14.505 20.522 C 14.992 20.808 15.610 21.069 16.364 21.000 C 17.502 20.895 18.094 19.848 18.333 18.570 C 18.855 15.780 19.891 9.684 20.133 7.138 C 20.165 6.805 20.128 6.433 20.097 6.253 C 20.065 6.068 19.968 5.584 19.517 5.218 Z"),
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
        return _telegram2Line!!
    }

private var _telegram2Line: ImageVector? = null
