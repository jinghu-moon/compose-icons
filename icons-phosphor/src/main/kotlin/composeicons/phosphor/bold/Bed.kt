package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorBoldIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 68h-176v-20C36 41.373 30.627 36 24 36 17.373 36 12 41.373 12 48v160c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h196v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-96C255.972 87.711 236.289 68.028 212 68ZM100 156h-64v-64h64ZM232 156h-108v-64h88c11.046 0 20 8.954 20 20Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
