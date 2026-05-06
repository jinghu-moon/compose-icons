package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorDuotoneIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112.19 137.74l15.62 52.52c.528 2.37-.048 4.851-1.567 6.745-1.519 1.894-3.815 2.996-6.243 2.995h-47.86C47.009 182.869 31.981 154.414 32 124 32 74 72.65 32.74 122.69 32c24.626-.351 48.365 9.187 65.902 26.479C206.13 75.77 216.003 99.371 216 124v4h-96c-2.428-0-4.724 1.101-6.243 2.995-1.519 1.894-2.095 4.375-1.567 6.745Z"),
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
                pathData = parseSvgPathData("M96 164c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM232 176v32c0 8.837-7.163 16-16 16h-36c-7.083-.031-13.313-4.687-15.35-11.47L153.84 176h-21.93l3.56 12c.059 .177 .109 .358 .15 .54 1.049 4.736-.107 9.692-3.144 13.475-3.036 3.783-7.625 5.984-12.476 5.985h-47.86c-1.613-0-3.189-.488-4.52-1.4C40.324 187.967 23.997 157.05 24 124 24 69.64 68.24 24.8 122.58 24c26.767-.38 52.569 9.988 71.63 28.783C213.272 71.577 224.003 97.23 224 124v4c0 4.418-3.582 8-8 8h-57.29l7.09 24h50.2c8.837 0 16 7.163 16 16ZM120 120h87.91C205.757 74.744 168.102 39.35 122.8 40 77.16 40.64 40 78.31 40 124c-.003 26.912 12.888 52.196 34.67 68h45.33L104.55 140c-.061-.177-.111-.357-.15-.54-1.048-4.733 .106-9.686 3.138-13.468 3.032-3.782 7.615-5.986 12.462-5.992ZM149.11 160 142 136h-22l7.14 24ZM216 176h-45.48L180 208h36Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
