package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorBoldIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM76 108C76 99.163 83.163 92 92 92c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM180 108c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM176.74 165c3.624 5.379 2.318 12.664-2.949 16.449-5.267 3.785-12.588 2.7-16.531-2.449C150.499 169.567 139.605 163.973 128 163.973c-11.605 0-22.499 5.595-29.26 15.027-3.943 5.149-11.264 6.234-16.531 2.449C76.942 177.664 75.636 170.379 79.26 165 90.531 149.301 108.674 139.992 128 139.992c19.326 0 37.469 9.309 48.74 25.008Z"),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
