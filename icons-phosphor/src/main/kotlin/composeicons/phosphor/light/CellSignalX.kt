package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorLightIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 195.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L184 184.48l-19.76 19.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L175.52 176 155.76 156.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L184 167.52l19.76-19.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L192.48 176ZM160 118c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6ZM200 118c3.314 0 6-2.686 6-6v-80c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6ZM120 106c-3.314 0-6 2.686-6 6v88c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-88c0-3.314-2.686-6-6-6ZM80 146c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM40 186c-3.314 0-6 2.686-6 6v8c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-8c0-3.314-2.686-6-6-6Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
