package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorLightIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.44 212 52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L61.31 63.56C47.272 86.726 46.258 115.516 58.632 139.612c12.373 24.096 36.362 40.048 63.368 42.138v20.25h-90c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h166.07l5.49 6c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM120.77 129c-9.407-2.739-16.482-10.525-18.31-20.15ZM62 104C61.978 93.143 64.651 82.45 69.78 72.88L90.85 96.06c-2.397 11.217 .401 22.916 7.613 31.834 7.212 8.919 18.067 14.102 29.537 14.106 1.464-.001 2.926-.088 4.38-.26l21.06 23.17c-20.374 8.511-43.653 6.27-62.029-5.971C73.035 146.699 61.997 126.08 62 104ZM134 202v-20.24c9.696-.747 19.167-3.293 27.93-7.51L187.16 202ZM87.26 44.32c-.785-1.384-.988-3.024-.564-4.558 .424-1.534 1.44-2.837 2.824-3.622 31.721-18.003 71.683-11.621 96.217 15.368 24.534 26.989 27.09 67.376 6.153 97.242-1.206 1.817-3.303 2.836-5.476 2.662-2.174-.173-4.082-1.512-4.984-3.497-.903-1.985-.657-4.303 .641-6.055 17.728-25.272 15.57-59.458-5.196-82.3C156.108 36.719 122.282 31.323 95.44 46.57c-2.88 1.637-6.542 .63-8.18-2.25ZM152.73 112.05c2.896-8.883 .802-18.638-5.484-25.55-6.286-6.913-15.798-9.921-24.916-7.88-3.236 .718-6.442-1.324-7.16-4.56-.718-3.236 1.324-6.442 4.56-7.16 13.323-2.974 27.218 1.426 36.4 11.528 9.182 10.102 12.24 24.353 8.01 37.332-1.068 3.092-4.416 4.758-7.527 3.747-3.111-1.011-4.838-4.328-3.883-7.457Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
