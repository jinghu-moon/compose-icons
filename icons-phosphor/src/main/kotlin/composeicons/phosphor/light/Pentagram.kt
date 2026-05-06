package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorLightIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.29 91.67C235.472 85.872 230.076 81.946 224 82h-62.52L141.33 19.87c-1.781-5.858-7.179-9.866-13.302-9.878-6.123-.011-11.535 3.977-13.338 9.828L94.51 82h-62.51c-6.075-.006-11.461 3.907-13.333 9.686-1.872 5.78 .197 12.107 5.123 15.664l50.65 36.44L55.05 203.63c-1.942 5.765 .127 12.122 5.09 15.64 4.877 3.625 11.553 3.625 16.43 0l51.43-37 51.41 37c4.904 3.6 11.571 3.621 16.497 .052 4.926-3.569 6.984-9.91 5.093-15.692L181.58 143.78l50.67-36.46c4.946-3.535 6.994-9.893 5.04-15.65ZM126.11 23.49c.195-.89 .984-1.525 1.895-1.525 .911 0 1.7 .634 1.895 1.525l19 58.46h-41.77ZM30.85 97.61c-.741-.477-1.045-1.408-.73-2.23C30.351 94.54 31.129 93.969 32 94h58.62L78.36 131.8ZM69.54 209.61c-.702 .513-1.654 .514-2.357 .003-.703-.511-.995-1.417-.723-2.243h0L84.69 151.17l33 23.77ZM88.54 139.19 103.24 94h49.52l14.65 45.16L128 167.51ZM189.49 207.37c.27 .829-.029 1.737-.737 2.245-.709 .508-1.665 .498-2.363-.025L138.27 174.9l33-23.77ZM225.17 97.59l-47.53 34.2L165.38 94h58.62c.883-.047 1.678 .534 1.9 1.39 .311 .814 .006 1.734-.73 2.2Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
