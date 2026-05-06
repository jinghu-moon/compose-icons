package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Suitcase: ImageVector
    get() {
        if (_suitcase != null) return _suitcase!!
        _suitcase = phosphorBoldIcon(
            name = "Suitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-36v-8C180 24.536 167.464 12 152 12h-48C88.536 12 76 24.536 76 40v8h-36C28.954 48 20 56.954 20 68v128c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-128C236 56.954 227.046 48 216 48ZM100 40c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v8h-56ZM156 72v120h-56v-120ZM44 72h32v120h-32ZM212 192h-32v-120h32Z"),
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
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
