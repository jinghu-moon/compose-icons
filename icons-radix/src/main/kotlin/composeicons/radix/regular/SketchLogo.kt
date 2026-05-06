package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = radixIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.037 1.177l.077 .017c.075 .024 .141 .071 .188 .136l3 4.1c.006 .008 .01 .017 .016 .025 .003 .005 .006 .01 .009 .015 .007 .012 .012 .024 .018 .036 .004 .009 .008 .018 .011 .027 .003 .01 .005 .02 .008 .03 .002 .009 .004 .018 .006 .027 .003 .016 .003 .031 .004 .047 0 .005 .002 .009 .002 .014v.011c-.002 .081-.031 .161-.085 .228L7.79 13.788c-.071 .087-.178 .137-.29 .137-.112 0-.219-.05-.29-.137L.71 5.888C.704 5.881 .699 5.873 .693 5.865 .691 5.862 .689 5.859 .687 5.855 .648 5.796 .627 5.729 .625 5.661v-.011c0-.005 .001-.009 .001-.014C.627 5.618 .628 5.6 .632 5.582 .633 5.576 .634 5.57 .636 5.564 .64 5.548 .644 5.532 .65 5.516 .653 5.51 .655 5.504 .657 5.498 .665 5.481 .674 5.464 .685 5.448 .687 5.444 .689 5.44 .691 5.436 .693 5.434 .695 5.431 .697 5.429L3.697 1.329l.053-.059c.059-.052 .133-.086 .213-.094L7.463 .827h.074l3.5 .35ZM5.151 6.025l2.348 6.083L9.849 6.025h-4.697ZM1.794 6.025l4.963 6.031L4.224 6.067 4.211 6.025h-2.417ZM10.789 6.025c-.004 .014-.007 .028-.013 .042L8.242 12.056 13.204 6.025h-2.415ZM10.922 5.275h.003v-.025l-.003 .025ZM5.659 5.275h3.682L7.5 2.182 5.659 5.275ZM4.429 1.883l.396 3.327L6.956 1.63 4.429 1.883ZM10.175 5.21l.396-3.327L8.043 1.63l2.132 3.58ZM10.934 5.176h2.254L11.249 2.525l-.315 2.65ZM1.812 5.176h2.255L3.75 2.524 1.812 5.176Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
