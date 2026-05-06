package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorThinIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 12C90.461 12.039 60.039 42.461 60 80v96c0 6.627 5.373 12 12 12h36v44c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20v-44h36c6.627 0 12-5.373 12-12v-96C195.961 42.461 165.539 12.039 128 12ZM140 232c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-44h24ZM188 176c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-96C68 46.863 94.863 20 128 20c33.137 0 60 26.863 60 60ZM116 72v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM148 72v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
