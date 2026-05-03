package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MilitaryRank: ImageVector
    get() {
        if (_militaryRank != null) return _militaryRank!!
        _militaryRank = tablerFilledIcon(
            name = "MilitaryRank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.555 2.168 L 18.555 6.168 C 18.833 6.354 19.000 6.666 19.000 7.000 L 19.000 19.000 C 19.000 20.657 17.657 22.000 16.000 22.000 L 8.000 22.000 C 6.343 22.000 5.000 20.657 5.000 19.000 L 5.000 7.000 C 5.000 6.666 5.167 6.354 5.445 6.168 L 11.445 2.168 C 11.781 1.944 12.219 1.944 12.555 2.168M 12.447 15.106 C 12.166 14.965 11.834 14.965 11.553 15.106 L 9.553 16.106 C 9.059 16.353 8.859 16.953 9.106 17.447 L 9.164 17.549 C 9.442 17.973 9.994 18.121 10.447 17.894 L 12.000 17.118 L 13.553 17.894 C 14.043 18.121 14.625 17.917 14.867 17.433 C 15.108 16.950 14.923 16.362 14.447 16.106 ZM 12.447 11.106 C 12.166 10.965 11.834 10.965 11.553 11.106 L 9.553 12.106 C 9.059 12.353 8.859 12.953 9.106 13.447 L 9.164 13.549 C 9.442 13.973 9.994 14.121 10.447 13.894 L 12.000 13.118 L 13.553 13.894 C 14.043 14.121 14.625 13.917 14.867 13.433 C 15.108 12.950 14.923 12.362 14.447 12.106 ZM 12.447 7.106 C 12.166 6.965 11.834 6.965 11.553 7.106 L 9.553 8.106 C 9.059 8.353 8.859 8.953 9.106 9.447 L 9.164 9.549 C 9.442 9.973 9.994 10.121 10.447 9.894 L 12.000 9.118 L 13.553 9.894 C 14.043 10.121 14.625 9.917 14.867 9.433 C 15.108 8.950 14.923 8.362 14.447 8.106 Z"),
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
        return _militaryRank!!
    }

private var _militaryRank: ImageVector? = null
