package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorBoldIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C28.954 44 20 52.954 20 64v128c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-128C236 52.954 227.046 44 216 44ZM108 140v-24h40v24ZM148 164v24h-40v-24ZM44 116h40v24h-40ZM108 92v-24h40v24ZM172 116h40v24h-40ZM212 92h-40v-24h40ZM84 68v24h-40v-24ZM44 164h40v24h-40ZM172 188v-24h40v24Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
