package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsDown: ImageVector
    get() {
        if (_circleChevronsDown != null) return _circleChevronsDown!!
        _circleChevronsDown = tablerFilledIcon(
            name = "CircleChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M9.707 12.293c-.251-.26-.623-.364-.973-.273-.35 .092-.623 .365-.714 .714-.092 .35 .013 .721 .273 .973l3 3c.391 .39 1.023 .39 1.414 0l3-3c.39-.391 .39-1.023 0-1.414l-.094-.083c-.398-.309-.964-.273-1.32 .083l-2.294 2.292ZM9.707 8.293C9.315 7.914 8.691 7.919 8.305 8.305c-.386 .386-.391 1.009-.012 1.402l3 3c.391 .39 1.023 .39 1.414 0l3-3c.39-.391 .39-1.023 0-1.414l-.094-.083c-.398-.309-.964-.273-1.32 .083l-2.294 2.292Z"),
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
        return _circleChevronsDown!!
    }

private var _circleChevronsDown: ImageVector? = null
