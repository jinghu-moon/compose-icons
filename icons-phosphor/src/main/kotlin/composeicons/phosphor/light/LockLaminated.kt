package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LockLaminated: ImageVector
    get() {
        if (_lockLaminated != null) return _lockLaminated!!
        _lockLaminated = phosphorLightIcon(
            name = "LockLaminated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 82h-34v-26C174 30.595 153.405 10 128 10 102.595 10 82 30.595 82 56v26h-34C40.268 82 34 88.268 34 96v112c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM46 126h164v20h-164ZM46 158h164v20h-164ZM94 56C94 37.222 109.222 22 128 22c18.778 0 34 15.222 34 34v26h-68ZM48 94h160c1.105 0 2 .895 2 2v18h-164v-18c0-1.105 .895-2 2-2ZM208 210h-160c-1.105 0-2-.895-2-2v-18h164v18c0 1.105-.895 2-2 2Z"),
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
        return _lockLaminated!!
    }

private var _lockLaminated: ImageVector? = null
