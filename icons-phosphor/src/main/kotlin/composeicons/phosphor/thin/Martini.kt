package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorThinIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 42.83c1.145-1.144 1.488-2.866 .868-4.361C235.079 36.973 233.619 35.999 232 36h-208c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361L124 145.66v66.34h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36v-66.34ZM33.66 44h188.68l-24 24h-140.68ZM128 138.34 65.66 76h124.68Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
