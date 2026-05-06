package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsUp: ImageVector
    get() {
        if (_circleChevronsUp != null) return _circleChevronsUp!!
        _circleChevronsUp = tablerFilledIcon(
            name = "CircleChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.867 2.001c5.495 0 9.96 4.432 10 9.926 .04 5.494-4.359 9.993-9.852 10.073h-.295C6.227 21.919 1.827 17.421 1.868 11.927c.04-5.494 4.505-9.926 10-9.926M12.708 11.293c-.391-.39-1.024-.39-1.414 0l-3 3c-.39 .391-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083L12 13.415l2.293 2.292c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402ZM12.708 7.293c-.391-.39-1.024-.39-1.414 0l-3 3c-.39 .391-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083L12 9.415l2.293 2.292c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402Z"),
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
        return _circleChevronsUp!!
    }

private var _circleChevronsUp: ImageVector? = null
