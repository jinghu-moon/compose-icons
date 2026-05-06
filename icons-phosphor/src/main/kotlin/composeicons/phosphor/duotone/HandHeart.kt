package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = phosphorDuotoneIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 152h32v56h-32c-4.418 0-8-3.582-8-8v-40c0-4.418 3.582-8 8-8ZM192.54 40C176.609 39.813 162.157 49.306 156 64 149.843 49.306 135.391 39.813 119.46 40 97.67 40 80 58.31 80 80c0 14.56 7 27.71 16.73 40h43.27c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h4l37.78-8.68C203.82 135.07 232 109.23 232 80 232 58.31 214.33 40 192.54 40Z"),
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
                pathData = parseSvgPathData("M230.33 141.06c-5.287-4.074-12.015-5.799-18.61-4.77C230.5 117.33 240 98.48 240 80 240 53.53 218.71 32 192.54 32 178.484 31.912 165.108 38.043 156 48.75 146.892 38.043 133.516 31.912 119.46 32 93.29 32 72 53.53 72 80c0 11 3.24 21.69 10.06 33-5.586 1.415-10.683 4.318-14.75 8.4L44.69 144h-28.69C7.163 144 0 151.163 0 160v40c0 8.837 7.163 16 16 16h104c.654 0 1.306-.08 1.94-.24l64-16c.408-.097 .806-.231 1.19-.4L226 182.82l.44-.2c7.594-3.795 12.695-11.238 13.495-19.69 .799-8.452-2.816-16.719-9.565-21.87ZM119.46 48c12.674-.185 24.197 7.328 29.14 19 1.233 3.001 4.156 4.96 7.4 4.96 3.244 0 6.167-1.959 7.4-4.96 4.943-11.672 16.466-19.185 29.14-19C209.59 48 224 62.65 224 80c0 19.51-15.79 41.58-45.66 63.9l-11.09 2.55c1.972-8.331 .025-17.106-5.287-23.821C156.652 115.915 148.561 111.999 140 112h-39.32C92.05 100.36 88 90.12 88 80 88 62.65 102.41 48 119.46 48ZM16 160h24v40h-24ZM219.43 168.21l-38 16.18L119 200h-63v-44.69L78.63 132.69c2.99-3.014 7.064-4.704 11.31-4.69h50.06c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c.602-.002 1.202-.069 1.79-.2l67-15.41 .31-.08c4.236-1.176 8.676 1.032 10.296 5.119 1.619 4.087-.104 8.737-3.996 10.781Z"),
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
