package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorDuotoneIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 40 24 88v24h8c13.077-.002 23.749 10.465 24 23.54C56.25 149 44.91 160 31.46 160h-7.46v32h56v-8c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32v8h80c4.418 0 8-3.582 8-8v-96C232 61.49 210.51 40 184 40ZM168 136c-11.434 .003-22-6.096-27.718-15.997C134.564 110.102 134.563 97.902 140.28 88h55.44c5.717 9.902 5.716 22.102-.002 32.003C190 129.904 179.434 136.003 168 136Z"),
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
                pathData = parseSvgPathData("M184 32c-.779-.002-1.555 .113-2.3 .34L21.7 80.34h0C18.318 81.355 16.001 84.468 16 88v24c0 4.418 3.582 8 8 8h8c8.7 .041 15.789 6.993 16 15.69 .072 4.235-1.581 8.318-4.58 11.31-3.163 3.221-7.485 5.04-12 5.05h-7.42c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h200c8.837 0 16-7.163 16-16v-96.05C239.967 57.086 214.914 32.033 184 32ZM185.12 48c18.576 .545 34.339 13.794 38.07 32h-144.68ZM192 104c.008 9.559-5.656 18.211-14.42 22.026-8.764 3.815-18.957 2.066-25.947-4.453C144.641 115.055 142.185 105.009 145.38 96h45.24c.914 2.568 1.38 5.274 1.38 8ZM88 184c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM224 184h-72c0-22.091-17.909-40-40-40-22.091 0-40 17.909-40 40h-40v-16c8.607-.179 16.803-3.713 22.84-9.85 6.017-6.032 9.323-14.251 9.16-22.77C63.583 117.984 49.401 104.076 32 104v-8h96.81c-3.25 15.901 3.431 32.189 16.909 41.229 13.478 9.04 31.083 9.04 44.562 0C203.759 128.189 210.44 111.901 207.19 96h16.81Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
