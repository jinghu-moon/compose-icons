package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLineDown: ImageVector
    get() {
        if (_arrowFatLineDown != null) return _arrowFatLineDown!!
        _arrowFatLineDown = phosphorLightIcon(
            name = "ArrowFatLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.54 133.7c-.929-2.239-3.115-3.699-5.54-3.7h-42v-58c0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6v58h-42c-2.425 .002-4.611 1.464-5.538 3.705-.928 2.241-.415 4.82 1.298 6.535l96 96c2.343 2.34 6.137 2.34 8.48 0l96-96c1.716-1.716 2.229-4.298 1.3-6.54ZM128 223.51 46.49 142h33.51c3.314 0 6-2.686 6-6v-58h84v58c0 3.314 2.686 6 6 6h33.51ZM74 40c0-3.314 2.686-6 6-6h96c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-96c-3.314 0-6-2.686-6-6Z"),
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
        return _arrowFatLineDown!!
    }

private var _arrowFatLineDown: ImageVector? = null
