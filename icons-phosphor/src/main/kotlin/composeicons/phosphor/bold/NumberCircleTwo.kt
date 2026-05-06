package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorBoldIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM156.75 125.67 128 164h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-4.545 0-8.7-2.568-10.733-6.633-2.033-4.065-1.594-8.93 1.133-12.567l43.17-57.56c2.845-3.774 3.21-8.865 .933-13.006-2.277-4.141-6.773-6.56-11.483-6.179-4.71 .381-8.758 3.492-10.34 7.945-2.209 6.249-9.066 9.524-15.315 7.315C95.116 105.106 91.841 98.249 94.05 92c1.233-3.468 2.986-6.729 5.2-9.67 11.968-15.878 34.542-19.048 50.42-7.08 15.878 11.968 19.048 34.542 7.08 50.42Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
