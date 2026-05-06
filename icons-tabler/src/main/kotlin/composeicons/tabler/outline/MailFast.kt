package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailFast: ImageVector
    get() {
        if (_mailFast != null) return _mailFast!!
        _mailFast = tablerOutlineIcon(
            name = "MailFast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7h3")
            addPathData("M3 11h2")
            addPathData("M9.02 8.801l-.6 6c-.056 .562 .128 1.122 .507 1.541 .379 .419 .918 .658 1.483 .658h7.98c1.027-0 1.888-.779 1.99-1.801l.6-6c.056-.562-.128-1.122-.507-1.541C20.094 7.239 19.555 7 18.99 7h-7.98C9.983 7 9.122 7.779 9.02 8.801")
            addPathData("M9.8 7.5l2.982 3.28c.535 .589 1.282 .941 2.077 .979 .795 .038 1.572-.242 2.161-.777L20.3 8")
        }
        return _mailFast!!
    }

private var _mailFast: ImageVector? = null
