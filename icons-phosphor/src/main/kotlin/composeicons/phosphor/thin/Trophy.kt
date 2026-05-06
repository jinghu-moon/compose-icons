package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorThinIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 68h-28v-20c0-2.209-1.791-4-4-4h-144c-2.209 0-4 1.791-4 4v20h-28C17.373 68 12 73.373 12 80v16c0 19.882 16.118 36 36 36h6.66c8.633 31.64 36.589 54.173 69.34 55.89v32.11h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-32.12c32.93-1.74 60.41-24.91 69.11-55.88h6.89c19.882 0 36-16.118 36-36v-16c0-6.627-5.373-12-12-12ZM48 124C32.536 124 20 111.464 20 96v-16c0-2.209 1.791-4 4-4h28v36c.02 4.02 .354 8.032 1 12ZM196 111.1c0 37.71-30.79 68.62-68 68.9C90.445 180 60 149.555 60 112v-60h136ZM236 96c0 15.464-12.536 28-28 28h-5.1c.727-4.262 1.094-8.577 1.1-12.9v-35.1h28c2.209 0 4 1.791 4 4Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
