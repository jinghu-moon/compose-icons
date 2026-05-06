package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bolt: ImageVector
    get() {
        if (_bolt != null) return _bolt!!
        _bolt = tablerFilledIcon(
            name = "Bolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 2l.018 .001 .016 .001 .083 .005 .011 .002h.011l.038 .009 .052 .008 .016 .006 .011 .001 .029 .011 .052 .014 .019 .009 .015 .004 .028 .014 .04 .017 .021 .012 .022 .01 .023 .015 .031 .017 .034 .024 .018 .011 .013 .012 .024 .017 .038 .034 .022 .017 .008 .01 .014 .012 .036 .041 .026 .027 .006 .009c.12 .147 .196 .322 .218 .513l.001 .012 .002 .041L14 3v6h5c.357-0 .686 .19 .865 .498 .179 .309 .18 .689 .003 .999l-.06 .091L11.808 21.588C11.24 22.371 10 21.968 10 21v-6h-5c-.357 0-.686-.19-.865-.498-.179-.309-.18-.689-.003-.999l.06-.091L12.192 2.412l.01-.013 .018-.024 .033-.038 .018-.022 .009-.008 .013-.014 .04-.036 .028-.026 .008-.006c.117-.096 .255-.164 .402-.199l.011-.001 .027-.005 .074-.013 .011-.001 .041-.002Z"),
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
        return _bolt!!
    }

private var _bolt: ImageVector? = null
