package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandReact: ImageVector
    get() {
        if (_brandReact != null) return _brandReact!!
        _brandReact = tablerOutlineIcon(
            name = "BrandReact",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.306 8.711C3.704 9.434 2 10.637 2 12c0 2.21 4.477 4 10 4 .773 0 1.526-.035 2.248-.102")
            addPathData("M17.692 15.289C20.295 14.567 22 13.363 22 12 22 9.79 17.523 8 12 8c-.773 0-1.526 .035-2.25 .102")
            addPathData("M6.305 15.287c-.676 2.615-.485 4.693 .695 5.373C8.913 21.765 12.703 18.783 15.464 14c.387-.67 .733-1.339 1.036-2")
            addPathData("M17.694 8.716C18.371 6.1 18.181 4.02 17 3.34 15.087 2.235 11.297 5.217 8.536 10c-.387 .67-.733 1.34-1.037 2")
            addPathData("M12 5.424C10.075 3.532 8.18 2.658 7 3.34 5.087 4.444 5.774 9.217 8.536 14c.386 .67 .793 1.304 1.212 1.896")
            addPathData("M12 18.574c1.926 1.893 3.821 2.768 5 2.086C18.913 19.556 18.226 14.783 15.464 10 15.089 9.35 14.684 8.717 14.252 8.103")
            addPathData("M11.5 12.866c.31 .181 .693 .183 1.004 .004 .311-.179 .503-.51 .502-.869-.001-.359-.194-.69-.506-.867-.478-.272-1.085-.107-1.36 .369-.275 .476-.114 1.085 .36 1.363")
        }
        return _brandReact!!
    }

private var _brandReact: ImageVector? = null
