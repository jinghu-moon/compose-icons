package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorLightIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.9 73.42 182.58 38.1C179.963 35.468 176.402 33.991 172.69 34h-124.69C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-124.69c.009-3.712-1.468-7.273-4.1-9.89ZM170 210h-84v-58c0-1.105 .895-2 2-2h80c1.105 0 2 .895 2 2ZM210 208c0 1.105-.895 2-2 2h-26v-58c0-7.732-6.268-14-14-14h-80c-7.732 0-14 6.268-14 14v58h-26c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h124.69c.528-0 1.035 .208 1.41 .58l35.32 35.32c.372 .375 .58 .882 .58 1.41ZM158 72c0 3.314-2.686 6-6 6h-56c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h56c3.314 0 6 2.686 6 6Z"),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
