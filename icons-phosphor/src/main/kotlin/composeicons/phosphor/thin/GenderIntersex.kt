package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorThinIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h30.34L163.55 70.79C145.095 51.241 115.888 46.354 92.074 58.831 68.261 71.308 55.654 98.103 61.221 124.405c5.568 26.302 27.952 45.689 54.779 47.445v24.15h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-24.15c21.74-1.436 40.989-14.556 50.274-34.266C183.559 117.873 181.417 94.677 168.68 77L204 41.66v30.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM120 164C91.281 164 68 140.719 68 112 68 83.281 91.281 60 120 60c28.719 0 52 23.281 52 52-.033 28.705-23.295 51.967-52 52Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
