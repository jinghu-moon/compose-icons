package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FirefoxBrowserFill: ImageVector
    get() {
        if (_firefoxBrowserFill != null) return _firefoxBrowserFill!!
        _firefoxBrowserFill = remixIcon(
            name = "FirefoxBrowserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.283 8.26C20.847 7.213 19.966 6.082 19.273 5.725c.479 .939 .892 2.002 1.016 3.057C19.157 5.959 17.236 4.82 15.668 2.342c-.196-.31-.425-.727-.545-1.012C12.895 2.634 11.972 4.918 11.735 6.371c-.688 .039-1.362 .211-1.985 .507-.113 .056-.17 .199-.127 .318 .048 .138 .209 .207 .341 .147 .635-.299 1.333-.457 2.035-.464 1.805-.013 3.518 .991 4.416 2.559-.535-.376-1.492-.747-2.415-.586 3.603 1.801 2.636 8.004-2.357 7.769C9.629 16.538 7.698 14.971 7.517 12.89c0 0 .462-1.723 3.311-1.723 .308 0 1.188-.859 1.205-1.108C12.028 9.978 10.285 9.284 9.606 8.615 9.304 8.317 9.012 7.997 8.658 7.759 8.429 6.96 8.42 6.115 8.63 5.311 7.601 5.78 6.796 6.52 6.214 7.174 5.817 6.671 5.845 5.012 5.867 4.666 4.994 5.131 4.225 5.94 3.619 6.803 2.59 8.261 1.997 10.174 1.997 11.984c0 5.531 4.471 10.015 10.003 10.015 4.954 0 9.081-3.597 9.887-8.321 .241-1.822 .107-3.709-.604-5.419Z"),
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
        return _firefoxBrowserFill!!
    }

private var _firefoxBrowserFill: ImageVector? = null
