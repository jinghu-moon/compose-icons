package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorBoldIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.15 197.71 164 95.81v-51.81h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-80C81.373 20 76 25.373 76 32c0 6.627 5.373 12 12 12h4v51.81L30.85 197.71c-3.707 6.179-3.804 13.874-.254 20.144C34.146 224.124 40.795 228 48 228h160c7.205 0 13.854-3.876 17.404-10.146 3.55-6.27 3.453-13.965-.254-20.144ZM140 44v55.14c.001 2.174 .592 4.306 1.71 6.17l35.13 58.54c-10.79 .86-25.15-1.31-43.42-10.56-14-7.08-27.46-11.33-40.27-12.76l21.14-35.22c1.118-1.864 1.709-3.996 1.71-6.17v-55.14ZM55.06 204 79 164.19c13-1.11 27.62 2.42 43.62 10.52 19.61 9.92 36.25 13.31 49.85 13.31 5.939 .023 11.86-.655 17.64-2.02l10.83 18Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
