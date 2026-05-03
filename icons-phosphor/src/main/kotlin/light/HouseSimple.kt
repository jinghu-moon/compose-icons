package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorLightIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 217.900 110.100 L 137.900 30.100 C 135.274 27.474 131.713 25.999 128.000 25.999 C 124.287 25.999 120.726 27.474 118.100 30.100 L 38.100 110.100 C 35.467 112.721 33.991 116.285 34.000 120.000 L 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 120.000 C 222.009 116.285 220.533 112.721 217.900 110.100 ZM 210.000 210.000 L 46.000 210.000 L 46.000 120.000 C 45.997 119.468 46.206 118.957 46.580 118.580 L 126.580 38.580 C 126.956 38.201 127.467 37.988 128.000 37.988 C 128.533 37.988 129.044 38.201 129.420 38.580 L 209.420 118.580 C 209.794 118.957 210.003 119.468 210.000 120.000 Z"),
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
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
