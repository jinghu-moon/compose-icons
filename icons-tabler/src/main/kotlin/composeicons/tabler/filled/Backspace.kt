package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = tablerFilledIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 5c1.047-0 1.917 .806 1.995 1.85L22 7v10c0 1.047-.806 1.917-1.85 1.995L20 19h-11c-.22 0-.433-.072-.608-.206l-.1-.087L3.255 13.667c-.809-.904-.847-2.25-.083-3.23l.12-.144 5-5c.156-.156 .359-.255 .577-.284L9 5h11ZM12.511 9.14c-.413-.246-.943-.163-1.261 .197-.318 .36-.335 .896-.04 1.276l.083 .094L12.585 12l-1.292 1.293-.083 .094c-.309 .398-.273 .964 .083 1.32 .356 .356 .922 .392 1.32 .083l.094-.083L14 13.415l1.293 1.292 .094 .083c.398 .309 .964 .273 1.32-.083 .356-.356 .392-.922 .083-1.32l-.083-.094L15.415 12l1.292-1.293 .083-.094c.309-.398 .273-.964-.083-1.32-.356-.356-.922-.392-1.32-.083l-.094 .083L14 10.585 12.707 9.293l-.094-.083-.102-.07Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
