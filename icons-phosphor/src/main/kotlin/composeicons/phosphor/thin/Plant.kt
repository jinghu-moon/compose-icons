package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorThinIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.63 48.12c-.123-2.022-1.738-3.632-3.76-3.75-50.25-3-90.44 12.1-107.52 40.29-11.64 19.22-11.17 41.92 1.24 64.21-8.758 9.621-14.541 21.572-16.65 34.41L93.45 159.79c8.63-16 8.81-32.33 .42-46.19C81.45 93.09 52.35 82.13 16 84.26c-2.011 .127-3.613 1.729-3.74 3.74-2.13 36.33 8.83 65.43 29.34 77.85 6.583 4.041 14.156 6.18 21.88 6.18 8.526-.145 16.881-2.413 24.31-6.6L116 193.67c0 .28 0 .56 0 .84v29.49c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-29.49c-.038-14.768 5.411-29.023 15.29-40 11.49 6.36 23.07 9.56 34.24 9.56 10.522 .002 20.84-2.909 29.81-8.41C231.52 138.57 246.59 98.38 243.63 48.12ZM45.74 159C28.47 148.56 19 123.69 20.08 92.08c31.61-1.09 56.48 8.39 67 25.66 6.48 10.71 6.59 23.37 .46 36.09L58.82 125.17c-1.58-1.432-4.006-1.372-5.514 .136-1.508 1.508-1.568 3.934-.136 5.514l28.67 28.67C69.11 165.62 56.45 165.51 45.74 159ZM199.19 148.8c-16.05 9.72-35.09 9.59-54.08-.25L202.83 90.82c1.496-1.571 1.466-4.048-.067-5.584-1.533-1.535-4.01-1.569-5.583-.076l-57.73 57.73c-9.84-19-10-38-.25-54.08C154.31 63.81 190.28 50.28 235.83 52.17c1.9 45.55-11.68 81.52-36.64 96.63Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
