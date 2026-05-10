package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorFillIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 128c0 22.091-17.909 40-40 40C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40ZM248 64v128c0 4.418-3.582 8-8 8h-224c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8h224c4.418 0 8 3.582 8 8ZM232 110.35C213.543 104.893 199.107 90.457 193.65 72h-131.3C56.893 90.457 42.457 104.893 24 110.35v35.3c18.457 5.457 32.893 19.893 38.35 38.35h131.3c5.457-18.457 19.893-32.893 38.35-38.35Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
