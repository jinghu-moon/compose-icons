package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorLightIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 66h-160C50.477 66 46 61.523 46 56 46 50.477 50.477 46 56 46h136c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-136C43.85 34 34 43.85 34 56v128c0 12.15 9.85 22 22 22h160c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM218 192c0 1.105-.895 2-2 2h-160c-5.523 0-10-4.477-10-10v-108.41c3.094 1.588 6.522 2.414 10 2.41h160c1.105 0 2 .895 2 2ZM190 132c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
