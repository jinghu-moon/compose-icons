package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorFillIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 48h-16v-16c0-8.837-7.163-16-16-16h-48C95.163 16 88 23.163 88 32v16h-16C54.327 48 40 62.327 40 80v96c.014 14.591 9.878 27.332 24 31v17c0 8.837 7.163 16 16 16h96c8.837 0 16-7.163 16-16v-17c14.122-3.668 23.986-16.409 24-31v-96C216 62.327 201.673 48 184 48ZM156 100c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM160.27 158.77c-19.752 12.313-44.788 12.313-64.54 0-3.739-2.358-4.858-7.301-2.5-11.04 2.358-3.739 7.301-4.858 11.04-2.5 14.534 9.02 32.926 9.02 47.46 0 3.739-2.358 8.682-1.239 11.04 2.5 2.358 3.739 1.239 8.682-2.5 11.04ZM104 32h48v16h-48ZM100 100c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM176 224h-96v-16h96Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
