package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cardboards: ImageVector
    get() {
        if (_cardboards != null) return _cardboards!!
        _cardboards = tablerFilledIcon(
            name = "Cardboards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 5c1.657 0 3 1.343 3 3v8.5C22 18.433 20.433 20 18.5 20h-1.062c-1.214-.002-2.361-.556-3.118-1.504L12.78 16.576c-.19-.237-.477-.374-.78-.374-.303 0-.59 .138-.78 .374L9.682 18.493C8.924 19.444 7.776 19.998 6.56 20h-1.06C3.567 20 2 18.433 2 16.5v-8.5C2 6.343 3.343 5 5 5ZM8 10C6.953 10 6.083 10.806 6.005 11.85L6 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 10.895 9.105 10 8 10M16 10c-1.047-0-1.917 .806-1.995 1.85L14 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2"),
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
        return _cardboards!!
    }

private var _cardboards: ImageVector? = null
