package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorRegularIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.87 72.58C186.846 61.495 199.978 39.725 200 16c0-4.418-3.582-8-8-8h-8c-23.292 .009-44.74 12.671-56 33.06C116.74 20.671 95.292 8.009 72 8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c23.572 .032 43.645 17.149 47.4 40.42C75.609 68.706 41.714 104.678 40.036 148.647c-1.677 43.969 29.379 82.418 72.716 90.028 43.338 7.61 85.635-17.959 99.038-59.869C225.193 136.897 205.581 91.529 165.87 72.58ZM183.33 24c-3.893 22.829-23.504 39.641-46.66 40 3.893-22.829 23.504-39.641 46.66-40ZM128 224C88.235 224 56 191.764 56 152 56 112.235 88.235 80 128 80c39.764 0 72 32.235 72 72-.044 39.746-32.254 71.956-72 72ZM183.89 161.32c-4.215 23.757-22.813 42.355-46.57 46.57-.436 .071-.878 .108-1.32 .11-4.159-.006-7.619-3.198-7.961-7.343-.342-4.145 2.549-7.86 6.651-8.547 17.051-3.03 30.4-16.379 33.43-33.43 .764-4.322 4.869-7.221 9.198-6.497 4.329 .724 7.266 4.801 6.582 9.137Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
