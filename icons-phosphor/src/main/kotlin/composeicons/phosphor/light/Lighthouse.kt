package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorLightIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 82c-3.314 0-6 2.686-6 6v18h-15L182 55.4c-.156-1.499-.87-2.884-2-3.88L137.11 13.37l-.15-.12c-5.191-4.324-12.729-4.324-17.92 0l-.15 .12L76 51.52c-1.13 .996-1.844 2.381-2 3.88L69 106h-15v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v24c0 3.314 2.686 6 6 6h19.75l-9.69 96.67c-.375 3.927 .925 7.83 3.579 10.749 2.654 2.919 6.416 4.582 10.361 4.581h112c3.949-.001 7.714-1.67 10.367-4.595 2.653-2.925 3.947-6.835 3.563-10.765L188.25 118h19.75c3.314 0 6-2.686 6-6v-24c0-3.314-2.686-6-6-6ZM126.77 22.42c.723-.564 1.737-.564 2.46 0l31 27.58h-64.46ZM85.43 62h85.14L175 106h-41v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-41ZM185.43 217.35c-.368 .403-.885 .637-1.43 .65h-112c-.559 .002-1.094-.231-1.474-.641-.38-.41-.571-.961-.526-1.519L74.2 174h107.6L186 215.81c.052 .564-.136 1.123-.52 1.54ZM180.6 162h-105.2l4.41-44h96.38Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
