package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CapsuleHorizontal: ImageVector
    get() {
        if (_capsuleHorizontal != null) return _capsuleHorizontal!!
        _capsuleHorizontal = tablerOutlineIcon(
            name = "CapsuleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 12C3 8.686 5.686 6 9 6h6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-6C5.686 18 3 15.314 3 12"),
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
        return _capsuleHorizontal!!
    }

private var _capsuleHorizontal: ImageVector? = null
