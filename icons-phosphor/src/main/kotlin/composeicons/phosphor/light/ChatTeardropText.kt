package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorLightIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170 112c0 3.314-2.686 6-6 6h-68c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h68c3.314 0 6 2.686 6 6ZM164 138h-68c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h68c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 124c-.061 54.099-43.901 97.939-98 98h-84c-7.732 0-14-6.268-14-14v-84C34 69.876 77.876 26 132 26c54.124 0 98 43.876 98 98ZM218 124C218 76.504 179.496 38 132 38 84.504 38 46 76.504 46 124v84c0 1.105 .895 2 2 2h84c47.474-.055 85.945-38.526 86-86Z"),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
