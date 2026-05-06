package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) return _fileHtml!!
        _fileHtml = phosphorLightIcon(
            name = "FileHtml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 120v-32c-.001-1.591-.634-3.116-1.76-4.24l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6ZM158 46.48 193.52 82h-35.52ZM66 160v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-24v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h24v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM122 160c0 3.314-2.686 6-6 6h-10v42c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-42h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM194 160v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-30l-13.2 17.6C167.667 197.111 165.889 198 164 198c-1.889 0-3.667-.889-4.8-2.4L146 178v30c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-2.583 1.653-4.875 4.103-5.692 2.45-.817 5.148 .026 6.697 2.092L164 182l19.2-25.6c1.55-2.066 4.247-2.909 6.697-2.092 2.45 .817 4.103 3.11 4.103 5.692ZM250 208c0 3.314-2.686 6-6 6h-28c-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v42h22c3.314 0 6 2.686 6 6Z"),
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
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
