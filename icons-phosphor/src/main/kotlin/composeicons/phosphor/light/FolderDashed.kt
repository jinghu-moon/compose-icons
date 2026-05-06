package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorLightIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94 208c0 3.314-2.686 6-6 6h-48.62C31.993 213.994 26.006 208.007 26 200.62v-8.62c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v8.62c.011 .758 .622 1.369 1.38 1.38h48.62c3.314 0 6 2.686 6 6ZM160 202h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 146c-3.314 0-6 2.686-6 6v48.89c0 .613-.497 1.11-1.11 1.11h-16.89c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16.89c7.238-.006 13.104-5.872 13.11-13.11v-48.89c0-3.314-2.686-6-6-6ZM216 74h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c1.105 0 2 .895 2 2v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-7.732-6.268-14-14-14ZM26 80v-24C26 48.268 32.268 42 40 42h52.69c3.714-.007 7.278 1.469 9.9 4.1l29.65 29.66c1.714 1.716 2.226 4.295 1.298 6.535-.928 2.241-3.113 3.702-5.538 3.705h-96c-3.314 0-6-2.686-6-6ZM38 74h75.51L94.1 54.59c-.373-.376-.88-.588-1.41-.59h-52.69c-1.105 0-2 .895-2 2ZM32 158c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
