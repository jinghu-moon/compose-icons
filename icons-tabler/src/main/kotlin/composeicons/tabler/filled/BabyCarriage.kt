package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = tablerFilledIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.5 2c1.786 0 3.493 .735 4.721 2.032 1.228 1.297 1.867 3.042 1.769 4.826 .021 .153 .007 .309-.04 .456-.284 2.237-1.705 4.167-3.757 5.103l.532 1.595Q17.86 16 18 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3l.005-.176c.044-.744 .362-1.444 .894-1.966l-.634-1.903Q14.888 15 14.5 15h-2.675q-.547 0-1.076-.083l-.648 1.941c.972 .953 1.18 2.441 .507 3.625-.673 1.183-2.058 1.765-3.375 1.417C5.917 21.552 5 20.361 5 19l.004-.176c.048-.812 .422-1.569 1.039-2.099 .616-.53 1.422-.787 2.231-.713l.56-1.682C7.106 13.514 5.786 12.026 5.182 10.213L3.78 6h-1.78C1.493 6 1.066 5.62 1.007 5.117L1 5C1 4.448 1.448 4 2 4h2.5c.431-0 .813 .275 .949 .684L6.553 8h6.447v-5c0-.552 .448-1 1-1ZM8 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C9 18.448 8.552 18 8 18M18 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
