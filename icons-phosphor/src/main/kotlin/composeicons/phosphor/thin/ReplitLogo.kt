package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorThinIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92h-68v-52c0-6.627-5.373-12-12-12h-64C65.373 28 60 33.373 60 40v48c0 6.627 5.373 12 12 12h68v56h-68c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-52h68c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM140 216c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h68ZM140 92h-68c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM220 152c0 2.209-1.791 4-4 4h-68v-56h68c2.209 0 4 1.791 4 4Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
