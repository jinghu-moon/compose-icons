package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorLightIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.07 176.94C214.41 167.2 206 139.73 206 104 206 60.922 171.078 26 128 26 84.922 26 50 60.922 50 104c0 35.74-8.42 63.2-14.08 72.94-2.528 4.328-2.548 9.678-.055 14.026 2.494 4.348 7.122 7.031 12.135 7.034h42.48c3.01 18.37 18.885 31.856 37.5 31.856 18.615 0 34.49-13.485 37.5-31.856h42.52c5.009-.011 9.63-2.696 12.12-7.043 2.489-4.347 2.466-9.692-.06-14.017ZM128 218c-12.045-.004-22.51-8.28-25.29-20h50.58c-2.78 11.72-13.245 19.996-25.29 20ZM209.71 185c-.336 .624-.991 1.01-1.7 1h-160.01c-.709 .01-1.364-.376-1.7-1-.357-.619-.357-1.381 0-2C53.87 170 62 139.69 62 104 62 67.549 91.549 38 128 38c36.451 0 66 29.549 66 66 0 35.68 8.14 65.95 15.71 79 .357 .619 .357 1.381 0 2Z"),
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
