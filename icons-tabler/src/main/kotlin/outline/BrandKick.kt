package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKick: ImageVector
    get() {
        if (_brandKick != null) return _brandKick!!
        _brandKick = tablerOutlineIcon(
            name = "BrandKick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 4.000 L 9.000 4.000 L 9.000 8.000 L 12.000 8.000 L 12.000 6.000 L 14.000 6.000 L 14.000 4.000 L 20.000 4.000 L 20.000 8.000 L 18.000 8.000 L 18.000 10.000 L 16.000 10.000 L 16.000 14.000 L 18.000 14.000 L 18.000 16.000 L 20.000 16.000 L 20.000 20.000 L 14.000 20.000 L 14.000 18.000 L 12.000 18.000 L 12.000 16.000 L 9.000 16.000 L 9.000 20.000 L 4.000 20.000 L 4.000 4.000"),
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
        return _brandKick!!
    }

private var _brandKick: ImageVector? = null
