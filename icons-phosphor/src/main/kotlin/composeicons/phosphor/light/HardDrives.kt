package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorLightIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 138h-160c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM210 200c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM208 42h-160C40.268 42 34 48.268 34 56v48c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM210 104c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM190 80c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM190 176c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
