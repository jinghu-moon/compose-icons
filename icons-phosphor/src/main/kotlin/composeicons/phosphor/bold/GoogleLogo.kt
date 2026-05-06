package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorBoldIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c-.002 48.608-34.958 90.174-82.845 98.513C97.268 234.851 50.32 207.547 33.888 161.801 17.455 116.055 36.298 65.118 78.546 41.08 120.794 17.041 174.208 26.864 205.14 64.36c4.219 5.111 3.496 12.676-1.615 16.895-5.111 4.219-12.676 3.496-16.895-1.615C163.843 52.017 124.865 44.047 93.065 60.509 61.264 76.971 45.268 113.398 54.668 147.952c9.4 34.553 41.644 57.858 77.402 55.941 35.758-1.916 65.327-28.533 70.98-63.893h-75.05c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h88c6.627 0 12 5.373 12 12Z"),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
