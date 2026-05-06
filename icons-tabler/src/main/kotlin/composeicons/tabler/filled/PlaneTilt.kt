package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) return _planeTilt!!
        _planeTilt = tablerFilledIcon(
            name = "PlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.107 2.893c1.189 1.186 1.194 3.11 .012 4.302L18.64 9.759l2.309 6.925c.118 .356 .028 .748-.235 1.016l-2.5 2.55c-.223 .227-.541 .335-.856 .29-.315-.045-.59-.238-.74-.519L13.754 14.661 12 16.414v2.586c-0 .265-.105 .52-.293 .707l-2 2c-.245 .245-.599 .346-.937 .267-.337-.079-.61-.328-.719-.657L6.71 17.29 2.685 15.948c-.329-.11-.578-.382-.657-.719-.08-.337 .021-.692 .266-.937l2-2C4.481 12.105 4.735 12 5 12h2.586L9.343 10.243 4.026 7.38C3.748 7.23 3.557 6.958 3.511 6.645c-.046-.313 .059-.628 .282-.852L6.293 3.293c.268-.268 .664-.362 1.023-.242l6.925 2.309L16.793 2.893c.572-.572 1.348-.894 2.157-.894 .809 0 1.585 .321 2.157 .894"),
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
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
