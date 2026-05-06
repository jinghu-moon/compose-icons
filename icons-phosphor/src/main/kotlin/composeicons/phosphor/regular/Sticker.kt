package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorRegularIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 32h-80C57.086 32.033 32.033 57.086 32 88v80c.033 30.914 25.086 55.967 56 56h48c.86-.001 1.714-.139 2.53-.41 26.23-8.75 76.31-58.83 85.06-85.06 .271-.816 .409-1.67 .41-2.53v-48C223.967 57.086 198.914 32.033 168 32ZM48 168v-80C48 65.909 65.909 48 88 48h80c22.091 0 40 17.909 40 40v40h-24c-30.914 .033-55.967 25.086-56 56v24h-40C65.909 208 48 190.091 48 168ZM144 203.14v-19.14c0-22.091 17.909-40 40-40h19.14C191 163.5 163.5 191 144 203.14Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
