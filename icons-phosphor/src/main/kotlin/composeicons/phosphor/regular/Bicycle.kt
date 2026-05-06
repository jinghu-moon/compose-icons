package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bicycle: ImageVector
    get() {
        if (_bicycle != null) return _bicycle!!
        _bicycle = phosphorRegularIcon(
            name = "Bicycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 112c-5.784-.003-11.52 1.044-16.93 3.09L165.93 72h26.07c4.418 0 8 3.582 8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C216 66.745 205.255 56 192 56h-40c-2.855 .006-5.49 1.534-6.915 4.008-1.425 2.474-1.423 5.52 .005 7.992l11.65 20h-57.48L82.91 60C81.484 57.53 78.852 56.006 76 56h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h23.41L85.12 95.51 69.41 117.06C47.031 105.861 19.803 113.68 6.776 135.047c-13.027 21.367-7.506 49.152 12.7 63.916 20.206 14.764 48.355 11.579 64.753-7.325 16.398-18.904 15.572-47.221-1.899-65.138L93.92 110.6 125.09 164c1.327 2.666 4.026 4.374 7.003 4.433 2.977 .059 5.741-1.541 7.173-4.152 1.432-2.611 1.295-5.802-.356-8.281L108.59 104h57.48l11.19 19.17c-17.883 14.947-22.445 40.58-10.816 60.779 11.628 20.199 36.086 29.125 57.992 21.165 21.906-7.96 34.927-30.505 30.876-53.457C251.26 128.704 231.307 111.979 208 112ZM80 160c.004 14.051-9.158 26.46-22.587 30.593-13.429 4.133-27.983-.977-35.88-12.598-7.897-11.621-7.29-27.034 1.497-37.998 8.787-10.964 23.698-14.913 36.76-9.737l-18.25 25c-1.809 2.301-2.217 5.407-1.064 8.098 1.154 2.69 3.685 4.536 6.599 4.812 2.914 .276 5.747-1.063 7.384-3.489l18.25-25c4.719 5.719 7.297 12.905 7.29 20.32ZM208 192c-12.962-.01-24.638-7.839-29.569-19.826-4.931-11.988-2.144-25.766 7.059-34.894L201.09 164c1.327 2.666 4.026 4.374 7.003 4.433 2.977 .059 5.741-1.541 7.173-4.152 1.432-2.611 1.295-5.802-.356-8.281L199.3 129.21c12.02-3.403 24.921 .5 33.039 9.996 8.118 9.495 9.968 22.847 4.737 34.192C231.847 184.742 220.492 192.006 208 192Z"),
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
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
