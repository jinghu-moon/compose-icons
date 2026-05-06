package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorBoldIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c19.882 0 36-16.118 36-36C164 28.118 147.882 12 128 12 108.118 12 92 28.118 92 48c0 19.882 16.118 36 36 36ZM128 36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM228 108c0 6.627-5.373 12-12 12h-76v16.09L188.73 157c4.401 1.888 7.259 6.211 7.27 11v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-40.09L130.33 158.05 56 224.92c-4.97 3.987-12.189 3.396-16.443-1.348C35.303 218.829 35.497 211.588 40 207.08l76-68.42v-18.66h-76c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12Z"),
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
