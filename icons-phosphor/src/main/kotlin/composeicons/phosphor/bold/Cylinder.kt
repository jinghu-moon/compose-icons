package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorBoldIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.14 24.08C165.28 16.29 147.12 12 128 12 108.88 12 90.72 16.29 76.86 24.08 60.83 33.1 52 45.86 52 60v136c0 14.14 8.83 26.9 24.86 35.92C90.72 239.71 108.88 244 128 244c19.12 0 37.28-4.29 51.14-12.08 16-9 24.86-21.78 24.86-35.92v-136C204 45.86 195.17 33.1 179.14 24.08ZM88.63 45C98.8 39.28 113.15 36 128 36c14.85 0 29.2 3.28 39.37 9 8 4.52 12.63 10 12.63 15 0 5-4.6 10.48-12.63 15C157.2 80.72 142.85 84 128 84 113.15 84 98.8 80.72 88.63 75 80.6 70.48 76 65 76 60 76 55 80.6 49.52 88.63 45ZM167.37 211c-10.17 5.72-24.52 9-39.37 9-14.85 0-29.2-3.28-39.37-9C80.6 206.48 76 201 76 196v-100.6l.86 .52C90.72 103.71 108.88 108 128 108c19.12 0 37.28-4.29 51.14-12.08l.86-.52v100.6c0 5-4.6 10.48-12.63 15Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
