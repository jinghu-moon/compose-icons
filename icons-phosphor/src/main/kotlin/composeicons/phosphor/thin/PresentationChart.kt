package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PresentationChart: ImageVector
    get() {
        if (_presentationChart != null) return _presentationChart!!
        _presentationChart = phosphorThinIcon(
            name = "PresentationChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-84v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-84C33.373 44 28 49.373 28 56v120c0 6.627 5.373 12 12 12h47.68L60.88 221.5c-.947 1.109-1.216 2.647-.7 4.011 .516 1.365 1.733 2.34 3.178 2.546 1.444 .206 2.886-.391 3.762-1.557L97.92 188h60.16l30.8 38.5c1.403 1.643 3.857 1.875 5.543 .524 1.686-1.351 1.995-3.797 .697-5.524L168.32 188h47.68c6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12ZM220 176c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-120c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM100 120v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM132 104v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-40c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM164 88v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _presentationChart!!
    }

private var _presentationChart: ImageVector? = null
