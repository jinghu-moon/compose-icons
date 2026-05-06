package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorThinIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 104v-40c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v30.34L205.17 45.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L161.66 100h30.34c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4ZM104 148h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h30.34L45.17 205.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L100 161.66v30.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM161.66 156h30.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-30.34l49.17 49.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM104 60c-2.209 0-4 1.791-4 4v30.34L50.83 45.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L94.34 100h-30.34c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
