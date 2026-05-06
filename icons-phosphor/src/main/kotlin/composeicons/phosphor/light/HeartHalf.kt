package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorLightIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M169.1 54.82c3.264-.608 5.418-3.746 4.81-7.01-.608-3.264-3.746-5.418-7.01-4.81C150.3 46.13 136.65 54.82 128 67.4 117.3 51.5 99 42 78 42 44.879 42.039 18.039 68.879 18 102c0 29.2 18.2 59.59 54.1 90.31 16.45 14.018 34.22 26.409 53.06 37 1.77 .966 3.91 .966 5.68 0h0c14.257-7.975 27.902-17 40.82-27 2.626-2.021 3.116-5.789 1.095-8.415-2.021-2.626-5.789-3.116-8.415-1.095-9.734 7.459-19.862 14.389-30.34 20.76v-132.28c6-13.78 18.76-23.4 35.1-26.46ZM122 213.54C97.4 198.51 30 152.7 30 102 30.028 75.502 51.502 54.028 78 54c19.87 0 36.62 10.4 44 27.22ZM232.33 102c-.223 .015-.447 .015-.67 0-3.053-.007-5.614-2.305-5.95-5.34C224.15 82.588 216.443 69.928 204.66 62.08 201.899 60.235 201.155 56.501 203 53.74c1.845-2.761 5.579-3.505 8.34-1.66 14.723 9.815 24.348 25.642 26.29 43.23 .194 1.592-.257 3.195-1.253 4.452-.996 1.257-2.453 2.063-4.047 2.238ZM228.67 138.72c-5.58 11.2-13.75 22.65-24.26 34-2.251 2.436-6.049 2.586-8.485 .335-2.436-2.251-2.586-6.049-.335-8.485 9.75-10.54 17.27-21.05 22.35-31.24 .917-1.986 2.842-3.317 5.024-3.471 2.182-.154 4.276 .891 5.463 2.729 1.187 1.838 1.28 4.176 .242 6.102Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
