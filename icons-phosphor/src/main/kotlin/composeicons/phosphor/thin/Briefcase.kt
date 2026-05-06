package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorThinIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 112c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM228 72v128c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-128C28 65.373 33.373 60 40 60h44v-12C84 36.954 92.954 28 104 28h48c11.046 0 20 8.954 20 20v12h44c6.627 0 12 5.373 12 12ZM92 60h72v-12c0-6.627-5.373-12-12-12h-48C97.373 36 92 41.373 92 48ZM36 72v44c28.104 15.751 59.784 24.015 92 24 32.216 .015 63.896-8.249 92-24v-44c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4ZM220 200v-74.9C191.669 140.145 160.078 148.008 128 148c-32.079 .01-63.669-7.853-92-22.9v74.9c0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
