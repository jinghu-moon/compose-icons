package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorLightIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.48 189.56l-64-144C188.516 43.395 186.369 42.001 184 42h-112c-2.347 .003-4.476 1.375-5.45 3.51v.05 .09h0L2.52 189.56c-.826 1.856-.657 4.004 .449 5.707C4.075 196.971 5.969 198 8 198h240c2.031-0 3.925-1.029 5.031-2.733 1.106-1.704 1.275-3.852 .449-5.707ZM66 76.27v109.73h-48.77ZM78 186v-109.73L126.77 186ZM139.9 186 81.23 54h98.87l58.67 132Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
