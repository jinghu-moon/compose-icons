package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = tablerFilledIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3ZM10.707 13.293c-.251-.26-.623-.364-.973-.273-.35 .092-.623 .365-.714 .714-.092 .35 .013 .721 .273 .973l2 2c.391 .39 1.023 .39 1.414 0l2-2c.39-.391 .39-1.023 0-1.414l-.094-.083c-.398-.309-.964-.273-1.32 .083l-1.294 1.292ZM12.707 7.293c-.391-.39-1.023-.39-1.414 0l-2 2c-.39 .391-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083L12 9.415l1.293 1.292c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402Z"),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
