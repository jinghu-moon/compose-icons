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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 78.000 C 144.569 78.000 158.000 64.569 158.000 48.000 C 158.000 31.431 144.569 18.000 128.000 18.000 C 111.431 18.000 98.000 31.431 98.000 48.000 C 98.000 64.569 111.431 78.000 128.000 78.000 ZM 128.000 30.000 C 137.941 30.000 146.000 38.059 146.000 48.000 C 146.000 57.941 137.941 66.000 128.000 66.000 C 118.059 66.000 110.000 57.941 110.000 48.000 C 110.000 38.059 118.059 30.000 128.000 30.000 ZM 222.000 104.000 C 222.000 107.314 219.314 110.000 216.000 110.000 L 134.000 110.000 L 134.000 140.000 L 186.360 162.450 C 188.579 163.399 190.014 165.586 190.000 168.000 L 190.000 216.000 C 190.000 219.314 187.314 222.000 184.000 222.000 C 180.686 222.000 178.000 219.314 178.000 216.000 L 178.000 172.000 L 129.160 151.000 L 52.000 220.460 C 49.515 222.454 45.905 222.158 43.778 219.786 C 41.651 217.415 41.749 213.794 44.000 211.540 L 122.000 141.330 L 122.000 110.000 L 40.000 110.000 C 36.686 110.000 34.000 107.314 34.000 104.000 C 34.000 100.686 36.686 98.000 40.000 98.000 L 216.000 98.000 C 219.314 98.000 222.000 100.686 222.000 104.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
