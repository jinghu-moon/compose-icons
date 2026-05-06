package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorThinIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM60 66.07C74.558 81.952 83.024 102.474 83.9 124h-47.81C37.009 102.481 45.474 81.973 60 66.07ZM132 124v-87.91c21.706 .93 42.376 9.542 58.32 24.3C174.271 77.787 164.968 100.347 164.09 124ZM124 124h-32.09C91.032 100.347 81.729 77.787 65.68 60.39 81.624 45.632 102.294 37.02 124 36.09ZM83.9 132C83.024 153.526 74.558 174.048 60 189.93 45.474 174.027 37.009 153.519 36.09 132ZM91.9 132h32.1v87.91c-21.706-.93-42.376-9.542-58.32-24.3C81.729 178.213 91.032 155.653 91.91 132ZM132 132h32.09c.878 23.653 10.181 46.213 26.23 63.61C174.376 210.368 153.706 218.98 132 219.91ZM172.1 132h47.81c-.919 21.519-9.384 42.027-23.91 57.93C181.442 174.048 172.976 153.526 172.1 132ZM172.1 124c.876-21.526 9.342-42.048 23.9-57.93 14.526 15.903 22.991 36.411 23.91 57.93Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
