package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard3: ImageVector
    get() {
        if (_playCard3 != null) return _playCard3!!
        _playCard3 = tablerFilledIcon(
            name = "PlayCard3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12.5 8h-2.5C9.448 8 9 8.448 9 9c0 .552 .448 1 1 1h2.5c.259-0 .475 .197 .499 .455 .023 .258-.154 .491-.409 .537L12.5 11h-1.5c-1.287 0-1.332 1.864-.133 1.993L11 13h1.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-2.5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2.5C13.881 16 15 14.881 15 13.5l-.005-.164c-.031-.474-.197-.929-.477-1.312L14.499 12l.019-.024c.556-.76 .638-1.768 .212-2.607C14.303 8.529 13.442 8 12.5 8M7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCard3!!
    }

private var _playCard3: ImageVector? = null
