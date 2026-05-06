package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorLightIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 66h-192C24.268 66 18 72.268 18 80v96c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-96c0-7.732-6.268-14-14-14ZM226 176c0 1.105-.895 2-2 2h-192c-1.105 0-2-.895-2-2v-96c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2ZM198 128c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
