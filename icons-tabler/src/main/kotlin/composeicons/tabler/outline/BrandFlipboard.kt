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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.973 3h16.054c.537 0 .973 .436 .973 .973v4.052c0 .537-.436 .973-.973 .973h-5.025v4.831c0 .648-.525 1.173-1.173 1.173h-4.829v5.025c0 .258-.103 .506-.285 .688-.183 .183-.43 .285-.689 .285h-4.053C3.436 21 3 20.564 3 20.027v-16.054C3 3.436 3.436 3 3.973 3"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandFlipboard!!
    }

private var _brandFlipboard: ImageVector? = null
