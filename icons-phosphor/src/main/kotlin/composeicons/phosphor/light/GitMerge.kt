package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorLightIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 114c-13.942 .003-26.045 9.611-29.21 23.19l-44-6.28c-2.403-.342-4.6-1.547-6.18-3.39L91.18 83.83c13.808-5.559 21.451-20.402 17.957-34.871C105.643 34.49 92.068 24.771 77.245 26.126 62.422 27.48 50.834 39.499 50.02 54.361 49.206 69.224 59.413 82.435 74 85.4v85.2c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C111.396 187.686 101.09 173.68 86 170.6v-74.38l33.52 39.11c3.477 4.055 8.311 6.707 13.6 7.46l45.35 6.48c2.79 15.637 17.285 26.388 33.058 24.522 15.774-1.866 27.359-15.703 26.423-31.559C237.016 126.377 223.884 113.998 208 114ZM62 56C62 46.059 70.059 38 80 38c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C70.059 74 62 65.941 62 56ZM98 200c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM208 162c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
