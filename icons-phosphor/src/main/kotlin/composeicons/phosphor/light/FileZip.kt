package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorLightIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26ZM184 186h-10v-28h10c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM134 152v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM94 208c0 3.314-2.686 6-6 6h-32c-2.146 .005-4.131-1.137-5.207-2.994-1.075-1.857-1.076-4.147-.003-6.006L77.66 158h-21.66c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c2.146-.005 4.131 1.137 5.207 2.994 1.075 1.857 1.076 4.147 .003 6.006L66.34 202h21.66c3.314 0 6 2.686 6 6ZM212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c-.001-1.591-.634-3.116-1.76-4.24ZM158 82v-35.52L193.52 82Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
