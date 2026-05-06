package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorDuotoneIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148.62 50.68 160 8C160 8 48 32 48 128c-.01 36.25 24.355 67.977 59.38 77.32L96 248c0 0 112-24 112-120C208.01 91.75 183.645 60.023 148.62 50.68ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
                pathData = parseSvgPathData("M128 96c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32C160 110.327 145.673 96 128 96ZM128 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM158.32 45.36l9.41-35.3c.716-2.69-.018-5.56-1.938-7.576C163.872 .468 161.042-.404 158.32 .18 137.53 5.282 117.718 13.758 99.67 25.27 60.63 50.37 40 85.89 40 128c.02 36.909 23.042 69.893 57.68 82.64l-9.41 35.3c-.716 2.69 .018 5.56 1.938 7.576 1.92 2.016 4.75 2.889 7.472 2.304 20.79-5.102 40.602-13.578 58.65-25.09C195.37 205.63 216 170.11 216 128 215.983 91.09 192.959 58.104 158.32 45.36ZM148.06 217c-12.716 8.098-26.378 14.603-40.68 19.37l7.73-29c1.138-4.269-1.401-8.652-5.67-9.79C77.933 189.153 56.015 160.614 56 128 56 91.23 73.48 61.28 107.94 39c12.716-8.098 26.378-14.603 40.68-19.37l-7.73 29c-1.138 4.269 1.401 8.652 5.67 9.79C178.067 66.847 199.985 95.386 200 128c0 36.77-17.48 66.72-51.94 89Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
