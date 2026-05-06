package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorLightIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 78c16.569 0 30-13.431 30-30C158 31.431 144.569 18 128 18 111.431 18 98 31.431 98 48c0 16.569 13.431 30 30 30ZM128 30c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM222 104c0 3.314-2.686 6-6 6h-82v30l52.36 22.45c2.219 .949 3.654 3.136 3.64 5.55v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-44L129.16 151 52 220.46c-2.485 1.994-6.095 1.698-8.222-.674-2.127-2.372-2.03-5.992 .222-8.246l78-70.21v-31.33h-82c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6Z"),
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
