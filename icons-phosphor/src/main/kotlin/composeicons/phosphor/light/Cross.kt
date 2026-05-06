package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorLightIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 74h-42v-42c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v42h-42C48.268 74 42 80.268 42 88v32c0 7.732 6.268 14 14 14h42v90c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-90h42c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14ZM202 120c0 1.105-.895 2-2 2h-48c-3.314 0-6 2.686-6 6v96c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-96c0-3.314-2.686-6-6-6h-48c-1.105 0-2-.895-2-2v-32c0-1.105 .895-2 2-2h48c3.314 0 6-2.686 6-6v-48c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v48c0 3.314 2.686 6 6 6h48c1.105 0 2 .895 2 2Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
