package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) return _playCardStar!!
        _playCardStar = tablerOutlineIcon(
            name = "PlayCardStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2")
            addPathData("M8 6h.01")
            addPathData("M16 18h.01")
            addPathData("M11.75 14.112l-1.63 .853c-.098 .051-.217 .042-.307-.023-.09-.065-.135-.175-.118-.284l.31-1.808L8.688 11.57c-.08-.078-.109-.194-.074-.3 .035-.106 .127-.183 .237-.199l1.82-.264 .815-1.644c.05-.1 .152-.164 .264-.164 .112 0 .214 .063 .263 .164l.814 1.644 1.82 .264c.111 .015 .203 .092 .238 .198 .035 .106 .006 .223-.074 .301l-1.318 1.28 .31 1.807c.019 .11-.026 .221-.116 .287-.09 .066-.21 .074-.309 .021l-1.628-.853")
        }
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
