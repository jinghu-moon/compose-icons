package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorDuotoneIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 98.36C230.73 136.92 198.67 168 160.09 168c-9.222 .024-18.363-1.731-26.92-5.17h0L120 176h-24v24h-24v24h-32c-4.418 0-8-3.582-8-8v-28.69c.001-2.119 .843-4.151 2.34-5.65L93.17 122.83h0C89.731 114.273 87.976 105.132 88 95.91 88 57.33 119.08 25.27 157.64 24.04c19.911-.664 39.206 6.952 53.297 21.035C225.027 59.158 232.653 78.449 232 98.36Z"),
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
                pathData = parseSvgPathData("M216.57 39.43C190.412 13.236 149.699 8.409 118.141 27.761 86.584 47.113 72.425 85.588 83.91 120.78L28.69 176c-3.014 2.99-4.704 7.064-4.69 11.31v28.69c0 8.837 7.163 16 16 16h32c4.418 0 8-3.582 8-8v-16h16c4.418 0 8-3.582 8-8v-16h16c2.122 .002 4.158-.84 5.66-2.34l9.56-9.57c8.002 2.603 16.365 3.922 24.78 3.91h.1c32.34-.039 61.475-19.545 73.832-49.431C246.29 96.683 239.438 62.297 216.57 39.43ZM224 98.1c-1.09 34.09-29.75 61.86-63.89 61.9h-.11c-8.098 .014-16.125-1.517-23.65-4.51-3.012-1.307-6.517-.641-8.84 1.68L116.69 168h-20.69c-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8v16h-24v-28.69L98.83 128.49c2.321-2.323 2.987-5.828 1.68-8.84C97.507 112.1 95.977 104.045 96 95.92 96 61.78 123.81 33.12 157.9 32.03c17.7-.591 34.854 6.179 47.379 18.699C217.805 63.249 224.583 80.4 224 98.1ZM192 76c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
