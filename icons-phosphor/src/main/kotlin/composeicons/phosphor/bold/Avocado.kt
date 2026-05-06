package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorBoldIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 108c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52-.033-28.705-23.295-51.967-52-52ZM128 188c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM214.76 129.32 185 45.17C176.968 20.78 154.306 4.205 128.629 3.941 102.952 3.676 79.953 19.781 71.42 44h0L41.92 127.46c-14.351 38.05-2.019 81.008 30.33 105.651 32.349 24.643 77.04 25.124 109.913 1.183 32.872-23.941 46.126-66.624 32.597-104.974ZM128 228C105.651 227.984 84.734 216.995 72.041 198.6 59.347 180.205 56.495 156.751 64.41 135.85c0-.09 .07-.18 .1-.26L94.05 52h0C99.176 37.457 112.995 27.794 128.414 27.97c15.419 .176 29.013 10.153 33.806 24.81l.09 .27 29.82 84.28c7.361 20.816 4.157 43.91-8.593 61.937C170.787 217.293 150.079 228.007 128 228Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
