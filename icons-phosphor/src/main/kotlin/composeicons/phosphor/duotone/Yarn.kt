package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorDuotoneIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 216h-48.61c43.815-27.605 60.629-83.25 39.432-130.499C201.625 38.252 148.883 13.812 99.131 28.183 49.379 42.554 17.794 91.354 25.056 142.628 32.319 193.902 76.214 232.011 128 232h104c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 40c15.425-.017 30.58 4.044 43.93 11.77-9.641 4.359-18.958 9.402-27.88 15.09-14.123-9.006-29.219-16.386-45-22C108.358 41.622 118.145 39.979 128 40ZM78.56 55.24c17.931 4.853 35.124 12.108 51.11 21.57-6.831 5.142-13.365 10.667-19.57 16.55C93.682 84.623 76.019 78.462 57.73 75.09 63.546 67.383 70.582 60.678 78.56 55.24ZM48.72 89.82c17.27 2.524 34.033 7.758 49.67 15.51-5.553 6.102-10.771 12.502-15.63 19.17C69.595 118.591 55.609 114.713 41.28 113c1.388-8.036 3.892-15.838 7.44-23.18ZM40 129c11.572 1.43 22.89 4.459 33.63 9-7.582 12.172-13.968 25.048-19.07 38.45C45.229 162.37 40.172 145.89 40 129ZM66.42 190.81C85.86 132.487 129.953 85.655 187 62.74c6.315 5.714 11.777 12.304 16.22 19.57C146.675 102.092 103.31 148.177 87 205.82 79.456 201.834 72.528 196.778 66.43 190.81ZM125.66 216c-8.09-.227-16.109-1.573-23.83-4C116.475 157.897 157.161 114.676 210.28 96.79c2.875 7.563 4.686 15.489 5.38 23.55-43.587 15.635-77.049 51.201-90 95.66ZM215.48 137.56c-4.316 39.055-33.949 70.543-72.67 77.22 11.987-35.002 38.465-63.148 72.67-77.25Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
