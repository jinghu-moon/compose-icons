package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SendHorizontal: ImageVector
    get() {
        if (_sendHorizontal != null) return _sendHorizontal!!
        _sendHorizontal = lucideOutlineIcon(
            name = "SendHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.714 3.048c-.184-.09-.404-.058-.555 .081-.151 .139-.202 .355-.128 .546l2.843 7.627c.168 .45 .168 .946 0 1.396L3.032 20.325c-.073 .191-.023 .407 .128 .545 .151 .138 .37 .171 .554 .082L21.714 12.452c.175-.083 .286-.259 .286-.452 0-.193-.111-.369-.286-.452Z")
            addPathData("M6 12h16")
        }
        return _sendHorizontal!!
    }

private var _sendHorizontal: ImageVector? = null
