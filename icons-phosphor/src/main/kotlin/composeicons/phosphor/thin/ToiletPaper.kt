package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorThinIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM236 120v88c0 6.627-5.373 12-12 12h-112c-6.627 0-12-5.373-12-12v-39.14C92.1 190.26 79 204 64 204 39.33 204 20 167.1 20 120 20 72.9 39.33 36 64 36h128c24.67 0 44 36.9 44 84ZM100 120C100 78.8 83.51 44 64 44 44.49 44 28 78.8 28 120c0 41.2 16.49 76 36 76 19.51 0 36-34.8 36-76ZM228 208v-84h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20C227 76.58 210.93 44 192.05 44h-109c14.29 12.8 24.14 39.76 24.9 72h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-19.95v84c0 2.209 1.791 4 4 4h112c2.209 0 4-1.791 4-4ZM176 116h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
