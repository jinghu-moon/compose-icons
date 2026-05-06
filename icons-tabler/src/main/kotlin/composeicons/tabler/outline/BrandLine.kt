package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLine: ImageVector
    get() {
        if (_brandLine != null) return _brandLine!!
        _brandLine = tablerOutlineIcon(
            name = "BrandLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 10.663C21 6.439 16.959 3 12 3 7.041 3 3 6.439 3 10.663c0 3.783 3.201 6.958 7.527 7.56 1.053 .239 .932 .644 .696 2.133-.039 .238-.184 .932 .777 .512 .96-.42 5.18-3.201 7.073-5.48C20.377 13.884 21 12.359 21 10.673v-.01"),
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
        return _brandLine!!
    }

private var _brandLine: ImageVector? = null
