package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorBoldIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.7 54.46c-6.391-3.5-14.18-3.247-20.33 .66L132 101.85v-30c-.021-7.263-3.995-13.938-10.37-17.418-6.375-3.48-14.139-3.212-20.26 .698L13.19 111.29C7.469 114.92 4.003 121.225 4.003 128c0 6.775 3.466 13.08 9.187 16.71l88.18 56.17c6.12 3.911 13.885 4.178 20.26 .698 6.375-3.48 10.349-10.155 10.37-17.418v-30l73.37 46.73c6.122 3.912 13.888 4.178 20.264 .696 6.376-3.482 10.349-10.161 10.366-17.426v-112.32c-.006-7.239-3.953-13.899-10.3-17.38ZM108 176.64 31.63 128 108 79.36ZM212 176.64 135.63 128 212 79.36Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
