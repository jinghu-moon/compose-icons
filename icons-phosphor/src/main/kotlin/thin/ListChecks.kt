package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorThinIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 128.000 132.000 C 125.791 132.000 124.000 130.209 124.000 128.000 C 124.000 125.791 125.791 124.000 128.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 128.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 66.209 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 128.000 60.000 C 125.791 60.000 124.000 61.791 124.000 64.000 C 124.000 66.209 125.791 68.000 128.000 68.000 ZM 216.000 188.000 L 128.000 188.000 C 125.791 188.000 124.000 189.791 124.000 192.000 C 124.000 194.209 125.791 196.000 128.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 ZM 85.170 45.170 L 56.000 74.340 L 42.830 61.170 C 41.267 59.607 38.733 59.607 37.170 61.170 C 35.607 62.733 35.607 65.267 37.170 66.830 L 53.170 82.830 C 53.920 83.581 54.938 84.003 56.000 84.003 C 57.062 84.003 58.080 83.581 58.830 82.830 L 90.830 50.830 C 92.393 49.267 92.393 46.733 90.830 45.170 C 89.267 43.607 86.733 43.607 85.170 45.170 ZM 85.170 109.170 L 56.000 138.340 L 42.830 125.170 C 41.267 123.607 38.733 123.607 37.170 125.170 C 35.607 126.733 35.607 129.267 37.170 130.830 L 53.170 146.830 C 53.920 147.581 54.938 148.003 56.000 148.003 C 57.062 148.003 58.080 147.581 58.830 146.830 L 90.830 114.830 C 92.393 113.267 92.393 110.733 90.830 109.170 C 89.267 107.607 86.733 107.607 85.170 109.170 ZM 85.170 173.170 L 56.000 202.340 L 42.830 189.170 C 41.267 187.607 38.733 187.607 37.170 189.170 C 35.607 190.733 35.607 193.267 37.170 194.830 L 53.170 210.830 C 53.920 211.581 54.938 212.003 56.000 212.003 C 57.062 212.003 58.080 211.581 58.830 210.830 L 90.830 178.830 C 92.393 177.267 92.393 174.733 90.830 173.170 C 89.267 171.607 86.733 171.607 85.170 173.170 Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
