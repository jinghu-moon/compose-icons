package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Adjustments: ImageVector
    get() {
        if (_adjustments != null) return _adjustments!!
        _adjustments = tablerFilledIcon(
            name = "Adjustments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3c.507 0 .934 .38 .993 .883L7 4v3.171C8.198 7.595 9 8.729 9 10c0 1.271-.801 2.405-2 2.829v7.171c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L5 20v-7.17C3.862 12.427 3.076 11.381 3.005 10.176L3 10l.005-.176C3.076 8.619 3.862 7.573 5 7.17v-3.17C5 3.448 5.448 3 6 3Z")
            addPathData("M12 3c.507 0 .934 .38 .993 .883L13 4v9.171c1.198 .424 2 1.558 2 2.829 0 1.271-.801 2.405-2 2.829v1.171c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 20v-1.17C9.862 18.427 9.076 17.381 9.005 16.176L9 16l.005-.176C9.076 14.619 9.862 13.573 11 13.17v-9.17c0-.552 .448-1 1-1Z")
            addPathData("M18 3c.507 0 .934 .38 .993 .883L19 4v.171c1.198 .424 2 1.558 2 2.829 0 1.271-.801 2.405-2 2.829v10.171c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L17 20v-10.17C15.862 9.427 15.076 8.381 15.005 7.176L15 7l.005-.176C15.076 5.619 15.862 4.573 17 4.17v-.17c0-.552 .448-1 1-1Z")
        }
        return _adjustments!!
    }

private var _adjustments: ImageVector? = null
