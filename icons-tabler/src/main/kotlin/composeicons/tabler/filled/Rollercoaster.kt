package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Rollercoaster: ImageVector
    get() {
        if (_rollercoaster != null) return _rollercoaster!!
        _rollercoaster = tablerFilledIcon(
            name = "Rollercoaster",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 8c.552 0 1 .448 1 1 0 .552-.448 1-1 1v11c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-11h-1.675q-.163 0-.325 .007v10.993c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-10.645c-.709 .223-1.382 .546-2 .959v9.686c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-7.748c-.451 .632-.805 1.328-1.051 2.064l-.735 2.205c-.063 .187-.134 .372-.213 .553L9 21c0 .552-.448 1-1 1C7.448 22 7 21.552 7 21l.001-.364C5.855 21.521 4.448 22.001 3 22 2.448 22 2 21.552 2 21c0-.552 .448-1 1-1 1.958-0 3.697-1.253 4.316-3.111l.735-2.205C9.382 10.692 13.117 8 17.325 8ZM10.78 4.375l2 2.5c.169 .211 .246 .482 .212 .751-.034 .269-.175 .512-.392 .674l-4 3c-.248 .186-.569 .247-.868 .164L5.932 10.964c-.397-.111-.686-.454-.727-.864l-.2-2c-.035-.348 .115-.69 .395-.9l4-3c.432-.324 1.043-.246 1.38 .175M20 2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-5C14.448 7 14 6.552 14 6v-3c0-.552 .448-1 1-1Z"),
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
        return _rollercoaster!!
    }

private var _rollercoaster: ImageVector? = null
