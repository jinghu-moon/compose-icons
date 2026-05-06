package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorLightIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 98.48v-10.48C182 71.431 168.569 58 152 58h-18v-28h34c5.523 0 10 4.477 10 10 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C190 27.85 180.15 18 168 18h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v28h-18C87.431 58 74 71.431 74 88v10.48C55.576 101.447 42.023 117.338 42 136v80c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-80c-.023-18.662-13.576-34.553-32-37.52ZM104 70h48c9.941 0 18 8.059 18 18v10h-84v-10c0-9.941 8.059-18 18-18ZM202 216c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-80c0-14.359 11.641-26 26-26h96c14.359 0 26 11.641 26 26Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
