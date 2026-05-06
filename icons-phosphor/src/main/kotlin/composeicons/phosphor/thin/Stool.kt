package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorThinIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 64v-24c0-6.627-5.373-12-12-12h-112C65.373 28 60 33.373 60 40v24c0 6.627 5.373 12 12 12h11.32L60.05 223.38c-.179 1.055 .073 2.138 .699 3.006 .626 .868 1.573 1.449 2.631 1.614 .206 .014 .414 .014 .62 0 1.988 .024 3.692-1.416 4-3.38L76.26 172h103.48l8.31 52.62c.305 1.945 1.981 3.379 3.95 3.38 .211-.002 .421-.018 .63-.05 2.181-.343 3.671-2.389 3.33-4.57L172.68 76h11.32c6.627 0 12-5.373 12-12ZM68 64v-24c0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4v24c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4ZM178.48 164h-101L91.38 76h73.16Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
