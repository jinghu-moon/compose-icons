package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microwave: ImageVector
    get() {
        if (_microwave != null) return _microwave!!
        _microwave = tablerFilledIcon(
            name = "Microwave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 5c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-10C2 5.895 2.895 5 4 5ZM14 7h-10v10h10ZM18.01 14h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M18.01 11h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M18.01 8h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1")
            addPathData("M5.945 9.668c1.336-.891 2.274-.891 3.61 0L9.466 9.612l.04 .017 .146 .064 .095 .044c.378 .171 .533 .23 .674 .255 .133 .023 .186 .005 .336-.16 .235-.279 .604-.408 .962-.336 .358 .072 .648 .333 .757 .681 .109 .348 .02 .728-.233 .992-.613 .681-1.358 .934-2.164 .794-.368-.064-.621-.161-1.158-.405-.101-.047-.203-.092-.306-.135l-.17-.091c-.664-.443-.726-.443-1.39 0-.46 .307-1.08 .183-1.387-.277C5.361 10.595 5.485 9.975 5.945 9.668")
            addPathData("M5.945 12.668c1.336-.891 2.274-.891 3.61 0l-.089-.056 .04 .017 .146 .064 .095 .044c.378 .171 .533 .23 .674 .255 .133 .023 .186 .005 .336-.16 .374-.389 .989-.412 1.39-.051 .401 .361 .444 .975 .096 1.388-.613 .681-1.358 .934-2.164 .794-.368-.064-.621-.161-1.158-.405-.101-.047-.203-.092-.306-.135l-.17-.091c-.664-.443-.726-.443-1.39 0-.46 .307-1.08 .183-1.387-.277-.307-.46-.183-1.08 .277-1.387")
        }
        return _microwave!!
    }

private var _microwave: ImageVector? = null
