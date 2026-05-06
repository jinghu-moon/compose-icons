package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorThinIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.25 169.77C208.83 153.373 220.574 128.307 220 102 219 58.36 184.1 22.38 140.55 20.09 117.683 18.848 95.299 26.996 78.582 42.649 61.865 58.301 52.263 80.1 52 103L29.1 147c-.05 .09-.09 .18-.13 .27-2.503 5.839-.022 12.617 5.66 15.46l.13 .06L60 174.38v33.62c0 6.627 5.373 12 12 12h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4-1.791-4-4v-36.19c0-1.567-.914-2.99-2.34-3.64L38.16 155.58c-1.811-.943-2.621-3.098-1.88-5L59.55 105.86c.294-.576 .448-1.213 .45-1.86C60.023 66.676 87.145 34.893 124 29v23.4c-10.06 2.053-16.931 11.391-15.899 21.606 1.032 10.215 9.631 17.99 19.899 17.99 10.267 0 18.867-7.775 19.899-17.99C148.931 63.791 142.06 54.453 132 52.4v-24.29c2.702-.14 5.408-.14 8.11 0 33.13 1.74 60.72 25 69.2 55.89h-25.31c-1.186 .001-2.311 .529-3.07 1.44l-27.46 33c-9.085-4.926-20.424-2.168-26.232 6.379-5.808 8.548-4.196 20.105 3.729 26.738 7.925 6.632 19.586 6.182 26.976-1.041 7.39-7.224 8.106-18.871 1.657-26.946L185.87 92h25.13c4.478 27.852-6.86 55.89-29.44 72.8-1.15 .862-1.749 2.274-1.57 3.7l8 64c.253 2.012 1.972 3.516 4 3.5h.5c1.066-.122 2.039-.668 2.699-1.514 .66-.846 .952-1.922 .811-2.986ZM140 72c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM144 148c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
