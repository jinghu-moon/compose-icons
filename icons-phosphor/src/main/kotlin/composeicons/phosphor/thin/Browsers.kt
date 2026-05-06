package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorThinIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-144C65.373 44 60 49.373 60 56v20h-20C33.373 76 28 81.373 28 88v112c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM40 84h144c2.209 0 4 1.791 4 4v20h-152v-20c0-2.209 1.791-4 4-4ZM188 200c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-84h152ZM220 168c0 2.209-1.791 4-4 4h-20v-84c0-6.627-5.373-12-12-12h-116v-20c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
