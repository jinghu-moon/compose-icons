package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorThinIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 52.23v-20.23c0-6.627-5.373-12-12-12h-80C81.373 20 76 25.373 76 32v20.23C57.782 54.267 44.004 69.668 44 88v112c0 19.882 16.118 36 36 36h96c19.882 0 36-16.118 36-36v-112C211.996 69.668 198.218 54.267 180 52.23ZM148 28h20c2.209 0 4 1.791 4 4v20h-24ZM116 28h24v24h-24ZM84 32c0-2.209 1.791-4 4-4h20v24h-24ZM204 200c0 15.464-12.536 28-28 28h-96C64.536 228 52 215.464 52 200v-112C52 72.536 64.536 60 80 60h96c15.464 0 28 12.536 28 28ZM156 160c0 11.046-8.954 20-20 20h-4v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20h4v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c11.046 0 20 8.954 20 20Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
