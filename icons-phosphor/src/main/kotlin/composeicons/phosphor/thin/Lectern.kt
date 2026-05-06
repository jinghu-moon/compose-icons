package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorThinIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.72 122.63l-40-80C200.701 38.559 196.544 35.988 192 36h-128c-4.548-.016-8.71 2.555-10.73 6.63l-40 80c-1.861 3.72-1.664 8.138 .522 11.677 2.186 3.539 6.048 5.693 10.208 5.693h100v72h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-72h100c4.159-0 8.022-2.155 10.208-5.693 2.186-3.539 2.384-7.957 .522-11.677ZM235.39 130.1c-.717 1.185-2.005 1.907-3.39 1.9h-208c-1.387 .001-2.676-.717-3.405-1.896-.729-1.18-.796-2.653-.175-3.894l40-80C61.098 44.855 62.484 43.999 64 44h128c1.516-.001 2.902 .855 3.58 2.21l40 80c.627 1.24 .555 2.717-.19 3.89ZM188 104c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
