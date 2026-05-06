package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorThinIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h64c1.061 .001 2.079-.42 2.83-1.17l26.34-26.34c1.58-1.521 4.08-1.521 5.66 0l26.34 26.34c.751 .75 1.769 1.171 2.83 1.17h64c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM228 192c0 2.209-1.791 4-4 4h-62.34L136.49 170.83c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L94.34 196h-62.34c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM80 100c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28C108 112.536 95.464 100 80 100ZM80 148C68.954 148 60 139.046 60 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM176 100c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM176 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
