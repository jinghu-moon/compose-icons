package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitHeight: ImageVector
    get() {
        if (_arrowAutofitHeight != null) return _arrowAutofitHeight!!
        _arrowAutofitHeight = tablerFilledIcon(
            name = "ArrowAutofitHeight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.879 3.879c-1.171 1.171-1.171 3.071 0 4.242l.09 .085 .094 .083 .096 .08 .158 .115c.471 .319 1.022 .497 1.59 .515L15 8.998v6.003h-.092c-1.196 .036-2.256 .78-2.698 1.893-.441 1.113-.179 2.381 .668 3.227 .147 .147 .192 .368 .112 .56-.079 .192-.267 .318-.475 .318L6 21C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h6.514c.208-0 .396 .125 .476 .317 .08 .192 .036 .414-.111 .562")
            addPathData("M18 13c.552 0 1 .448 1 1v4.584l1.293-1.291c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.024 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L18 22l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L17 18.586v-4.586c0-.552 .448-1 1-1")
            addPathData("M17.852 2.011l.058-.007L18 2l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L19 5.415v4.585c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4.585L15.707 6.707c-.356 .356-.922 .392-1.32 .083l-.094-.083c-.39-.39-.39-1.023 0-1.414L17.293 2.293q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z")
        }
        return _arrowAutofitHeight!!
    }

private var _arrowAutofitHeight: ImageVector? = null
