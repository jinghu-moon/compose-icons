package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorBoldIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 44h-72c-12.122-.004-23.706 5.01-32 13.85C119.706 49.01 108.122 43.996 96 44h-72C17.373 44 12 49.373 12 56v144c0 6.627 5.373 12 12 12h72c11.046 0 20 8.954 20 20 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-11.046 8.954-20 20-20h72c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM96 188h-60v-120h60c11.046 0 20 8.954 20 20v104.81C109.81 189.641 102.954 187.993 96 188ZM220 188h-60c-6.956-.004-13.813 1.652-20 4.83v-104.83c0-11.046 8.954-20 20-20h60ZM164 96h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM208 148c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
