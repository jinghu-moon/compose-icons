package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) return _lockOpen!!
        _lockOpen = phosphorLightIcon(
            name = "LockOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 82h-114v-26C94 37.222 109.222 22 128 22c16.3 0 31 11.69 34.12 27.19 .702 3.2 3.84 5.245 7.051 4.595 3.211-.65 5.307-3.754 4.709-6.975C169.55 25.48 150.26 10 128 10 102.609 10.033 82.033 30.609 82 56v26h-34C40.268 82 34 88.268 34 96v112c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM138 152c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
