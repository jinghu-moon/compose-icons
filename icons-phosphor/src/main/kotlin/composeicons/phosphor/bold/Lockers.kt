package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorBoldIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 80c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12ZM180 108h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM76 92h16c6.627 0 12-5.373 12-12C104 73.373 98.627 68 92 68h-16C69.373 68 64 73.373 64 80c0 6.627 5.373 12 12 12ZM92 108h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM228 48v176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-64v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-64v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-176C28 36.954 36.954 28 48 28h160c11.046 0 20 8.954 20 20ZM116 188v-136h-64v136ZM140 188h64v-136h-64Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
