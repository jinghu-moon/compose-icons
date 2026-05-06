package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorLightIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124.4 84.8 94.53 62.4C94.184 62.14 93.763 62 93.33 62h-53.33c-1.105 0-2 .895-2 2v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16C26 56.268 32.268 50 40 50h53.33c3.029 0 5.977 .982 8.4 2.8l29.87 22.4c2.651 1.988 3.188 5.749 1.2 8.4-1.988 2.651-5.749 3.188-8.4 1.2ZM88 202h-48.62c-.758-.011-1.369-.622-1.38-1.38v-8.62c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v8.62c.006 7.387 5.993 13.374 13.38 13.38h48.62c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM160 202h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 146c-3.314 0-6 2.686-6 6v48.89c0 .613-.497 1.11-1.11 1.11h-16.89c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16.89c7.238-.006 13.104-5.872 13.11-13.11v-48.89c0-3.314-2.686-6-6-6ZM216 74h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c1.105 0 2 .895 2 2v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-7.732-6.268-14-14-14ZM32 158c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
