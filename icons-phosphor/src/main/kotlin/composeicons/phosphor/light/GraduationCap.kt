package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorLightIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.82 90.71l-120-64c-1.76-.949-3.88-.949-5.64 0L5.18 90.71C3.229 91.754 2.011 93.787 2.011 96c0 2.213 1.218 4.246 3.169 5.29L34 116.67v49.62c-.001 3.437 1.263 6.754 3.55 9.32C50.42 189.94 79.29 214 128 214c17.152 .161 34.16-3.149 50-9.73v35.73c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-41.65c10.649-5.997 20.257-13.68 28.45-22.75 2.292-2.559 3.557-5.875 3.55-9.31v-49.62l28.82-15.38c1.951-1.044 3.169-3.077 3.169-5.29 0-2.213-1.218-4.246-3.169-5.29ZM128 202C84 202 58 180.44 46.48 167.59c-.31-.362-.48-.823-.48-1.3v-43.22l79.18 42.22c1.763 .939 3.877 .939 5.64 0L178 140.13v51C165 197.35 148.45 202 128 202ZM210 166.29c0 .477-.17 .938-.48 1.3-5.763 6.384-12.323 12-19.52 16.71v-50.57l20-10.66ZM187.85 121.29c-.309-.269-.644-.507-1-.71l-56-29.86c-2.899-1.392-6.38-.252-7.892 2.586-1.513 2.838-.519 6.363 2.252 7.994L175.25 128 128 153.2 20.75 96 128 38.8 235.25 96Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
