package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHackerrank: ImageVector
    get() {
        if (_brandHackerrank != null) return _brandHackerrank!!
        _brandHackerrank = tablerOutlineIcon(
            name = "BrandHackerrank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.484 5.667C18.338 4.763 16.134 3.273 12.987 2.238 12.503 2.079 12.262 2 11.947 2c-.314 0-.556 .08-1.04 .238C7.76 3.273 5.557 4.763 4.411 5.668c-.402 .317-.604 .476-.797 .816-.194 .341-.233 .62-.309 1.178C3.108 9.1 3.006 10.549 3 12c0 1.742 .165 3.317 .305 4.338 .076 .558 .115 .837 .309 1.178 .193 .34 .395 .5 .797 .817 1.146 .904 3.35 2.394 6.497 3.429 .483 .159 .725 .238 1.04 .238 .314 0 .555-.08 1.04-.238 3.146-1.035 5.35-2.525 6.496-3.43 .402-.317 .603-.476 .797-.816 .194-.341 .232-.62 .309-1.178 .14-1.021 .305-2.596 .305-4.338 0-1.742-.165-3.317-.305-4.338-.077-.558-.115-.837-.309-1.178-.194-.341-.395-.5-.797-.817")
            addPathData("M9 8v7")
            addPathData("M9 12h6")
            addPathData("M16 16h-2l1 1 1-1")
            addPathData("M8 8h2L9 7 8 8")
            addPathData("M15 9v7")
        }
        return _brandHackerrank!!
    }

private var _brandHackerrank: ImageVector? = null
