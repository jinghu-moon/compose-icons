package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorDuotoneIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 91.64l-147.41 88c-12.229 7.12-27.682 5.363-38-4.32L18.53 140c-1.97-1.847-2.876-4.563-2.408-7.223 .468-2.66 2.246-4.904 4.728-5.967L24 125.27 55.79 136 88 116.51 58.65 88C56.621 86.174 55.663 83.44 56.108 80.748c.445-2.693 2.233-4.973 4.742-6.048L68 72l57.53 21.17L180.37 60.42c13.602-8.004 31.008-4.897 41 7.32Z"),
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
                pathData = parseSvgPathData("M176 216c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM247.86 93.15c-.423 2.252-1.792 4.215-3.76 5.39L96.69 186.54c-6.145 3.603-13.137 5.508-20.26 5.52C66.283 192.048 56.524 188.16 49.15 181.19l-.12-.12L13 145.8C9.129 142.124 7.346 136.758 8.247 131.496c.901-5.262 4.368-9.728 9.243-11.906l3-1.47c1.895-.93 4.08-1.074 6.08-.4l28.26 9.54L75 115.06 53.17 93.87C49.181 90.195 47.326 84.75 48.24 79.404c.915-5.346 4.476-9.864 9.46-12.004l.32-.13 7.15-2.71c1.803-.672 3.787-.672 5.59 0l53.94 19.82L176.27 53.6c16.987-10.11 38.82-6.227 51.28 9.12l.12 .15 18.64 23.89c1.409 1.809 1.973 4.136 1.55 6.39ZM228.12 89.45l-13-16.67C207.642 63.632 194.599 61.328 184.44 67.36l-54.8 32.72c-2.078 1.232-4.6 1.467-6.87 .64L68 80.58l-4 1.53 .21 .2 29.36 28.49c1.777 1.727 2.654 4.179 2.374 6.641-.28 2.462-1.685 4.655-3.804 5.939L59.93 142.87c-2.017 1.218-4.468 1.485-6.7 .73L24.56 133.93l-.19 .1-.37 .17c.048 .034 .092 .075 .13 .12l36 35.26c7.717 7.252 19.291 8.547 28.42 3.18Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
