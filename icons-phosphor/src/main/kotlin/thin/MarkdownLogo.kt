package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorThinIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 52.000 L 24.000 52.000 C 17.373 52.000 12.000 57.373 12.000 64.000 L 12.000 192.000 C 12.000 198.627 17.373 204.000 24.000 204.000 L 232.000 204.000 C 238.627 204.000 244.000 198.627 244.000 192.000 L 244.000 64.000 C 244.000 57.373 238.627 52.000 232.000 52.000 ZM 236.000 192.000 C 236.000 194.209 234.209 196.000 232.000 196.000 L 24.000 196.000 C 21.791 196.000 20.000 194.209 20.000 192.000 L 20.000 64.000 C 20.000 61.791 21.791 60.000 24.000 60.000 L 232.000 60.000 C 234.209 60.000 236.000 61.791 236.000 64.000 ZM 124.000 104.000 L 124.000 152.000 C 124.000 154.209 122.209 156.000 120.000 156.000 C 117.791 156.000 116.000 154.209 116.000 152.000 L 116.000 113.660 L 90.830 138.830 C 90.080 139.581 89.062 140.003 88.000 140.003 C 86.938 140.003 85.920 139.581 85.170 138.830 L 60.000 113.660 L 60.000 152.000 C 60.000 154.209 58.209 156.000 56.000 156.000 C 53.791 156.000 52.000 154.209 52.000 152.000 L 52.000 104.000 C 51.999 102.381 52.973 100.921 54.469 100.302 C 55.964 99.682 57.686 100.025 58.830 101.170 L 88.000 130.340 L 117.170 101.170 C 118.314 100.025 120.036 99.682 121.531 100.302 C 123.027 100.921 124.001 102.381 124.000 104.000 ZM 202.830 125.170 C 203.581 125.920 204.003 126.938 204.003 128.000 C 204.003 129.062 203.581 130.080 202.830 130.830 L 178.830 154.830 C 178.080 155.581 177.062 156.003 176.000 156.003 C 174.938 156.003 173.920 155.581 173.170 154.830 L 149.170 130.830 C 147.607 129.267 147.607 126.733 149.170 125.170 C 150.733 123.607 153.267 123.607 154.830 125.170 L 172.000 142.340 L 172.000 104.000 C 172.000 101.791 173.791 100.000 176.000 100.000 C 178.209 100.000 180.000 101.791 180.000 104.000 L 180.000 142.340 L 197.170 125.170 C 197.920 124.419 198.938 123.997 200.000 123.997 C 201.062 123.997 202.080 124.419 202.830 125.170 Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
