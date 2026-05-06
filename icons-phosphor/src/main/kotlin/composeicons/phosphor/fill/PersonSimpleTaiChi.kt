package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorFillIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 48C96 30.327 110.327 16 128 16c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 80 96 65.673 96 48ZM216 96h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80v28.44L42.65 210.05c-3.3 2.955-3.58 8.025-.625 11.325 2.955 3.3 8.025 3.58 11.325 .625l76.2-68.58L176 173.28v42.72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c-.001-3.199-1.909-6.09-4.85-7.35L136 138.72v-26.72h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
