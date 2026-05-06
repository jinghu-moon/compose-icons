package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilePpt: ImageVector
    get() {
        if (_filePpt != null) return _filePpt!!
        _filePpt = phosphorLightIcon(
            name = "FilePpt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 152c0 3.314-2.686 6-6 6h-14v50c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-50h-14c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM90 172c0 14.359-11.641 26-26 26h-10v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6h16c14.359 0 26 11.641 26 26ZM78 172c0-7.732-6.268-14-14-14h-10v28h10c7.732 0 14-6.268 14-14ZM158 172c0 14.359-11.641 26-26 26h-10v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6h16c14.359 0 26 11.641 26 26ZM146 172c0-7.732-6.268-14-14-14h-10v28h10c7.732 0 14-6.268 14-14ZM42 112v-72C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM158 82h35.52L158 46.48Z"),
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
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
