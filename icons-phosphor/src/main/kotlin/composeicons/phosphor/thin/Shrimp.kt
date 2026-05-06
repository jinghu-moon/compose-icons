package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorThinIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 116c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM219.93 82.65C218.467 123.542 184.918 155.951 144 156h-32c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16h56c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-52v24h36c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-56C54.026 228 20 193.974 20 152 20 110.026 54.026 76 96 76h116c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16h-84C116.954 44 108 35.046 108 24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 6.627 5.373 12 12 12h84c11.701 .003 21.694 8.443 23.655 19.978 1.961 11.535-4.682 22.803-15.725 26.672ZM50.47 202.46l37.78-27C88.086 174.314 88.002 173.158 88 172c-.005-3.304 .676-6.573 2-9.6L30.1 135.17c-6.234 24.47 1.606 50.38 20.36 67.29ZM90.9 183.46 57 207.64c11.411 8.05 25.035 12.368 39 12.36h12v-24.34c-7.275-1.243-13.578-5.754-17.1-12.24ZM108 148.34v-64.34h-12c-28.09 .035-53.277 17.315-63.42 43.51l61.89 28.13c3.585-3.855 8.34-6.42 13.53-7.3ZM211.88 84h-95.88v64h28c35.985-.041 65.723-28.08 67.88-64Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
