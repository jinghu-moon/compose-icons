package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorBoldIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.69 100.17c-3.141 .526-5.944 2.28-7.791 4.874-1.848 2.594-2.588 5.816-2.059 8.956 .772 4.627 1.16 9.309 1.16 14 .029 18.848-6.315 37.152-18 51.94-7.778-9.893-17.692-17.899-29-23.42 20.119-20.374 19.982-53.18-.308-73.384-20.289-20.205-53.095-20.205-73.385 0C71.018 103.34 70.881 136.146 91 156.52c-11.308 5.521-21.222 13.527-29 23.42C42.061 154.674 38.325 120.232 52.382 91.279 66.44 62.325 95.814 43.959 128 44c4.691-0 9.373 .388 14 1.16 6.536 1.105 12.73-3.299 13.835-9.835C156.94 28.789 152.536 22.595 146 21.49 114.657 16.227 82.586 25.024 58.314 45.542 34.042 66.059 20.029 96.218 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108 .001-6.031-.497-12.051-1.49-18-1.106-6.528-7.29-10.927-13.82-9.83ZM100 120c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM79.57 196.57C90.869 181.121 108.86 171.989 128 171.989c19.14 0 37.131 9.132 48.43 24.581-29.009 20.573-67.851 20.573-96.86 0ZM240.49 48.49l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-16-16c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L200 55 223.51 31.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
