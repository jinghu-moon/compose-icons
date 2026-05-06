package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorLightIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 106h-13.51L190.58 70.1C187.963 67.468 184.402 65.991 180.69 66h-42.69v-28h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h26v28h-62C56.268 66 50 72.268 50 80v54h-28v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v64c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h28v22.69c-.009 3.712 1.468 7.273 4.1 9.89l39.32 39.32c2.617 2.632 6.178 4.109 9.89 4.1h77.38c3.712 .009 7.273-1.468 9.89-4.1L226.49 182h13.51c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM242 168c0 1.105-.895 2-2 2h-16c-1.591 .001-3.116 .634-4.24 1.76l-37.66 37.66c-.375 .372-.882 .58-1.41 .58h-77.38c-.528 0-1.035-.208-1.41-.58L62.58 170.1c-.372-.375-.58-.882-.58-1.41v-88.69c0-1.105 .895-2 2-2h116.69c.528-0 1.035 .208 1.41 .58l37.66 37.66c1.124 1.126 2.649 1.759 4.24 1.76h16c1.105 0 2 .895 2 2Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
