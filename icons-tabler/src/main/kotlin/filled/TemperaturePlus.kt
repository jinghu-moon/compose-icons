package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TemperaturePlus: ImageVector
    get() {
        if (_temperaturePlus != null) return _temperaturePlus!!
        _temperaturePlus = tablerFilledIcon(
            name = "TemperaturePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 2.000 C 11.657 2.000 13.000 3.343 13.000 5.000 L 13.000 12.965 L 13.075 13.021 C 14.592 14.204 15.296 16.152 14.885 18.031 L 14.830 18.258 C 14.266 20.361 12.406 21.857 10.232 21.958 C 8.057 22.058 6.067 20.740 5.311 18.698 C 4.556 16.656 5.208 14.360 6.925 13.021 L 7.000 12.965 L 7.000 5.000 C 7.000 3.411 8.238 2.098 9.824 2.005 ZM 19.000 5.000 C 19.552 5.000 20.000 5.448 20.000 6.000 L 20.000 8.000 L 22.000 8.000 C 22.552 8.000 23.000 8.448 23.000 9.000 C 23.000 9.552 22.552 10.000 22.000 10.000 L 20.000 10.000 L 20.000 12.000 C 20.000 12.552 19.552 13.000 19.000 13.000 C 18.448 13.000 18.000 12.552 18.000 12.000 L 18.000 10.000 L 16.000 10.000 C 15.448 10.000 15.000 9.552 15.000 9.000 C 15.000 8.448 15.448 8.000 16.000 8.000 L 18.000 8.000 L 18.000 6.000 C 18.000 5.448 18.448 5.000 19.000 5.000M 10.000 4.000 C 9.448 4.000 9.000 4.448 9.000 5.000 L 9.000 9.000 L 11.000 9.000 L 11.000 5.000 C 11.000 4.448 10.552 4.000 10.000 4.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _temperaturePlus!!
    }

private var _temperaturePlus: ImageVector? = null
