package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorLightIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 44.24c1.714-1.716 2.226-4.295 1.298-6.535C236.611 35.464 234.425 34.002 232 34h-208c-2.425 .002-4.611 1.464-5.538 3.705-.928 2.241-.415 4.819 1.298 6.535L122 146.49v63.51h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-34v-63.51ZM70.49 78h115L128 135.51ZM217.49 46l-20 20h-139l-20-20Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
