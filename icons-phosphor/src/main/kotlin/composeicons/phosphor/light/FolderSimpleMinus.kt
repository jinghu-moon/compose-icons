package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) return _folderSimpleMinus!!
        _folderSimpleMinus = phosphorLightIcon(
            name = "FolderSimpleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 74h-86L101.73 52.8C99.307 50.982 96.359 50 93.33 50h-53.33C32.268 50 26 56.268 26 64v136c0 7.732 6.268 14 14 14h176.89c7.238-.006 13.104-5.872 13.11-13.11v-112.89c0-7.732-6.268-14-14-14ZM218 200.89c0 .613-.497 1.11-1.11 1.11h-176.89c-1.105 0-2-.895-2-2v-136c0-1.105 .895-2 2-2h53.33c.433 0 .854 .14 1.2 .4l29.87 22.4c1.039 .779 2.302 1.2 3.6 1.2h88c1.105 0 2 .895 2 2ZM158 144c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6Z"),
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
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
