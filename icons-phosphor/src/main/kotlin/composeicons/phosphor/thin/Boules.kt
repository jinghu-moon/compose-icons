package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorThinIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM190.13 60.21 60.21 190.13C54.227 183.617 49.216 176.275 45.33 168.33l123-123c7.945 3.886 15.287 8.897 21.8 14.88ZM195.79 65.87c5.979 6.516 10.991 13.858 14.88 21.8l-123 123C79.728 206.781 72.386 201.769 65.87 195.79ZM128 36c11.079-.012 22.068 1.991 32.43 5.91L41.91 160.43C31.265 132.171 35.166 100.488 52.348 75.655 69.529 50.822 97.803 36.002 128 36ZM128 220c-11.079 .012-22.068-1.991-32.43-5.91L214.09 95.57c10.645 28.259 6.744 59.942-10.438 84.775C186.471 205.178 158.197 219.998 128 220Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
