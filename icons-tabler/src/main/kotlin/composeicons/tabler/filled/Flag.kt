package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = tablerFilledIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5c0-.269 .108-.526 .3-.714C6.562 2.069 10.158 1.992 12.513 4.11l.351 .328c1.509 1.322 3.763 1.322 5.272 0l.249-.227c.61-.483 1.527-.097 1.61 .676L20 5v9c-0 .269-.108 .526-.3 .714-2.262 2.217-5.858 2.294-8.213 .176l-.351-.328C9.678 13.284 7.513 13.236 6 14.448v6.552c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L4 21v-16Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
