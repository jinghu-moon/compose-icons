package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) return _fileHtml!!
        _fileHtml = phosphorRegularIcon(
            name = "FileHtml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 120v-32c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-80h88v48c0 4.418 3.582 8 8 8h48v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM160 51.31 188.69 80h-28.69ZM68 160v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-20v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h20v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM124 160c0 4.418-3.582 8-8 8h-8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM196 160v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24l-9.6 12.8C168.889 198.814 166.518 200 164 200c-2.518 0-4.889-1.186-6.4-3.2L148 184v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-3.443 2.203-6.501 5.47-7.589 3.267-1.089 6.864 .035 8.93 2.789L164 178.67l17.6-23.47c2.066-2.755 5.663-3.878 8.93-2.789 3.267 1.089 5.47 4.146 5.47 7.589ZM252 208c0 4.418-3.582 8-8 8h-28c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40h20c4.418 0 8 3.582 8 8Z"),
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
