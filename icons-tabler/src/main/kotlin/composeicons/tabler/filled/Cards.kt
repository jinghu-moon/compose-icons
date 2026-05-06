package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = tablerFilledIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.348 3.169 3.198 6.282C2.201 6.725 1.742 7.885 2.168 8.89L7.088 20.785c.198 .488 .584 .876 1.072 1.076 .487 .2 1.034 .195 1.518-.013l7.142-3.11c1-.441 1.462-1.604 1.036-2.611L12.936 4.233c-.198-.488-.584-.875-1.071-1.075-.487-.2-1.034-.196-1.517 .011Z")
            addPathData("M16 3c1.047-0 1.917 .806 1.995 1.85L18 5v3.5c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L16 8.5v-3.5h-1c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L15 3h1Z")
            addPathData("M19.08 5.61c.216-.508 .802-.745 1.31-.53 .257 .108 .505 .21 .769 .314 .962 .408 1.447 1.489 1.114 2.479l-.056 .146-2.298 5.374c-.21 .484-.76 .722-1.256 .543-.496-.179-.769-.712-.622-1.219l.04-.11L20.377 7.236l-.366-.148-.402-.167c-.244-.104-.438-.3-.537-.546-.099-.246-.097-.522 .007-.766Z")
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
