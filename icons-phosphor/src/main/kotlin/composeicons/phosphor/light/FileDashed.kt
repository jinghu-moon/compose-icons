package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorLightIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M78 224c0 3.314-2.686 6-6 6h-16c-7.732 0-14-6.268-14-14v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v32c0 1.105 .895 2 2 2h16c3.314 0 6 2.686 6 6ZM214 88v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-42h-50c-3.314 0-6-2.686-6-6v-50h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c1.591 .001 3.116 .634 4.24 1.76l56 56c1.126 1.124 1.759 2.649 1.76 4.24ZM158 82h35.51L158 46.49ZM80 26h-24C48.268 26 42 32.268 42 40v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-1.105 .895-2 2-2h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM208 170c-3.314 0-6 2.686-6 6v40c0 1.105-.895 2-2 2h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c7.732 0 14-6.268 14-14v-40c0-3.314-2.686-6-6-6ZM48 150c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6ZM152 218h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
