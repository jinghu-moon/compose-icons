package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorLightIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.61 33.84C168.16 26.3 146.2 24.1 124.77 27.67c-23 3.82-42.93 13.72-57.58 28.62C56.31 67.36 43.13 88.94 42.06 128.94c-.69 26.23 4.34 54.87 13.46 76.62C64.29 226.48 75.65 238 87.52 238c21.72 0 31.72-19.53 41.39-38.41 7.08-13.82 14.4-28.11 26.21-36.12h0c6-4.11 14.09-7.21 22.61-10.5C201 144 230 132.81 230 93.17 230 66.75 214.19 45.13 186.61 33.84ZM173.41 141.78c-9.17 3.54-17.84 6.88-25 11.76-14.36 9.73-22.75 26.12-30.15 40.58C109.47 211.23 101.9 226 87.52 226c-5 0-13.18-6.59-20.94-25.08-8.49-20.26-13.17-47-12.52-71.66 .75-28.16 8.45-51.09 21.69-64.55C94.2 45.93 120.32 38.06 144.61 38.06c12.815-.101 25.531 2.255 37.46 6.94C213.33 57.74 218 80.65 218 93.17c0 31.41-21.66 39.76-44.59 48.61Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
