package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunWind: ImageVector
    get() {
        if (_sunWind != null) return _sunWind!!
        _sunWind = tablerOutlineIcon(
            name = "SunWind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.468 10C13.629 8.542 11.967 7.765 10.31 8.056 8.653 8.347 7.355 9.643 7.062 11.3c-.293 1.657 .483 3.319 1.94 4.16")
            addPathData("M2 12h1")
            addPathData("M11 3v1")
            addPathData("M11 20v1")
            addPathData("M4.6 5.6l.7 .7")
            addPathData("M17.4 5.6l-.7 .7")
            addPathData("M5.3 17.7l-.7 .7")
            addPathData("M15 13h5c1.105 0 2-.895 2-2C22 9.895 21.105 9 20 9")
            addPathData("M12 16h5.714 .253c.536-.009 1.053 .198 1.436 .574 .382 .376 .597 .89 .597 1.426 0 1.105-.895 2-2 2h-.286")
        }
        return _sunWind!!
    }

private var _sunWind: ImageVector? = null
