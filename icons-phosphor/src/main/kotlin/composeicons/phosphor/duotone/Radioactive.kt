package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorDuotoneIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 128h-52c-2.269-.018-4.427-.987-5.948-2.671C32.532 123.644 31.787 121.399 32 119.14 34.565 91.137 49.285 65.67 72.27 49.47c1.837-1.3 4.136-1.766 6.334-1.285 2.198 .481 4.091 1.866 5.216 3.815l26 44.94C98.787 103.395 92.004 115.217 92 128ZM146 159.18c-11.138 6.431-24.862 6.431-36 0L84.17 203.91c-1.124 1.945-1.378 4.273-.701 6.414 .677 2.142 2.224 3.9 4.261 4.846 25.556 11.774 54.984 11.774 80.54 0 2.038-.945 3.584-2.704 4.261-4.846 .677-2.142 .423-4.47-.701-6.414ZM224 119.18C221.443 91.182 206.733 65.716 183.76 49.51c-1.833-1.314-4.136-1.792-6.341-1.318-2.205 .474-4.107 1.857-5.239 3.808L146.23 97c10.438 6.106 17.114 17.045 17.77 29.12 0 .62 .05 1.23 .05 1.85h52c2.255-.033 4.394-1.004 5.903-2.679 1.509-1.676 2.251-3.905 2.047-6.151Z"),
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
                pathData = parseSvgPathData("M116 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM100 128c0-4.418-3.582-8-8-8h-51.93c-.048-.039-.074-.098-.07-.16C42.337 94.179 55.824 70.838 76.89 56l26 45c2.209 3.827 7.103 5.139 10.93 2.93 3.827-2.209 5.139-7.103 2.93-10.93l-26-45C88.502 44.101 84.715 41.33 80.319 40.365c-4.396-.965-8.995-.034-12.669 2.565C42.753 60.482 26.819 88.082 24.07 118.42c-.405 4.526 1.108 9.013 4.17 12.37 3.019 3.305 7.284 5.195 11.76 5.21h52c4.418 0 8-3.582 8-8ZM231.93 118.42C229.18 88.082 213.247 60.482 188.35 42.93c-3.674-2.599-8.273-3.53-12.669-2.565-4.396 .965-8.182 3.736-10.431 7.635L139.3 93c-2.209 3.827-.897 8.721 2.93 10.93 3.827 2.209 8.721 .897 10.93-2.93l26-45c21.048 14.857 34.516 38.202 36.84 63.86 0 .07 0 .12 0 .14h-52c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h52c4.476-.015 8.741-1.905 11.76-5.21 3.062-3.357 4.575-7.844 4.17-12.37ZM152.93 155.18c-2.209-3.827-7.103-5.139-10.93-2.93-3.827 2.209-5.139 7.103-2.93 10.93l25.84 44.73c-23.421 10.787-50.389 10.787-73.81 0l25.83-44.73c2.209-3.827 .897-8.721-2.93-10.93-3.827-2.209-8.721-.897-10.93 2.93L77.25 199.91c-2.248 3.89-2.757 8.545-1.403 12.829 1.354 4.284 4.447 7.8 8.523 9.691 27.687 12.76 59.573 12.76 87.26 0 4.075-1.891 7.168-5.407 8.523-9.691 1.354-4.284 .845-8.939-1.403-12.829Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
