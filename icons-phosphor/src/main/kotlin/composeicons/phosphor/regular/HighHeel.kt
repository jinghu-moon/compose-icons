package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorRegularIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231 156.19 180 144.7 69.66 34.34C68.116 32.796 66.007 31.951 63.824 32c-2.183 .049-4.251 .988-5.724 2.6C36.11 58.64 24 89 24 120v72c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-48.94c2.49 1.45 4.94 3 7.34 4.64 18.16 12.463 32.26 29.985 40.55 50.39 2.451 6.026 8.325 9.951 14.83 9.91h89.28c8.837 0 16-7.163 16-16v-4.73c.038-14.959-10.381-27.911-25-31.08ZM72 192h-32v-63.71c10.961 .775 21.745 3.174 32 7.12ZM240 192h-89.32c-9.468-23.268-25.556-43.247-46.27-57.46C85.454 121.436 63.288 113.74 40.29 112.28 42.094 90.145 50.516 69.065 64.46 51.78L170.34 157.66c1.072 1.068 2.424 1.81 3.9 2.14l53.24 12c7.317 1.557 12.542 8.029 12.52 15.51Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
