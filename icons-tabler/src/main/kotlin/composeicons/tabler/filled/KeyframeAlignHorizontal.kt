package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_keyframeAlignHorizontal != null) return _keyframeAlignHorizontal!!
        _keyframeAlignHorizontal = tablerFilledIcon(
            name = "KeyframeAlignHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6c-.629 0-1.214 .301-1.606 .807L7.486 10.555c-.643 .85-.647 2.022-.011 2.876l2.919 3.762c.39 .505 .977 .807 1.606 .807 .629 0 1.214-.301 1.606-.807l2.908-3.748c.643-.85 .647-2.022 .011-2.876L13.606 6.807C13.225 6.303 12.632 6.005 12 6Z")
            addPathData("M5 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L5 13h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L3 11h2Z")
            addPathData("M21 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 13h-2c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L19 11h2Z")
        }
        return _keyframeAlignHorizontal!!
    }

private var _keyframeAlignHorizontal: ImageVector? = null
