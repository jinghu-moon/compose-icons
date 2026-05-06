package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorThinIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 108.7v-36.7c0-6.627-5.373-12-12-12h-192C25.373 60 20 65.373 20 72v36.7c-4.79 1.693-7.994 6.22-8 11.3v48c0 6.627 5.373 12 12 12h12v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h168v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h12c6.627 0 12-5.373 12-12v-48c-.006-5.08-3.21-9.607-8-11.3ZM228 72v36h-12c-6.627 0-12 5.373-12 12v20h-72v-72h92c2.209 0 4 1.791 4 4ZM32 68h92v72h-72v-20c0-6.627-5.373-12-12-12h-12v-36c0-2.209 1.791-4 4-4ZM236 168c0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4v24c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4v-24c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
