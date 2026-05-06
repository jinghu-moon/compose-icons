package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceCctv: ImageVector
    get() {
        if (_deviceCctv != null) return _deviceCctv!!
        _deviceCctv = tablerFilledIcon(
            name = "DeviceCctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 8v6c0 4.418-3.582 8-8 8C7.582 22 4 18.418 4 14v-6ZM12 10c-2.141 0-3.903 1.687-3.996 3.826L8 14c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4M12.01 13c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L12 15c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM2 5v-1C2 2.895 2.895 2 4 2h16c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2h-16C2.895 7 2 6.105 2 5"),
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
        return _deviceCctv!!
    }

private var _deviceCctv: ImageVector? = null
