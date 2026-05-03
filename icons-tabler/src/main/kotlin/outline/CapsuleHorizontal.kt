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
                pathData = parseSvgPathData("M 3.000 12.000 C 3.000 8.686 5.686 6.000 9.000 6.000 L 15.000 6.000 C 18.314 6.000 21.000 8.686 21.000 12.000 C 21.000 15.314 18.314 18.000 15.000 18.000 L 9.000 18.000 C 5.686 18.000 3.000 15.314 3.000 12.000"),
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
