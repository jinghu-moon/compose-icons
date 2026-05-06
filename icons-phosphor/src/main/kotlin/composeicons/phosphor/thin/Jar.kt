package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorThinIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 52.23v-20.23c0-6.627-5.373-12-12-12h-80C81.373 20 76 25.373 76 32v20.23C57.782 54.267 44.004 69.668 44 88v112c0 19.882 16.118 36 36 36h96c19.882 0 36-16.118 36-36v-112C211.996 69.668 198.218 54.267 180 52.23ZM172 32v20h-24v-24h20c2.209 0 4 1.791 4 4ZM116 52v-24h24v24ZM88 28h20v24h-24v-20c0-2.209 1.791-4 4-4ZM204 200c0 15.464-12.536 28-28 28h-96C64.536 228 52 215.464 52 200v-112C52 72.536 64.536 60 80 60h96c15.464 0 28 12.536 28 28Z"),
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
        return _jar!!
    }

private var _jar: ImageVector? = null
