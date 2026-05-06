package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorDuotoneIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 216h-208L64.7 144h126.6Z"),
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
                pathData = parseSvgPathData("M32 104c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM71.43 58.75c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L71.43 36.12c-3.145-2.988-8.099-2.925-11.167 .143-3.068 3.068-3.131 8.022-.143 11.167ZM128 40c4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8ZM178.91 61.09c2.122 .002 4.158-.84 5.66-2.34L195.88 47.43c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L173.25 47.43c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938ZM192 104c0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-4.418 0-8 3.582-8 8ZM88 112c4.418 0 8-3.582 8-8C96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C176 77.49 154.51 56 128 56 101.49 56 80 77.49 80 104c0 4.418 3.582 8 8 8ZM238.91 220c-1.426 2.47-4.058 3.993-6.91 4h-208c-2.852 .013-5.496-1.493-6.939-3.954-1.443-2.461-1.466-5.504-.061-7.986l40.69-72c1.426-2.521 4.104-4.074 7-4.06h126.61c2.896-.014 5.574 1.539 7 4.06l40.69 72c1.381 2.474 1.351 5.494-.08 7.94ZM186.64 152h-24.37l3.48 16h29.93ZM149.38 168l-3.48-16h-35.8l-3.48 16ZM103.14 184l-5.21 24h60.14l-5.21-24ZM60.32 168h29.93l3.48-16h-24.37ZM37.71 208h43.84l5.22-24h-35.49ZM218.29 208 204.72 184h-35.49l5.22 24Z"),
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
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
