package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.IroningSteam: ImageVector
    get() {
        if (_ironingSteam != null) return _ironingSteam!!
        _ironingSteam = tablerFilledIcon(
            name = "IroningSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1")
            addPathData("M16.459 3c1.955 0 3.624 1.414 3.945 3.343l.577 3.464 .81 4.865c.096 .579-.067 1.172-.447 1.62-.38 .448-.937 .707-1.524 .708h-16.82C2.448 17 2 16.552 2 16 2 11.582 5.582 8 10 8h8.652L18.432 6.671C18.281 5.766 17.535 5.08 16.621 5.006L16.459 5h-7.459C8.448 5 8 4.552 8 4 8 3.448 8.448 3 9 3Z")
            addPathData("M7.106 18.553c.256-.476 .844-.661 1.327-.42 .483 .242 .687 .823 .461 1.314l-1 2c-.256 .476-.844 .661-1.327 .42-.483-.242-.687-.823-.461-1.314Z")
            addPathData("M15.553 18.106c.494-.247 1.094-.047 1.341 .447l1 2c.227 .49 .023 1.072-.461 1.314-.483 .242-1.071 .056-1.327-.42l-1-2c-.247-.494-.047-1.094 .447-1.341")
        }
        return _ironingSteam!!
    }

private var _ironingSteam: ImageVector? = null
