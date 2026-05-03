package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorThinIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 44.000 C 77.190 44.000 36.000 85.190 36.000 136.000 C 36.000 186.810 77.190 228.000 128.000 228.000 C 178.810 228.000 220.000 186.810 220.000 136.000 C 219.945 85.213 178.787 44.055 128.000 44.000 ZM 128.000 220.000 C 81.608 220.000 44.000 182.392 44.000 136.000 C 44.000 89.608 81.608 52.000 128.000 52.000 C 174.392 52.000 212.000 89.608 212.000 136.000 C 211.950 182.371 174.371 219.950 128.000 220.000 ZM 58.830 34.830 L 26.830 66.830 C 25.267 68.393 22.733 68.393 21.170 66.830 C 19.607 65.267 19.607 62.733 21.170 61.170 L 53.170 29.170 C 54.733 27.607 57.267 27.607 58.830 29.170 C 60.393 30.733 60.393 33.267 58.830 34.830 ZM 234.830 66.830 C 234.080 67.581 233.062 68.003 232.000 68.003 C 230.938 68.003 229.920 67.581 229.170 66.830 L 197.170 34.830 C 195.607 33.267 195.607 30.733 197.170 29.170 C 198.733 27.607 201.267 27.607 202.830 29.170 L 234.830 61.170 C 235.581 61.920 236.003 62.938 236.003 64.000 C 236.003 65.062 235.581 66.080 234.830 66.830 ZM 188.000 136.000 C 188.000 138.209 186.209 140.000 184.000 140.000 L 128.000 140.000 C 125.791 140.000 124.000 138.209 124.000 136.000 L 124.000 80.000 C 124.000 77.791 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 77.791 132.000 80.000 L 132.000 132.000 L 184.000 132.000 C 186.209 132.000 188.000 133.791 188.000 136.000 Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
