package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorThinIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M153.76 28.41c-1.373-.676-3.011-.509-4.22 .43L78.63 84h-46.63C25.373 84 20 89.373 20 96v64c0 6.627 5.373 12 12 12h46.63l70.91 55.16c.706 .541 1.57 .836 2.46 .84 .611 .002 1.213-.138 1.76-.41 1.37-.671 2.239-2.064 2.24-3.59v-192c-.001-1.526-.87-2.919-2.24-3.59ZM28 160v-64c0-2.209 1.791-4 4-4h44v72h-44c-2.209 0-4-1.791-4-4ZM148 215.82 84 166v-76L148 40.22ZM195 104.21c11.98 13.601 11.98 33.989 0 47.59-1.464 1.657-3.993 1.814-5.65 .35-1.657-1.464-1.814-3.993-.35-5.65 9.31-10.577 9.31-26.423 0-37-1.343-1.668-1.135-4.097 .473-5.512 1.608-1.415 4.044-1.312 5.527 .232ZM244 128c.013 18.697-6.878 36.741-19.35 50.67-1.475 1.657-4.013 1.805-5.67 .33-1.657-1.475-1.805-4.013-.33-5.67 23.084-25.812 23.084-64.848 0-90.66-1.475-1.657-1.327-4.195 .33-5.67 1.657-1.475 4.195-1.327 5.67 .33C237.122 91.259 244.013 109.303 244 128Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
