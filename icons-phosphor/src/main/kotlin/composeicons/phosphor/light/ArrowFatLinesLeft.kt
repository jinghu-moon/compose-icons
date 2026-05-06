package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorLightIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 74h-26v-42c-.002-2.425-1.464-4.611-3.705-5.538-2.241-.928-4.819-.415-6.535 1.298L19.76 123.76c-2.34 2.343-2.34 6.137 0 8.48l96 96c1.716 1.714 4.295 2.226 6.535 1.298 2.241-.928 3.702-3.113 3.705-5.538v-42h26c3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6ZM146 170h-26c-3.314 0-6 2.686-6 6v33.51L32.49 128 114 46.49v33.51c0 3.314 2.686 6 6 6h26ZM222 80v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM190 80v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
