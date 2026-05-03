package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HonorOfKingsFill: ImageVector
    get() {
        if (_honorOfKingsFill != null) return _honorOfKingsFill!!
        _honorOfKingsFill = remixIcon(
            name = "HonorOfKingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.159 4.258 C 21.193 7.757 21.750 9.069 21.947 10.959 C 22.248 13.853 21.290 16.853 19.072 19.071 C 15.406 22.737 9.601 22.962 5.673 19.744 L 8.524 16.891 C 10.868 18.561 14.142 18.345 16.244 16.243 C 18.346 14.140 18.562 10.866 16.892 8.523 L 21.159 4.258 ZM 18.329 4.256 L 15.478 7.109 C 13.134 5.439 9.860 5.655 7.758 7.757 C 5.656 9.859 5.440 13.133 7.110 15.477 L 2.843 19.742 C 2.809 16.243 2.252 14.931 2.055 13.041 C 1.754 10.147 2.712 7.147 4.930 4.929 C 8.596 1.263 14.401 1.038 18.329 4.256 ZM 12.001 8.000 C 14.210 8.000 16.001 9.791 16.001 12.000 C 16.001 14.209 14.210 16.000 12.001 16.000 C 9.792 16.000 8.001 14.209 8.001 12.000 C 8.001 9.791 9.792 8.000 12.001 8.000 ZM 12.001 10.500 C 11.172 10.500 10.501 11.172 10.501 12.000 C 10.501 12.828 11.172 13.500 12.001 13.500 C 12.829 13.500 13.501 12.828 13.501 12.000 C 13.501 11.172 12.829 10.500 12.001 10.500 Z"),
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
        return _honorOfKingsFill!!
    }

private var _honorOfKingsFill: ImageVector? = null
