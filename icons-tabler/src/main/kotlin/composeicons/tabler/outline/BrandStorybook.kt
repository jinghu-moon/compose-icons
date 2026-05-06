package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStorybook: ImageVector
    get() {
        if (_brandStorybook != null) return _brandStorybook!!
        _brandStorybook = tablerOutlineIcon(
            name = "BrandStorybook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4l.5 16.5L19 21v-18L5 4")
            addPathData("M9 15c.6 1.5 1.639 2 3.283 2h-.283c1.8 0 3-.974 3-2.435 0-1.194-.831-1.799-2.147-2.333l-1.975-.802C9.728 10.963 9 10.008 9 8.963 9 7.993 9.899 7.177 11.087 7.07l.613-.055c1.528-.138 3 .762 3.3 1.985")
            addPathData("M16 3.5v1")
        }
        return _brandStorybook!!
    }

private var _brandStorybook: ImageVector? = null
