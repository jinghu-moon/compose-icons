package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorBoldIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.14 69.17 186.83 33.86C183.089 30.096 177.997 27.986 172.69 28h-124.69C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-124.69c.014-5.307-2.096-10.399-5.86-14.14ZM164 204h-72v-44h72ZM204 204h-16v-48c0-11.046-8.954-20-20-20h-80c-11.046 0-20 8.954-20 20v48h-16v-152h119l33 33ZM164 84c0 6.627-5.373 12-12 12h-56C89.373 96 84 90.627 84 84 84 77.373 89.373 72 96 72h56c6.627 0 12 5.373 12 12Z"),
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
