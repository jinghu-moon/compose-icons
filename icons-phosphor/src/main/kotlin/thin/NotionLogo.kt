package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorThinIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 168.000 44.000 C 165.791 44.000 164.000 45.791 164.000 48.000 C 164.000 50.209 165.791 52.000 168.000 52.000 L 188.000 52.000 L 188.000 192.430 L 107.500 46.070 C 106.797 44.794 105.457 44.001 104.000 44.000 L 40.000 44.000 C 37.791 44.000 36.000 45.791 36.000 48.000 C 36.000 50.209 37.791 52.000 40.000 52.000 L 60.000 52.000 L 60.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 205.791 36.000 208.000 C 36.000 210.209 37.791 212.000 40.000 212.000 L 88.000 212.000 C 90.209 212.000 92.000 210.209 92.000 208.000 C 92.000 205.791 90.209 204.000 88.000 204.000 L 68.000 204.000 L 68.000 63.570 L 148.500 209.930 C 149.203 211.206 150.543 211.999 152.000 212.000 L 192.000 212.000 C 194.209 212.000 196.000 210.209 196.000 208.000 L 196.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 50.209 220.000 48.000 C 220.000 45.791 218.209 44.000 216.000 44.000 ZM 70.770 52.000 L 101.630 52.000 L 185.230 204.000 L 154.370 204.000 Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
