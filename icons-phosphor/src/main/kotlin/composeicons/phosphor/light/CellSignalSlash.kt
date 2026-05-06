package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorLightIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M86 152v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM40 186c-3.314 0-6 2.686-6 6v8c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-8c0-3.314-2.686-6-6-6ZM212.44 212 52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L114 121.52v78.48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-65.28l28 30.8v34.48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-21.28L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM160 121.63c3.314 0 6-2.686 6-6v-43.63c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v43.63c0 3.314 2.686 6 6 6ZM200 165.63c3.314 0 6-2.686 6-6v-127.63c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v127.63c0 3.314 2.686 6 6 6Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
