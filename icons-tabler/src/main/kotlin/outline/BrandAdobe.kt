package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobe: ImageVector
    get() {
        if (_brandAdobe != null) return _brandAdobe!!
        _brandAdobe = tablerOutlineIcon(
            name = "BrandAdobe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.893 4.514 L 20.870 18.514 C 21.002 18.747 21.035 19.023 20.960 19.279 C 20.886 19.536 20.712 19.753 20.476 19.879 C 20.323 19.963 20.151 20.006 19.976 20.006 L 16.500 20.006 L 12.000 12.006 L 9.500 16.006 L 11.000 16.006 L 13.000 20.006 L 4.023 20.006 C 3.458 20.006 3.000 19.556 3.000 19.006 C 3.000 18.835 3.045 18.666 3.130 18.516 L 11.107 4.523 C 11.292 4.205 11.632 4.010 12.000 4.010 C 12.368 4.010 12.708 4.205 12.893 4.523 L 12.893 4.514"),
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
        return _brandAdobe!!
    }

private var _brandAdobe: ImageVector? = null
