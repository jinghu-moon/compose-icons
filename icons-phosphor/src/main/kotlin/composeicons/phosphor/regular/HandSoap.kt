package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorRegularIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 96.8v-8.8C184 70.327 169.673 56 152 56h-16v-24h32c4.418 0 8 3.582 8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C192 26.745 181.255 16 168 16h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v24h-16C86.327 56 72 70.327 72 88v8.8C53.388 100.627 40.023 116.999 40 136v80c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-80c-.023-19.001-13.388-35.373-32-39.2ZM104 72h48c8.837 0 16 7.163 16 16v8h-80v-8c0-8.837 7.163-16 16-16ZM200 216h-144v-80c0-13.255 10.745-24 24-24h96c13.255 0 24 10.745 24 24v80Z"),
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
