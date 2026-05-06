package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorThinIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 196h-12v-28c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v28h-120v-140c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-6.627-5.373-12-12-12h-176C33.373 44 28 49.373 28 56v140h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM164 172h56v24h-56Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
