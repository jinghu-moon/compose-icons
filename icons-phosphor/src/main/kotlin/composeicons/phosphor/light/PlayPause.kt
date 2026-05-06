package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorLightIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 64v128c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-128c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM224 58c-3.314 0-6 2.686-6 6v128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-128c0-3.314-2.686-6-6-6ZM142 128c.004 4.726-2.416 9.124-6.41 11.65L47.41 195.8c-4.272 2.735-9.693 2.928-14.149 .504C28.806 193.879 26.024 189.222 26 184.15v-112.3c.024-5.072 2.806-9.729 7.261-12.154 4.455-2.424 9.877-2.231 14.149 .504l88.18 56.15c3.994 2.526 6.414 6.924 6.41 11.65ZM130 128c.006-.624-.317-1.206-.85-1.53L41 70.32c-.296-.2-.643-.311-1-.32-.349 0-.692 .086-1 .25-.615 .295-1.005 .918-1 1.6v112.3c-.005 .682 .385 1.305 1 1.6 .626 .358 1.401 .331 2-.07l88.19-56.15c.518-.334 .825-.914 .81-1.53Z"),
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
