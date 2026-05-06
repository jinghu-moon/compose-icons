package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorBoldIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.45 69.31c-4.026-2.048-8.86-1.661-12.51 1L212 88.43v-16.43C212 60.954 203.046 52 192 52h-160C20.954 52 12 60.954 12 72v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-16.43l24.94 18.14c3.651 2.656 8.484 3.039 12.507 .989 4.023-2.05 6.555-6.184 6.553-10.699v-96c-0-4.511-2.531-8.641-6.55-10.69ZM188 180h-152v-104h152ZM232 152.43 212 137.89v-19.78l20-14.54Z"),
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
