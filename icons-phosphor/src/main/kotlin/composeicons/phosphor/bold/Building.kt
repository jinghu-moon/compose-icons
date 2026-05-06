package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorBoldIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 220h-20v-184h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-176C33.373 12 28 17.373 28 24c0 6.627 5.373 12 12 12h4v184h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM68 36h120v184h-24v-36c0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v36h-24ZM140 220h-24v-24h24ZM84 64C84 57.373 89.373 52 96 52h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12C89.373 76 84 70.627 84 64ZM136 64c0-6.627 5.373-12 12-12h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12ZM84 104C84 97.373 89.373 92 96 92h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12ZM136 104c0-6.627 5.373-12 12-12h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12ZM84 144c0-6.627 5.373-12 12-12h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12ZM136 144c0-6.627 5.373-12 12-12h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12Z"),
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
        return _building!!
    }

private var _building: ImageVector? = null
