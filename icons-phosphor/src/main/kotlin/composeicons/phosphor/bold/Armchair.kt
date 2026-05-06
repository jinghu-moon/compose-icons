package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorBoldIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 78.53v-6.53C219.972 47.711 200.289 28.028 176 28h-96C55.711 28.028 36.028 47.711 36 72v6.53C14.504 85.448-.07 105.448-.07 128.03c0 22.582 14.574 42.582 36.07 49.5v22.47c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-22.49c21.496-6.918 36.07-26.918 36.07-49.5C256.07 105.428 241.496 85.428 220 78.51ZM80 52h96c11.046 0 20 8.954 20 20v4.62C172.187 80.369 154.056 99.967 152.17 124h-48.34C101.944 99.967 83.813 80.369 60 76.62v-4.62C60 60.954 68.954 52 80 52ZM206.81 155.86c-6.136 .611-10.81 5.774-10.81 11.94v28.2h-136v-28.2c-0-6.166-4.674-11.329-10.81-11.94C34.168 154.345 23.052 141.191 24.063 126.127 25.074 111.062 37.847 99.512 52.937 100.017 68.027 100.522 79.999 112.901 80 128v36c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16h48v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-36c.001-15.099 11.973-27.478 27.063-27.983 15.09-.505 27.863 11.045 28.874 26.11 1.011 15.065-10.105 28.218-25.127 29.733Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
