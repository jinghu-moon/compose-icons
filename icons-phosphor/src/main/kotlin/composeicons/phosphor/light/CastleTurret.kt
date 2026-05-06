package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorLightIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 218h-18v-103.51l11.9-11.91c2.632-2.617 4.109-6.178 4.1-9.89v-44.69c0-7.732-6.268-14-14-14h-24c-3.314 0-6 2.686-6 6v26h-20v-26c0-3.314-2.686-6-6-6h-32c-3.314 0-6 2.686-6 6v26h-20v-26c0-3.314-2.686-6-6-6h-24C48.268 34 42 40.268 42 48v44.69c-.009 3.712 1.468 7.273 4.1 9.89L58 114.49v103.51h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h176c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM68.24 107.76 54.58 94.1c-.372-.375-.58-.882-.58-1.41v-44.69c0-1.105 .895-2 2-2h18v26c0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6v-26h20v26c0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6v-26h18c1.105 0 2 .895 2 2v44.69c0 .528-.208 1.035-.58 1.41l-13.66 13.66c-1.126 1.124-1.759 2.649-1.76 4.24v106h-28v-50c0-16.569-13.431-30-30-30-16.569 0-30 13.431-30 30v50h-28v-106c-.001-1.591-.634-3.116-1.76-4.24ZM146 218h-36v-50c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
