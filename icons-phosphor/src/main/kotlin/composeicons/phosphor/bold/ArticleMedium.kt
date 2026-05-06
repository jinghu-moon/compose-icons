package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorBoldIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 132c0 6.627-5.373 12-12 12h-20c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4v-52h-4C17.373 68 12 62.627 12 56 12 49.373 17.373 44 24 44h16c4.015-.008 7.768 1.992 10 5.33l30 45 30-45c2.232-3.338 5.985-5.338 10-5.33h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-4v52h4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20c-4.969-.007-9.419-3.074-11.193-7.716-1.774-4.641-.504-9.895 3.193-13.214v-27.44l-18 27c-2.223 3.352-5.978 5.367-10 5.367-4.022 0-7.777-2.015-10-5.367l-18-27v27.44c2.542 2.273 3.996 5.52 4 8.93ZM176 104h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM232 120h-56c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 160h-152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 200h-152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
