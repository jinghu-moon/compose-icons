package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorBoldIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 156c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM164 124c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84ZM85.34 102l36 24c4.032 2.69 9.288 2.69 13.32 0l36-24c5.523-3.678 7.018-11.137 3.34-16.66C170.322 79.817 162.863 78.322 157.34 82L128 101.58 98.66 82C93.137 78.322 85.678 79.817 82 85.34 78.322 90.863 79.817 98.322 85.34 102ZM154 167.12c-16.037-9.479-35.963-9.479-52 0-3.906 2.043-6.377 6.063-6.437 10.471-.06 4.407 2.302 8.493 6.151 10.641 3.849 2.148 8.566 2.013 12.286-.352 8.612-5.188 19.388-5.188 28 0 3.72 2.365 8.437 2.5 12.286 .352 3.849-2.148 6.211-6.234 6.151-10.641-.06-4.407-2.531-8.427-6.437-10.471Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
