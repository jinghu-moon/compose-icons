package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorBoldIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM211.13 116h-31.57C177.974 92.468 170.643 69.683 158.21 49.64c28.312 10.964 48.531 36.318 52.92 66.36ZM128 207c-9.36-10.81-24.46-33.13-27.45-67h54.94c-1.494 18.687-7.354 36.762-17.11 52.77-3.069 5.017-6.54 9.776-10.38 14.23ZM100.55 116c1.494-18.687 7.354-36.762 17.11-52.77C120.716 58.215 124.174 53.456 128 49c9.36 10.81 24.46 33.13 27.45 67ZM97.79 49.64C85.357 69.683 78.026 92.468 76.44 116h-31.57C49.259 85.958 69.478 60.604 97.79 49.64ZM44.87 140h31.57c1.586 23.532 8.917 46.317 21.35 66.36C69.478 195.396 49.259 170.042 44.87 140ZM158.21 206.36C170.643 186.317 177.974 163.532 179.56 140h31.57c-4.389 30.042-24.608 55.396-52.92 66.36Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
