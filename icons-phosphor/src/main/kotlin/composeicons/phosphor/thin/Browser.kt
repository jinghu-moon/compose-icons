package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Browser: ImageVector
    get() {
        if (_browser != null) return _browser!!
        _browser = phosphorThinIcon(
            name = "Browser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v144c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM40 52h176c2.209 0 4 1.791 4 4v36h-184v-36c0-2.209 1.791-4 4-4ZM216 204h-176c-2.209 0-4-1.791-4-4v-100h184v100c0 2.209-1.791 4-4 4Z"),
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
        return _browser!!
    }

private var _browser: ImageVector? = null
