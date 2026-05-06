package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorThinIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.89 76.47c-1.302-.697-2.882-.62-4.11 .2L204 104.53v-32.53c0-6.627-5.373-12-12-12h-160C25.373 60 20 65.373 20 72v112c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-32.53l41.78 27.86c1.228 .819 2.807 .896 4.108 .199 1.301-.697 2.113-2.053 2.112-3.529v-96c.002-1.476-.809-2.833-2.11-3.53ZM196 184c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM244 168.53 204 141.86v-27.72L244 87.47Z"),
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
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
