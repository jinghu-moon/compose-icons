package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = phosphorRegularIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM216 200h-176v-144h176v144ZM80 84c0 6.627-5.373 12-12 12C61.373 96 56 90.627 56 84 56 77.373 61.373 72 68 72c6.627 0 12 5.373 12 12ZM120 84c0 6.627-5.373 12-12 12C101.373 96 96 90.627 96 84c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
