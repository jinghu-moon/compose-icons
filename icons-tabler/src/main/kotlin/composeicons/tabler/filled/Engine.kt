package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = tablerFilledIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 4c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v1h.383c.757 .001 1.449 .429 1.787 1.106L16.62 11h.38v-1c0-.507 .38-.934 .883-.993L18 9h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2c-.552 0-1-.448-1-1v-1h-1v1c0 1.047-.806 1.917-1.85 1.995L14 20h-3.465c-.669 0-1.293-.334-1.664-.89L7.464 17h-1.464c-.507-0-.934-.38-.993-.883L5 16v-2h-1v2c0 .552-.448 1-1 1C2.448 17 2 16.552 2 16v-6C2 9.448 2.448 9 3 9c.552 0 1 .448 1 1v2h1v-2C5 9.448 5.448 9 6 9h1.584L9.293 7.293c.156-.155 .358-.255 .576-.284L10 7h1v-1h-1C9.448 6 9 5.552 9 5 9 4.448 9.448 4 10 4Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
