package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorLightIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.83 74.71c-1.952-1.044-4.319-.928-6.16 .3L206 100.79v-28.79c0-7.732-6.268-14-14-14h-160C24.268 58 18 64.268 18 72v112c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-28.79L244.67 181c1.842 1.229 4.212 1.344 6.164 .297 1.952-1.046 3.169-3.083 3.166-5.297v-96c-0-2.213-1.219-4.246-3.17-5.29ZM194 184c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM242 164.79l-36-24v-25.58l36-24Z"),
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
