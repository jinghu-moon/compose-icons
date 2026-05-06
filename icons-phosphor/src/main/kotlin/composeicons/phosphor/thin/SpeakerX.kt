package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorThinIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M153.76 28.41c-1.373-.676-3.011-.509-4.22 .43L78.63 84h-46.63C25.373 84 20 89.373 20 96v64c0 6.627 5.373 12 12 12h46.63l70.91 55.16c.706 .541 1.57 .836 2.46 .84 .611 .002 1.213-.138 1.76-.41 1.37-.671 2.239-2.064 2.24-3.59v-192c-.001-1.526-.87-2.919-2.24-3.59ZM28 160v-64c0-2.209 1.791-4 4-4h44v72h-44c-2.209 0-4-1.791-4-4ZM148 215.82 84 166v-76L148 40.22ZM242.83 149.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L216 133.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L210.34 128 189.17 106.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L216 122.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L221.66 128Z"),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
