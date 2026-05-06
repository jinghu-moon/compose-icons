package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorLightIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L56.25 58h-8.25C35.85 58 26 67.85 26 80v112c0 12.15 9.85 22 22 22h150.07l5.49 6c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM105.5 112.2l40.11 44.13c-5.116 3.719-11.286 5.705-17.61 5.67-11.791-.001-22.488-6.909-27.34-17.656-4.852-10.747-2.958-23.339 4.84-32.184ZM48 202c-5.523 0-10-4.477-10-10v-112C38 74.477 42.477 70 48 70h19.16l30.23 33.25c-15.129 15.952-15.396 40.873-.612 57.145 14.784 16.272 39.616 18.39 56.942 4.855L187.16 202ZM230 80v106c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-106c0-5.523-4.477-10-10-10h-32c-2.008 .003-3.885-.999-5-2.67L156.78 46h-57.57l-.23 .34c-1.836 2.761-5.564 3.511-8.325 1.675C87.894 46.179 87.144 42.451 88.98 39.69l2-3C92.094 35.006 93.981 33.995 96 34h64c2.008-.003 3.885 .999 5 2.67L179.21 58h28.79c12.15 0 22 9.85 22 22Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
