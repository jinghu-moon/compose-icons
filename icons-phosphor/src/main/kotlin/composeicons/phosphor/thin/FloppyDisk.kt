package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorThinIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 74.83 181.17 39.51C178.924 37.256 175.872 35.992 172.69 36h-124.69C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-124.69c.008-3.182-1.256-6.234-3.51-8.48ZM172 212h-88v-60c0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4ZM212 208c0 2.209-1.791 4-4 4h-28v-60c0-6.627-5.373-12-12-12h-80c-6.627 0-12 5.373-12 12v60h-28c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h124.69c1.058 .002 2.072 .422 2.82 1.17l35.32 35.32c.748 .748 1.168 1.762 1.17 2.82ZM156 72c0 2.209-1.791 4-4 4h-56c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h56c2.209 0 4 1.791 4 4Z"),
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
