package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stack3: ImageVector
    get() {
        if (_stack3 != null) return _stack3!!
        _stack3 = tablerFilledIcon(
            name = "Stack3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.894 17.553c.247 .494 .047 1.094-.447 1.341l-8 4c-.281 .141-.613 .141-.894 0l-8-4c-.476-.256-.661-.844-.42-1.327 .242-.483 .823-.687 1.314-.461L12 20.88l7.554-3.775c.494-.247 1.094-.047 1.341 .447M20.895 13.552c.247 .494 .047 1.094-.447 1.341l-8 4c-.281 .141-.613 .141-.894 0l-8-4c-.476-.256-.661-.844-.42-1.327 .242-.483 .823-.687 1.314-.461L12 16.88l7.554-3.775c.494-.247 1.094-.047 1.341 .447M20.895 9.552c.247 .494 .047 1.094-.447 1.341l-8 4c-.281 .141-.613 .141-.894 0l-8-4c-.476-.256-.661-.844-.42-1.327 .242-.483 .823-.687 1.314-.461L12 12.88 19.554 9.105c.494-.247 1.094-.047 1.341 .447M12.008 1q.056 0 .111 .007l.111 .02 .086 .024 .012 .006 .012 .002 .029 .014 .05 .019 .016 .009 .012 .005 8 4c.338 .17 .552 .516 .552 .894 0 .378-.214 .724-.552 .894l-8 4c-.281 .141-.613 .141-.894 0l-8-4C3.215 6.724 3.001 6.378 3.001 6c0-.378 .214-.724 .552-.894l8-4 .011-.005 .018-.01 .078-.032 .011-.002 .013-.006 .086-.024 .11-.02 .056-.005Z"),
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
        return _stack3!!
    }

private var _stack3: ImageVector? = null
