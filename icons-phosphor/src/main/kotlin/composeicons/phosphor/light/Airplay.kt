package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorLightIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132.56 156.1c-1.14-1.329-2.804-2.095-4.555-2.095-1.751 0-3.415 .765-4.555 2.095l-48 56c-1.521 1.778-1.869 4.279-.892 6.406 .977 2.126 3.102 3.491 5.442 3.494h96c2.342 0 4.47-1.363 5.45-3.49 .98-2.127 .632-4.63-.89-6.41ZM93.05 210l35-40.78L163 210ZM230 64v112c0 12.15-9.85 22-22 22h-8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c5.523 0 10-4.477 10-10v-112c0-5.523-4.477-10-10-10h-160C42.477 54 38 58.477 38 64v112c0 5.523 4.477 10 10 10h8c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-8C35.85 198 26 188.15 26 176v-112C26 51.85 35.85 42 48 42h160c12.15 0 22 9.85 22 22Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
