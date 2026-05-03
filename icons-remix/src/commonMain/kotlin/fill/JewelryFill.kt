package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.JewelryFill: ImageVector
    get() {
        if (_jewelryFill != null) return _jewelryFill!!
        _jewelryFill = remixIcon(
            name = "JewelryFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 2.847 L 15.000 4.863 C 15.000 5.252 15.226 5.605 15.578 5.769 L 15.986 5.960 C 15.901 7.363 15.429 8.596 14.743 9.486 C 13.985 10.472 13.007 11.000 12.000 11.000 C 10.994 11.000 10.016 10.472 9.258 9.486 C 8.572 8.596 8.100 7.363 8.014 5.960 L 8.423 5.769 C 8.775 5.605 9.000 5.252 9.000 4.863 L 9.000 2.847 C 9.000 2.358 9.354 1.942 9.840 1.886 C 11.282 1.720 12.719 1.720 14.161 1.886 C 14.647 1.942 15.000 2.358 15.000 2.847 ZM 6.097 6.855 L 2.850 8.370 C 2.103 8.719 1.778 9.605 2.121 10.354 L 6.599 20.125 C 6.844 20.658 7.376 21.000 7.963 21.000 L 16.038 21.000 C 16.624 21.000 17.157 20.658 17.402 20.125 L 21.880 10.354 C 22.223 9.605 21.897 8.719 21.150 8.370 L 17.903 6.855 C 17.691 8.323 17.136 9.656 16.329 10.706 C 15.416 11.893 14.148 12.748 12.681 12.953 L 14.189 15.064 C 14.375 15.325 14.375 15.675 14.189 15.936 L 12.204 18.715 C 12.104 18.855 11.897 18.855 11.797 18.715 L 9.812 15.936 C 9.626 15.675 9.626 15.325 9.812 15.064 L 11.320 12.953 C 9.853 12.748 8.585 11.893 7.672 10.706 C 6.864 9.656 6.310 8.323 6.097 6.855 Z"),
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
        return _jewelryFill!!
    }

private var _jewelryFill: ImageVector? = null
