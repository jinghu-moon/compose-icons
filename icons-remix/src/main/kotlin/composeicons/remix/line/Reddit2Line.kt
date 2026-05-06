package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Reddit2Line: ImageVector
    get() {
        if (_reddit2Line != null) return _reddit2Line!!
        _reddit2Line = remixIcon(
            name = "Reddit2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.597 2.287c1.149 0 2.08 .931 2.08 2.08 0 1.149-.931 2.08-2.08 2.08C15.614 6.447 14.792 5.765 14.574 4.849c-.873 .118-1.603 .689-1.942 1.47 1.722 .088 3.329 .534 4.687 1.256 .541-.281 1.155-.443 1.809-.443l.202 .005c2.08 .105 3.733 1.825 3.733 3.931 0 1.356-.689 2.544-1.727 3.25-.233 1.84-1.327 3.429-2.867 4.564-1.699 1.251-3.983 1.994-6.462 1.994C9.53 20.874 7.247 20.132 5.549 18.883 4.01 17.751 2.914 16.164 2.679 14.327 1.632 13.622 .938 12.429 .938 11.066 .938 8.893 2.701 7.131 4.874 7.131l.337 .015c.53 .046 1.029 .198 1.477 .433C8.124 6.813 9.839 6.356 11.676 6.307c.394-1.273 1.521-2.227 2.885-2.366 .197-.944 1.034-1.653 2.036-1.653ZM12.007 8.302C10.15 8.302 8.473 8.798 7.191 9.594l-.589 .366L6.053 9.536C5.764 9.313 5.417 9.17 5.038 9.138L4.874 9.131c-1.069 0-1.936 .867-1.937 1.936 0 .724 .399 1.356 .995 1.689l.122 .062 .558 .262 .018 .615c.037 1.328 .779 2.603 2.104 3.577 1.324 .974 3.182 1.602 5.273 1.603 2.093 0 3.952-.63 5.276-1.604 1.324-.975 2.065-2.251 2.101-3.58l.017-.613 .554-.264c.658-.313 1.108-.978 1.108-1.746C21.062 10.064 20.301 9.24 19.325 9.141l-.198-.01c-.441 0-.847 .149-1.176 .401l-.549 .421-.587-.364C15.535 8.796 13.86 8.302 12.007 8.302ZM12.007 15.251c1.02 0 1.996 .05 2.9 .142 .154 .015 .253 .176 .192 .319-.505 1.209-1.701 2.06-3.093 2.06C10.615 17.771 9.42 16.921 8.914 15.712c-.06-.143 .037-.304 .191-.319 .903-.092 1.882-.142 2.901-.142ZM8.128 11.049c.823 0 1.45 .883 1.401 1.939-.049 1.057-.755 1.44-1.578 1.44-.823 0-1.451-.574-1.402-1.631 .049-1.057 .756-1.749 1.579-1.749ZM15.887 11.049c.823 0 1.529 .692 1.578 1.749 .049 1.057-.578 1.631-1.401 1.631-.823-0-1.529-.385-1.578-1.441-.049-1.057 .578-1.938 1.401-1.938Z"),
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
        return _reddit2Line!!
    }

private var _reddit2Line: ImageVector? = null
