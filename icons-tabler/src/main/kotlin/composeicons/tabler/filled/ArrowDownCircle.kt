package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) return _arrowDownCircle!!
        _arrowDownCircle = tablerFilledIcon(
            name = "ArrowDownCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c1.462-.001 2.711 1.052 2.958 2.493C15.206 5.933 14.378 7.343 13 7.829v10.755l1.293-1.291c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.024 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L12 22l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L11 18.586v-10.757C9.624 7.34 8.8 5.933 9.046 4.494 9.293 3.055 10.54 2.002 12 2"),
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
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
