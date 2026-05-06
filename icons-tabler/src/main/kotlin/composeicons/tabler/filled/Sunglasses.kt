package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = tablerFilledIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 3c.552 0 1 .448 1 1C9 4.552 8.552 5 8 5h-1.257L4.343 13h5.657c.552 0 1 .448 1 1v1h2v-1c0-.552 .448-1 1-1h5.656L17.256 5h-1.256c-.507-0-.934-.38-.993-.883L15 4c0-.552 .448-1 1-1h2c.442-0 .831 .29 .958 .713l3.01 10.036 .022 .112 .008 .08L22 16.5c-.001 2.388-1.866 4.359-4.25 4.492C15.367 21.125 13.294 19.373 13.028 17h-2.056c-.266 2.373-2.339 4.125-4.722 3.992C3.866 20.859 2.001 18.888 2 16.5v-2.518l.004-.071 .014-.103 .018-.076L5.042 3.712C5.169 3.289 5.559 3 6 3Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
