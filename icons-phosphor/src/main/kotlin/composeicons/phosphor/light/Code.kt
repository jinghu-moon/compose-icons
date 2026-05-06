package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorLightIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M67.84 92.61 25.37 128l42.47 35.39c1.667 1.366 2.473 3.521 2.112 5.646-.361 2.125-1.833 3.892-3.858 4.631-2.024 .739-4.29 .336-5.934-1.057l-48-40C10.792 131.47 10 129.781 10 128c0-1.781 .791-3.47 2.16-4.61l48-40c2.549-2.089 6.304-1.731 8.413 .801 2.109 2.532 1.782 6.29-.733 8.419ZM243.84 123.39l-48-40c-1.645-1.392-3.91-1.796-5.934-1.057-2.024 .739-3.497 2.507-3.858 4.631-.361 2.125 .445 4.28 2.112 5.646L230.63 128l-42.47 35.39c-1.667 1.366-2.473 3.521-2.112 5.646 .361 2.125 1.833 3.892 3.858 4.631 2.024 .739 4.29 .336 5.934-1.057l48-40c1.368-1.14 2.16-2.829 2.16-4.61 0-1.781-.791-3.47-2.16-4.61ZM162.05 34.39c-1.498-.543-3.151-.468-4.594 .21-1.443 .677-2.557 1.901-3.096 3.4l-64 176c-1.095 3.114 .531 6.528 3.64 7.64 .642 .23 1.318 .352 2 .36 2.524 0 4.778-1.578 5.64-3.95l64-176c.544-1.496 .471-3.146-.202-4.589-.673-1.442-1.892-2.558-3.388-3.101Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
