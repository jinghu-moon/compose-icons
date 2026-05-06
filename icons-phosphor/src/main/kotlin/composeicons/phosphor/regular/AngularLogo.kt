package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorRegularIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.08 64.62l-96-40c-1.969-.83-4.191-.83-6.16 0L28.92 64.62c-3.339 1.393-5.328 4.854-4.85 8.44l16 120c.349 2.629 1.979 4.913 4.35 6.1l80 40c2.253 1.128 4.907 1.128 7.16 0l80-40c2.371-1.187 4.001-3.471 4.35-6.1l16-120c.478-3.586-1.511-7.047-4.85-8.44ZM200.63 186.74 128 223.06 55.37 186.74 40.74 77 128 40.67 215.26 77ZM121 84.12 81 156.12c-2.143 3.866-.746 8.737 3.12 10.88 3.866 2.143 8.737 .746 10.88-3.12L106 144h44l11 19.88c2.143 3.866 7.014 5.263 10.88 3.12 3.866-2.143 5.263-7.014 3.12-10.88L135 84.12c-1.409-2.547-4.09-4.127-7-4.127-2.91 0-5.591 1.58-7 4.127ZM141.07 128h-26.14L128 104.47Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
