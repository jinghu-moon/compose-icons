package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorRegularIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.31 108.68l-80-80c-6.248-6.243-16.372-6.243-22.62 0l-80 80C33.674 111.673 31.985 115.751 32 120v96c0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8v-96c.015-4.249-1.674-8.327-4.69-11.32ZM208 208h-160v-88L128 40l80 80Z"),
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
