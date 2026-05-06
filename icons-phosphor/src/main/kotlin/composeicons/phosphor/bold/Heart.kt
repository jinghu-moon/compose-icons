package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorBoldIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 36c-20.09 0-37.92 7.93-50 21.56C115.92 43.93 98.09 36 78 36 41.567 36.044 12.044 65.567 12 102c0 72.34 105.81 130.14 110.31 132.57 3.552 1.913 7.828 1.913 11.38 0C138.19 232.14 244 174.34 244 102 243.956 65.567 214.433 36.044 178 36ZM172.51 178.36C158.583 190.178 143.694 200.815 128 210.16 112.306 200.815 97.417 190.178 83.49 178.36 61.82 159.77 36 131.42 36 102 36 78.804 54.804 60 78 60c17.8 0 32.7 9.4 38.89 24.54 1.843 4.514 6.234 7.465 11.11 7.465 4.876 0 9.267-2.95 11.11-7.465C145.3 69.4 160.2 60 178 60c23.196 0 42 18.804 42 42 0 29.42-25.82 57.77-47.49 76.36Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
