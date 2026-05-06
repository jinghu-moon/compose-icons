package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorDuotoneIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 32h-128c-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8ZM128 184C110.327 184 96 169.673 96 152c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M192 24h-128C55.163 24 48 31.163 48 40v176c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM192 216h-128v-176h128ZM116 76c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM128 192c22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40ZM128 128c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24Z"),
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
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null
