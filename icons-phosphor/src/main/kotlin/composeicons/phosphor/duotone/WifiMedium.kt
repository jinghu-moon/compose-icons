package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorDuotoneIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.33 130.94l-68.18 82.18c-1.52 1.827-3.773 2.884-6.15 2.884-2.377 0-4.63-1.057-6.15-2.884L53.67 130.94c43.042-35.925 105.618-35.925 148.66 0Z"),
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
                pathData = parseSvgPathData("M247.89 80.91c-.506-4.291-2.732-8.193-6.17-10.81C209.036 45.237 169.066 31.846 128 32 86.934 31.846 46.964 45.237 14.28 70.1 10.842 72.717 8.616 76.619 8.11 80.91c-.508 4.282 .772 8.584 3.54 11.89L115.65 218.23c3.044 3.676 7.577 5.794 12.35 5.77h0c4.759 .012 9.275-2.104 12.31-5.77h0l104-125.43c2.782-3.3 4.077-7.603 3.58-11.89ZM128 208 65.13 132.2c37.582-26.948 88.158-26.948 125.74 0ZM201.12 119.84C157.561 88.036 98.439 88.036 54.88 119.84L24.09 82.74C53.971 60.061 90.488 47.852 128 48c37.512-.148 74.029 12.061 103.91 34.74Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
