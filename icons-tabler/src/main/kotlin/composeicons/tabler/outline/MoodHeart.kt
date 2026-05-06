package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodHeart: ImageVector
    get() {
        if (_moodHeart != null) return _moodHeart!!
        _moodHeart = tablerOutlineIcon(
            name = "MoodHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.27 18.698 4.926 15.214 3.594 11.73 2.262 7.784 3.217 5.296 5.996 2.807 8.775 2.29 12.801 3.997 16.118c1.707 3.317 5.283 5.237 8.991 4.828")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.74 .712 1.75 1.072 2.774 .99")
            addPathData("M18.994 21.5l2.518-2.58c.649-.673 .651-1.738 .004-2.413-.306-.32-.729-.501-1.172-.502-.443-.001-.867 .179-1.174 .497l-.168 .172-.168-.172c-.306-.32-.729-.501-1.172-.502-.443-.001-.867 .179-1.174 .498-.649 .672-.651 1.737-.004 2.412l2.51 2.59")
        }
        return _moodHeart!!
    }

private var _moodHeart: ImageVector? = null
