package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorLightIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.46 122.18l-28.34-7.09C215.387 73.392 182.599 40.608 140.9 34.88L133.82 6.54C133.151 3.871 130.752 1.999 128 1.999c-2.752 0-5.151 1.872-5.82 4.541l-7.08 28.34C73.401 40.608 40.613 73.392 34.88 115.09L6.54 122.18c-2.669 .669-4.541 3.068-4.541 5.82 0 2.752 1.872 5.151 4.541 5.82l28.34 7.09c5.733 41.698 38.521 74.482 80.22 80.21l7.08 28.34c.669 2.669 3.068 4.541 5.82 4.541 2.752 0 5.151-1.872 5.82-4.541l7.08-28.34c41.699-5.728 74.487-38.512 80.22-80.21l28.34-7.09c2.669-.669 4.541-3.068 4.541-5.82 0-2.752-1.872-5.151-4.541-5.82ZM208.41 111.92 157 99.05 144.08 47.59c32.481 6.459 57.871 31.849 64.33 64.33ZM145.41 102.16 128 119.51 110.64 102.16 128 32.74ZM111.92 47.59 99.05 99.05 47.59 111.92C54.049 79.439 79.439 54.049 111.92 47.59ZM102.16 110.65 119.52 128l-17.36 17.35L32.74 128ZM47.59 144.08 99.05 157l12.87 51.46C79.425 201.994 54.031 176.58 47.59 144.08ZM110.64 153.84 128 136.49l17.36 17.35L128 223.26ZM144.08 208.41 157 157l51.46-12.87c-6.484 32.476-31.894 57.846-64.38 64.28ZM153.84 145.35 136.48 128l17.36-17.35L223.26 128Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
