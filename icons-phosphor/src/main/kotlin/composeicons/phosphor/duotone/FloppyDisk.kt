package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorDuotoneIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 83.31v124.69c0 4.418-3.582 8-8 8h-32v-64c0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8v64h-32c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h124.69c2.119 .001 4.151 .843 5.65 2.34l35.32 35.32c1.497 1.499 2.339 3.531 2.34 5.65Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M219.31 72 184 36.69C181.01 33.676 176.936 31.986 172.69 32h-124.69C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-124.69c.014-4.246-1.676-8.32-4.69-11.31ZM168 208h-80v-56h80ZM208 208h-24v-56c0-8.837-7.163-16-16-16h-80c-8.837 0-16 7.163-16 16v56h-24v-160h124.69L208 83.31ZM160 72c0 4.418-3.582 8-8 8h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8Z"),
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
