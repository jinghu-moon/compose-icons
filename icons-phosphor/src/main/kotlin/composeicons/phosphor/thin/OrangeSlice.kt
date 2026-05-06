package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorThinIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 84h-240C5.791 84 4 85.791 4 88c0 68.483 55.517 124 124 124 68.483 0 124-55.517 124-124 0-2.209-1.791-4-4-4ZM71.53 150.13 124 97.66v74.24c-19.494-.916-38.054-8.616-52.47-21.77ZM65.87 144.47C52.716 130.054 45.016 111.494 44.1 92h74.24ZM132 97.66l52.47 52.47C170.054 163.284 151.494 170.984 132 171.9ZM190.13 144.47 137.66 92h74.24c-.916 19.494-8.616 38.054-21.77 52.47ZM128 204C65.522 203.927 14.297 154.439 12.07 92h24c2.177 49.18 42.682 87.932 91.91 87.932 49.228 0 89.733-38.752 91.91-87.932h24C241.663 154.423 190.463 203.905 128 204Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
