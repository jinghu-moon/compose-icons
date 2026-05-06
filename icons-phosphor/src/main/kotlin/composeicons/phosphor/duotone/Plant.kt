package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorDuotoneIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138.54 149.46C106.62 96.25 149.18 43.05 239.63 48.37 245 138.82 191.75 181.39 138.54 149.46ZM16.26 88.26c-3.8 64.61 34.21 95 72.21 72.21 22.8-38-7.6-76.01-72.21-72.21Z"),
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
                pathData = parseSvgPathData("M247.63 47.89c-.237-4.051-3.469-7.283-7.52-7.52-51.76-3-93.32 12.74-111.18 42.22-11.8 19.48-11.78 43.16-.16 65.74-6.607 7.859-11.44 17.052-14.17 26.95L98.33 159c7.82-16.33 7.52-33.36-1-47.49C84.09 89.73 53.62 78 15.79 80.27c-4.051 .237-7.283 3.469-7.52 7.52-2.23 37.83 9.46 68.3 31.25 81.5 7.203 4.397 15.481 6.719 23.92 6.71 8.179-.101 16.231-2.038 23.56-5.67l25 25v28.67c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-29.49c-.036-12.727 4.295-25.081 12.27-35 10.289 5.377 21.701 8.255 33.31 8.4 11.224 .036 22.239-3.03 31.83-8.86C234.89 141.21 250.67 99.65 247.63 47.89ZM86.06 146.74 61.65 122.34c-3.145-2.988-8.099-2.925-11.167 .143-3.068 3.068-3.131 8.022-.143 11.167l24.41 24.41c-9.61 3.18-18.93 2.39-26.94-2.46C32.47 146.31 23.79 124.32 24 96c28.31-.25 50.31 8.47 59.6 23.81 4.85 8.01 5.64 17.33 2.46 26.93ZM197.12 145.38c-13.4 8.11-29.15 8.73-45.15 2L205.66 93.68c3.126-3.123 3.128-8.189 .005-11.315-3.123-3.126-8.189-3.128-11.315-.005L140.65 136c-6.76-16-6.15-31.76 2-45.15 13.94-23 47-35.8 89.33-34.83 .96 42.32-11.84 75.42-34.86 89.36Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
