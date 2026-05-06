package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorRegularIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80c17.673 0 32-14.327 32-32C160 30.327 145.673 16 128 16 110.327 16 96 30.327 96 48c0 17.673 14.327 32 32 32ZM128 32c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM224 104c0 4.418-3.582 8-8 8h-80v26.72l51.15 21.93c2.941 1.26 4.849 4.151 4.85 7.35v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-42.72L129.55 153.37 53.35 222c-3.286 2.955-8.345 2.686-11.3-.6-2.955-3.286-2.686-8.345 .6-11.3L120 140.44v-28.44h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
