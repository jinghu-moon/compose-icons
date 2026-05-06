package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge3D: ImageVector
    get() {
        if (_badge3D != null) return _badge3D!!
        _badge3D = tablerFilledIcon(
            name = "Badge3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM8.5 8h-1.5C6.448 8 6 8.448 6 9c0 .552 .448 1 1 1h1.5c.259-0 .475 .197 .499 .455 .023 .258-.154 .491-.409 .537L8.5 11h-.5c-1.287 0-1.332 1.864-.133 1.993L8 13h.5c.276 0 .5 .224 .5 .5C9 13.776 8.776 14 8.5 14h-1.5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1.5C9.881 16 11 14.881 11 13.5l-.005-.164c-.031-.474-.197-.929-.477-1.312L10.499 12l.019-.024c.556-.76 .638-1.768 .212-2.607C10.303 8.529 9.442 8 8.5 8M15 8h-1c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h1c1.657 0 3-1.343 3-3v-2C18 9.343 16.657 8 15 8M15 10c.552 0 1 .448 1 1v2c-0 .507-.38 .934-.883 .993L15 14Z"),
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
        return _badge3D!!
    }

private var _badge3D: ImageVector? = null
