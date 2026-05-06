package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorFillIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.31 72 184 36.69C181.01 33.676 176.936 31.986 172.69 32h-124.69C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-124.69c.014-4.246-1.676-8.32-4.69-11.31ZM208 208h-24v-56c0-8.837-7.163-16-16-16h-80c-8.837 0-16 7.163-16 16v56h-24v-160h124.69L208 83.31ZM160 72c0 4.418-3.582 8-8 8h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8Z"),
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
