package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFlipboard: ImageVector
    get() {
        if (_brandFlipboard != null) return _brandFlipboard!!
        _brandFlipboard = tablerOutlineIcon(
            name = "BrandFlipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.973 3.000 L 20.027 3.000 C 20.564 3.000 21.000 3.436 21.000 3.973 L 21.000 8.025 C 21.000 8.562 20.564 8.998 20.027 8.998 L 15.002 8.998 L 15.002 13.829 C 15.002 14.477 14.477 15.002 13.829 15.002 L 9.000 15.002 L 9.000 20.027 C 9.000 20.285 8.897 20.533 8.715 20.715 C 8.532 20.898 8.284 21.000 8.026 21.000 L 3.973 21.000 C 3.436 21.000 3.000 20.564 3.000 20.027 L 3.000 3.973 C 3.000 3.436 3.436 3.000 3.973 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandFlipboard!!
    }

private var _brandFlipboard: ImageVector? = null
