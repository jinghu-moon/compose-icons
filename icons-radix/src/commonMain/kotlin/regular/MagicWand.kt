package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MagicWand: ImageVector
    get() {
        if (_magicWand != null) return _magicWand!!
        _magicWand = radixIcon(
            name = "MagicWand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.224 5.082 C 9.419 4.954 9.683 4.976 9.853 5.147 C 10.024 5.318 10.046 5.582 9.918 5.776 L 9.853 5.854 L 2.853 12.854 C 2.658 13.049 2.342 13.049 2.146 12.854 C 1.951 12.659 1.951 12.342 2.146 12.147 L 9.146 5.147 L 9.224 5.082 ZM 13.500 5.100 C 13.721 5.100 13.900 5.279 13.900 5.500 L 13.900 6.100 L 14.500 6.100 L 14.581 6.109 C 14.763 6.146 14.900 6.307 14.900 6.500 C 14.900 6.693 14.763 6.855 14.581 6.892 L 14.500 6.901 L 13.900 6.901 L 13.900 7.500 C 13.900 7.721 13.721 7.901 13.500 7.901 C 13.279 7.901 13.100 7.721 13.099 7.500 L 13.099 6.901 L 12.500 6.901 C 12.279 6.901 12.100 6.721 12.099 6.500 C 12.099 6.279 12.279 6.100 12.500 6.100 L 13.099 6.100 L 13.099 5.500 C 13.099 5.279 13.279 5.100 13.500 5.100 ZM 11.224 3.082 C 11.419 2.954 11.682 2.976 11.853 3.147 C 12.024 3.318 12.046 3.582 11.918 3.776 L 11.853 3.854 L 10.853 4.854 C 10.658 5.049 10.342 5.049 10.146 4.854 C 9.951 4.659 9.951 4.342 10.146 4.147 L 11.146 3.147 L 11.224 3.082 ZM 8.500 0.100 C 8.721 0.100 8.900 0.279 8.900 0.500 L 8.900 1.100 L 9.500 1.100 L 9.581 1.109 C 9.763 1.146 9.900 1.307 9.900 1.500 C 9.900 1.693 9.763 1.855 9.581 1.892 L 9.500 1.901 L 8.900 1.901 L 8.900 2.500 C 8.900 2.721 8.721 2.901 8.500 2.901 C 8.279 2.901 8.100 2.721 8.099 2.500 L 8.099 1.901 L 7.500 1.901 C 7.279 1.901 7.100 1.721 7.099 1.500 C 7.099 1.279 7.279 1.100 7.500 1.100 L 8.099 1.100 L 8.099 0.500 C 8.099 0.279 8.279 0.100 8.500 0.100 ZM 13.500 0.100 C 13.721 0.100 13.900 0.279 13.900 0.500 L 13.900 1.100 L 14.500 1.100 L 14.581 1.109 C 14.763 1.146 14.900 1.307 14.900 1.500 C 14.900 1.693 14.763 1.855 14.581 1.892 L 14.500 1.901 L 13.900 1.901 L 13.900 2.500 C 13.900 2.721 13.721 2.901 13.500 2.901 C 13.279 2.901 13.100 2.721 13.099 2.500 L 13.099 1.901 L 12.500 1.901 C 12.279 1.901 12.100 1.721 12.099 1.500 C 12.099 1.279 12.279 1.100 12.500 1.100 L 13.099 1.100 L 13.099 0.500 C 13.099 0.279 13.279 0.100 13.500 0.100 Z"),
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
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
