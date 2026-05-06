package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MessageCircle: ImageVector
    get() {
        if (_messageCircle != null) return _messageCircle!!
        _messageCircle = tablerFilledIcon(
            name = "MessageCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.821 4.91C9.72 2.145 15.289 2.371 18.894 5.445c3.667 3.129 4.168 8.238 1.152 11.898-2.841 3.447-7.965 4.583-12.231 2.805l-.233-.101-4.374 .931-.04 .006-.035 .007h-.018l-.022 .005h-.038L3.022 21l-.021-.001L2.978 21l-.033-.003h-.035l-.022-.004-.022-.002-.035-.007-.034-.005-.016-.004-.024-.005-.049-.016-.024-.005-.011-.005-.022-.007-.045-.02-.03-.012-.011-.006-.014-.006-.031-.018-.045-.024-.016-.011-.037-.026-.04-.027-.002-.004-.013-.009-.043-.04-.025-.02-.006-.007-.056-.062-.013-.014-.011-.014-.039-.056-.014-.019-.005-.01-.042-.073-.007-.012-.004-.008-.007-.012-.014-.038-.02-.042-.004-.016-.004-.01-.017-.061-.007-.018-.002-.015-.005-.019-.005-.033-.008-.042-.002-.031-.003-.01v-.016L2 20.022l.001-.036 .001-.023 .002-.053 .004-.025v-.019l.008-.035 .005-.034 .005-.02 .004-.02 .018-.06 .003-.013L3.201 16.234l-.022-.037C.969 12.45 1.97 7.806 5.592 5.078Z"),
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
        return _messageCircle!!
    }

private var _messageCircle: ImageVector? = null
