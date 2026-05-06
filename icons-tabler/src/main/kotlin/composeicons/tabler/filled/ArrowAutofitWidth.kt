package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitWidth: ImageVector
    get() {
        if (_arrowAutofitWidth != null) return _arrowAutofitWidth!!
        _arrowAutofitWidth = tablerFilledIcon(
            name = "ArrowAutofitWidth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.121 12.879c-1.171-1.171-3.071-1.171-4.242 0l-.085 .09-.083 .094-.08 .096-.115 .158c-.319 .471-.497 1.022-.515 1.59l.001 .093h-6.003v-.092C8.963 13.712 8.219 12.652 7.106 12.21c-1.113-.441-2.381-.179-3.227 .668-.147 .147-.368 .192-.56 .112-.192-.079-.318-.267-.318-.475L3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v6.514c0 .208-.125 .396-.317 .476-.192 .08-.414 .036-.562-.111")
            addPathData("M11 18c0 .552-.448 1-1 1h-4.584l1.291 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.39 .39-1.023 .39-1.414 0l-3-3c-.035-.035-.067-.072-.097-.112l-.071-.11-.054-.114-.035-.105-.03-.149L2 18l.003-.075 .017-.126 .03-.111 .044-.111 .052-.098 .067-.096 .08-.09L5.293 14.293c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402L5.414 17h4.586c.552 0 1 .448 1 1M21.989 17.852l.007 .058L22 18l-.003 .075-.017 .126-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973L18.585 19h-4.585c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h4.585L17.293 15.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0l3 3q.054 .053 .097 .112l.071 .11 .054 .114 .035 .105Z")
        }
        return _arrowAutofitWidth!!
    }

private var _arrowAutofitWidth: ImageVector? = null
