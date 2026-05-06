package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorDuotoneIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187.64 160h-63.28L156 73Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M215.52 213.26 164.51 73l9.09-25h10.4c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h4.58L32.48 213.26c-.727 1.996-.631 4.199 .268 6.123 .899 1.925 2.526 3.413 4.522 4.137 .876 .315 1.799 .477 2.73 .48 3.366 0 6.371-2.106 7.52-5.27L57.24 192h47l-7.74 21.26c-.727 1.996-.631 4.199 .268 6.123 .899 1.925 2.526 3.413 4.522 4.137 .87 .313 1.786 .475 2.71 .48 3.366 0 6.371-2.106 7.52-5.27L130 168h52l18.45 50.73c1.152 3.174 4.173 5.283 7.55 5.27 .931-.003 1.854-.165 2.73-.48 1.997-.724 3.624-2.212 4.522-4.137 .899-1.925 .995-4.128 .268-6.123ZM127.52 128h-47L92.15 96h47ZM156.61 48 144.94 80h-46.94L109.6 48ZM63.06 176 74.7 144h47L110 176ZM135.78 152 156 96.41 176.21 152Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
