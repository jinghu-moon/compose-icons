package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorBoldIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 215.52l-44-44c31.62-13.133 47.304-48.827 35.59-81-2.268-6.227-9.153-9.437-15.38-7.17l-35.61 13c7.782-23.283 1.56-48.965-16.015-66.105C139.501 13.105 113.671 7.528 90.59 15.89c-6.227 2.268-9.437 9.153-7.17 15.38l13 35.61C73.122 59.07 47.409 65.288 30.255 82.882 13.1 100.475 7.534 126.337 15.93 149.43c2.268 6.227 9.153 9.437 15.38 7.17l35.61-13c-7.863 23.304-1.662 49.052 15.947 66.221 17.609 17.17 43.506 22.718 66.603 14.269 6.227-2.268 9.437-9.153 7.17-15.38L143.69 173.12c5.079 1.711 10.354 2.773 15.7 3.16l56.17 56.17c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM129.38 39.78c12.673 5.909 21.341 18.008 22.86 31.908 1.519 13.901-4.332 27.585-15.43 36.092L110.7 36.05c6.437-.287 12.847 .993 18.68 3.73ZM36.05 129.32C35.247 111.846 45.892 95.878 62.329 89.896c16.438-5.982 34.855-.589 45.471 13.314ZM110.64 200.24C97.967 194.331 89.299 182.232 87.78 168.332c-1.519-13.901 4.332-27.585 15.43-36.092L129.32 204c-6.439 .276-12.849-1.014-18.68-3.76ZM147.09 148.73c-5.848-2.713-10.95-6.803-14.87-11.92L204 110.7c.613 13.97-6.114 27.246-17.741 35.015-11.628 7.768-26.468 8.9-39.139 2.985Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
