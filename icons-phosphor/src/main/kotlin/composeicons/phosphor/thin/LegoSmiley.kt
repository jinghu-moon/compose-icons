package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorThinIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 120c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM156 104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM153.87 148.62c-15.841 9.848-35.899 9.848-51.74 0-1.867-1.13-4.294-.555-5.456 1.292-1.162 1.847-.63 4.284 1.196 5.478 18.445 11.486 41.815 11.486 60.26 0 1.746-1.224 2.225-3.603 1.088-5.408-1.137-1.804-3.49-2.399-5.348-1.352ZM212 80v96c-.001 13.918-10.225 25.722-24 27.71v20.29c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12v-20.29C54.225 201.722 44.001 189.918 44 176v-96C44 64.536 56.536 52 72 52h20v-20c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12v20h20c15.464 0 28 12.536 28 28ZM100 52h56v-20c0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4ZM180 224v-20h-104v20c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4ZM204 80C204 68.954 195.046 60 184 60h-112C60.954 60 52 68.954 52 80v96c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
