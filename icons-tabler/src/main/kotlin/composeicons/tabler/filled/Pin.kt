package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = tablerFilledIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.113 3.21l.094 .083 5.5 5.5c.348 .35 .389 .902 .095 1.3-.294 .397-.833 .521-1.27 .29l-3.172 3.171-1.424 3.797c-.038 .1-.091 .194-.158 .277l-.07 .08-1.5 1.5c-.357 .356-.922 .391-1.32 .082l-.095-.083L9 16.415 5.207 20.207c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L7.585 15 4.793 12.207c-.356-.356-.392-.922-.083-1.32l.083-.094L6.293 9.293c.075-.076 .163-.139 .258-.187l.098-.042L10.445 7.639 13.616 4.469c-.223-.417-.124-.932 .238-1.237 .362-.304 .887-.314 1.259-.023Z"),
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
        return _pin!!
    }

private var _pin: ImageVector? = null
