package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorLightIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-124.69c-3.714-.007-7.278 1.469-9.9 4.1L38.1 73.41C35.469 76.032 33.993 79.596 34 83.31v124.69c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM86 46h84v34c0 1.105-.895 2-2 2h-80c-1.105 0-2-.895-2-2ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-124.69c.002-.53 .214-1.037 .59-1.41L74 54.48v25.52c0 7.732 6.268 14 14 14h80c7.732 0 14-6.268 14-14v-34h26c1.105 0 2 .895 2 2ZM128 114c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38 0-20.987-17.013-38-38-38ZM128 178c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
