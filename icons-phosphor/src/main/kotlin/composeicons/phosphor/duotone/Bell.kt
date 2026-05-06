package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorDuotoneIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 192h-160c-2.85-.017-5.475-1.549-6.892-4.021-1.417-2.472-1.413-5.511 .012-7.979C47.71 168.6 56 139.81 56 104 56 64.235 88.235 32 128 32c39.764 0 72 32.235 72 72 0 35.82 8.3 64.6 14.9 76 1.427 2.471 1.429 5.514 .007 7.988-1.422 2.473-4.054 4.002-6.907 4.012Z"),
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
                pathData = parseSvgPathData("M221.8 175.94C216.25 166.38 208 139.33 208 104 208 59.817 172.183 24 128 24 83.817 24 48 59.817 48 104c0 35.34-8.26 62.38-13.81 71.94-2.885 4.947-2.906 11.058-.055 16.025 2.851 4.967 8.138 8.031 13.865 8.035h40.81c3.805 18.619 20.186 31.991 39.19 31.991 19.004 0 35.385-13.372 39.19-31.991h40.81c5.725-.008 11.009-3.073 13.858-8.039 2.848-4.966 2.826-11.075-.058-16.021ZM128 216c-10.168-.003-19.231-6.413-22.62-16h45.24c-3.389 9.587-12.452 15.997-22.62 16ZM48 184c7.7-13.24 16-43.92 16-80C64 68.654 92.654 40 128 40c35.346 0 64 28.654 64 64 0 36.05 8.28 66.73 16 80Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
