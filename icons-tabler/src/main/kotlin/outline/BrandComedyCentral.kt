package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandComedyCentral: ImageVector
    get() {
        if (_brandComedyCentral != null) return _brandComedyCentral!!
        _brandComedyCentral = tablerOutlineIcon(
            name = "BrandComedyCentral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.343 17.657 C 8.467 20.781 13.532 20.781 16.657 17.657 C 19.781 14.533 19.781 9.467 16.657 6.343 C 13.532 3.219 8.467 3.219 5.343 6.343"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 13.828 9.172 C 12.684 8.028 10.964 7.685 9.469 8.304 C 7.974 8.923 6.999 10.382 6.999 12.000 C 6.999 13.618 7.974 15.077 9.469 15.696 C 10.964 16.315 12.684 15.972 13.828 14.828"),
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
        return _brandComedyCentral!!
    }

private var _brandComedyCentral: ImageVector? = null
