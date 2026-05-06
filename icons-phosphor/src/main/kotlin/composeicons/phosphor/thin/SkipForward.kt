package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorThinIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36c-2.209 0-4 1.791-4 4v76.44L70.31 37.84C66.61 35.527 61.946 35.404 58.13 37.52 54.329 39.575 51.972 43.559 52 47.88v160.24c-.028 4.321 2.329 8.305 6.13 10.36 3.816 2.116 8.48 1.993 12.18-.32L196 139.56v76.44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-176c0-2.209-1.791-4-4-4ZM194.18 131.26 66.06 211.38c-1.233 .772-2.787 .814-4.06 .11-1.239-.666-2.009-1.963-2-3.37v-160.24c-.009-1.407 .761-2.704 2-3.37 .611-.342 1.3-.518 2-.51 .747 .005 1.478 .22 2.11 .62l128.12 80.12c1.131 .697 1.82 1.931 1.82 3.26 0 1.329-.689 2.563-1.82 3.26Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
