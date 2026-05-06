package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorBoldIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 184c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM220 112v40c0 50.81-41.19 92-92 92C77.19 244 36 202.81 36 152v-76C35.995 66.1 40.573 56.755 48.398 50.691 56.223 44.626 66.414 42.525 76 45v-1C75.986 29.082 86.281 16.133 100.818 12.785 115.356 9.437 130.278 16.579 136.79 30c9.83-3.677 20.839-2.299 29.46 3.686C174.871 39.672 180.009 49.505 180 60v21c9.586-2.475 19.777-.374 27.602 5.691 7.825 6.064 12.403 15.409 12.398 25.309ZM196 112c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-52c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v44c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-60c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-36c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v76c0 37.555 30.445 68 68 68 37.555 0 68-30.445 68-68ZM128 128c-21.061-.051-40.356 11.761-49.89 30.54-2.923 5.888-.566 13.031 5.288 16.022 5.853 2.991 13.024 .716 16.082-5.102 5.468-10.709 16.476-17.448 28.5-17.448 12.024 0 23.032 6.74 28.5 17.448 2.058 4.028 6.207 6.557 10.73 6.54 1.896 .003 3.765-.45 5.45-1.32 5.9-3.014 8.241-10.239 5.23-16.14C168.356 139.761 149.061 127.949 128 128Z"),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
