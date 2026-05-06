package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorThinIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161.76 28.41c-1.373-.676-3.011-.509-4.22 .43L86.63 84h-46.63C33.373 84 28 89.373 28 96v64c0 6.627 5.373 12 12 12h46.63l70.91 55.16c.706 .541 1.57 .836 2.46 .84 .611 .002 1.213-.138 1.76-.41 1.37-.671 2.239-2.064 2.24-3.59v-192c-.001-1.526-.87-2.919-2.24-3.59ZM156 215.82l-65.54-51c-.708-.535-1.572-.823-2.46-.82h-48c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h48c.89-.003 1.754-.298 2.46-.84L156 40.16ZM204 104v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM236 88v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
