package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorBoldIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 64v128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM224 52c-6.627 0-12 5.373-12 12v128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM148 128c.015 6.78-3.457 13.091-9.19 16.71L50.63 200.87c-6.12 3.911-13.885 4.178-20.26 .698C23.995 198.088 20.021 191.413 20 184.15v-112.3c.021-7.263 3.995-13.938 10.37-17.418 6.375-3.48 14.139-3.212 20.26 .698l88.18 56.16c5.733 3.619 9.205 9.93 9.19 16.71ZM120.38 128 44 79.37v97.26Z"),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
