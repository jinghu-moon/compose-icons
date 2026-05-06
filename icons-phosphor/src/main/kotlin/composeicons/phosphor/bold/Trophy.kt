package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorBoldIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 60h-20v-12c0-6.627-5.373-12-12-12h-144C49.373 36 44 41.373 44 48v12h-20C12.954 60 4 68.954 4 80v16c.028 24.289 19.711 43.972 44 44h.77c10.445 29.431 36.325 50.66 67.23 55.15v16.85h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-16.89c30.94-4.51 56.53-26.2 67-55.11h1c24.289-.028 43.972-19.711 44-44v-16C252 68.954 243.046 60 232 60ZM28 96v-12h16v28c0 1.21 0 2.41 .09 3.61C34.737 113.746 28.002 105.537 28 96ZM188 111.1c0 33.33-26.71 60.65-59.54 60.9-15.993 .123-31.372-6.145-42.724-17.41C74.384 143.324 68 127.993 68 112v-52h120ZM228 96c-0 9.55-6.752 17.767-16.12 19.62 .08-1.5 .12-3 .12-4.52v-27.1h16Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
