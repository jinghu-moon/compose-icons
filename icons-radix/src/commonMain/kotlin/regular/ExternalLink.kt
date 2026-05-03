package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = radixIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.500 2.000 C 6.776 2.000 7.000 2.224 7.000 2.500 C 7.000 2.776 6.776 3.000 6.500 3.000 L 3.000 3.000 L 3.000 12.000 L 12.000 12.000 L 12.000 8.500 C 12.000 8.224 12.224 8.000 12.500 8.000 C 12.776 8.000 13.000 8.224 13.000 8.500 L 13.000 12.000 C 13.000 12.552 12.552 13.000 12.000 13.000 L 3.000 13.000 C 2.448 13.000 2.000 12.552 2.000 12.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 L 6.500 2.000 ZM 12.500 2.000 C 12.533 2.000 12.566 2.002 12.598 2.009 L 12.601 2.010 C 12.660 2.022 12.714 2.045 12.764 2.076 C 12.776 2.084 12.787 2.093 12.799 2.102 C 12.813 2.112 12.828 2.123 12.841 2.136 C 12.845 2.140 12.850 2.143 12.854 2.146 C 12.858 2.151 12.861 2.157 12.865 2.161 C 12.878 2.175 12.890 2.190 12.901 2.205 C 12.910 2.216 12.918 2.228 12.925 2.239 C 12.935 2.256 12.944 2.274 12.952 2.292 C 12.956 2.300 12.960 2.308 12.964 2.316 C 12.972 2.337 12.978 2.357 12.983 2.379 C 12.986 2.389 12.989 2.399 12.991 2.409 C 12.997 2.439 13.000 2.469 13.000 2.500 L 13.000 5.500 C 13.000 5.776 12.776 6.000 12.500 6.000 C 12.224 6.000 12.000 5.776 12.000 5.500 L 12.000 3.707 L 6.854 8.854 C 6.658 9.049 6.342 9.049 6.146 8.854 C 5.951 8.658 5.951 8.342 6.146 8.146 L 11.293 3.000 L 9.500 3.000 C 9.224 3.000 9.000 2.776 9.000 2.500 C 9.000 2.224 9.224 2.000 9.500 2.000 L 12.500 2.000 Z"),
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
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
