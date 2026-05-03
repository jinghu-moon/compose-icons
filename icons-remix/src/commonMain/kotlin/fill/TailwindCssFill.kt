package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TailwindCssFill: ImageVector
    get() {
        if (_tailwindCssFill != null) return _tailwindCssFill!!
        _tailwindCssFill = remixIcon(
            name = "TailwindCssFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.860 C 8.826 4.860 6.843 6.447 6.050 9.620 C 7.240 8.033 8.628 7.438 10.215 7.835 C 11.120 8.061 11.767 8.718 12.483 9.445 C 13.651 10.630 15.000 12.000 17.950 12.000 C 21.123 12.000 23.106 10.413 23.900 7.240 C 22.710 8.827 21.321 9.422 19.735 9.025 C 18.829 8.799 18.183 8.142 17.466 7.415 C 16.299 6.230 14.950 4.860 12.000 4.860 ZM 6.050 12.000 C 2.876 12.000 0.893 13.587 0.100 16.760 C 1.290 15.173 2.678 14.578 4.265 14.975 C 5.170 15.201 5.817 15.858 6.534 16.586 C 7.701 17.770 9.050 19.140 12.000 19.140 C 15.173 19.140 17.156 17.553 17.950 14.380 C 16.760 15.967 15.371 16.562 13.785 16.165 C 12.879 15.939 12.233 15.282 11.516 14.554 C 10.349 13.370 9.000 12.000 6.050 12.000 Z"),
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
        return _tailwindCssFill!!
    }

private var _tailwindCssFill: ImageVector? = null
